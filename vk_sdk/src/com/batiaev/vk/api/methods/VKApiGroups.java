package com.batiaev.vk.api.methods;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.consts.VKApiRigths;

/**
 * @author batiaev
 *
 * Builds requests for API.groups part
 * 
 * https://vk.com/dev/groups
 */
public class VKApiGroups extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.isMember">API groups.isMember()</a>
     *
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String isMember(VKParameters params) {
        return prepareRequest("isMember", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getById">API groups.getById()</a>
     *
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.get">API groups.get()</a>
     *
     */
    @Rights(VKApiRigths.NOTHING)
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getMembers">API groups.getMembers()</a>
     *
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getMembers(VKParameters params) {
        return prepareRequest("getMembers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.join">API groups.join()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String join(VKParameters params) {
        return prepareRequest("join", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.leave">API groups.leave()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String leave(VKParameters params) {
        return prepareRequest("leave", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.search">API groups.search()</a>
     *
     */
    @Rights(VKApiRigths.NOTHING)
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getInvites">API groups.getInvites()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getInvites(VKParameters params) {
        return prepareRequest("getInvites", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getInvitedUsers">API groups.getInvitedUsers()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getInvitedUsers(VKParameters params) {
        return prepareRequest("getInvitedUsers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.banUser">API groups.banUser()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String banUser(VKParameters params) {
        return prepareRequest("banUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.unbanUser">API groups.unbanUser()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getBanned">API groups.getBanned()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.create">API groups.create()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String create(VKParameters params) {
        return prepareRequest("create", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.edit">API groups.edit()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editPlace">API groups.editPlace()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editPlace(VKParameters params) {
        return prepareRequest("editPlace", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getSettings">API groups.getSettings()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getSettings(VKParameters params) {
        return prepareRequest("getSettings", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getRequests">API groups.getRequests()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getRequests(VKParameters params) {
        return prepareRequest("getRequests", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editManager">API groups.editManager()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editManager(VKParameters params) {
        return prepareRequest("editManager", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.invite">API groups.invite()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String invite(VKParameters params) {
        return prepareRequest("invite", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.addLink">API groups.addLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addLink(VKParameters params) {
        return prepareRequest("addLink", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.deleteLink">API groups.deleteLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteLink(VKParameters params) {
        return prepareRequest("deleteLink", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editLink">API groups.editLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editLink(VKParameters params) {
        return prepareRequest("editLink", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.reorderLink">API groups.reorderLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String reorderLink(VKParameters params) {
        return prepareRequest("reorderLink", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.removeUser">API groups.removeUser()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String removeUser(VKParameters params) {
        return prepareRequest("removeUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.approveRequest">API groups.approveRequest()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String approveRequest(VKParameters params) {
        return prepareRequest("approveRequest", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "groups";
    }
}
