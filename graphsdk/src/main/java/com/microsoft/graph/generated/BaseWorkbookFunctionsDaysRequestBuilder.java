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
 * The class for the Base Workbook Functions Days Request Builder.
 */
public class BaseWorkbookFunctionsDaysRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDays
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDaysRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement startDate) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("endDate", endDate);
        mBodyParams.put("startDate", startDate);
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest
     *
     * @return The IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDaysRequest instance
     */
    public IWorkbookFunctionsDaysRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsDaysRequest request = new WorkbookFunctionsDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("endDate")) {
            request.mBody.endDate = getParameter("endDate");
        }

        if (hasParameter("startDate")) {
            request.mBody.startDate = getParameter("startDate");
        }

        return request;
    }
}
