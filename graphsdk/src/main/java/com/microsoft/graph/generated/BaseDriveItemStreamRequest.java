// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

import java.io.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Stream Request.
 */
public class BaseDriveItemStreamRequest extends BaseStreamRequest<DriveItem> implements IBaseDriveItemStreamRequest {

    /**
     * The request for this DriveItemStream
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDriveItemStreamRequest(
                         final String requestUrl,
                         final IBaseClient client,
                         final List<Option> requestOptions,
                         final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the contents of this stream
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<InputStream> callback) {
        send(callback);
    }

    /**
     * Gets the contents of this stream
     *
     * @return The stream that the caller needs to close.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public InputStream get() throws ClientException {
       return send();
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents The contents of the stream to upload.
     * @param callback The callback to be called after success or failure.
     */
    public void put(final byte[] fileContents, final ICallback<DriveItem> callback) {
        send(fileContents, callback);
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents The contents of the stream to upload.
     * @return The result of the upload.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public DriveItem put(final byte[] fileContents) throws ClientException {
        return send(fileContents);
    }
}
