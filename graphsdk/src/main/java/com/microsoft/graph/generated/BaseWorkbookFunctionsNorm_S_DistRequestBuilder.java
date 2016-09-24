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
 * The class for the Base Workbook Functions Norm_S_Dist Request Builder.
 */
public class BaseWorkbookFunctionsNorm_S_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_S_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsNorm_S_DistRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement z, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("z", z);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest
     *
     * @return The IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsNorm_S_DistRequest request = new WorkbookFunctionsNorm_S_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("z")) {
            request.mBody.z = getParameter("z");
        }

        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
