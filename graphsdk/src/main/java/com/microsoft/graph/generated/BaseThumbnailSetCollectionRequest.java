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
 * The class for the Base Thumbnail Set Collection Request.
 */
public class BaseThumbnailSetCollectionRequest extends BaseCollectionRequest<BaseThumbnailSetCollectionResponse, IThumbnailSetCollectionPage> implements IBaseThumbnailSetCollectionRequest {

    /**
     * The request builder for this collection of ThumbnailSet
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseThumbnailSetCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseThumbnailSetCollectionResponse.class, IThumbnailSetCollectionPage.class);
    }

    public void get(final ICallback<IThumbnailSetCollectionPage> callback) {
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

    public IThumbnailSetCollectionPage get() throws ClientException {
        final BaseThumbnailSetCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ThumbnailSet newThumbnailSet, final ICallback<ThumbnailSet> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ThumbnailSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newThumbnailSet, callback);
    }

    public ThumbnailSet post(final ThumbnailSet newThumbnailSet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThumbnailSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newThumbnailSet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IThumbnailSetCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ThumbnailSetCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IThumbnailSetCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ThumbnailSetCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IThumbnailSetCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ThumbnailSetCollectionRequest)this;
    }

    public IThumbnailSetCollectionPage buildFromResponse(final BaseThumbnailSetCollectionResponse response) {
        final IThumbnailSetCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ThumbnailSetCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ThumbnailSetCollectionPage page = new ThumbnailSetCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
