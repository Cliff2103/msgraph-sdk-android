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
 * The class for the Base Conversation.
 */
public class BaseConversation extends Entity implements IJsonBackedObject {


    public BaseConversation() {
        oDataType = "microsoft.graph.conversation";
    }

    /**
     * The Topic.
     */
    @SerializedName("topic")
    @Expose
    public String topic;

    /**
     * The Has Attachments.
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Last Delivered Date Time.
     */
    @SerializedName("lastDeliveredDateTime")
    @Expose
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Unique Senders.
     */
    @SerializedName("uniqueSenders")
    @Expose
    public List<String> uniqueSenders;

    /**
     * The Preview.
     */
    @SerializedName("preview")
    @Expose
    public String preview;

    /**
     * The Threads.
     */
    public transient ConversationThreadCollectionPage threads;


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


        if (json.has("threads")) {
            final BaseConversationThreadCollectionResponse response = new BaseConversationThreadCollectionResponse();
            if (json.has("threads@odata.nextLink")) {
                response.nextLink = json.get("threads@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("threads").toString(), JsonObject[].class);
            final ConversationThread[] array = new ConversationThread[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationThread.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            threads = new ConversationThreadCollectionPage(response, null);
        }
    }
}
