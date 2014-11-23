/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.api;

/**
 * This class defines the RBAC permissions defined and used by this WCB. If you want to check authorization against RBAC
 * permissions defined by this WCB, use these constants rather then hard coded values. For example:
 * myAuthorizationService.checkAccess(RBACConstants.CREATE_ELEMENT);
 */
public final class RBACConstants {
    /**
     * ID of the VideoPlayer element RBAC permission category.
     */
    public static final String ELEMENT_CATEGORY = WCBConstants.ELEMENT_COMPONENT_ID;

    /**
     * RBAC Permission ID needed to create a VideoPlayer element.
     */
    public static final String CREATE_ELEMENT = WCBConstants.ELEMENT_COMPONENT_ID + ".create";

    /**
     * RBAC Permission ID needed to update a VideoPlayer element.
     */
    public static final String UPDATE_ELEMENT = WCBConstants.ELEMENT_COMPONENT_ID + ".update";

    /**
     * RBAC Permission ID needed to delete a VideoPlayer element.
     */
    public static final String DELETE_ELEMENT = WCBConstants.ELEMENT_COMPONENT_ID + ".delete";

    /**
     * Constructor. Do not instantiate, this class only contains constants.
     */
    private RBACConstants() {
    }
}
