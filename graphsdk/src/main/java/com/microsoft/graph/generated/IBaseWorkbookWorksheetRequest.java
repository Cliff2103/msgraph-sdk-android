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
 * The interface for the Base Workbook Worksheet Request.
 */
public interface IBaseWorkbookWorksheetRequest extends IHttpRequest {

    /**
     * Gets the WorkbookWorksheet from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookWorksheet> callback);

    /**
     * Gets the WorkbookWorksheet from the service
     * @return The WorkbookWorksheet from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheet get() throws ClientException;

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
     * Patches this WorkbookWorksheet with a source
     * @param sourceWorkbookWorksheet The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookWorksheet sourceWorkbookWorksheet, final ICallback<WorkbookWorksheet> callback);

    /**
     * Patches this WorkbookWorksheet with a source
     * @param sourceWorkbookWorksheet The source object with updates
     * @return The updated WorkbookWorksheet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheet patch(final WorkbookWorksheet sourceWorkbookWorksheet) throws ClientException;

    /**
     * Posts a WorkbookWorksheet with a new object
     * @param newWorkbookWorksheet The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookWorksheet newWorkbookWorksheet, final ICallback<WorkbookWorksheet> callback);

    /**
     * Posts a WorkbookWorksheet with a new object
     * @param newWorkbookWorksheet The new object to create
     * @return The created WorkbookWorksheet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheet post(final WorkbookWorksheet newWorkbookWorksheet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookWorksheetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookWorksheetRequest expand(final String value);

}
