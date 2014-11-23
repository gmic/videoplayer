/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.element;

import nl.gx.webmanager.authorization.AuthorizationService;
import nl.gx.webmanager.wcb.elementtype.impl.SimpleElementComponent;

/**
 * Implementation of the VideoPlayer element component. It overrides the simple element component in order to get the
 * authorization service injected.
 */
public class VideoPlayerElementComponent extends SimpleElementComponent {
    // Authorization service, injected by the framework
    private AuthorizationService myAuthorizationService;

    /**
     * Returns the authorization service.
     * @return the authorization service
     */
    public AuthorizationService getAuthorizationService() {
        return myAuthorizationService;
    }
}
