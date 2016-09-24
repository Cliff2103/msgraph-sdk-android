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
 * The class for the Base Multi Value Legacy Extended Property Collection Request Builder.
 */
public class BaseMultiValueLegacyExtendedPropertyCollectionRequestBuilder extends BaseRequestBuilder implements IBaseMultiValueLegacyExtendedPropertyCollectionRequestBuilder {

    /**
     * The request builder for this collection of Post
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseMultiValueLegacyExtendedPropertyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMultiValueLegacyExtendedPropertyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMultiValueLegacyExtendedPropertyCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new MultiValueLegacyExtendedPropertyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder byId(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
