package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * @author batiaev
 *
 * Builds requests for API.stats part
 *
 * @see <a href="https://vk.com/dev/stats">API stats</a>
 */
public class VKApiStats extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/stats.get">API stats.get()</a>
     *
     * This method doesn't require any specific rights.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/stats.trackVisitor">API stats.trackVisitor()</a>
     *
     * Adds information about the current session in the attendance statistics application.
     * After the first call of this method in the "Statistics" section of your application settings
     * will be available tab "visitors." It will display information about the number of start-ups
     * and unique visitors to your application.
     *
     * In order to obtain reliable data on attendance application method must be called each time you start.
     *
     * This method is available only Standalone-applications.
     *
     * result
     * In case of successful processing method will return 1.
     */
    public String trackVisitor(VKParameters params) {
        return prepareRequest("trackVisitor", params).getRequest();
    }

    /**
     * Returns statistics for the records on the wall.
     * Statistics records currently available only for the community with the number
     * of participants from 10,000 and above, as well as official communities.
     * This method does not require authorization.
     *
     * @param params required params:
     *  - owner_id community identity - the owner of record. Indicated with a "minus". [integer required parameter]
     *  - post_id record identifier. [positive number Required]
     * Please note - these statistics are only available for the 300 last (most recent) records on the wall of the community.
     * @return statistics data records in the form of the object that contains the following fields:
     *  - reach_subscribers - coverage of subscribers;
     *  - reach_total - total coverage;
     *  - links - clicks on;
     *  - to_group - transitions in the Community;
     *  - join_group - entry into the community;
     *  - report - a record number of complaints;
     *  - hide - hide the number of entries;
     *  - unsubscribe - unsubscribe the number of participants.
     */
    public String getPostReach(VKParameters params) {
        return prepareRequest("getPostReach", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "stats";
    }
}
