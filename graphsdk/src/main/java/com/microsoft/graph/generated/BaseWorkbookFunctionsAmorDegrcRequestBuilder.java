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
 * The class for the Base Workbook Functions Amor Degrc Request Builder.
 */
public class BaseWorkbookFunctionsAmorDegrcRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAmorDegrc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAmorDegrcRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement datePurchased, final com.google.gson.JsonElement firstPeriod, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement period, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("cost", cost);
        mBodyParams.put("datePurchased", datePurchased);
        mBodyParams.put("firstPeriod", firstPeriod);
        mBodyParams.put("salvage", salvage);
        mBodyParams.put("period", period);
        mBodyParams.put("rate", rate);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsAmorDegrcRequest
     *
     * @return The IWorkbookFunctionsAmorDegrcRequest instance
     */
    public IWorkbookFunctionsAmorDegrcRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAmorDegrcRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAmorDegrcRequest instance
     */
    public IWorkbookFunctionsAmorDegrcRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsAmorDegrcRequest request = new WorkbookFunctionsAmorDegrcRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.mBody.cost = getParameter("cost");
        }

        if (hasParameter("datePurchased")) {
            request.mBody.datePurchased = getParameter("datePurchased");
        }

        if (hasParameter("firstPeriod")) {
            request.mBody.firstPeriod = getParameter("firstPeriod");
        }

        if (hasParameter("salvage")) {
            request.mBody.salvage = getParameter("salvage");
        }

        if (hasParameter("period")) {
            request.mBody.period = getParameter("period");
        }

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}
