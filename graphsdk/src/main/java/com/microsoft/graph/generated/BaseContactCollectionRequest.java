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
 * The class for the Base Contact Collection Request.
 */
public class BaseContactCollectionRequest extends BaseCollectionRequest<BaseContactCollectionResponse, IContactCollectionPage> implements IBaseContactCollectionRequest {

    /**
     * The request builder for this collection of Contact
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseContactCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseContactCollectionResponse.class, IContactCollectionPage.class);
    }

    public void get(final ICallback<IContactCollectionPage> callback) {
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

    public IContactCollectionPage get() throws ClientException {
        final BaseContactCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Contact newContact, final ICallback<Contact> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newContact, callback);
    }

    public Contact post(final Contact newContact) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newContact);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IContactCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ContactCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IContactCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ContactCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IContactCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ContactCollectionRequest)this;
    }

    public IContactCollectionPage buildFromResponse(final BaseContactCollectionResponse response) {
        final IContactCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ContactCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ContactCollectionPage page = new ContactCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
