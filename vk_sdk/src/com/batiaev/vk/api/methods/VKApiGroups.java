package com.batiaev.vk.api.methods;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.groups part
 * 
 * https://vk.com/dev/groups
 */
public class VKApiGroups extends VKApiBase {

    /**
     * https://vk.com/dev/groups.isMember
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public String isMember(VKParameters params) {
        return prepareRequest("isMember", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getById
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.get
     *
     * This method doesn't require any specific rights.
     *
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getMembers
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public String getMembers(VKParameters params) {
        return prepareRequest("getMembers", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.join
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String join(VKParameters params) {
        return prepareRequest("join", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.leave
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String leave(VKParameters params) {
        return prepareRequest("leave", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.search
     *
     * This method doesn't require any specific rights.
     *
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getInvites
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String getInvites(VKParameters params) {
        return prepareRequest("getInvites", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getInvitedUsers
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String getInvitedUsers(VKParameters params) {
        return prepareRequest("getInvitedUsers", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.banUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String banUser(VKParameters params) {
        return prepareRequest("banUser", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.unbanUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getBanned
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.create
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String create(VKParameters params) {
        return prepareRequest("create", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.edit
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.editPlace
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String editPlace(VKParameters params) {
        return prepareRequest("editPlace", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getSettings
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String getSettings(VKParameters params) {
        return prepareRequest("getSettings", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.getRequests
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String getRequests(VKParameters params) {
        return prepareRequest("getRequests", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.editManager
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String editManager(VKParameters params) {
        return prepareRequest("editManager", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.invite
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String invite(VKParameters params) {
        return prepareRequest("invite", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.addLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String addLink(VKParameters params) {
        return prepareRequest("addLink", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.deleteLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String deleteLink(VKParameters params) {
        return prepareRequest("deleteLink", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.editLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String editLink(VKParameters params) {
        return prepareRequest("editLink", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.reorderLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String reorderLink(VKParameters params) {
        return prepareRequest("reorderLink", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.removeUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String removeUser(VKParameters params) {
        return prepareRequest("removeUser", params).getRequest();
    }

    /**
     * https://vk.com/dev/groups.approveRequest
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public String approveRequest(VKParameters params) {
        return prepareRequest("approveRequest", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "groups";
    }
}
