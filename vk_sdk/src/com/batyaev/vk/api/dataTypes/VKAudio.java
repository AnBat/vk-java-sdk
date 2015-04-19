package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * An audio object describes an audio file
 */
public class VKAudio {

    public int id; //Audio ID.
    public int owner_id; //Audio owner ID.
    public String artist; //Artist name.
    public String title; //Audio file title.
    public int duration; //Duration (in seconds).
    public String url; //Link to mp3.
    public String lyrics_id; //ID of the lyrics (if available) of the audio file.
    public int album_id; //ID of the album containing the audio file (if assigned).
    public VKAudioGenre genre_id; //Genre ID. See the list of audio genres.

}

