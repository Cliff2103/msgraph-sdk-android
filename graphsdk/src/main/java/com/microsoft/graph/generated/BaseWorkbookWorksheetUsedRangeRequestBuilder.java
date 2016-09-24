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
 * The class for the Base Workbook Worksheet Used Range Request Builder.
 */
public class BaseWorkbookWorksheetUsedRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Boolean valuesOnly) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("valuesOnly", valuesOnly));
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest
     *
     * @return The IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest(final List<Option> requestOptions) {
        WorkbookWorksheetUsedRangeRequest request = new WorkbookWorksheetUsedRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
