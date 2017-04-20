/*
 * Created by anton on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.entity;

/**
 * An audio object describes an audio file
 *
 * @see VKAudioGenre
 */
public class VKAudio extends AbstractEntity {

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int ownerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String artist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int duration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String url() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String lyricsId() {
        return lyrics_id;
    }

    public void setLyricsId(String lyrics_id) {
        this.lyrics_id = lyrics_id;
    }

    public int albumId() {
        return album_id;
    }

    public void setAlbumId(int album_id) {
        this.album_id = album_id;
    }

    public VKAudioGenre genreId() {
        return genre_id;
    }

    public void setGenreId(VKAudioGenre genre_id) {
        this.genre_id = genre_id;
    }

    /**
     * Audio ID.
     */
    private int id;
    /**
     * Audio owner ID.
     */
    private int owner_id;
    /**
     * Artist name.
     */
    private String artist;
    /**
     * Audio file title.
     */
    private String title;
    /**
     * Duration (in seconds).
     */
    private int duration;
    /**
     * Link to mp3.
     */
    private String url;
    /**
     * ID of the lyrics (if available) of the audio file.
     */
    private String lyrics_id;
    /**
     * ID of the album containing the audio file (if assigned).
     */
    private int album_id;
    /**
     * Genre ID. See the list of audio genres.
     */
    private VKAudioGenre genre_id;

}

