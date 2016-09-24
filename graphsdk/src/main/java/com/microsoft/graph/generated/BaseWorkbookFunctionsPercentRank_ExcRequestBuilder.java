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
 * The class for the Base Workbook Functions Percent Rank_Exc Request Builder.
 */
public class BaseWorkbookFunctionsPercentRank_ExcRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentRank_Exc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsPercentRank_ExcRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("array", array);
        mBodyParams.put("x", x);
        mBodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest
     *
     * @return The IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    public IWorkbookFunctionsPercentRank_ExcRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_ExcRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPercentRank_ExcRequest instance
     */
    public IWorkbookFunctionsPercentRank_ExcRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsPercentRank_ExcRequest request = new WorkbookFunctionsPercentRank_ExcRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.mBody.array = getParameter("array");
        }

        if (hasParameter("x")) {
            request.mBody.x = getParameter("x");
        }

        if (hasParameter("significance")) {
            request.mBody.significance = getParameter("significance");
        }

        return request;
    }
}
