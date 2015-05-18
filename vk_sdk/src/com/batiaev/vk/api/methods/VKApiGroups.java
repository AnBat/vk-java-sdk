package com.batiaev.vk.api.methods;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
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
    public VKRequest isMember(VKParameters params) {
        return prepareRequest("isMember", params);
    }

    /**
     * https://vk.com/dev/groups.getById
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/groups.get
     *
     * This method doesn't require any specific rights.
     *
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/groups.getMembers
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public VKRequest getMembers(VKParameters params) {
        return prepareRequest("getMembers", params);
    }

    /**
     * https://vk.com/dev/groups.join
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest join(VKParameters params) {
        return prepareRequest("join", params);
    }

    /**
     * https://vk.com/dev/groups.leave
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest leave(VKParameters params) {
        return prepareRequest("leave", params);
    }

    /**
     * https://vk.com/dev/groups.search
     *
     * This method doesn't require any specific rights.
     *
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/groups.getInvites
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest getInvites(VKParameters params) {
        return prepareRequest("getInvites", params);
    }

    /**
     * https://vk.com/dev/groups.getInvitedUsers
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest getInvitedUsers(VKParameters params) {
        return prepareRequest("getInvitedUsers", params);
    }

    /**
     * https://vk.com/dev/groups.banUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest banUser(VKParameters params) {
        return prepareRequest("banUser", params);
    }

    /**
     * https://vk.com/dev/groups.unbanUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params);
    }

    /**
     * https://vk.com/dev/groups.getBanned
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }

    /**
     * https://vk.com/dev/groups.create
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest create(VKParameters params) {
        return prepareRequest("create", params);
    }

    /**
     * https://vk.com/dev/groups.edit
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/groups.editPlace
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest editPlace(VKParameters params) {
        return prepareRequest("editPlace", params);
    }

    /**
     * https://vk.com/dev/groups.getSettings
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest getSettings(VKParameters params) {
        return prepareRequest("getSettings", params);
    }

    /**
     * https://vk.com/dev/groups.getRequests
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest getRequests(VKParameters params) {
        return prepareRequest("getRequests", params);
    }

    /**
     * https://vk.com/dev/groups.editManager
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest editManager(VKParameters params) {
        return prepareRequest("editManager", params);
    }

    /**
     * https://vk.com/dev/groups.invite
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest invite(VKParameters params) {
        return prepareRequest("invite", params);
    }

    /**
     * https://vk.com/dev/groups.addLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest addLink(VKParameters params) {
        return prepareRequest("addLink", params);
    }

    /**
     * https://vk.com/dev/groups.deleteLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest deleteLink(VKParameters params) {
        return prepareRequest("deleteLink", params);
    }

    /**
     * https://vk.com/dev/groups.editLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest editLink(VKParameters params) {
        return prepareRequest("editLink", params);
    }

    /**
     * https://vk.com/dev/groups.reorderLink
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest reorderLink(VKParameters params) {
        return prepareRequest("reorderLink", params);
    }

    /**
     * https://vk.com/dev/groups.removeUser
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest removeUser(VKParameters params) {
        return prepareRequest("removeUser", params);
    }

    /**
     * https://vk.com/dev/groups.approveRequest
     *
     * You need the following rights to call this method: groups. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     */
    public VKRequest approveRequest(VKParameters params) {
        return prepareRequest("approveRequest", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "groups";
    }
}
