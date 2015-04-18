package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

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
     * https://vk.com/dev/ads.getAccounts
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getAccounts(VKParameters params) {
        return prepareRequest("getAccounts", params);
    }

    /**
     * https://vk.com/dev/ads.getClients
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getClients(VKParameters params) {
        return prepareRequest("getClients", params);
    }

    /**
     * https://vk.com/dev/ads.createClients
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest createClients(VKParameters params) {
        return prepareRequest("createClients", params);
    }

    /**
     * https://vk.com/dev/ads.updateClients
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest updateClients(VKParameters params) {
        return prepareRequest("updateClients", params);
    }

    /**
     * https://vk.com/dev/ads.deleteClients
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest deleteClients(VKParameters params) {
        return prepareRequest("deleteClients", params);
    }

    /**
     * https://vk.com/dev/ads.getCampaigns
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getCampaigns(VKParameters params) {
        return prepareRequest("getCampaigns", params);
    }

    /**
     * https://vk.com/dev/ads.createCampaigns
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest createCampaigns(VKParameters params) {
        return prepareRequest("createCampaigns", params);
    }

    /**
     * https://vk.com/dev/ads.updateCampaigns
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest updateCampaigns(VKParameters params) {
        return prepareRequest("updateCampaigns", params);
    }

    /**
     * https://vk.com/dev/ads.deleteCampaigns
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest deleteCampaigns(VKParameters params) {
        return prepareRequest("deleteCampaigns", params);
    }

    /**
     * https://vk.com/dev/ads.getAds
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getAds(VKParameters params) {
        return prepareRequest("getAds", params);
    }

    /**
     * https://vk.com/dev/ads.getAdsLayout
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getAdsLayout(VKParameters params) {
        return prepareRequest("getAdsLayout", params);
    }

    /**
     * https://vk.com/dev/ads.getAdsTargeting
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getAdsTargeting(VKParameters params) {
        return prepareRequest("getAdsTargeting", params);
    }

    /**
     * https://vk.com/dev/ads.createAds
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest createAds(VKParameters params) {
        return prepareRequest("createAds", params);
    }

    /**
     * https://vk.com/dev/ads.updateAds
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest updateAds(VKParameters params) {
        return prepareRequest("updateAds", params);
    }

    /**
     * https://vk.com/dev/ads.deleteAds
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest deleteAds(VKParameters params) {
        return prepareRequest("deleteAds", params);
    }

    /**
     * https://vk.com/dev/ads.getStatistics
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getStatistics(VKParameters params) {
        return prepareRequest("getStatistics", params);
    }

    /**
     * https://vk.com/dev/ads.getDemographics
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getDemographics(VKParameters params) {
        return prepareRequest("getDemographics", params);
    }

    /**
     * https://vk.com/dev/ads.getBudget
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getBudget(VKParameters params) {
        return prepareRequest("getBudget", params);
    }

    /**
     * https://vk.com/dev/ads.getOfficeUsers
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getOfficeUsers(VKParameters params) {
        return prepareRequest("getOfficeUsers", params);
    }

    /**
     * https://vk.com/dev/ads.addOfficeUsers
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest addOfficeUsers(VKParameters params) {
        return prepareRequest("addOfficeUsers", params);
    }

    /**
     * https://vk.com/dev/ads.removeOfficeUsers
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest removeOfficeUsers(VKParameters params) {
        return prepareRequest("removeOfficeUsers", params);
    }

    /**
     * https://vk.com/dev/ads.getTargetingStats
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getTargetingStats(VKParameters params) {
        return prepareRequest("getTargetingStats", params);
    }

    /**
     * https://vk.com/dev/ads.getSuggestions
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params);
    }

    /**
     * https://vk.com/dev/ads.getCategories
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getCategories(VKParameters params) {
        return prepareRequest("getCategories", params);
    }

    /**
     * https://vk.com/dev/ads.getUploadURL
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getUploadURL(VKParameters params) {
        return prepareRequest("getUploadURL", params);
    }

    /**
     * https://vk.com/dev/ads.getVideoUploadURL
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getVideoUploadURL(VKParameters params) {
        return prepareRequest("getVideoUploadURL", params);
    }

    /**
     * https://vk.com/dev/ads.getFloodStats
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getFloodStats(VKParameters params) {
        return prepareRequest("getFloodStats", params);
    }

    /**
     * https://vk.com/dev/ads.getRejectionReason
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getRejectionReason(VKParameters params) {
        return prepareRequest("getRejectionReason", params);
    }

    /**
     * https://vk.com/dev/ads.createTargetGroup
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest createTargetGroup(VKParameters params) {
        return prepareRequest("createTargetGroup", params);
    }

    /**
     * https://vk.com/dev/ads.updateTargetGroup
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest updateTargetGroup(VKParameters params) {
        return prepareRequest("updateTargetGroup", params);
    }

    /**
     * https://vk.com/dev/ads.deleteTargetGroup
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest deleteTargetGroup(VKParameters params) {
        return prepareRequest("deleteTargetGroup", params);
    }

    /**
     * https://vk.com/dev/ads.getTargetGroups
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest getTargetGroups(VKParameters params) {
        return prepareRequest("getTargetGroups", params);
    }

    /**
     * https://vk.com/dev/ads.importTargetContacts
     *
     * You need the following rights to call this method: ads.
     */
    public VKRequest importTargetContacts(VKParameters params) {
        return prepareRequest("importTargetContacts", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "ads";
    }
}
