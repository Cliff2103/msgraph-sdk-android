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
 * The class for the Base Vpp Token Request.
 */
public class BaseVppTokenRequest extends BaseRequest implements IBaseVppTokenRequest {

    /**
     * The request for the VppToken
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseVppTokenRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the VppToken from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<VppToken> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the VppToken from the service
     * @return The VppToken from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public VppToken get() throws ClientException {
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
     * Patches this VppToken with a source
     * @param sourceVppToken The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final VppToken sourceVppToken, final ICallback<VppToken> callback) {
        send(HttpMethod.PATCH, callback, sourceVppToken);
    }

    /**
     * Patches this VppToken with a source
     * @param sourceVppToken The source object with updates
     * @return The updated VppToken
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public VppToken patch(final VppToken sourceVppToken) throws ClientException {
        return send(HttpMethod.PATCH, sourceVppToken);
    }

    /**
     * Creates a VppToken with a new object
     * @param newVppToken The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final VppToken newVppToken, final ICallback<VppToken> callback) {
        send(HttpMethod.POST, callback, newVppToken);
    }

    /**
     * Creates a VppToken with a new object
     * @param newVppToken The new object to create
     * @return The created VppToken
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public VppToken post(final VppToken newVppToken) throws ClientException {
        return send(HttpMethod.POST, newVppToken);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IVppTokenRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (VppTokenRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IVppTokenRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (VppTokenRequest)this;
     }

}

