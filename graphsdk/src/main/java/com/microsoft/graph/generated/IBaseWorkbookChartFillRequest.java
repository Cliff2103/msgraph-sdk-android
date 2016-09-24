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
 * The interface for the Base Workbook Chart Fill Request.
 */
public interface IBaseWorkbookChartFillRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartFill from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartFill> callback);

    /**
     * Gets the WorkbookChartFill from the service
     * @return The WorkbookChartFill from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFill get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartFill with a source
     * @param sourceWorkbookChartFill The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartFill sourceWorkbookChartFill, final ICallback<WorkbookChartFill> callback);

    /**
     * Patches this WorkbookChartFill with a source
     * @param sourceWorkbookChartFill The source object with updates
     * @return The updated WorkbookChartFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFill patch(final WorkbookChartFill sourceWorkbookChartFill) throws ClientException;

    /**
     * Posts a WorkbookChartFill with a new object
     * @param newWorkbookChartFill The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartFill newWorkbookChartFill, final ICallback<WorkbookChartFill> callback);

    /**
     * Posts a WorkbookChartFill with a new object
     * @param newWorkbookChartFill The new object to create
     * @return The created WorkbookChartFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFill post(final WorkbookChartFill newWorkbookChartFill) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartFillRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartFillRequest expand(final String value);

}
