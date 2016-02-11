package com.batiaev.vk.common.json2class;

import com.batiaev.vk.common.consts.VKApiConst;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.entity.VkError;
import com.batiaev.vk.common.entity.VkObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import static com.batiaev.vk.common.entity.VkObjectType.*;

/**
 * Created by batiaev on 2/11/16.
 * @author batiaev
 */
public class VkJson2Class {
    private static final Logger LOG = LogManager.getLogger(VkJson2Class.class);

    public static VkObject toClass(JSONObject jsonObject, int type) {
        VkObject object = new VkObject();
        switch (type) {
            case ERROR:
                object = parseError(jsonObject);
                break;
        }
        return object;
    }

    public static JSONObject toJson(VkObject object) {
        return new JSONObject();
    }

    //---

    private static VkError parseError(JSONObject jsonObject) {
        LOG.debug("Parsing error...");
        VkError error = new VkError();
        error.error_code = jsonObject.getInt(VKApiJsonConst.ERROR_CODE);
        error.error_msg = jsonObject.getString(VKApiJsonConst.ERROR_MSG);
        JSONArray requestParams = jsonObject.getJSONArray(VKApiConst.REQUEST_PARAMS);
        for (int i = 0; i < requestParams.length(); ++i) {
            JSONObject param = requestParams.getJSONObject(i);
            error.request_params.put(param.getString(VKApiConst.KEY), param.getString(VKApiConst.VALUE));
        }
        return error;
    }
}
