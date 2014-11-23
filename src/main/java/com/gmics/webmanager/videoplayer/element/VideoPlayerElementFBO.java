/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.element;

import nl.gx.webmanager.cms.element.implementation.ElementFBO;
import nl.gx.webmanager.springmvc.DelegatedController;

import com.gmics.webmanager.videoplayer.api.WCBConstants;

/**
 * Implementation of the form backing object for editing the element in the edit environment.
 */
public class VideoPlayerElementFBO extends ElementFBO {
    private CommandEditDownload[] myDownloads;

    private String myVideoURL;
    private String myImageURL;
    private String myImageAlt;
    private Boolean myAudioDescriptionEnabled;
    private String myAudioDescriptionFile;
    private Boolean myCaptionsEnabled;
    private String myCaptionsFiles;
    private String myCaptionsLabels;
    private Boolean myGaproEnabled;
    private String myGaproKey;
    private String myDownloadTitle;
    private Boolean myDownloadsEnabled = true;
    private String myDownloadsURL1;
    private String myDownloadsURL2;
    private String myDownloadsURL3;
    private String myDownloadsURL4;
    private String myDownloadsURL5;
    private String myDownloadsURL6;
    private String myDownloadsMeta1;
    private String myDownloadsMeta2;
    private String myDownloadsMeta3;
    private String myDownloadsMeta4;
    private String myDownloadsMeta5;
    private String myDownloadsMeta6;
    private String myDownloadsText1;
    private String myDownloadsText2;
    private String myDownloadsText3;
    private String myDownloadsText4;
    private String myDownloadsText5;
    private String myDownloadsText6;

    /**
     * Constructor of the VideoPlayer element form backing object.
     * @param controller Controller that creates and manages this form backing object
     */
    public VideoPlayerElementFBO(DelegatedController controller) {
        super(controller);
    }

    /**
     * Returns the value of audioDescriptionEnabled.
     * @return the audioDescriptionEnabled
     */
    public Boolean getAudioDescriptionEnabled() {
        return myAudioDescriptionEnabled;
    }

    /**
     * Returns the value of audioDescriptionFile.
     * @return the audioDescriptionFile
     */
    public String getAudioDescriptionFile() {
        return myAudioDescriptionFile;
    }

    /**
     * Returns the value of captionsEnabled.
     * @return true if captionsEnabled
     */
    public Boolean getCaptionsEnabled() {
        return myCaptionsEnabled;
    }

    /**
     * Returns the value of captionsFiles.
     * @return the captionsFiles
     */
    public String getCaptionsFiles() {
        return myCaptionsFiles;
    }

    /**
     * Returns the value of captionsLabels.
     * @return the captionsLabels
     */
    public String getCaptionsLabels() {
        return myCaptionsLabels;
    }

    /**
     * Returns the value of downloadTitle.
     * @return the downloads
     */
    public CommandEditDownload[] getDownloads() {
        return myDownloads;
    }

    /**
     * Returns the value of getDownloadsEnabled.
     * @return true if downloadsEnabled
     */
    public Boolean getDownloadsEnabled() {
        return myDownloadsEnabled;
    }

    /**
     * Returns the value of downloadsMeta1.
     * @return the downloadsMeta1
     */
    public String getDownloadsMeta1() {
        return myDownloadsMeta1;
    }

    /**
     * Returns the value of downloadsMeta2.
     * @return the downloadsMeta2
     */
    public String getDownloadsMeta2() {
        return myDownloadsMeta2;
    }

    /**
     * Returns the value of downloadsMeta3.
     * @return the downloadsMeta3
     */
    public String getDownloadsMeta3() {
        return myDownloadsMeta3;
    }

    /**
     * Returns the value of downloadsMeta4.
     * @return the downloadsMeta4
     */
    public String getDownloadsMeta4() {
        return myDownloadsMeta4;
    }

    /**
     * Returns the value of downloadsMeta5.
     * @return the downloadsMeta5
     */
    public String getDownloadsMeta5() {
        return myDownloadsMeta5;
    }

    /**
     * Returns the value of downloadsMeta6.
     * @return the downloadsMeta6
     */
    public String getDownloadsMeta6() {
        return myDownloadsMeta6;
    }

    /**
     * Returns the value of downloadsText1.
     * @return the downloadsText1
     */
    public String getDownloadsText1() {
        return myDownloadsText1;
    }

    /**
     * Returns the value of downloadsText2.
     * @return the downloadsText2
     */
    public String getDownloadsText2() {
        return myDownloadsText2;
    }

    /**
     * Returns the value of downloadsText3.
     * @return the downloadsText3
     */
    public String getDownloadsText3() {
        return myDownloadsText3;
    }

    /**
     * Returns the value of downloadsText4.
     * @return the downloadsText4
     */
    public String getDownloadsText4() {
        return myDownloadsText4;
    }

    /**
     * Returns the value of downloadsText5.
     * @return the downloadsText5
     */
    public String getDownloadsText5() {
        return myDownloadsText5;
    }

    /**
     * Returns the value of downloadsText6.
     * @return the downloadsText6
     */
    public String getDownloadsText6() {
        return myDownloadsText6;
    }

    /**
     * Returns the value of downloadsURL1.
     * @return the downloadsURL1
     */
    public String getDownloadsURL1() {
        return myDownloadsURL1;
    }

    /**
     * Returns the value of downloadsURL2.
     * @return the downloadsURL2
     */
    public String getDownloadsURL2() {
        return myDownloadsURL2;
    }

    /**
     * Returns the value of downloadsURL3.
     * @return the downloadsURL3
     */
    public String getDownloadsURL3() {
        return myDownloadsURL3;
    }

    /**
     * Returns the value of downloadsURL4.
     * @return the downloadsURL4
     */
    public String getDownloadsURL4() {
        return myDownloadsURL4;
    }

    /**
     * Returns the value of downloadsURL5.
     * @return the downloadsURL5
     */
    public String getDownloadsURL5() {
        return myDownloadsURL5;
    }

    /**
     * Returns the value of downloadsURL6.
     * @return the downloadsURL6
     */
    public String getDownloadsURL6() {
        return myDownloadsURL6;
    }

    /**
     * Returns the value of downloadTitle.
     * @return the downloadTitle
     */
    public String getDownloadTitle() {
        return myDownloadTitle;
    }

    /**
     * Returns the value of gaproEnabled.
     * @return true if gaproEnabled
     */
    public Boolean getGaproEnabled() {
        return myGaproEnabled;
    }

    /**
     * Returns the value of gaproKey.
     * @return the gaproKey
     */
    public String getGaproKey() {
        return myGaproKey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHelpTopicsId() {
        return WCBConstants.OH_ANCHOR_INTRODUCTION;
    }

    /**
     * Returns the value of imageAlt.
     * @return the imageAlt
     */
    public String getImageAlt() {
        return myImageAlt;
    }

    /**
     * Returns the value of imageURL.
     * @return the imageURL
     */
    public String getImageURL() {
        return myImageURL;
    }

    /**
     * Returns the value of videoURL.
     * @return the videoURL
     */
    public String getVideoURL() {
        return myVideoURL;
    }

    /**
     * Sets the value of audioDescriptionEnabled.
     * @param audioDescriptionEnabled the audioDescriptionEnabled to set
     */
    public void setAudioDescriptionEnabled(Boolean audioDescriptionEnabled) {
        this.myAudioDescriptionEnabled = audioDescriptionEnabled;
    }

    /**
     * Sets the value of audioDescriptionFile.
     * @param audioDescriptionFile the audioDescriptionFile to set
     */
    public void setAudioDescriptionFile(String audioDescriptionFile) {
        this.myAudioDescriptionFile = audioDescriptionFile;
    }

    /**
     * Sets the value of captionsEnabled.
     * @param captionsEnabled the captionsEnabled to set
     */
    public void setCaptionsEnabled(Boolean captionsEnabled) {
        this.myCaptionsEnabled = captionsEnabled;
    }

    /**
     * Sets the value of captionsFiles.
     * @param captionsFiles the captionsFiles to set
     */
    public void setCaptionsFiles(String captionsFiles) {
        this.myCaptionsFiles = captionsFiles;
    }

    /**
     * Sets the value of captionsLabels.
     * @param captionsLabels the captionsLabels to set
     */
    public void setCaptionsLabels(String captionsLabels) {
        this.myCaptionsLabels = captionsLabels;
    }

    /**
     * Sets the value of downloadTitle.
     * @param downloads the downloads to set
     */
    public void setDownloads(CommandEditDownload[] downloads) {
        this.myDownloads = downloads;
    }

    /**
     * Sets the value of downloadsEnabled.
     * @param downloadsEnabled the downloadsEnabled to set
     */
    public void setDownloadsEnabled(Boolean downloadsEnabled) {
        this.myDownloadsEnabled = downloadsEnabled;
    }

    /**
     * Sets the value of downloadsMeta1.
     * @param downloadsMeta1 the downloadsMeta1 to set
     */
    public void setDownloadsMeta1(String downloadsMeta1) {
        this.myDownloadsMeta1 = downloadsMeta1;
    }

    /**
     * Sets the value of downloadsMeta2.
     * @param downloadsMeta2 the downloadsMeta2 to set
     */
    public void setDownloadsMeta2(String downloadsMeta2) {
        this.myDownloadsMeta2 = downloadsMeta2;
    }

    /**
     * Sets the value of downloadsMeta3.
     * @param downloadsMeta3 the downloadsMeta3 to set
     */
    public void setDownloadsMeta3(String downloadsMeta3) {
        this.myDownloadsMeta3 = downloadsMeta3;
    }

    /**
     * Sets the value of downloadsMeta4.
     * @param downloadsMeta4 the downloadsMeta4 to set
     */
    public void setDownloadsMeta4(String downloadsMeta4) {
        this.myDownloadsMeta4 = downloadsMeta4;
    }

    /**
     * Sets the value of downloadsMeta5.
     * @param downloadsMeta5 the downloadsMeta5 to set
     */
    public void setDownloadsMeta5(String downloadsMeta5) {
        this.myDownloadsMeta5 = downloadsMeta5;
    }

    /**
     * Sets the value of downloadsMeta6.
     * @param downloadsMeta6 the downloadsMeta6 to set
     */
    public void setDownloadsMeta6(String downloadsMeta6) {
        this.myDownloadsMeta6 = downloadsMeta6;
    }

    /**
     * Sets the value of downloadsText1.
     * @param downloadsText1 the downloadsText1 to set
     */
    public void setDownloadsText1(String downloadsText1) {
        this.myDownloadsText1 = downloadsText1;
    }

    /**
     * Sets the value of downloadsText2.
     * @param downloadsText2 the downloadsText2 to set
     */
    public void setDownloadsText2(String downloadsText2) {
        this.myDownloadsText2 = downloadsText2;
    }

    /**
     * Sets the value of downloadsText3.
     * @param downloadsText3 the downloadsText3 to set
     */
    public void setDownloadsText3(String downloadsText3) {
        this.myDownloadsText3 = downloadsText3;
    }

    /**
     * Sets the value of downloadsText4.
     * @param downloadsText4 the downloadsText4 to set
     */
    public void setDownloadsText4(String downloadsText4) {
        this.myDownloadsText4 = downloadsText4;
    }

    /**
     * Sets the value of downloadsText5.
     * @param downloadsText5 the downloadsText5 to set
     */
    public void setDownloadsText5(String downloadsText5) {
        this.myDownloadsText5 = downloadsText5;
    }

    /**
     * Sets the value of downloadsText6.
     * @param downloadsText6 the downloadsText6 to set
     */
    public void setDownloadsText6(String downloadsText6) {
        this.myDownloadsText6 = downloadsText6;
    }

    /**
     * Sets the value of downloadsURL1.
     * @param downloadsURL1 the downloadsURL1 to set
     */
    public void setDownloadsURL1(String downloadsURL1) {
        this.myDownloadsURL1 = downloadsURL1;
    }

    /**
     * Sets the value of downloadsURL2.
     * @param downloadsURL2 the downloadsURL2 to set
     */
    public void setDownloadsURL2(String downloadsURL2) {
        this.myDownloadsURL2 = downloadsURL2;
    }

    /**
     * Sets the value of downloadsURL3.
     * @param downloadsURL3 the downloadsURL3 to set
     */
    public void setDownloadsURL3(String downloadsURL3) {
        this.myDownloadsURL3 = downloadsURL3;
    }

    /**
     * Sets the value of downloadsURL4.
     * @param downloadsURL4 the downloadsURL4 to set
     */
    public void setDownloadsURL4(String downloadsURL4) {
        this.myDownloadsURL4 = downloadsURL4;
    }

    /**
     * Sets the value of downloadsURL5.
     * @param downloadsURL5 the downloadsURL5 to set
     */
    public void setDownloadsURL5(String downloadsURL5) {
        this.myDownloadsURL5 = downloadsURL5;
    }

    /**
     * Sets the value of downloadsURL6.
     * @param downloadsURL6 the downloadsURL6 to set
     */
    public void setDownloadsURL6(String downloadsURL6) {
        this.myDownloadsURL6 = downloadsURL6;
    }

    /**
     * Sets the value of downloadTitle.
     * @param downloadTitle the downloadTitle to set
     */
    public void setDownloadTitle(String downloadTitle) {
        this.myDownloadTitle = downloadTitle;
    }

    /**
     * Sets the value of gaproEnabled.
     * @param gaproEnabled the gaproEnabled to set
     */
    public void setGaproEnabled(Boolean gaproEnabled) {
        this.myGaproEnabled = gaproEnabled;
    }

    /**
     * Sets the value of gaproKey.
     * @param gaproKey the gaproKey to set
     */
    public void setGaproKey(String gaproKey) {
        this.myGaproKey = gaproKey;
    }

    /**
     * Sets the value of imageAlt.
     * @param imageAlt the imageAlt to set
     */
    public void setImageAlt(String imageAlt) {
        this.myImageAlt = imageAlt;
    }

    /**
     * Sets the value of imageURL.
     * @param imageURL the imageURL to set
     */
    public void setImageURL(String imageURL) {
        this.myImageURL = imageURL;
    }

    /**
     * Sets the value of videoURL.
     * @param videoURL the videoURL to set
     */
    public void setVideoURL(String videoURL) {
        this.myVideoURL = videoURL;
    }
}
