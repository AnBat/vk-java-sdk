package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * Builds requests for API.ads part
 *
 * API for VK advertising account is being beta tested.
 * In case of any error or problem with API, please contact us at api@vk.com.
 * Before you can call API methods, authorize at server or client end.
 * After it you can make any API requests using a standard interaction pattern.
 * Also, prior to start with Ads API, read limitations and recommendations.
 * Below there is a list of all methods for operations with the data of VK advertising accounts.
 *
 * https://vk.com/dev/ads
 */
public class VKApiAds extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/ads.getAccounts">API ads.getAccounts()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getAccounts(VKParameters params) {
        String url = getUrl("getAccounts", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getClients">API ads.getClients()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getClients(VKParameters params) {
        String url = getUrl("getClients", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.createClients">API ads.createClients()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String createClients(VKParameters params) {
        String url = getUrl("createClients", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.updateClients">API ads.updateClients()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String updateClients(VKParameters params) {
        String url = getUrl("updateClients", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.deleteClients">API ads.deleteClients()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String deleteClients(VKParameters params) {
        String url = getUrl("deleteClients", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getCampaigns">API ads.getCampaigns()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getCampaigns(VKParameters params) {
        String url = getUrl("getCampaigns", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.createCampaigns">API ads.createCampaigns()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String createCampaigns(VKParameters params) {
        String url = getUrl("createCampaigns", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.updateCampaigns">API ads.updateCampaigns()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String updateCampaigns(VKParameters params) {
        String url = getUrl("updateCampaigns", params);
        return execute(url).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.deleteCampaigns">API ads.deleteCampaigns()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String deleteCampaigns(VKParameters params) {
        return execute("deleteCampaigns", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getAds">API ads.getAds()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getAds(VKParameters params) {
        return execute("getAds", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getAdsLayout">API ads.getAdsLayout()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsLayout(VKParameters params) {
        return execute("getAdsLayout", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getAdsTargeting">API ads.getAdsTargeting()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsTargeting(VKParameters params) {
        return execute("getAdsTargeting", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.createAds">API ads.createAds()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String createAds(VKParameters params) {
        return execute("createAds", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.updateAds">API ads.updateAds()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String updateAds(VKParameters params) {
        return execute("updateAds", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.deleteAds">API ads.deleteAds()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String deleteAds(VKParameters params) {
        return execute("deleteAds", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getStatistics">API ads.getStatistics()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getStatistics(VKParameters params) {
        return execute("getStatistics", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getDemographics">API ads.getDemographics()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getDemographics(VKParameters params) {
        return execute("getDemographics", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getBudget">API ads.getBudget()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getBudget(VKParameters params) {
        return execute("getBudget", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getOfficeUsers">API ads.getOfficeUsers()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getOfficeUsers(VKParameters params) {
        return execute("getOfficeUsers", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.addOfficeUsers">API ads.addOfficeUsers()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String addOfficeUsers(VKParameters params) {
        return execute("addOfficeUsers", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.removeOfficeUsers">API ads.removeOfficeUsers()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String removeOfficeUsers(VKParameters params) {
        return execute("removeOfficeUsers", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getTargetingStats">API ads.getTargetingStats()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetingStats(VKParameters params) {
        return execute("getTargetingStats", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getSuggestions">API ads.getSuggestions()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getSuggestions(VKParameters params) {
        return execute("getSuggestions", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getCategories">API ads.getCategories()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getCategories(VKParameters params) {
        return execute("getCategories", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getUploadURL">API ads.getUploadURL()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getUploadURL(VKParameters params) {
        return execute("getUploadURL", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getVideoUploadURL">API ads.getVideoUploadURL()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getVideoUploadURL(VKParameters params) {
        return execute("getVideoUploadURL", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getFloodStats">API ads.getFloodStats()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getFloodStats(VKParameters params) {
        return execute("getFloodStats", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getRejectionReason">API ads.getRejectionReason()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getRejectionReason(VKParameters params) {
        return execute("getRejectionReason", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.createTargetGroup">API ads.createTargetGroup()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String createTargetGroup(VKParameters params) {
        return execute("createTargetGroup", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.updateTargetGroup">API ads.updateTargetGroup()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String updateTargetGroup(VKParameters params) {
        return execute("updateTargetGroup", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.deleteTargetGroup">API ads.deleteTargetGroup()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String deleteTargetGroup(VKParameters params) {
        return execute("deleteTargetGroup", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.getTargetGroups">API ads.getTargetGroups()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetGroups(VKParameters params) {
        return execute("getTargetGroups", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/ads.importTargetContacts">API ads.importTargetContacts()</a>=
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.ADS)
    public String importTargetContacts(VKParameters params) {
        return execute("importTargetContacts", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "ads";
    }
}
