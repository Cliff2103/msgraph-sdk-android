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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Subscribed Sku Collection Request Builder.
 */
public class BaseSubscribedSkuCollectionRequestBuilder extends BaseRequestBuilder implements IBaseSubscribedSkuCollectionRequestBuilder {

    /**
     * The request builder for this collection of SubscribedSku
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSubscribedSkuCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ISubscribedSkuCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ISubscribedSkuCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new SubscribedSkuCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISubscribedSkuRequestBuilder byId(final String id) {
        return new SubscribedSkuRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
