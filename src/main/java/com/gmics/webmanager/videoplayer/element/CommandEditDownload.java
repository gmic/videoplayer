/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.element;

/**
 * Implementation of the form backing object for editing downloads data in the edit environment.
 */
public class CommandEditDownload {

    private Boolean myRemove;
    private String myDownloadURL;

    /**
     * Constructor of the VideoPlayer element form backing object.
     */
    public CommandEditDownload() {
    }

    /**
     * Returns the value of downloadURL.
     * @return the downloadURL
     */
    public String getDownloadURL() {
        return myDownloadURL;
    }

    /**
     * Returns true if this download should be removed.
     * @return true if download should be removed
     */
    public Boolean getRemove() {
        if (myRemove == null) {
            return false;
        }
        return myRemove;
    }

    /**
     * Sets the value of downloadURL.
     * @param downloadURL the downloadURL to set
     */
    public void setDownloadURL(String downloadURL) {
        this.myDownloadURL = downloadURL;
    }

    /**
     * Sets the value of remove.
     * @param remove true if download should be removed
     */
    public void setRemove(Boolean remove) {
        this.myRemove = remove;
    }

}
