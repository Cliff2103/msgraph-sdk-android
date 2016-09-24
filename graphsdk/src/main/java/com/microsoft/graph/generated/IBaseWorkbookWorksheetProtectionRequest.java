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
 * The interface for the Base Workbook Worksheet Protection Request.
 */
public interface IBaseWorkbookWorksheetProtectionRequest extends IHttpRequest {

    /**
     * Gets the WorkbookWorksheetProtection from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookWorksheetProtection> callback);

    /**
     * Gets the WorkbookWorksheetProtection from the service
     * @return The WorkbookWorksheetProtection from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheetProtection get() throws ClientException;

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
     * Patches this WorkbookWorksheetProtection with a source
     * @param sourceWorkbookWorksheetProtection The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection, final ICallback<WorkbookWorksheetProtection> callback);

    /**
     * Patches this WorkbookWorksheetProtection with a source
     * @param sourceWorkbookWorksheetProtection The source object with updates
     * @return The updated WorkbookWorksheetProtection
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheetProtection patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException;

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     * @param newWorkbookWorksheetProtection The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final ICallback<WorkbookWorksheetProtection> callback);

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     * @param newWorkbookWorksheetProtection The new object to create
     * @return The created WorkbookWorksheetProtection
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookWorksheetProtection post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookWorksheetProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookWorksheetProtectionRequest expand(final String value);

}
