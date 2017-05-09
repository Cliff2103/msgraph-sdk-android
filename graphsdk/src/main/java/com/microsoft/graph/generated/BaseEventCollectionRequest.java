// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Event Collection Request.
 */
public class BaseEventCollectionRequest extends BaseCollectionRequest<BaseEventCollectionResponse, IEventCollectionPage> implements IBaseEventCollectionRequest {

    /**
     * The request builder for this collection of Event
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEventCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseEventCollectionResponse.class, IEventCollectionPage.class);
    }

    public void get(final ICallback<IEventCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IEventCollectionPage get() throws ClientException {
        final BaseEventCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Event newEvent, final ICallback<Event> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newEvent, callback);
    }

    public Event post(final Event newEvent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newEvent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IEventCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (EventCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IEventCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (EventCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IEventCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (EventCollectionRequest)this;
    }

    public IEventCollectionPage buildFromResponse(final BaseEventCollectionResponse response) {
        final IEventCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EventCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EventCollectionPage page = new EventCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
