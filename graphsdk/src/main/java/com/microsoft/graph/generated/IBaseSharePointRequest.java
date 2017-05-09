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
 * The interface for the Base Share Point Request.
 */
public interface IBaseSharePointRequest extends IHttpRequest {

    /**
     * Gets the SharePoint from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<SharePoint> callback);

    /**
     * Gets the SharePoint from the service
     * @return The SharePoint from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SharePoint get() throws ClientException;

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
     * Patches this SharePoint with a source
     * @param sourceSharePoint The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final SharePoint sourceSharePoint, final ICallback<SharePoint> callback);

    /**
     * Patches this SharePoint with a source
     * @param sourceSharePoint The source object with updates
     * @return The updated SharePoint
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SharePoint patch(final SharePoint sourceSharePoint) throws ClientException;

    /**
     * Posts a SharePoint with a new object
     * @param newSharePoint The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final SharePoint newSharePoint, final ICallback<SharePoint> callback);

    /**
     * Posts a SharePoint with a new object
     * @param newSharePoint The new object to create
     * @return The created SharePoint
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SharePoint post(final SharePoint newSharePoint) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseSharePointRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseSharePointRequest expand(final String value);

}
