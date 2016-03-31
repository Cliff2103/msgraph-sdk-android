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
 * The class for the Base Drive Item.
 */
public class BaseDriveItem extends Entity implements IJsonBackedObject {


	public BaseDriveItem(){
		oDataType = "microsoft.graph.driveItem";
	}
	
    /**
     * The Created By.
     */
    @SerializedName("createdBy")
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     */
    @SerializedName("createdDateTime")
    public java.util.Calendar createdDateTime;

    /**
     * The CTag.
     */
    @SerializedName("cTag")
    public String cTag;

    /**
     * The Description.
     */
    @SerializedName("description")
    public String description;

    /**
     * The ETag.
     */
    @SerializedName("eTag")
    public String eTag;

    /**
     * The Last Modified By.
     */
    @SerializedName("lastModifiedBy")
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     */
    @SerializedName("lastModifiedDateTime")
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Name.
     */
    @SerializedName("name")
    public String name;

    /**
     * The Parent Reference.
     */
    @SerializedName("parentReference")
    public ItemReference parentReference;

    /**
     * The Size.
     */
    @SerializedName("size")
    public Long size;

    /**
     * The Web Dav Url.
     */
    @SerializedName("webDavUrl")
    public String webDavUrl;

    /**
     * The Web Url.
     */
    @SerializedName("webUrl")
    public String webUrl;

    /**
     * The Audio.
     */
    @SerializedName("audio")
    public Audio audio;

    /**
     * The Deleted.
     */
    @SerializedName("deleted")
    public Deleted deleted;

    /**
     * The File.
     */
    @SerializedName("file")
    public File file;

    /**
     * The File System Info.
     */
    @SerializedName("fileSystemInfo")
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     */
    @SerializedName("folder")
    public Folder folder;

    /**
     * The Image.
     */
    @SerializedName("image")
    public Image image;

    /**
     * The Location.
     */
    @SerializedName("location")
    public GeoCoordinates location;

    /**
     * The Photo.
     */
    @SerializedName("photo")
    public Photo photo;

    /**
     * The Remote Item.
     */
    @SerializedName("remoteItem")
    public RemoteItem remoteItem;

    /**
     * The Search Result.
     */
    @SerializedName("searchResult")
    public SearchResult searchResult;

    /**
     * The Shared.
     */
    @SerializedName("shared")
    public Shared shared;

    /**
     * The Special Folder.
     */
    @SerializedName("specialFolder")
    public SpecialFolder specialFolder;

    /**
     * The Video.
     */
    @SerializedName("video")
    public Video video;

    /**
     * The Package.
     */
    @SerializedName("package")
    public com.microsoft.graph.extensions.Package msgraph_package;

    /**
     * The Created By User.
     */
    @SerializedName("createdByUser")
    public User createdByUser;

    /**
     * The Last Modified By User.
     */
    @SerializedName("lastModifiedByUser")
    public User lastModifiedByUser;

    /**
     * The Permissions.
     */
    public transient PermissionCollectionPage permissions;

    /**
     * The Children.
     */
    public transient DriveItemCollectionPage children;

    /**
     * The Thumbnails.
     */
    public transient ThumbnailSetCollectionPage thumbnails;


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


        if (json.has("permissions")) {
            final BasePermissionCollectionResponse response = new BasePermissionCollectionResponse();
            if (json.has("permissions@odata.nextLink")) {
                response.nextLink = json.get("permissions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("permissions").toString(), JsonObject[].class);
            final Permission[] array = new Permission[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Permission.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            permissions = new PermissionCollectionPage(response, null);
        }

        if (json.has("children")) {
            final BaseDriveItemCollectionResponse response = new BaseDriveItemCollectionResponse();
            if (json.has("children@odata.nextLink")) {
                response.nextLink = json.get("children@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("children").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            children = new DriveItemCollectionPage(response, null);
        }

        if (json.has("thumbnails")) {
            final BaseThumbnailSetCollectionResponse response = new BaseThumbnailSetCollectionResponse();
            if (json.has("thumbnails@odata.nextLink")) {
                response.nextLink = json.get("thumbnails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("thumbnails").toString(), JsonObject[].class);
            final ThumbnailSet[] array = new ThumbnailSet[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ThumbnailSet.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            thumbnails = new ThumbnailSetCollectionPage(response, null);
        }
    }
}