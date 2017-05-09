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
 * The class for the Base Workbook Functions Floor_Math Request Builder.
 */
public class BaseWorkbookFunctionsFloor_MathRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFloor_Math
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsFloor_MathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance, final com.google.gson.JsonElement mode) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("significance", significance);
        mBodyParams.put("mode", mode);
    }

    /**
     * Creates the IWorkbookFunctionsFloor_MathRequest
     *
     * @return The IWorkbookFunctionsFloor_MathRequest instance
     */
    public IWorkbookFunctionsFloor_MathRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFloor_MathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsFloor_MathRequest instance
     */
    public IWorkbookFunctionsFloor_MathRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsFloor_MathRequest request = new WorkbookFunctionsFloor_MathRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.mBody.significance = getParameter("significance");
        }

        if (hasParameter("mode")) {
            request.mBody.mode = getParameter("mode");
        }

        return request;
    }
}
