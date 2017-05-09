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
 * The class for the Base Conversation Thread.
 */
public class BaseConversationThread extends Entity implements IJsonBackedObject {


    public BaseConversationThread() {
        oDataType = "microsoft.graph.conversationThread";
    }

    /**
     * The To Recipients.
	 * 
     */
    @SerializedName("toRecipients")
    @Expose
    public java.util.List<Recipient> toRecipients;

    /**
     * The Topic.
	 * 
     */
    @SerializedName("topic")
    @Expose
    public String topic;

    /**
     * The Has Attachments.
	 * 
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Last Delivered Date Time.
	 * 
     */
    @SerializedName("lastDeliveredDateTime")
    @Expose
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Unique Senders.
	 * 
     */
    @SerializedName("uniqueSenders")
    @Expose
    public java.util.List<String> uniqueSenders;

    /**
     * The Cc Recipients.
	 * 
     */
    @SerializedName("ccRecipients")
    @Expose
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Preview.
	 * 
     */
    @SerializedName("preview")
    @Expose
    public String preview;

    /**
     * The Is Locked.
	 * 
     */
    @SerializedName("isLocked")
    @Expose
    public Boolean isLocked;

    /**
     * The Posts.
	 * 
     */
    public transient PostCollectionPage posts;


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


        if (json.has("posts")) {
            final BasePostCollectionResponse response = new BasePostCollectionResponse();
            if (json.has("posts@odata.nextLink")) {
                response.nextLink = json.get("posts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("posts").toString(), JsonObject[].class);
            final Post[] array = new Post[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Post.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            posts = new PostCollectionPage(response, null);
        }
    }
}
