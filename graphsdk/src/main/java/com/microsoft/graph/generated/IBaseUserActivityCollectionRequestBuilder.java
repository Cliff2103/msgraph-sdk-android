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
 * The interface for the Base User Activity Collection Request Builder.
 */
public interface IBaseUserActivityCollectionRequestBuilder extends IRequestBuilder {

    IUserActivityCollectionRequest buildRequest();

    IUserActivityCollectionRequest buildRequest(final java.util.List<Option> requestOptions);

    IUserActivityRequestBuilder byId(final String id);


    IUserActivityRecentCollectionRequestBuilder getRecent();
}
