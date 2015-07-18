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
     * @link https://vk.com/dev/ads.getAccounts
     */
    @Rights(VKApiRigths.ADS)
    public String getAccounts(VKParameters params) {
        return prepareRequest("getAccounts", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getClients
     */
    @Rights(VKApiRigths.ADS)
    public String getClients(VKParameters params) {
        return prepareRequest("getClients", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.createClients
     */
    @Rights(VKApiRigths.ADS)
    public String createClients(VKParameters params) {
        return prepareRequest("createClients", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.updateClients
     */
    @Rights(VKApiRigths.ADS)
    public String updateClients(VKParameters params) {
        return prepareRequest("updateClients", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.deleteClients
     */
    @Rights(VKApiRigths.ADS)
    public String deleteClients(VKParameters params) {
        return prepareRequest("deleteClients", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public String getCampaigns(VKParameters params) {
        return prepareRequest("getCampaigns", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.createCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public String createCampaigns(VKParameters params) {
        return prepareRequest("createCampaigns", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.updateCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public String updateCampaigns(VKParameters params) {
        return prepareRequest("updateCampaigns", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.deleteCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public String deleteCampaigns(VKParameters params) {
        return prepareRequest("deleteCampaigns", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getAds
     */
    @Rights(VKApiRigths.ADS)
    public String getAds(VKParameters params) {
        return prepareRequest("getAds", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getAdsLayout
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsLayout(VKParameters params) {
        return prepareRequest("getAdsLayout", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getAdsTargeting
     */
    @Rights(VKApiRigths.ADS)
    public String getAdsTargeting(VKParameters params) {
        return prepareRequest("getAdsTargeting", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.createAds
     */
    @Rights(VKApiRigths.ADS)
    public String createAds(VKParameters params) {
        return prepareRequest("createAds", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.updateAds
     */
    @Rights(VKApiRigths.ADS)
    public String updateAds(VKParameters params) {
        return prepareRequest("updateAds", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.deleteAds
     */
    @Rights(VKApiRigths.ADS)
    public String deleteAds(VKParameters params) {
        return prepareRequest("deleteAds", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getStatistics
     */
    @Rights(VKApiRigths.ADS)
    public String getStatistics(VKParameters params) {
        return prepareRequest("getStatistics", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getDemographics
     */
    @Rights(VKApiRigths.ADS)
    public String getDemographics(VKParameters params) {
        return prepareRequest("getDemographics", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getBudget
     */
    @Rights(VKApiRigths.ADS)
    public String getBudget(VKParameters params) {
        return prepareRequest("getBudget", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public String getOfficeUsers(VKParameters params) {
        return prepareRequest("getOfficeUsers", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.addOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public String addOfficeUsers(VKParameters params) {
        return prepareRequest("addOfficeUsers", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.removeOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public String removeOfficeUsers(VKParameters params) {
        return prepareRequest("removeOfficeUsers", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getTargetingStats
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetingStats(VKParameters params) {
        return prepareRequest("getTargetingStats", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getSuggestions
     */
    @Rights(VKApiRigths.ADS)
    public String getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getCategories
     */
    @Rights(VKApiRigths.ADS)
    public String getCategories(VKParameters params) {
        return prepareRequest("getCategories", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getUploadURL
     */
    @Rights(VKApiRigths.ADS)
    public String getUploadURL(VKParameters params) {
        return prepareRequest("getUploadURL", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getVideoUploadURL
     */
    @Rights(VKApiRigths.ADS)
    public String getVideoUploadURL(VKParameters params) {
        return prepareRequest("getVideoUploadURL", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getFloodStats
     */
    @Rights(VKApiRigths.ADS)
    public String getFloodStats(VKParameters params) {
        return prepareRequest("getFloodStats", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getRejectionReason
     */
    @Rights(VKApiRigths.ADS)
    public String getRejectionReason(VKParameters params) {
        return prepareRequest("getRejectionReason", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.createTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public String createTargetGroup(VKParameters params) {
        return prepareRequest("createTargetGroup", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.updateTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public String updateTargetGroup(VKParameters params) {
        return prepareRequest("updateTargetGroup", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.deleteTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public String deleteTargetGroup(VKParameters params) {
        return prepareRequest("deleteTargetGroup", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.getTargetGroups
     */
    @Rights(VKApiRigths.ADS)
    public String getTargetGroups(VKParameters params) {
        return prepareRequest("getTargetGroups", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/ads.importTargetContacts
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
