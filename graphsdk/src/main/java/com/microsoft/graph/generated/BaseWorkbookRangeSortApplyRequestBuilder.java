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
 * The class for the Base Workbook Range Sort Apply Request Builder.
 */
public class BaseWorkbookRangeSortApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeSortApply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final Boolean hasHeaders, final String orientation, final String method) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("fields", fields);
        mBodyParams.put("matchCase", matchCase);
        mBodyParams.put("hasHeaders", hasHeaders);
        mBodyParams.put("orientation", orientation);
        mBodyParams.put("method", method);
    }

    /**
     * Creates the IWorkbookRangeSortApplyRequest
     *
     * @return The IWorkbookRangeSortApplyRequest instance
     */
    public IWorkbookRangeSortApplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeSortApplyRequest instance
     */
    public IWorkbookRangeSortApplyRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookRangeSortApplyRequest request = new WorkbookRangeSortApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fields")) {
            request.mBody.fields = getParameter("fields");
        }

        if (hasParameter("matchCase")) {
            request.mBody.matchCase = getParameter("matchCase");
        }

        if (hasParameter("hasHeaders")) {
            request.mBody.hasHeaders = getParameter("hasHeaders");
        }

        if (hasParameter("orientation")) {
            request.mBody.orientation = getParameter("orientation");
        }

        if (hasParameter("method")) {
            request.mBody.method = getParameter("method");
        }

        return request;
    }
}
