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
 * The class for the Base Workbook Functions Fixed Request Builder.
 */
public class BaseWorkbookFunctionsFixedRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFixed
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsFixedRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement decimals, final com.google.gson.JsonElement noCommas) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("decimals", decimals);
        mBodyParams.put("noCommas", noCommas);
    }

    /**
     * Creates the IWorkbookFunctionsFixedRequest
     *
     * @return The IWorkbookFunctionsFixedRequest instance
     */
    public IWorkbookFunctionsFixedRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFixedRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsFixedRequest instance
     */
    public IWorkbookFunctionsFixedRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsFixedRequest request = new WorkbookFunctionsFixedRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("decimals")) {
            request.mBody.decimals = getParameter("decimals");
        }

        if (hasParameter("noCommas")) {
            request.mBody.noCommas = getParameter("noCommas");
        }

        return request;
    }
}
