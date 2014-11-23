/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.api;

/**
 * This class contains the identifiers, namespaces, names and descriptions of the WCB itself and of the components it
 * contains. If you need to use IDs defined by this WCB, use these constants rather then hard coded values.
 */
public final class WCBConstants {
    /**
     * The domain of this WCB, i.e. 'nl.gx.product'. By convention the domain contains only characters in the range
     * [a-z] separated by dots.
     */
    public static final String DOMAIN = "com.gmics.webmanager";

    /**
     * The WCB ID of this WCB, i.e. 'helloworldelement'. By convention the WCB ID contains only characters in the range
     * [a-z].
     */
    public static final String WCB_ID = "videoplayer";

    /**
     * The full namespace URI used by JCR node types contained by this WCB.
     */
    public static final String NAMESPACE_URI = "http://www.wcmexchange.com/" + WCB_ID;

    /**
     * The namespace prefix used by JCR node types contained by this WCB.
     */
    public static final String NAMESPACE_PREFIX = WCB_ID;

    /**
     * The ID of the component bundle definition. Each WCB has exactly one component bundle definition but may have one
     * or more component definitions.
     */
    public static final String BUNDLE_ID = DOMAIN + "." + WCB_ID;

    /**
     * The name of this WCB, equals the name of the component bundle definition.
     */
    public static final String BUNDLE_NAME = "videoplayer";

    /**
     * The description of this WCB, equals the description of the component bundle definition.
     */
    public static final String BUNDLE_DESCRIPTION = "videoplayer WCB";

    /**
     * The component definition ID of the VideoPlayer element component.
     */
    public static final String ELEMENT_COMPONENT_ID = BUNDLE_ID + ".element";

    /**
     * The name of the VideoPlayer element component.
     */
    public static final String ELEMENT_COMPONENT_NAME = "videoplayer element";

    /**
     * The description of the VideoPlayer element component.
     */
    public static final String ELEMENT_COMPONENT_DESCRIPTION = "videoplayer element component";
    /**
     * The component definition ID of the VideoPlayer element component.
     */
    public static final String PRESENTATION_COMPONENT_ID = BUNDLE_ID + ".presentation";

    /**
     * The name of the VideoPlayer element component.
     */
    public static final String PRESENTATION_COMPONENT_NAME = "videoplayer presentation";

    /**
     * The description of the VideoPlayer element component.
     */
    public static final String PRESENTATION_COMPONENT_DESCRIPTION = "videoplayer presentation component";

    /**
     * The name of the VideoPlayer element node type.
     */
    public static final String ELEMENT_NODE_TYPE_NAME = "element";

    /**
     * The component definition ID of the online help service provider component.
     */
    public static final String HELPPROVIDER_COMPONENT_ID = BUNDLE_ID + ".onlinehelp";

    /**
     * The name of the online help service provider component.
     */
    public static final String HELPPROVIDER_COMPONENT_NAME = "videoplayer Online Help provider";

    /**
     * The description of the online help service provider component.
     */
    public static final String HELPPROVIDER_COMPONENT_DESCRIPTION = "videoplayer Online Help provider "
            + "service component";

    /**
     * The anchor for the "introduction" chapter in the Online help.
     */
    public static final String OH_ANCHOR_INTRODUCTION = BUNDLE_ID + "/introduction";

    /**
     * Constructor. Do not instantiate, this class only contains constants.
     */
    private WCBConstants() {
    }
}
