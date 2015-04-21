package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.annotation.Rights;
import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;
import com.batyaev.vk.api.consts.VKApiRigths;

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
    public VKRequest getAccounts(VKParameters params) {
        return prepareRequest("getAccounts", params);
    }

    /**
     * @link https://vk.com/dev/ads.getClients
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getClients(VKParameters params) {
        return prepareRequest("getClients", params);
    }

    /**
     * @link https://vk.com/dev/ads.createClients
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest createClients(VKParameters params) {
        return prepareRequest("createClients", params);
    }

    /**
     * @link https://vk.com/dev/ads.updateClients
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest updateClients(VKParameters params) {
        return prepareRequest("updateClients", params);
    }

    /**
     * @link https://vk.com/dev/ads.deleteClients
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest deleteClients(VKParameters params) {
        return prepareRequest("deleteClients", params);
    }

    /**
     * @link https://vk.com/dev/ads.getCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getCampaigns(VKParameters params) {
        return prepareRequest("getCampaigns", params);
    }

    /**
     * @link https://vk.com/dev/ads.createCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest createCampaigns(VKParameters params) {
        return prepareRequest("createCampaigns", params);
    }

    /**
     * @link https://vk.com/dev/ads.updateCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest updateCampaigns(VKParameters params) {
        return prepareRequest("updateCampaigns", params);
    }

    /**
     * @link https://vk.com/dev/ads.deleteCampaigns
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest deleteCampaigns(VKParameters params) {
        return prepareRequest("deleteCampaigns", params);
    }

    /**
     * @link https://vk.com/dev/ads.getAds
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getAds(VKParameters params) {
        return prepareRequest("getAds", params);
    }

    /**
     * @link https://vk.com/dev/ads.getAdsLayout
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getAdsLayout(VKParameters params) {
        return prepareRequest("getAdsLayout", params);
    }

    /**
     * @link https://vk.com/dev/ads.getAdsTargeting
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getAdsTargeting(VKParameters params) {
        return prepareRequest("getAdsTargeting", params);
    }

    /**
     * @link https://vk.com/dev/ads.createAds
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest createAds(VKParameters params) {
        return prepareRequest("createAds", params);
    }

    /**
     * @link https://vk.com/dev/ads.updateAds
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest updateAds(VKParameters params) {
        return prepareRequest("updateAds", params);
    }

    /**
     * @link https://vk.com/dev/ads.deleteAds
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest deleteAds(VKParameters params) {
        return prepareRequest("deleteAds", params);
    }

    /**
     * @link https://vk.com/dev/ads.getStatistics
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getStatistics(VKParameters params) {
        return prepareRequest("getStatistics", params);
    }

    /**
     * @link https://vk.com/dev/ads.getDemographics
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getDemographics(VKParameters params) {
        return prepareRequest("getDemographics", params);
    }

    /**
     * @link https://vk.com/dev/ads.getBudget
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getBudget(VKParameters params) {
        return prepareRequest("getBudget", params);
    }

    /**
     * @link https://vk.com/dev/ads.getOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getOfficeUsers(VKParameters params) {
        return prepareRequest("getOfficeUsers", params);
    }

    /**
     * @link https://vk.com/dev/ads.addOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest addOfficeUsers(VKParameters params) {
        return prepareRequest("addOfficeUsers", params);
    }

    /**
     * @link https://vk.com/dev/ads.removeOfficeUsers
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest removeOfficeUsers(VKParameters params) {
        return prepareRequest("removeOfficeUsers", params);
    }

    /**
     * @link https://vk.com/dev/ads.getTargetingStats
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getTargetingStats(VKParameters params) {
        return prepareRequest("getTargetingStats", params);
    }

    /**
     * @link https://vk.com/dev/ads.getSuggestions
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params);
    }

    /**
     * @link https://vk.com/dev/ads.getCategories
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getCategories(VKParameters params) {
        return prepareRequest("getCategories", params);
    }

    /**
     * @link https://vk.com/dev/ads.getUploadURL
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getUploadURL(VKParameters params) {
        return prepareRequest("getUploadURL", params);
    }

    /**
     * @link https://vk.com/dev/ads.getVideoUploadURL
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getVideoUploadURL(VKParameters params) {
        return prepareRequest("getVideoUploadURL", params);
    }

    /**
     * @link https://vk.com/dev/ads.getFloodStats
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getFloodStats(VKParameters params) {
        return prepareRequest("getFloodStats", params);
    }

    /**
     * @link https://vk.com/dev/ads.getRejectionReason
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getRejectionReason(VKParameters params) {
        return prepareRequest("getRejectionReason", params);
    }

    /**
     * @link https://vk.com/dev/ads.createTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest createTargetGroup(VKParameters params) {
        return prepareRequest("createTargetGroup", params);
    }

    /**
     * @link https://vk.com/dev/ads.updateTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest updateTargetGroup(VKParameters params) {
        return prepareRequest("updateTargetGroup", params);
    }

    /**
     * @link https://vk.com/dev/ads.deleteTargetGroup
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest deleteTargetGroup(VKParameters params) {
        return prepareRequest("deleteTargetGroup", params);
    }

    /**
     * @link https://vk.com/dev/ads.getTargetGroups
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest getTargetGroups(VKParameters params) {
        return prepareRequest("getTargetGroups", params);
    }

    /**
     * @link https://vk.com/dev/ads.importTargetContacts
     */
    @Rights(VKApiRigths.ADS)
    public VKRequest importTargetContacts(VKParameters params) {
        return prepareRequest("importTargetContacts", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "ads";
    }
}
