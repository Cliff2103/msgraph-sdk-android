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
 * The class for the Base Workbook Functions Hlookup Request Builder.
 */
public class BaseWorkbookFunctionsHlookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHlookup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsHlookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement rowIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("lookupValue", lookupValue);
        mBodyParams.put("tableArray", tableArray);
        mBodyParams.put("rowIndexNum", rowIndexNum);
        mBodyParams.put("rangeLookup", rangeLookup);
    }

    /**
     * Creates the IWorkbookFunctionsHlookupRequest
     *
     * @return The IWorkbookFunctionsHlookupRequest instance
     */
    public IWorkbookFunctionsHlookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHlookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsHlookupRequest instance
     */
    public IWorkbookFunctionsHlookupRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsHlookupRequest request = new WorkbookFunctionsHlookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.mBody.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("tableArray")) {
            request.mBody.tableArray = getParameter("tableArray");
        }

        if (hasParameter("rowIndexNum")) {
            request.mBody.rowIndexNum = getParameter("rowIndexNum");
        }

        if (hasParameter("rangeLookup")) {
            request.mBody.rangeLookup = getParameter("rangeLookup");
        }

        return request;
    }
}
