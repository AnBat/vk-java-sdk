package com.batiaev.vk.common;

/**
 * @author batiaev
 * Created by batiaev on 7/3/15.
 */
public class VKApiVersion {
    public static final String v4_0 = "4.0";
    public static final String v5_30 = "5.30";
    public static final String v5_31 = "5.31";
    public static final String v5_32 = "5.32";
    public static final String v5_33 = "5.33";
    public static final String v5_34 = "5.34";
    public static final String Latest = v5_34;

    String versionChanges(String version) {
        switch (version) {
            case v4_0:
                return "offset and count could be only positive\n" +
                        "Affects methods messages.get, messages.getDialogs";
            case v5_30:
                return "Affects methods photos.createAlbum, photos.editAlbum, photos.getAlbums, " +
                        "video.get, video.edit, video.getAlbums, video.getAlbumById, video.getAlbumsByVideo, " +
                        "video.addAlbum, video.editAlbum, video.save, notes.add, notes.edit, notes.get, notes.getById";
            case v5_31:
                return "Affects methods account.registerDevice, account.unregisterDevice, account.setSilenceMode, account.getPushSettings";
            case v5_32:
                return "";
            case v5_33:
                return "Affects methods wall.getComments, photos.getComments, video.getComments, board.getComments";
            case v5_34:
                return "The error will be returned if the access to video comments is restricted.\n" +
                        "Affects methods video.getComments";
            default:
                return "";
        }
    }
}
