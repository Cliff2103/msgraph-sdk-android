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
 * The class for the Base Workbook Functions F_Dist Request Builder.
 */
public class BaseWorkbookFunctionsF_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsF_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("x", x);
        mBodyParams.put("degFreedom1", degFreedom1);
        mBodyParams.put("degFreedom2", degFreedom2);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsF_DistRequest
     *
     * @return The IWorkbookFunctionsF_DistRequest instance
     */
    public IWorkbookFunctionsF_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsF_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsF_DistRequest instance
     */
    public IWorkbookFunctionsF_DistRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsF_DistRequest request = new WorkbookFunctionsF_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.mBody.x = getParameter("x");
        }

        if (hasParameter("degFreedom1")) {
            request.mBody.degFreedom1 = getParameter("degFreedom1");
        }

        if (hasParameter("degFreedom2")) {
            request.mBody.degFreedom2 = getParameter("degFreedom2");
        }

        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
