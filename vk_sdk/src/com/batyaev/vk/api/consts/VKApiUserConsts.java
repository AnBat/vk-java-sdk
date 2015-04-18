package com.batyaev.vk.api.consts;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.lang.String;

public class VKApiUserConsts {
    public final static String FIELD_UID = "uid";
    public final static String FIELD_FIRST_NAME = "first_name";
    public final static String FIELD_LAST_NAME = "last_name";
    public final static String FIELD_DEACTIVATED = "deactivated"; //{deleted, banned}
    public final static String FIELD_HIDDEN = "hidden";
    public final static String FIELD_VERIFIED = "verified";
    public final static String FIELD_BLACKLISTED = "blacklisted";
    public final static String FIELD_SEX = "sex"; //{1 — female; 2 — male; 0 — not specified.}
    public final static String FIELD_BDATE = "bdate"; //DD.MM.YYYY or DD.MM (if birth year is hidden) or nothing if date is hidden
    public final static String FIELD_CITY = "city";
    public final static String FIELD_COUNTRY = "country";
    public final static String FIELD_HOME_TOWN = "home_town";
    public final static String FIELD_PHOTO_50 = "photo_50"; //default = http://vk.com/images/camera_c.gif
    public final static String FIELD_PHOTO_100 = "photo_100"; //default = http://vk.com/images/camera_b.gif
    public final static String FIELD_PHOTO_200_ORIG = "photo_200_orig"; //default = http://vk.com/images/camera_a.gif
    public final static String FIELD_PHOTO_200 = "photo_200";
    public final static String FIELD_PHOTO_400_ORIG = "photo_400_orig";
    public final static String FIELD_PHOTO_MAX = "photo_max"; //default = http://vk.com/images/camera_b.gif
    public final static String FIELD_PHOTO_MAX_ORIG = "photo_max_orig"; //default = http://vk.com/images/camera_a.gif
    public final static String FIELD_ONLINE = "online";
    //sub
    public final static String FIELD_ONLINE_MOBILE = "online_mobile";
    public final static String FIELD_ONLINE_APP = "online_app";
    //end sub
    public final static String FIELD_LISTS = "lists"; //comma separated IDs
    public final static String FIELD_DOMAIN = "domain";
    public final static String FIELD_HAS_MODILE = "has_mobile";
    public final static String FIELD_CONTACTS = "contacts";
    //sub
    public final static String FIELD_CONTACTS_MOBILE_PHONE = "mobile_phone"; //only for standalone applications
    public final static String FIELD_CONTACTS_HOME_PHONE = "home_phone";
    //end sub
    public final static String FIELD_SITE = "site";
    public final static String FIELD_EDUCATION = "education";
    //sub
    public final static String FIELD_EDUCATION_UNIVERSITY = "university";
    public final static String FIELD_EDUCATION_UNIVERSITY_NAME = "university_name";
    public final static String FIELD_EDUCATION_FACULTY = "faculty";
    public final static String FIELD_EDUCATION_FACULTY_NAME = "faculty_name";
    public final static String FIELD_EDUCATION_GRADUATION = "graduation";
    //end sub
    public final static String FIELD_UNIVERSITIES = "universities";
    //sub
    public final static String FIELD_UNIVERSITIES_ID = "id";
    public final static String FIELD_UNIVERSITIES_COUNTRY = "country";
    public final static String FIELD_UNIVERSITIES_CITY = "city";
    public final static String FIELD_UNIVERSITIES_NAME = "name";
    public final static String FIELD_UNIVERSITIES_FACULTY = "faculty";
    public final static String FIELD_UNIVERSITIES_FACULTY_NAME = "faculty_name";
    public final static String FIELD_UNIVERSITIES_CHAIR = "chair";
    public final static String FIELD_UNIVERSITIES_CHAIR_NAME = "chair_name";
    public final static String FIELD_UNIVERSITIES_GRADUATION = "graduation";
    //end sub
    public final static String FIELD_SCHOOLS = "schools";
    //sub
    public final static String FIELD_SCHOOLS_ID = "id";
    public final static String FIELD_SCHOOLS_COUNTRY = "country";
    public final static String FIELD_SCHOOLS_CITY = "city";
    public final static String FIELD_SCHOOLS_NAME = "name";
    public final static String FIELD_SCHOOLS_YEAR_FROM = "year_from";
    public final static String FIELD_SCHOOLS_YEAR_TO = "year_to";
    public final static String FIELD_SCHOOLS_YEAR_GRADUATED = "year_graduated";
    public final static String FIELD_SCHOOLS_CLASS = "class";
    public final static String FIELD_SCHOOLS_SPECIALITY = "speciality";
    public final static String FIELD_SCHOOLS_TYPE = "type";
    public final static String FIELD_SCHOOLS_TYPE_STR = "type_str";
    //end sub
    public final static String FIELD_STATUS = "status";
    public final static String FIELD_LAST_SEEN = "last_seen";
    //sub
    public final static String FIELD_LAST_SEEN_TIME = "time"; //in Unix time
    public final static String FIELD_LAST_SEEN_PLATFORM = "platform";
    //end sub
    public final static String FIELD_FOLOWERS_COUNT = "followers_count";
    public final static String FIELD_COUNT = "common_count";
    public final static String FIELD_COUNTERS = "counters";
    //sub
    public final static String FIELD_COUNTERS_ALBUMS = "albums";
    public final static String FIELD_COUNTERS_VIDEOS = "videos";
    public final static String FIELD_COUNTERS_AUDIOS = "audios";
    public final static String FIELD_COUNTERS_NOTES = "notes";
    public final static String FIELD_COUNTERS_FRIENDS = "friends";
    public final static String FIELD_COUNTERS_GROUPS = "groups";
    public final static String FIELD_COUNTERS_ONLINE_FRIENDS = "online_friends";
    public final static String FIELD_COUNTERS_MANUAL_FRIENDS = "mutual_friends";
    public final static String FIELD_COUNTERS_USER_VIDEOS = "user_videos";
    public final static String FIELD_COUNTERS_FOLLOWERS = "followers";
    public final static String FIELD_COUNTERS_USER_PHOTOS = "user_photos"; //Fields returned only for desktop applications:
    public final static String FIELD_COUNTERS_SUBSCRIPTIONS = "subscriptions"; //Fields returned only for desktop applications:
    //end sub
    public final static String FIELD_OCCUPATION = "occupation";
    //sub
    public final static String FIELD_OCCUPATION_TYPE = "type"; //{work, school, university; }
    public final static String FIELD_OCCUPATION_ID = "id";
    public final static String FIELD_OCCUPATION_NAME = "name";
    //end sub
    public final static String FIELD_NICKNAME = "nickname";
    public final static String FIELD_RELATIVES = "relatives";
    //sub
    public final static String FIELD_RELATIVES_ID = "id"; //or name not together
    public final static String FIELD_RELATIVES_NAME = "name"; //or id not together
    public final static String FIELD_RELATIVES_TYPE = "type";
    //end sub
    public final static String FIELD_RELATION = "relation";
//    1 – single;
//    2 – in a relationship;
//    3 – engaged;
//    4 – married;
//    5 – it's complicated;
//    6 – actively searching;
//    7 – in love.
    public final static String FIELD_PERSONAL = "personal";
    //sub
    public final static String FIELD_POLITICAL = "political";
//    1 – Communist;
//    2 – Socialist;
//    3 – Moderate;
//    4 – Liberal;
//    5 – Conservative;
//    6 – Monarchist;
//    7 – Ultraconservative;
//    8 – Apathetic;
//    9 – Libertian.
    public final static String FIELD_LANGS = "langs";
    public final static String FIELD_RELIGION = "religion";
    public final static String FIELD_INSPIRED_BY = "inspired_by";
    public final static String FIELD_PEOPLE_MAIN = "people_main";
//    1 – intellect and creativity;
//    2 – kindness and honesty;
//    3 – health and beauty;
//    4 – wealth and power;
//    5 – courage and persistance;
//    6 – humor and love for life.
    public final static String FIELD_LIFE_MAIN = "life_main";
//    1 – family and children;
//    2 – career and money;
//    3 – entertainment and leisure;
//    4 – science and research;
//    5 – improving the world;
//    6 – personal development;
//    7 – beauty and art ;
//    8 – fame and influence;
    public final static String FIELD_SMOKING = "smoking";
//    1 – very negative;
//    2 – negative;
//    3 – neutral;
//    4 – compromisable;
//    5 – positive.
    public final static String FIELD_ALCOHOL = "alcohol";
//    1 – very negative;
//    2 – negative;
//    3 – neutral;
//    4 – compromisable;
//    5 – positive.
    public final static String FIELD_CONNECTIONS = "connections"; //{skype, facebook, twitter, livejournal, instagram.}
    public final static String FIELD_EXPORTS = "exports"; //{twitter, facebook, livejournal, instagram}
    public final static String FIELD_WALL_COMMENTS = "wall_comments"; //{0,1}
    public final static String FIELD_ACTIVITIES = "activities";
    public final static String FIELD_INTERESTS = "interests";
    public final static String FIELD_MUSIC = "music";
    public final static String FIELD_MOVIES = "movies";
    public final static String FIELD_TV = "tv";
    public final static String FIELD_BOOKS = "books";
    public final static String FIELD_GAMES = "games";
    public final static String FIELD_ABOUT = "about";
    public final static String FIELD_QUOTES = "quotes";
    public final static String FIELD_CAN_POST = "can_post";
    public final static String FIELD_CAN_SEE_ALL_POSTS = "can_see_all_posts";
    public final static String FIELD_CAN_SEE_AUDIO = "can_see_audio";
    public final static String FIELD_CAN_WRITE_PRIVATE_MESSAGE = "can_write_private_message";
    public final static String FIELD_TIMEZONE = "timezone";
    public final static String FIELD_SCREEN_NAME = "screen_name";
}
