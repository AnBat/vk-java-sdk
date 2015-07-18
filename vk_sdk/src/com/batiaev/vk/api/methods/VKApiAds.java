package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiRigths;

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
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getAccounts">API ads.getAccounts()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getAccounts(VKParameters params) {
        return prepareRequest("getAccounts", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getClients">API ads.getClients()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getClients(VKParameters params) {
        return prepareRequest("getClients", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.createClients">API ads.createClients()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String createClients(VKParameters params) {
        return prepareRequest("createClients", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.updateClients">API ads.updateClients()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String updateClients(VKParameters params) {
        return prepareRequest("updateClients", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.deleteClients">API ads.deleteClients()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String deleteClients(VKParameters params) {
        return prepareRequest("deleteClients", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getCampaigns">API ads.getCampaigns()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getCampaigns(VKParameters params) {
        return prepareRequest("getCampaigns", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.createCampaigns">API ads.createCampaigns()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String createCampaigns(VKParameters params) {
        return prepareRequest("createCampaigns", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.updateCampaigns">API ads.updateCampaigns()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String updateCampaigns(VKParameters params) {
        return prepareRequest("updateCampaigns", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.deleteCampaigns">API ads.deleteCampaigns()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String deleteCampaigns(VKParameters params) {
        return prepareRequest("deleteCampaigns", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getAds">API ads.getAds()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getAds(VKParameters params) {
        return prepareRequest("getAds", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getAdsLayout">API ads.getAdsLayout()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsLayout(VKParameters params) {
        return prepareRequest("getAdsLayout", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getAdsTargeting">API ads.getAdsTargeting()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsTargeting(VKParameters params) {
        return prepareRequest("getAdsTargeting", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.createAds">API ads.createAds()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String createAds(VKParameters params) {
        return prepareRequest("createAds", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.updateAds">API ads.updateAds()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String updateAds(VKParameters params) {
        return prepareRequest("updateAds", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.deleteAds">API ads.deleteAds()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String deleteAds(VKParameters params) {
        return prepareRequest("deleteAds", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getStatistics">API ads.getStatistics()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getStatistics(VKParameters params) {
        return prepareRequest("getStatistics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getDemographics">API ads.getDemographics()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getDemographics(VKParameters params) {
        return prepareRequest("getDemographics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getBudget">API ads.getBudget()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getBudget(VKParameters params) {
        return prepareRequest("getBudget", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getOfficeUsers">API ads.getOfficeUsers()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getOfficeUsers(VKParameters params) {
        return prepareRequest("getOfficeUsers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.addOfficeUsers">API ads.addOfficeUsers()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String addOfficeUsers(VKParameters params) {
        return prepareRequest("addOfficeUsers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.removeOfficeUsers">API ads.removeOfficeUsers()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String removeOfficeUsers(VKParameters params) {
        return prepareRequest("removeOfficeUsers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getTargetingStats">API ads.getTargetingStats()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetingStats(VKParameters params) {
        return prepareRequest("getTargetingStats", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getSuggestions">API ads.getSuggestions()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getCategories">API ads.getCategories()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getCategories(VKParameters params) {
        return prepareRequest("getCategories", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getUploadURL">API ads.getUploadURL()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getUploadURL(VKParameters params) {
        return prepareRequest("getUploadURL", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getVideoUploadURL">API ads.getVideoUploadURL()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getVideoUploadURL(VKParameters params) {
        return prepareRequest("getVideoUploadURL", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getFloodStats">API ads.getFloodStats()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getFloodStats(VKParameters params) {
        return prepareRequest("getFloodStats", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getRejectionReason">API ads.getRejectionReason()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getRejectionReason(VKParameters params) {
        return prepareRequest("getRejectionReason", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.createTargetGroup">API ads.createTargetGroup()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String createTargetGroup(VKParameters params) {
        return prepareRequest("createTargetGroup", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.updateTargetGroup">API ads.updateTargetGroup()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String updateTargetGroup(VKParameters params) {
        return prepareRequest("updateTargetGroup", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.deleteTargetGroup">API ads.deleteTargetGroup()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String deleteTargetGroup(VKParameters params) {
        return prepareRequest("deleteTargetGroup", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.getTargetGroups">API ads.getTargetGroups()</a>
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetGroups(VKParameters params) {
        return prepareRequest("getTargetGroups", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/ads.importTargetContacts">API ads.importTargetContacts()</a>=
     */
    @Rights(VKApiRigths.ADS)
    public String importTargetContacts(VKParameters params) {
        return prepareRequest("importTargetContacts", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "ads";
    }
}
