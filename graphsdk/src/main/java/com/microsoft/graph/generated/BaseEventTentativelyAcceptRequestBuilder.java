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
 * The class for the Base Event Tentatively Accept Request Builder.
 */
public class BaseEventTentativelyAcceptRequestBuilder extends BaseRequestBuilder {

    public final String mComment;
    public final Boolean mSendResponse;

    /**
     * The request builder for this EventTentativelyAccept
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventTentativelyAcceptRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, options);
        mComment = comment;
        mSendResponse = sendResponse;
    }

    /**
     * Creates the IEventTentativelyAcceptRequest
     *
     * @return The IEventTentativelyAcceptRequest instance
     */
    public IEventTentativelyAcceptRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventTentativelyAcceptRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IEventTentativelyAcceptRequest instance
     */
    public IEventTentativelyAcceptRequest buildRequest(final List<Option> options) {
        return new EventTentativelyAcceptRequest(getRequestUrl(), getClient(), options, mComment, mSendResponse);
    }
}