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
 * The class for the Base Message.
 */
public class BaseMessage extends OutlookItem implements IJsonBackedObject {


    /**
     * The Received Date Time.
     * The date and time the message was received.
     */
    @SerializedName("receivedDateTime")
    @Expose
    public java.util.Calendar receivedDateTime;

    /**
     * The Sent Date Time.
     * The date and time the message was sent.
     */
    @SerializedName("sentDateTime")
    @Expose
    public java.util.Calendar sentDateTime;

    /**
     * The Has Attachments.
     * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false. To verify the existence of inline attachments, parse the body property to look for a src attribute, such as <IMG src="cid:image001.jpg@01D26CD8.6C05F070">.
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Internet Message Id.
     * The message ID in the format specified by RFC2822.
     */
    @SerializedName("internetMessageId")
    @Expose
    public String internetMessageId;

    /**
     * The Subject.
     * The subject of the message.
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Body.
     * The body of the message. It can be in HTML or text format.
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Body Preview.
     * The first 255 characters of the message body. It is in text format.
     */
    @SerializedName("bodyPreview")
    @Expose
    public String bodyPreview;

    /**
     * The Importance.
     * The importance of the message: Low, Normal, High.
     */
    @SerializedName("importance")
    @Expose
    public Importance importance;

    /**
     * The Parent Folder Id.
     * The unique identifier for the message's parent mailFolder.
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Sender.
     * The account that is actually used to generate the message.
     */
    @SerializedName("sender")
    @Expose
    public Recipient sender;

    /**
     * The From.
     * The mailbox owner and sender of the message.
     */
    @SerializedName("from")
    @Expose
    public Recipient from;

    /**
     * The To Recipients.
     * The To: recipients for the message.
     */
    @SerializedName("toRecipients")
    @Expose
    public java.util.List<Recipient> toRecipients;

    /**
     * The Cc Recipients.
     * The Cc: recipients for the message.
     */
    @SerializedName("ccRecipients")
    @Expose
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Bcc Recipients.
     * The Bcc: recipients for the message.
     */
    @SerializedName("bccRecipients")
    @Expose
    public java.util.List<Recipient> bccRecipients;

    /**
     * The Reply To.
     * The email addresses to use when replying.
     */
    @SerializedName("replyTo")
    @Expose
    public java.util.List<Recipient> replyTo;

    /**
     * The Conversation Id.
     * The ID of the conversation the email belongs to.
     */
    @SerializedName("conversationId")
    @Expose
    public String conversationId;

    /**
     * The Unique Body.
     * The part of the body of the message that is unique to the current message. uniqueBody is not returned by default but can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
     */
    @SerializedName("uniqueBody")
    @Expose
    public ItemBody uniqueBody;

    /**
     * The Is Delivery Receipt Requested.
     * Indicates whether a read receipt is requested for the message.
     */
    @SerializedName("isDeliveryReceiptRequested")
    @Expose
    public Boolean isDeliveryReceiptRequested;

    /**
     * The Is Read Receipt Requested.
     * Indicates whether a read receipt is requested for the message.
     */
    @SerializedName("isReadReceiptRequested")
    @Expose
    public Boolean isReadReceiptRequested;

    /**
     * The Is Read.
     * Indicates whether the message has been read.
     */
    @SerializedName("isRead")
    @Expose
    public Boolean isRead;

    /**
     * The Is Draft.
     * Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet.
     */
    @SerializedName("isDraft")
    @Expose
    public Boolean isDraft;

    /**
     * The Web Link.
     * The URL to open the message in Outlook Web App.You can append an ispopout argument to the end of the URL to change how the message is displayed. If ispopout is not present or if it is set to 1, then the message is shown in a popout window. If ispopout is set to 0, then the browser will show the message in the Outlook Web App review pane.The message will open in the browser if you are logged in to your mailbox via Outlook Web App. You will be prompted to login if you are not already logged in with the browser.This URL can be accessed from within an iFrame.
     */
    @SerializedName("webLink")
    @Expose
    public String webLink;

    /**
     * The Inference Classification.
     * The classification of the message for the user, based on inferred relevance or importance, or on an explicit override. Possible values are: focused or other.
     */
    @SerializedName("inferenceClassification")
    @Expose
    public InferenceClassificationType inferenceClassification;

    /**
     * The Attachments.
     * The fileAttachment and itemAttachment attachments for the message.
     */
    public transient AttachmentCollectionPage attachments;

    /**
     * The Extensions.
     * The collection of open extensions defined for the message. Read-only. Nullable.
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the message. Read-only. Nullable.
     */
    public transient SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the message. Read-only. Nullable.
     */
    public transient MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;


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


        if (json.has("attachments")) {
            final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
            if (json.has("attachments@odata.nextLink")) {
                response.nextLink = json.get("attachments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("attachments").toString(), JsonObject[].class);
            final Attachment[] array = new Attachment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            attachments = new AttachmentCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}
