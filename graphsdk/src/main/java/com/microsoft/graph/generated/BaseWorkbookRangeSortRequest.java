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
 * The class for the Base Workbook Range Sort Request.
 */
public class BaseWorkbookRangeSortRequest extends BaseRequest implements IBaseWorkbookRangeSortRequest {

    /**
     * The request for the WorkbookRangeSort
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookRangeSortRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookRangeSort from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookRangeSort> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeSort from the service
     * @return The WorkbookRangeSort from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeSort get() throws ClientException {
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
     * Patches this WorkbookRangeSort with a source
     * @param sourceWorkbookRangeSort The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookRangeSort sourceWorkbookRangeSort, final ICallback<WorkbookRangeSort> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeSort);
    }

    /**
     * Patches this WorkbookRangeSort with a source
     * @param sourceWorkbookRangeSort The source object with updates
     * @return The updated WorkbookRangeSort
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeSort patch(final WorkbookRangeSort sourceWorkbookRangeSort) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeSort);
    }

    /**
     * Creates a WorkbookRangeSort with a new object
     * @param newWorkbookRangeSort The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookRangeSort newWorkbookRangeSort, final ICallback<WorkbookRangeSort> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeSort);
    }

    /**
     * Creates a WorkbookRangeSort with a new object
     * @param newWorkbookRangeSort The new object to create
     * @return The created WorkbookRangeSort
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeSort post(final WorkbookRangeSort newWorkbookRangeSort) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeSort);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookRangeSortRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRangeSortRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookRangeSortRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRangeSortRequest)this;
     }

}
