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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Reminder.
 */
public class BaseReminder implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    public BaseReminder() {
        oDataType = "microsoft.graph.reminder";
    }

    /**
     * The Event Id.
	 * 
     */
    @SerializedName("eventId")
    @Expose
    public String eventId;

    /**
     * The Event Start Time.
	 * 
     */
    @SerializedName("eventStartTime")
    @Expose
    public DateTimeTimeZone eventStartTime;

    /**
     * The Event End Time.
	 * 
     */
    @SerializedName("eventEndTime")
    @Expose
    public DateTimeTimeZone eventEndTime;

    /**
     * The Change Key.
	 * 
     */
    @SerializedName("changeKey")
    @Expose
    public String changeKey;

    /**
     * The Event Subject.
	 * 
     */
    @SerializedName("eventSubject")
    @Expose
    public String eventSubject;

    /**
     * The Event Location.
	 * 
     */
    @SerializedName("eventLocation")
    @Expose
    public Location eventLocation;

    /**
     * The Event Web Link.
	 * 
     */
    @SerializedName("eventWebLink")
    @Expose
    public String eventWebLink;

    /**
     * The Reminder Fire Time.
	 * 
     */
    @SerializedName("reminderFireTime")
    @Expose
    public DateTimeTimeZone reminderFireTime;


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
