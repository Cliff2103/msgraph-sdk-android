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
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Version Request Builder.
 */
public class BaseDriveItemVersionRequestBuilder extends BaseRequestBuilder implements IBaseDriveItemVersionRequestBuilder {

    /**
     * The request builder for the DriveItemVersion
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemVersionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IDriveItemVersionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IDriveItemVersionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new DriveItemVersionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDriveItemVersionStreamRequestBuilder getContent() {
        return new DriveItemVersionStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public IDriveItemVersionRestoreVersionRequestBuilder getRestoreVersion() {
        return new DriveItemVersionRestoreVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restoreVersion"), getClient(), null);
    }
}
