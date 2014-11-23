/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.element;

import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.gx.webmanager.springmvc.controller.component.ElementComponentController;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.gmics.webmanager.videoplayer.api.RBACConstants;
import com.gmics.webmanager.videoplayer.api.VideoPlayerElement;

/**
 * Controller for the VideoPlayer element.
 */
public class VideoPlayerElementController extends ElementComponentController {
    // Static logger for the class
    private static final Logger LOG = Logger.getLogger(VideoPlayerElementController.class.getName());

    // Properties that will be ignored when copying bean properties using BeanUtils
    private static final String[] BEANUTILS_COPYPROPERTIES_IGNORE = {"presentation", "downloads"};

    // Private member variable to store the form backing object, making it stateful during the lifetime
    // of one HTTP request. Note that the VideoPlayer element controller is not stateful itself so a new
    // instance of the controller and form backing object will be created for each HTTP request.
    private VideoPlayerElementFBO myFormBackingObject;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void createEditViews() {
        super.createEditViews();
        addEditView("editVideoPlayerElement.jspf", "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object formBackingObject(HttpServletRequest request) throws ServletException {
        if (myFormBackingObject == null) {
            // Create Form Backing Object
            myFormBackingObject = new VideoPlayerElementFBO(this);

            // Initialize form backing object with element values
            VideoPlayerElement element = (VideoPlayerElement) getElement();

            // Initialize form backing object with default values from element,
            // use BeanUtils of the Spring framework for this purpose
            BeanUtils.copyProperties(element, myFormBackingObject, BEANUTILS_COPYPROPERTIES_IGNORE);
        }

        // Return the Form Backing Object
        return myFormBackingObject;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
            BindException errors, ModelAndView modelAndView) throws Exception {
        if (((VideoPlayerElementComponent) getComponent()).getAuthorizationService().checkAccess(
                RBACConstants.UPDATE_ELEMENT)) {
            // Copy properties from the FBO to the business object
            VideoPlayerElement element = (VideoPlayerElement) getElement();

            // Update VideoPlayer element impl with these values
            if (element != null) {
                // Update the VideoPlayer element with values from the form backing
                // object, use BeanUtils of the Spring framework for this purpose
                BeanUtils.copyProperties(myFormBackingObject, element);
            }
        } else {
            LOG.warning("No authorization to update VideoPlayer elements");
        }
    }
}
