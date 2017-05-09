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
 * The interface for the Base Domain Dns Cname Record Request.
 */
public interface IBaseDomainDnsCnameRecordRequest extends IHttpRequest {

    /**
     * Gets the DomainDnsCnameRecord from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DomainDnsCnameRecord> callback);

    /**
     * Gets the DomainDnsCnameRecord from the service
     * @return The DomainDnsCnameRecord from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsCnameRecord get() throws ClientException;

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
     * Patches this DomainDnsCnameRecord with a source
     * @param sourceDomainDnsCnameRecord The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DomainDnsCnameRecord sourceDomainDnsCnameRecord, final ICallback<DomainDnsCnameRecord> callback);

    /**
     * Patches this DomainDnsCnameRecord with a source
     * @param sourceDomainDnsCnameRecord The source object with updates
     * @return The updated DomainDnsCnameRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsCnameRecord patch(final DomainDnsCnameRecord sourceDomainDnsCnameRecord) throws ClientException;

    /**
     * Posts a DomainDnsCnameRecord with a new object
     * @param newDomainDnsCnameRecord The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DomainDnsCnameRecord newDomainDnsCnameRecord, final ICallback<DomainDnsCnameRecord> callback);

    /**
     * Posts a DomainDnsCnameRecord with a new object
     * @param newDomainDnsCnameRecord The new object to create
     * @return The created DomainDnsCnameRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsCnameRecord post(final DomainDnsCnameRecord newDomainDnsCnameRecord) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDomainDnsCnameRecordRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDomainDnsCnameRecordRequest expand(final String value);

}
