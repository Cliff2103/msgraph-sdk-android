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
 * The class for the Base Audio.
 */
public class BaseAudio implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    public BaseAudio() {
        oDataType = "microsoft.graph.audio";
    }

    /**
     * The Album.
	 * 
     */
    @SerializedName("album")
    @Expose
    public String album;

    /**
     * The Album Artist.
	 * 
     */
    @SerializedName("albumArtist")
    @Expose
    public String albumArtist;

    /**
     * The Artist.
	 * 
     */
    @SerializedName("artist")
    @Expose
    public String artist;

    /**
     * The Bitrate.
	 * 
     */
    @SerializedName("bitrate")
    @Expose
    public Long bitrate;

    /**
     * The Composers.
	 * 
     */
    @SerializedName("composers")
    @Expose
    public String composers;

    /**
     * The Copyright.
	 * 
     */
    @SerializedName("copyright")
    @Expose
    public String copyright;

    /**
     * The Disc.
	 * 
     */
    @SerializedName("disc")
    @Expose
    public Integer disc;

    /**
     * The Disc Count.
	 * 
     */
    @SerializedName("discCount")
    @Expose
    public Integer discCount;

    /**
     * The Duration.
	 * 
     */
    @SerializedName("duration")
    @Expose
    public Long duration;

    /**
     * The Genre.
	 * 
     */
    @SerializedName("genre")
    @Expose
    public String genre;

    /**
     * The Has Drm.
	 * 
     */
    @SerializedName("hasDrm")
    @Expose
    public Boolean hasDrm;

    /**
     * The Is Variable Bitrate.
	 * 
     */
    @SerializedName("isVariableBitrate")
    @Expose
    public Boolean isVariableBitrate;

    /**
     * The Title.
	 * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Track.
	 * 
     */
    @SerializedName("track")
    @Expose
    public Integer track;

    /**
     * The Track Count.
	 * 
     */
    @SerializedName("trackCount")
    @Expose
    public Integer trackCount;

    /**
     * The Year.
	 * 
     */
    @SerializedName("year")
    @Expose
    public Integer year;


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
