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
 * The class for the Base Outlook Item Request Builder.
 */
public class BaseOutlookItemRequestBuilder extends BaseRequestBuilder implements IBaseOutlookItemRequestBuilder {

    /**
     * The request builder for the OutlookItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseOutlookItemRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IOutlookItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IOutlookItemRequest buildRequest(final List<Option> options) {
        return new OutlookItemRequest(getRequestUrl(), getClient(), options);
    }


    public IEventRequestBuilder event() {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("event"), getClient(), null);
    }

    public IMessageRequestBuilder message() {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("message"), getClient(), null);
    }

    public IContactRequestBuilder contact() {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contact"), getClient(), null);
    }

    public IPostRequestBuilder post() {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment("post"), getClient(), null);
    }
}