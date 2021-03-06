package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 * @since 11/9/15
 */
public class VkWallAttachment extends VkMessageAttachment {

    private VKPost post;

    public VkWallAttachment() {
        type = Wall;
        post = new VKPost();
    }

    public VKPost post() {
        return post;
    }

    public void setPost(VKPost post) {
        this.post = post;
    }
}
