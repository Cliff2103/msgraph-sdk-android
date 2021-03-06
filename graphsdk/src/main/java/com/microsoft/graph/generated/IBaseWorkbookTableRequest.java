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
 * The interface for the Base Workbook Table Request.
 */
public interface IBaseWorkbookTableRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTable from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookTable> callback);

    /**
     * Gets the WorkbookTable from the service
     * @return The WorkbookTable from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTable get() throws ClientException;

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
     * Patches this WorkbookTable with a source
     * @param sourceWorkbookTable The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookTable sourceWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Patches this WorkbookTable with a source
     * @param sourceWorkbookTable The source object with updates
     * @return The updated WorkbookTable
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTable patch(final WorkbookTable sourceWorkbookTable) throws ClientException;

    /**
     * Posts a WorkbookTable with a new object
     * @param newWorkbookTable The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookTable newWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Posts a WorkbookTable with a new object
     * @param newWorkbookTable The new object to create
     * @return The created WorkbookTable
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTable post(final WorkbookTable newWorkbookTable) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookTableRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookTableRequest expand(final String value);

}

