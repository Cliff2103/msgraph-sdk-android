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
 * The class for the Base Planner Task Request Builder.
 */
public class BasePlannerTaskRequestBuilder extends BaseRequestBuilder implements IBasePlannerTaskRequestBuilder {

    /**
     * The request builder for the PlannerTask
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlannerTaskRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IPlannerTaskRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IPlannerTaskRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new PlannerTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for PlannerTaskDetails.
     */
    public IPlannerTaskDetailsRequestBuilder getDetails() {
        return new PlannerTaskDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("details"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerAssignedToTaskBoardTaskFormat.
     */
    public IPlannerAssignedToTaskBoardTaskFormatRequestBuilder getAssignedToTaskBoardFormat() {
        return new PlannerAssignedToTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("assignedToTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerProgressTaskBoardTaskFormat.
     */
    public IPlannerProgressTaskBoardTaskFormatRequestBuilder getProgressTaskBoardFormat() {
        return new PlannerProgressTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("progressTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerBucketTaskBoardTaskFormat.
     */
    public IPlannerBucketTaskBoardTaskFormatRequestBuilder getBucketTaskBoardFormat() {
        return new PlannerBucketTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("bucketTaskBoardFormat"), getClient(), null);
    }
}
