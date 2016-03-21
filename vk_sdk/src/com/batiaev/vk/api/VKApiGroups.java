package com.batiaev.vk.api;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;
import com.batiaev.vk.common.consts.VkApiMethods;

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
        return execute(getUrl("isMember", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getById">API groups.getById()</a>
     *
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.get">API groups.get()</a>
     *
     */
    @Rights(VKApiRigths.NOTHING)
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getMembers">API groups.getMembers()</a>
     *
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getMembers(VKParameters params) {
        return execute(getUrl("getMembers", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.join">API groups.join()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String join(VKParameters params) {
        return execute(getUrl("join", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.leave">API groups.leave()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String leave(VKParameters params) {
        return execute(getUrl("leave", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.search">API groups.search()</a>
     *
     */
    @Rights(VKApiRigths.NOTHING)
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getInvites">API groups.getInvites()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getInvites(VKParameters params) {
        return execute(getUrl("getInvites", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getInvitedUsers">API groups.getInvitedUsers()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getInvitedUsers(VKParameters params) {
        return execute(getUrl("getInvitedUsers", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.banUser">API groups.banUser()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String banUser(VKParameters params) {
        return execute(getUrl("banUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.unbanUser">API groups.unbanUser()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return execute(getUrl("unbanUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getBanned">API groups.getBanned()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return execute(getUrl("getBanned", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.create">API groups.create()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String create(VKParameters params) {
        return execute(getUrl(VkApiMethods.CREATE, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.edit">API groups.edit()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editPlace">API groups.editPlace()</a>
     *
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editPlace(VKParameters params) {
        return execute(getUrl("editPlace", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.getSettings">API groups.getSettings()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String getSettings(VKParameters params) {
        return execute(getUrl("getSettings", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.toStrings">API groups.toStrings()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String toStrings(VKParameters params) {
        return execute(getUrl("toStrings", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editManager">API groups.editManager()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editManager(VKParameters params) {
        return execute(getUrl("editManager", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.invite">API groups.invite()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String invite(VKParameters params) {
        return execute(getUrl("invite", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.addLink">API groups.addLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addLink(VKParameters params) {
        return execute(getUrl("addLink", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.deleteLink">API groups.deleteLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteLink(VKParameters params) {
        return execute(getUrl("deleteLink", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.editLink">API groups.editLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editLink(VKParameters params) {
        return execute(getUrl("editLink", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.reorderLink">API groups.reorderLink()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String reorderLink(VKParameters params) {
        return execute(getUrl("reorderLink", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.removeUser">API groups.removeUser()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String removeUser(VKParameters params) {
        return execute(getUrl("removeUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/groups.approveRequest">API groups.approveRequest()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String approveRequest(VKParameters params) {
        return execute(getUrl("approveRequest", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "groups";
    }
}
