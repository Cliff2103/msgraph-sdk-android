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
 * The class for the Base Workbook Application Calculate Request Builder.
 */
public class BaseWorkbookApplicationCalculateRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookApplicationCalculate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookApplicationCalculateRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String calculationType) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("calculationType", calculationType);
    }

    /**
     * Creates the IWorkbookApplicationCalculateRequest
     *
     * @return The IWorkbookApplicationCalculateRequest instance
     */
    public IWorkbookApplicationCalculateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookApplicationCalculateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookApplicationCalculateRequest instance
     */
    public IWorkbookApplicationCalculateRequest buildRequest(final List<Option> requestOptions) {
        WorkbookApplicationCalculateRequest request = new WorkbookApplicationCalculateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("calculationType")) {
            request.mBody.calculationType = getParameter("calculationType");
        }

        return request;
    }
}
