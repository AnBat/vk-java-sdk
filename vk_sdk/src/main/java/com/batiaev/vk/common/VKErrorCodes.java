/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common;

/**
 * @author batiaev
 * @since 03/05/15
 */
public class VKErrorCodes {
    /**
     * Unknown error occurred
     * <p>
     * Try again later.
     */
    public final static int UNKNOWN = 1;
    /**
     * Application is disabled. Enable your application or use test mode
     * <p>
     * You need to switch on the app in Settings (https://vk.com/editapp?id={Your API_ID})
     * or use the test mode (test_mode=1).
     */
    public final static int APP_DISABLED = 2;
    /**
     * Unknown method passed
     * <p>
     * Check the method name: <a href="https://vk.com/dev/methods">https://vk.com/dev/methods</a> .
     */
    public final static int UNKNOWN_METHOD = 3;
    /**
     * Incorrect signature
     * <p>
     * Check if the signature has been formed correctly:
     * <a href="https://vk.com/dev/api_nohttps">API nohttps</a>
     */
    public final static int INCORRECT_SIGNATURE = 4;
    /**
     * User authorization failed
     * <p>
     * Make sure that you use a correct authorization type.
     * To work with the methods without a secureprefix you need to authorize a user with one of these ways:
     * <a href="https://vk.com/dev/auth_sites">Auth sites</a>.
     * <a href="https://vk.com/dev/auth_mobile">Auth mobile</a>.
     */
    public final static int AUTHORIZATION_FAILED = 5;
    /**
     * Too many requests per second
     * <p>
     * Decrease the request frequency or use the execute method.
     * More details on frequency limits here:
     * <a href="https://vk.com/dev/api_requests">API requests</a>.
     */
    public final static int TOO_MANY_REQUEST = 6;
    /**
     * Permission to perform this action is denied
     * <p>
     * Make sure that your have received required permissions during the authorization.
     * You can do it with the account.getAppPermissions method.
     */
    public final static int PERMISSION_DENIED = 7;
    /**
     * Invalid request
     * <p>
     * Check the @link request syntax and used parameters list (it can be found on a method description page) .
     */
    public final static int INVALID_REQUEST = 8;
    /**
     * Flood control
     * <p>
     * You need to decrease the count of identical requests. For more efficient work you may use execute or JSONP.
     */
    public final static int FLOOD_CONTROL = 9;
    /**
     * Internal server error
     * <p>
     * Try again later.
     */
    public final static int INTERNAL_SERVER_ERROR = 10;
    /**
     * In test mode application should be disabled or user should be authorized
     * <p>
     * Switch the app off in Settings: https://vk.com/editapp?id={Your API_ID}.
     */
    public final static int TEST_MODE_OR_USER_NOT_AUTHORIZED = 11;
    /**
     * Captcha needed
     * <p>
     * Work with this error is explained in detail on the separate page.
     */
    public final static int CAPTCHA_NEEDED = 14;
    /**
     * Access denied
     * <p>
     * Make sure that you use correct identifiers and the content is available for the user in the full version of the site.
     */
    public final static int ACCESS_DENIED = 15;
    /**
     * HTTP authorization failed
     * <p>
     * To avoid this error check if a user has the 'Use secure connection' option enabled
     * with the @link account.getInfo method.
     */
    public final static int HTTP_AUTH_FAILED = 16;
    /**
     * Validation required
     * <p>
     * Make sure that you don't use a token received with <a href="https://vk.com/dev/auth_mobile">auth_mobile</a>.
     * for a request from the server. It's restricted. The validation process is described on the @link separate page.
     */
    public final static int VALIDATION_REQUEST = 17;
    /**
     * Permission to perform this action is denied for non-standalone applications
     * <p>
     * If you see this error despite your app has the Standalone type, make sure that you use
     * redirect_uri=<a href="https://oauth.vk.com/blank.html">https://oauth.vk.com/blank.html</a>. Details here:
     * <a href="https://vk.com/dev/auth_mobile">Auth mobile</a>.
     */
    public final static int PERMISSON_DENIED_FOR_NON_STAND_ALONE_APP = 20;
    /**
     * Permission to perform this action is allowed only for Standalone and OpenAPI applications
     */
    public final static int PERMISSON_ALLOWED_FOR_STANDALONE_AND_OPENAPI = 21;
    /**
     * This method was disabled
     * <p>
     * All the methods available now are listed here: <a href="https://vk.com/dev/methods">Auth mobile</a>.
     */
    public final static int METHOD_DISABLED = 23;
    /**
     * Confirmation required
     * <p>
     * Confirmation process is described on the @link separate page.
     */
    public final static int CONFIRMATION_REQUEST = 24;
    /**
     * One of the parameters specified was missing or invalid
     * <p>
     * Check the reqired parameters list and their format on a method description page.
     */
    public final static int PARAMETER_MISSING_OR_INVALID = 100;
    /**
     * Invalid application API ID
     * <p>
     * Find the app in the administrated list in settings: @link http://vk.com/apps?act=settings
     * And set the correct API_ID in the request
     */
    public final static int INVALID_APP_ID = 101;
    /**
     * Invalid user id
     * <p>
     * Make sure that you use a correct id. You can get an id using a screen name
     * with the @link utils.resolveScreenName method
     */
    public final static int INVALID_USER_ID = 113;
    /**
     * Invalid timestamp
     * <p>
     * You may get a correct value with the @link utils.getServerTime method.
     */
    public final static int INVALID_TIMESTAMP = 150;
    /**
     * Access to album denied
     * <p>
     * Make sure you use correct ids (owner_id is always positive for users, negative for communities)
     * and the current user has access to the requested content in the full version of the site.
     */
    public final static int ACCESS_TO_ALBUM_DENIED = 200;
    /**
     * Access to audio denied
     * <p>
     * Make sure you use correct ids (owner_id is always positive for users, negative for communities)
     * and the current user has access to the requested content in the full version of the site.
     */
    public final static int ACCESS_TO_AUDIO_DENIED = 201;
    /**
     * Access to group denied
     * <p>
     * Make sure that the current user is a member or admin of the community
     * (for closed and private groups and events).
     */
    public final static int ACCESS_TO_GROUP_DENIED = 203;
    /**
     * This album is full
     * <p>
     * You need to delete the odd objects from the album or use another album.
     */
    public final static int ALBUM_IS_FULL = 300;
    /**
     * Permission denied. You must enable votes processing in application settings
     * <p>
     * Check the app settings: http://vk.com/editapp?id={Your API_ID}&amp;section=payments
     */
    public final static int PERMISSION_DENIED_DESABLED_VOTES = 500;
    /**
     * Permission denied. You have no access to operations specified with given object(s)
     */
    public final static int PERMISSION_DENIED_NO_ACCESS = 600;
    /**
     * Some ads error occured
     */
    public final static int SOME_ADS = 603;
}
