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
 * The class for the Base Workbook Worksheet Protection Protect Request Builder.
 */
public class BaseWorkbookWorksheetProtectionProtectRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetProtectionProtect
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookWorksheetProtectionProtectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final WorkbookWorksheetProtectionOptions options) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("options", options);
    }

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest
     *
     * @return The IWorkbookWorksheetProtectionProtectRequest instance
     */
    public IWorkbookWorksheetProtectionProtectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookWorksheetProtectionProtectRequest instance
     */
    public IWorkbookWorksheetProtectionProtectRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookWorksheetProtectionProtectRequest request = new WorkbookWorksheetProtectionProtectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("options")) {
            request.mBody.options = getParameter("options");
        }

        return request;
    }
}
