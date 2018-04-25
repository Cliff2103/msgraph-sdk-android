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
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of DirectoryObjects objects.
     *
     * @return The request builder for the collection of DirectoryObjects objects
     */
    IDirectoryObjectCollectionRequestBuilder getDirectoryObjects();

    /**
     * Gets a single DirectoryObjects.
     *
     * @param id The id of the DirectoryObjects to retrieve.
     * @return The request builder for the DirectoryObjects object
     */
    IDirectoryObjectRequestBuilder getDirectoryObjects(final String id);

    /**
     * Gets the collection of Devices objects.
     *
     * @return The request builder for the collection of Devices objects
     */
    IDeviceCollectionRequestBuilder getDevices();

    /**
     * Gets a single Devices.
     *
     * @param id The id of the Devices to retrieve.
     * @return The request builder for the Devices object
     */
    IDeviceRequestBuilder getDevices(final String id);

    /**
     * Gets the collection of Domains objects.
     *
     * @return The request builder for the collection of Domains objects
     */
    IDomainCollectionRequestBuilder getDomains();

    /**
     * Gets a single Domains.
     *
     * @param id The id of the Domains to retrieve.
     * @return The request builder for the Domains object
     */
    IDomainRequestBuilder getDomains(final String id);

    /**
     * Gets the collection of DomainDnsRecords objects.
     *
     * @return The request builder for the collection of DomainDnsRecords objects
     */
    IDomainDnsRecordCollectionRequestBuilder getDomainDnsRecords();

    /**
     * Gets a single DomainDnsRecords.
     *
     * @param id The id of the DomainDnsRecords to retrieve.
     * @return The request builder for the DomainDnsRecords object
     */
    IDomainDnsRecordRequestBuilder getDomainDnsRecords(final String id);

    /**
     * Gets the collection of Groups objects.
     *
     * @return The request builder for the collection of Groups objects
     */
    IGroupCollectionRequestBuilder getGroups();

    /**
     * Gets a single Groups.
     *
     * @param id The id of the Groups to retrieve.
     * @return The request builder for the Groups object
     */
    IGroupRequestBuilder getGroups(final String id);

    /**
     * Gets the collection of DirectoryRoles objects.
     *
     * @return The request builder for the collection of DirectoryRoles objects
     */
    IDirectoryRoleCollectionRequestBuilder getDirectoryRoles();

    /**
     * Gets a single DirectoryRoles.
     *
     * @param id The id of the DirectoryRoles to retrieve.
     * @return The request builder for the DirectoryRoles object
     */
    IDirectoryRoleRequestBuilder getDirectoryRoles(final String id);

    /**
     * Gets the collection of DirectoryRoleTemplates objects.
     *
     * @return The request builder for the collection of DirectoryRoleTemplates objects
     */
    IDirectoryRoleTemplateCollectionRequestBuilder getDirectoryRoleTemplates();

    /**
     * Gets a single DirectoryRoleTemplates.
     *
     * @param id The id of the DirectoryRoleTemplates to retrieve.
     * @return The request builder for the DirectoryRoleTemplates object
     */
    IDirectoryRoleTemplateRequestBuilder getDirectoryRoleTemplates(final String id);

    /**
     * Gets the collection of Organization objects.
     *
     * @return The request builder for the collection of Organization objects
     */
    IOrganizationCollectionRequestBuilder getOrganization();

    /**
     * Gets a single Organization.
     *
     * @param id The id of the Organization to retrieve.
     * @return The request builder for the Organization object
     */
    IOrganizationRequestBuilder getOrganization(final String id);

    /**
     * Gets the collection of GroupSettings objects.
     *
     * @return The request builder for the collection of GroupSettings objects
     */
    IGroupSettingCollectionRequestBuilder getGroupSettings();

    /**
     * Gets a single GroupSettings.
     *
     * @param id The id of the GroupSettings to retrieve.
     * @return The request builder for the GroupSettings object
     */
    IGroupSettingRequestBuilder getGroupSettings(final String id);

    /**
     * Gets the collection of GroupSettingTemplates objects.
     *
     * @return The request builder for the collection of GroupSettingTemplates objects
     */
    IGroupSettingTemplateCollectionRequestBuilder getGroupSettingTemplates();

    /**
     * Gets a single GroupSettingTemplates.
     *
     * @param id The id of the GroupSettingTemplates to retrieve.
     * @return The request builder for the GroupSettingTemplates object
     */
    IGroupSettingTemplateRequestBuilder getGroupSettingTemplates(final String id);

    /**
     * Gets the collection of SubscribedSkus objects.
     *
     * @return The request builder for the collection of SubscribedSkus objects
     */
    ISubscribedSkuCollectionRequestBuilder getSubscribedSkus();

    /**
     * Gets a single SubscribedSkus.
     *
     * @param id The id of the SubscribedSkus to retrieve.
     * @return The request builder for the SubscribedSkus object
     */
    ISubscribedSkuRequestBuilder getSubscribedSkus(final String id);

    /**
     * Gets the collection of Users objects.
     *
     * @return The request builder for the collection of Users objects
     */
    IUserCollectionRequestBuilder getUsers();

    /**
     * Gets a single Users.
     *
     * @param id The id of the Users to retrieve.
     * @return The request builder for the Users object
     */
    IUserRequestBuilder getUsers(final String id);

    /**
     * Gets the collection of Contracts objects.
     *
     * @return The request builder for the collection of Contracts objects
     */
    IContractCollectionRequestBuilder getContracts();

    /**
     * Gets a single Contracts.
     *
     * @param id The id of the Contracts to retrieve.
     * @return The request builder for the Contracts object
     */
    IContractRequestBuilder getContracts(final String id);

    /**
     * Gets the collection of SchemaExtensions objects.
     *
     * @return The request builder for the collection of SchemaExtensions objects
     */
    ISchemaExtensionCollectionRequestBuilder getSchemaExtensions();

    /**
     * Gets a single SchemaExtensions.
     *
     * @param id The id of the SchemaExtensions to retrieve.
     * @return The request builder for the SchemaExtensions object
     */
    ISchemaExtensionRequestBuilder getSchemaExtensions(final String id);

    /**
     * Gets the collection of Drives objects.
     *
     * @return The request builder for the collection of Drives objects
     */
    IDriveCollectionRequestBuilder getDrives();

    /**
     * Gets a single Drives.
     *
     * @param id The id of the Drives to retrieve.
     * @return The request builder for the Drives object
     */
    IDriveRequestBuilder getDrives(final String id);

    /**
     * Gets the collection of Shares objects.
     *
     * @return The request builder for the collection of Shares objects
     */
    ISharedDriveItemCollectionRequestBuilder getShares();

    /**
     * Gets a single Shares.
     *
     * @param id The id of the Shares to retrieve.
     * @return The request builder for the Shares object
     */
    ISharedDriveItemRequestBuilder getShares(final String id);

    /**
     * Gets the collection of Sites objects.
     *
     * @return The request builder for the collection of Sites objects
     */
    ISiteCollectionRequestBuilder getSites();

    /**
     * Gets a single Sites.
     *
     * @param id The id of the Sites to retrieve.
     * @return The request builder for the Sites object
     */
    ISiteRequestBuilder getSites(final String id);

    /**
     * Gets the collection of Workbooks objects.
     *
     * @return The request builder for the collection of Workbooks objects
     */
    IDriveItemCollectionRequestBuilder getWorkbooks();

    /**
     * Gets a single Workbooks.
     *
     * @param id The id of the Workbooks to retrieve.
     * @return The request builder for the Workbooks object
     */
    IDriveItemRequestBuilder getWorkbooks(final String id);

    /**
     * Gets the collection of Subscriptions objects.
     *
     * @return The request builder for the collection of Subscriptions objects
     */
    ISubscriptionCollectionRequestBuilder getSubscriptions();

    /**
     * Gets a single Subscriptions.
     *
     * @param id The id of the Subscriptions to retrieve.
     * @return The request builder for the Subscriptions object
     */
    ISubscriptionRequestBuilder getSubscriptions(final String id);

    /**
     * Gets the collection of Invitations objects.
     *
     * @return The request builder for the collection of Invitations objects
     */
    IInvitationCollectionRequestBuilder getInvitations();

    /**
     * Gets a single Invitations.
     *
     * @param id The id of the Invitations to retrieve.
     * @return The request builder for the Invitations object
     */
    IInvitationRequestBuilder getInvitations(final String id);

    /**
     * Gets the collection of GroupLifecyclePolicies objects.
     *
     * @return The request builder for the collection of GroupLifecyclePolicies objects
     */
    IGroupLifecyclePolicyCollectionRequestBuilder getGroupLifecyclePolicies();

    /**
     * Gets a single GroupLifecyclePolicies.
     *
     * @param id The id of the GroupLifecyclePolicies to retrieve.
     * @return The request builder for the GroupLifecyclePolicies object
     */
    IGroupLifecyclePolicyRequestBuilder getGroupLifecyclePolicies(final String id);

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the User.
     */
    IUserRequestBuilder getMe();

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Directory.
     */
    IDirectoryRequestBuilder getDirectory();

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Drive.
     */
    IDriveRequestBuilder getDrive();

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Planner.
     */
    IPlannerRequestBuilder getPlanner();

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the ReportRoot.
     */
    IReportRootRequestBuilder getReports();

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the EducationRoot.
     */
    IEducationRootRequestBuilder getEducation();

}
