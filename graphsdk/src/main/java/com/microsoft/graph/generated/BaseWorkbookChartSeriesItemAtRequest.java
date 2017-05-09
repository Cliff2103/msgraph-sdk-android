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
 * The class for the Base Workbook Chart Series Item At Request.
 */
public class BaseWorkbookChartSeriesItemAtRequest extends BaseRequest implements IBaseWorkbookChartSeriesItemAtRequest {

    /**
     * The request for this WorkbookChartSeriesItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartSeriesItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartSeries.class);
    }

    /**
     * Patches the WorkbookChartSeriesItemAt
     * @param srcWorkbookChartSeries The WorkbookChartSeries with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookChartSeries srcWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookChartSeries);
    }

    /**
     * Patches the WorkbookChartSeriesItemAt
     *
     * @param srcWorkbookChartSeries The WorkbookChartSeries with which to PATCH
     * @return The WorkbookChartSeries
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookChartSeries patch(WorkbookChartSeries srcWorkbookChartSeries) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookChartSeries);
    }

    /**
     * Puts the WorkbookChartSeriesItemAt
     *
     * @param srcWorkbookChartSeries The WorkbookChartSeries to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookChartSeries srcWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartSeries);
    }

    /**
     * Puts the WorkbookChartSeriesItemAt
     *
     * @param srcWorkbookChartSeries The WorkbookChartSeries to PUT
     * @return The WorkbookChartSeries
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookChartSeries put(WorkbookChartSeries srcWorkbookChartSeries) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookChartSeries);
    }
    /**
     * Gets the WorkbookChartSeries
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartSeries> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartSeries
     *
     * @return The WorkbookChartSeries
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookChartSeries get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookChartSeriesItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookChartSeriesItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookChartSeriesItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookChartSeriesItemAtRequest)this;
    }

}
