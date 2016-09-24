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
 * The class for the Base Workbook Functions Fisher Inv Request Builder.
 */
public class BaseWorkbookFunctionsFisherInvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFisherInv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsFisherInvRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement y) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("y", y);
    }

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest
     *
     * @return The IWorkbookFunctionsFisherInvRequest instance
     */
    public IWorkbookFunctionsFisherInvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFisherInvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsFisherInvRequest instance
     */
    public IWorkbookFunctionsFisherInvRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsFisherInvRequest request = new WorkbookFunctionsFisherInvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("y")) {
            request.mBody.y = getParameter("y");
        }

        return request;
    }
}
