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
 * The class for the Base Directory Role Collection Request.
 */
public class BaseDirectoryRoleCollectionRequest extends BaseCollectionRequest<BaseDirectoryRoleCollectionResponse, IDirectoryRoleCollectionPage> implements IBaseDirectoryRoleCollectionRequest {

    /**
     * The request builder for this collection of DirectoryRole
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDirectoryRoleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDirectoryRoleCollectionResponse.class, IDirectoryRoleCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryRoleCollectionPage> callback) {
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

    public IDirectoryRoleCollectionPage get() throws ClientException {
        final BaseDirectoryRoleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectoryRole newDirectoryRole, final ICallback<DirectoryRole> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectoryRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDirectoryRole, callback);
    }

    public DirectoryRole post(final DirectoryRole newDirectoryRole) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectoryRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDirectoryRole);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDirectoryRoleCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DirectoryRoleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDirectoryRoleCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DirectoryRoleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDirectoryRoleCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DirectoryRoleCollectionRequest)this;
    }

    public IDirectoryRoleCollectionPage buildFromResponse(final BaseDirectoryRoleCollectionResponse response) {
        final IDirectoryRoleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryRoleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryRoleCollectionPage page = new DirectoryRoleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
