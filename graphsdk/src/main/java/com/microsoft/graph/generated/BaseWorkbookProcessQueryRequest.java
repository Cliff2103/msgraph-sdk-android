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
 * The class for the Base Workbook Process Query Request.
 */
public class BaseWorkbookProcessQueryRequest extends BaseRequest implements IBaseWorkbookProcessQueryRequest {
    protected final WorkbookProcessQueryBody mBody;

    /**
     * The request for this WorkbookProcessQuery
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookProcessQueryRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        mBody = new WorkbookProcessQueryBody();
    }

    public void post(final ICallback<java.io.InputStream> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public java.io.InputStream post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookProcessQueryRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookProcessQueryRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookProcessQueryRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (WorkbookProcessQueryRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookProcessQueryRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookProcessQueryRequest)this;
    }

}
