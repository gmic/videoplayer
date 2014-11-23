/*
 * Copyright (c) 2012 GMICS
 */
package videoplayer.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import nl.gx.webmanager.jcr.annotation.Interfaces;
import nl.gx.webmanager.wcb.ComponentBundleDefinition;
import nl.gx.webmanager.wcb.ComponentDefinition;

import org.junit.Before;
import org.junit.Test;

import com.gmics.webmanager.videoplayer.Activator;
import com.gmics.webmanager.videoplayer.api.VideoPlayerElement;
import com.gmics.webmanager.videoplayer.api.WCBConstants;
import com.gmics.webmanager.videoplayer.element.VideoPlayerElementImpl;

/**
 * This class contains the JUnit test of the element component. It contains some basic tests, extend it to your need.
 */
public class VideoPlayerElementTest extends Activator {

    /**
     * Setup the unit test mock objects.
     */
    @Before
    public void setUp() {
    }

    /**
     * Test if the activator defines proper component definitions and that the ids are defined properly.
     */
    @Test
    public void testActivator() {
        ComponentBundleDefinition definition = getBundleDefinition();
        assertEquals(WCBConstants.BUNDLE_ID, definition.getId());
        assertEquals(WCBConstants.DOMAIN + "." + WCBConstants.WCB_ID, definition.getId());
        assertEquals(WCBConstants.NAMESPACE_URI, "http://www.wcmexchange.com/" + WCBConstants.WCB_ID);
        assertEquals(WCBConstants.NAMESPACE_PREFIX, WCBConstants.WCB_ID);
        assertTrue(Activator.class.getPackage().getName().startsWith(WCBConstants.DOMAIN + "." + WCBConstants.WCB_ID));
        final ComponentDefinition[] defs = definition.getComponentDefinitions();
        assertTrue(defs != null);
        assertTrue(defs.length > 0);
        for (ComponentDefinition compDef : defs) {
            assertTrue(compDef.getId().startsWith(definition.getId()));
        }
    }

    /**
     * Test if the @Interfaces annotation on the element implementation is set properly. The element should implement
     * the interface that is marked by that annotation.
     */
    @Test
    public void testElementAnnotation() {
        Interfaces annotation = VideoPlayerElementImpl.class.getAnnotation(Interfaces.class);
        assertNotNull(annotation);
        String[] interfaceAnnotations = annotation.value();
        for (String interfaceAnnotation : interfaceAnnotations) {
            try {
                Class<?> intClass = VideoPlayerElementImpl.class.getClassLoader().loadClass(interfaceAnnotation);

                // Check if the element impl implements this interface
                assertTrue(intClass.isAssignableFrom(VideoPlayerElementImpl.class));
            } catch (ClassNotFoundException e) {
                fail("Interface annotation " + interfaceAnnotation + " defined by "
                        + VideoPlayerElement.class.getName() + " does not exist.");
            }
        }
    }

}
