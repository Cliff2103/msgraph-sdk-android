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
 * The class for the Base Outlook Category Request.
 */
public class BaseOutlookCategoryRequest extends BaseRequest implements IBaseOutlookCategoryRequest {

    /**
     * The request for the OutlookCategory
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOutlookCategoryRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the OutlookCategory from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<OutlookCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OutlookCategory from the service
     * @return The OutlookCategory from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OutlookCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this OutlookCategory with a source
     * @param sourceOutlookCategory The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OutlookCategory sourceOutlookCategory, final ICallback<OutlookCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceOutlookCategory);
    }

    /**
     * Patches this OutlookCategory with a source
     * @param sourceOutlookCategory The source object with updates
     * @return The updated OutlookCategory
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OutlookCategory patch(final OutlookCategory sourceOutlookCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     * @param newOutlookCategory The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OutlookCategory newOutlookCategory, final ICallback<OutlookCategory> callback) {
        send(HttpMethod.POST, callback, newOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     * @param newOutlookCategory The new object to create
     * @return The created OutlookCategory
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OutlookCategory post(final OutlookCategory newOutlookCategory) throws ClientException {
        return send(HttpMethod.POST, newOutlookCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOutlookCategoryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OutlookCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOutlookCategoryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OutlookCategoryRequest)this;
     }

}

