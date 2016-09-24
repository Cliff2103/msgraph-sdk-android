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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions True Request.
 */
public interface IBaseWorkbookFunctionsTrueRequest {

    /**
     * Creates the WorkbookFunctionsTrue
     *
     * @param callback The callback to be called after success or failure.
     */
    void post(final ICallback<WorkbookFunctionResult> callback);

    /**
     * Creates the WorkbookFunctionsTrue
     *
     * @return The WorkbookFunctionResult
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookFunctionResult post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookFunctionsTrueRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookFunctionsTrueRequest expand(final String value);

}
