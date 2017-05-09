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
 * The class for the Base Site Get By Path Request.
 */
public class BaseSiteGetByPathRequest extends BaseRequest implements IBaseSiteGetByPathRequest {

    /**
     * The request for this SiteGetByPath
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseSiteGetByPathRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    /**
     * Patches the SiteGetByPath
     * @param srcSite The Site with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(Site srcSite, final ICallback<Site> callback) {
        send(HttpMethod.PATCH, callback, srcSite);
    }

    /**
     * Patches the SiteGetByPath
     *
     * @param srcSite The Site with which to PATCH
     * @return The Site
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public Site patch(Site srcSite) throws ClientException {
        return this.send(HttpMethod.PATCH, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite The Site to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(Site srcSite, final ICallback<Site> callback) {
        send(HttpMethod.PUT, callback, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite The Site to PUT
     * @return The Site
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public Site put(Site srcSite) throws ClientException {
        return this.send(HttpMethod.PUT, srcSite);
    }
    /**
     * Gets the Site
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Site> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Site
     *
     * @return The Site
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public Site get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ISiteGetByPathRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (SiteGetByPathRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ISiteGetByPathRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (SiteGetByPathRequest)this;
    }

}
