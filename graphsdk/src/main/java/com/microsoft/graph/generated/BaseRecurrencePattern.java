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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Recurrence Pattern.
 */
public class BaseRecurrencePattern implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    public BaseRecurrencePattern() {
        oDataType = "microsoft.graph.recurrencePattern";
    }

    /**
     * The Type.
     */
    @SerializedName("type")
    @Expose
    public RecurrencePatternType type;

    /**
     * The Interval.
     */
    @SerializedName("interval")
    @Expose
    public Integer interval;

    /**
     * The Month.
     */
    @SerializedName("month")
    @Expose
    public Integer month;

    /**
     * The Day Of Month.
     */
    @SerializedName("dayOfMonth")
    @Expose
    public Integer dayOfMonth;

    /**
     * The Days Of Week.
     */
    @SerializedName("daysOfWeek")
    @Expose
    public List<DayOfWeek> daysOfWeek;

    /**
     * The First Day Of Week.
     */
    @SerializedName("firstDayOfWeek")
    @Expose
    public DayOfWeek firstDayOfWeek;

    /**
     * The Index.
     */
    @SerializedName("index")
    @Expose
    public WeekIndex index;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
