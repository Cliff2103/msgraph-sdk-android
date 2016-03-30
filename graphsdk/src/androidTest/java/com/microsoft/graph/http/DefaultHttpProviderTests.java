// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import android.test.AndroidTestCase;

import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.concurrency.MockExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.logger.MockLogger;
import com.microsoft.graph.serializer.MockSerializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Test cases for {@see DefaultHttpProvider}
 */
public class DefaultHttpProviderTests extends AndroidTestCase {

    private MockInterceptor mInterceptor;
    private DefaultHttpProvider mProvider;

    public void testNoContentType() throws Exception {
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        setDefaultHttpProvider(null);
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        try {
            mProvider.send(new MockRequest(), Drive.class, null);
            fail("Expected exception");
        } catch (final ClientException ce) {
            if (!(ce.getCause() instanceof NullPointerException)) {
                fail("Wrong inner exception!");
            }
        }
        assertEquals(1, mInterceptor.getInterceptionCount());
    }

    public void testDriveResponse() throws Exception {
        final String driveId = "driveId";
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                final HashMap<String, String> map = new HashMap<>();
                map.put("Content-Type", "application/json");
                return map;
            }
        };
        final Drive expectedDrive = new Drive();
        expectedDrive.id = driveId;
        setDefaultHttpProvider(expectedDrive);
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        final Drive drive = mProvider.send(new MockRequest(), Drive.class, null);

        assertEquals(driveId, drive.id);
        assertEquals(1, mInterceptor.getInterceptionCount());
    }

    public void testBinaryResponse() throws Exception {
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                final HashMap<String, String> map = new HashMap<>();
                map.put("Content-Type", "application/octet-stream");
                return map;
            }
        };
        setDefaultHttpProvider(null);
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));
        mProvider.send(new MockRequest(), InputStream.class, null);
        assertEquals(1, mInterceptor.getInterceptionCount());
    }

    public void testPostItem() throws Exception {
        final String itemId = "itemId";
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                final HashMap<String, String> map = new HashMap<>();
                map.put("Content-Type", "application/json");
                return map;
            }
        };

        final DriveItem expectedItem = new DriveItem();
        expectedItem.id = itemId;
        setDefaultHttpProvider(expectedItem);
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        final DriveItem item = mProvider.send(new MockRequest(), DriveItem.class, new DriveItem());

        assertEquals(itemId, item.id);
        assertEquals(1, mInterceptor.getInterceptionCount());
    }

    public void testPostByte() throws Exception {
        final String itemId = "itemId";
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 200;
            }

            @Override
            public String getJsonResponse() {
                return "{ \"id\": \"zzz\" }";
            }

            @Override
            public Map<String, String> getHeaders() {
                final HashMap<String, String> map = new HashMap<>();
                map.put("Content-Type", "application/json");
                return map;
            }
        };
        final DriveItem expectedItem = new DriveItem();
        expectedItem.id = itemId;
        setDefaultHttpProvider(expectedItem);
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        final AtomicBoolean progress = new AtomicBoolean(false);
        final AtomicBoolean success = new AtomicBoolean(false);
        final AtomicBoolean failure = new AtomicBoolean(false);
        final IProgressCallback<DriveItem> progressCallback = new IProgressCallback<DriveItem>() {
            @Override
            public void progress(final long current, final long max) {
                progress.set(true);
            }

            @Override
            public void success(final DriveItem item) {
                success.set(true);
            }

            @Override
            public void failure(final ClientException ex) {
                failure.set(true);
            }
        };

        mProvider.send(new MockRequest(), progressCallback, DriveItem.class, new byte[]{1, 2, 3, 4});

        assertTrue(progress.get());
        assertTrue(success.get());
        assertEquals(1, mInterceptor.getInterceptionCount());
    }

    public void testErrorResponse() throws Exception {
        final GraphErrorCodes expectedErrorCode = GraphErrorCodes.InvalidRequest;
        final String expectedMessage = "Test error!";
        final GraphErrorResponse toSerialize = new GraphErrorResponse();
        toSerialize.error = new GraphError();
        toSerialize.error.code = expectedErrorCode.toString();
        toSerialize.error.message = expectedMessage;
        toSerialize.error.innererror = null;

        setDefaultHttpProvider(toSerialize);
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return 415;
            }

            @Override
            public String getJsonResponse() {
                return "{}";
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        try {
            mProvider.send(new MockRequest(), DriveItem.class, null);
            fail("Expected exception in previous statement");
        } catch (final GraphServiceException e) {
            assertTrue(e.isError(expectedErrorCode));
            assertEquals(expectedMessage, e.getServiceError().message);
        }
    }

    public void testBodyLessResponse() throws Exception {
        final int[] codes = new int[] {204, 304 };
        final AtomicInteger currentCode = new AtomicInteger(0);
        setDefaultHttpProvider(null);
        final ITestData data = new ITestData() {
            @Override
            public int getRequestCode() {
                return codes[currentCode.get()];
            }

            @Override
            public String getJsonResponse() {
                throw new UnsupportedOperationException("Should not ever hit this");
            }

            @Override
            public Map<String, String> getHeaders() {
                return new HashMap<>();
            }
        };
        mProvider.setConnectionFactory(new MockSingleConnectionFactory(new TestDataConnection(data)));

        for (final int ignored : codes) {
            DriveItem result = mProvider.send(new MockRequest(), DriveItem.class, null);
            currentCode.incrementAndGet();
            assertNull(result);
        }
        assertEquals(codes.length, mInterceptor.getInterceptionCount());
    }

    /**
     * Mock {@see IConnection} backed with test data
     */
    private class TestDataConnection implements IConnection {

        private final ITestData mData;

        public TestDataConnection(ITestData data) {
            mData = data;
        }

        @Override
        public void setFollowRedirects(final boolean followRedirects) {

        }

        @Override
        public void addRequestHeader(final String headerName, final String headerValue) {

        }

        @Override
        public OutputStream getOutputStream() throws IOException {
            return new ByteArrayOutputStream();
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(mData.getJsonResponse().getBytes());
        }

        @Override
        public int getResponseCode() throws IOException {
            return mData.getRequestCode();
        }

        @Override
        public String getResponseMessage() throws IOException {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public Map<String, String> getHeaders() {
            return mData.getHeaders();
        }

        @Override
        public String getRequestMethod() {
            return null;
        }

        @Override
        public int getContentLength() {
            return 0;
        }
    }

    /**
     * Test data to use in configuring the mock connection object
     */
    private interface ITestData {
        int getRequestCode();

        String getJsonResponse();

        Map<String,String> getHeaders();
    }

    /**
     * Configures the http provider for test cases
     * @param toSerialize The object to serialize
     */
    private void setDefaultHttpProvider(final Object toSerialize) {
        mProvider = new DefaultHttpProvider(new MockSerializer(toSerialize, ""),
                mInterceptor = new MockInterceptor(),
                new MockExecutors(),
                new MockLogger());
    }
}
