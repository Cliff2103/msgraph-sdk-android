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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Entire Column Request.
 */
public interface IBaseWorkbookRangeEntireColumnRequest {

    /**
     * Patches the WorkbookRangeEntireColumn
     *
     * @param srcWorkbookRange The WorkbookRange with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Patches the WorkbookRangeEntireColumn
     *
     * @param srcWorkbookRange The WorkbookRange with which to PATCH
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookRange patch(WorkbookRange srcWorkbookRange) throws ClientException;

    /**
     * Puts the WorkbookRangeEntireColumn
     *
     * @param srcWorkbookRange The WorkbookRange to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Puts the WorkbookRangeEntireColumn
     *
     * @param srcWorkbookRange The WorkbookRange to PUT
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookRange put(WorkbookRange srcWorkbookRange) throws ClientException;
    /**
     * Gets the WorkbookRange
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookRange> callback);

    /**
     * Gets the WorkbookRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookRange get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookRangeEntireColumnRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookRangeEntireColumnRequest expand(final String value);

}
