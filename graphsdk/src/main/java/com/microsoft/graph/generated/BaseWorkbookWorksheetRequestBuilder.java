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
 * The class for the Base Workbook Worksheet Request Builder.
 */
public class BaseWorkbookWorksheetRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookWorksheetRequestBuilder {

    /**
     * The request builder for the WorkbookWorksheet
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookWorksheetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookWorksheetRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookWorksheetRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookWorksheetRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartCollectionRequestBuilder getCharts() {
        return new WorkbookChartCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("charts"), getClient(), null);
    }

    public IWorkbookChartRequestBuilder getCharts(final String id) {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment("charts") + "/" + id, getClient(), null);
    }
    public IWorkbookNamedItemCollectionRequestBuilder getNames() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder getNames(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IWorkbookPivotTableCollectionRequestBuilder getPivotTables() {
        return new WorkbookPivotTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables"), getClient(), null);
    }

    public IWorkbookPivotTableRequestBuilder getPivotTables(final String id) {
        return new WorkbookPivotTableRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheetProtection.
     */
    public IWorkbookWorksheetProtectionRequestBuilder getProtection() {
        return new WorkbookWorksheetProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("protection"), getClient(), null);
    }
    public IWorkbookTableCollectionRequestBuilder getTables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder getTables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }

    public IWorkbookWorksheetCellRequestBuilder getCell(final Integer row, final Integer column) {
        return new WorkbookWorksheetCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cell"), getClient(), null, row, column);
    }

    public IWorkbookWorksheetRangeRequestBuilder getRange() {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookWorksheetRangeRequestBuilder getRange(final String address) {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null, address);
    }

    public IWorkbookWorksheetUsedRangeRequestBuilder getUsedRange() {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null);
    }

    public IWorkbookWorksheetUsedRangeRequestBuilder getUsedRange(final Boolean valuesOnly) {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null, valuesOnly);
    }
}
