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
 * The class for the Base Workbook Functions Odd FPrice Request Builder.
 */
public class BaseWorkbookFunctionsOddFPriceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddFPrice
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsOddFPriceRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement firstCoupon, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("issue", issue);
        mBodyParams.put("firstCoupon", firstCoupon);
        mBodyParams.put("rate", rate);
        mBodyParams.put("yld", yld);
        mBodyParams.put("redemption", redemption);
        mBodyParams.put("frequency", frequency);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsOddFPriceRequest
     *
     * @return The IWorkbookFunctionsOddFPriceRequest instance
     */
    public IWorkbookFunctionsOddFPriceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsOddFPriceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsOddFPriceRequest instance
     */
    public IWorkbookFunctionsOddFPriceRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsOddFPriceRequest request = new WorkbookFunctionsOddFPriceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.mBody.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.mBody.issue = getParameter("issue");
        }

        if (hasParameter("firstCoupon")) {
            request.mBody.firstCoupon = getParameter("firstCoupon");
        }

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.mBody.yld = getParameter("yld");
        }

        if (hasParameter("redemption")) {
            request.mBody.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.mBody.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}
