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
 * The interface for the Base List Request.
 */
public interface IBaseListRequest extends IHttpRequest {

    /**
     * Gets the List from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<List> callback);

    /**
     * Gets the List from the service
     * @return The List from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    List get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this List with a source
     * @param sourceList The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final List sourceList, final ICallback<List> callback);

    /**
     * Patches this List with a source
     * @param sourceList The source object with updates
     * @return The updated List
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    List patch(final List sourceList) throws ClientException;

    /**
     * Posts a List with a new object
     * @param newList The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final List newList, final ICallback<List> callback);

    /**
     * Posts a List with a new object
     * @param newList The new object to create
     * @return The created List
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    List post(final List newList) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseListRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseListRequest expand(final String value);

}
