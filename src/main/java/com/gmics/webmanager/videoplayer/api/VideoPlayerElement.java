/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.api;

import nl.gx.webmanager.cms.element.Element;

/**
 * Interface for the VideoPlayer element.
 */
public interface VideoPlayerElement extends Element {
    /**
     * Returns the value of audiodescription.
     * @return the audiodescription
     */
    String getAudiodescription();

    /**
     * Returns the value of audioDescriptionEnabled.
     * @return the audioDescriptionEnabled
     */
    Boolean getAudioDescriptionEnabled();

    /**
     * Returns the value of audioDescriptionFile.
     * @return the audioDescriptionFile
     */
    String getAudioDescriptionFile();

    /**
     * Returns the value of captions.
     * @return the captions
     */
    String getCaptions();

    /**
     * Returns the value of captionsEnabled.
     * @return the captionsEnabled
     */
    Boolean getCaptionsEnabled();

    /**
     * Returns the value of captionsFiles.
     * @return the captionsFiles
     */
    String getCaptionsFiles();

    /**
     * Returns the value of captionsLabels.
     * @return the captionsLabels
     */
    String getCaptionsLabels();

    /**
     * Returns the value of downloadsEnabled.
     * @return the downloadsEnabled
     */
    Boolean getDownloadsEnabled();

    /**
     * Returns the value of downloadsCount.
     * @return the downloadsCount
     */
    // int getDownloadsCount();

    /**
     * Returns the value of downloadsURL.
     * @return the downloadsURL
     */
    // String getDownloadsURL(int i);

    /**
     * Returns the value of downloadsMeta1.
     * @return the downloadsMeta1
     */
    String getDownloadsMeta1();

    /**
     * Returns the value of downloadsMeta2.
     * @return the downloadsMeta2
     */
    String getDownloadsMeta2();

    /**
     * Returns the value of downloadsMeta3.
     * @return the downloadsMeta3
     */
    String getDownloadsMeta3();

    /**
     * Returns the value of downloadsMeta4.
     * @return the downloadsMeta4
     */
    String getDownloadsMeta4();

    /**
     * Returns the value of downloadsMeta5.
     * @return the downloadsMeta5
     */
    String getDownloadsMeta5();

    /**
     * Returns the value of downloadsMeta6.
     * @return the downloadsMeta6
     */
    String getDownloadsMeta6();

    /**
     * Returns the value of downloadsText1.
     * @return the downloadsText1
     */
    String getDownloadsText1();

    /**
     * Returns the value of downloadsText2.
     * @return the downloadsText2
     */
    String getDownloadsText2();

    /**
     * Returns the value of downloadsText3.
     * @return the downloadsText3
     */
    String getDownloadsText3();

    /**
     * Returns the value of downloadsText4.
     * @return the downloadsText4
     */
    String getDownloadsText4();

    /**
     * Returns the value of downloadsText5.
     * @return the downloadsText5
     */
    String getDownloadsText5();

    /**
     * Returns the value of downloadsText6.
     * @return the downloadsText6
     */
    String getDownloadsText6();

    /**
     * Returns the value of downloadsURL1.
     * @return the downloadsURL1
     */
    String getDownloadsURL1();

    /**
     * Returns the value of downloadsURL2.
     * @return the downloadsURL2
     */
    String getDownloadsURL2();

    /**
     * Returns the value of downloadsURL3.
     * @return the downloadsURL3
     */
    String getDownloadsURL3();

    /**
     * Returns the value of downloadsURL4.
     * @return the downloadsURL4
     */
    String getDownloadsURL4();

    /**
     * Returns the value of downloadsURL5.
     * @return the downloadsURL5
     */
    String getDownloadsURL5();

    /**
     * Returns the value of downloadsURL6.
     * @return the downloadsURL6
     */
    String getDownloadsURL6();

    /**
     * Returns the value of downloadTitle.
     * @return the downloadTitle
     */
    String getDownloadTitle();

    /**
     * Returns the value of gaproEnabled.
     * @return the gaproEnabled
     */
    Boolean getGaproEnabled();

    /**
     * Returns the value of gaproKey.
     * @return the gaproKey
     */
    String getGaproKey();

    /**
     * Returns the value of imageAlt.
     * @return the imageAlt
     */
    String getImageAlt();

    /**
     * Returns the value of imageURL.
     * @return the imageURL
     */
    String getImageURL();

    /**
     * Returns the videoURL.
     * @return the videoURL
     */
    String getVideoURL();

    /**
     * Sets the value of audiodescription.
     * @param audiodescription the audiodescription to set
     */
    void setAudiodescription(String audiodescription);

    /**
     * Sets the value of audioDescriptionEnabled.
     * @param audioDescriptionEnabled the audioDescriptionEnabled to set
     */
    void setAudioDescriptionEnabled(Boolean audioDescriptionEnabled);

    /**
     * Sets the value of audioDescriptionFile.
     * @param audioDescriptionFile the audioDescriptionFile to set
     */
    void setAudioDescriptionFile(String audioDescriptionFile);

    /**
     * Sets the value of captions.
     * @param captions the captions to set
     */
    void setCaptions(String captions);

    /**
     * Sets the value of captionsEnabled.
     * @param captionsEnabled the captionsEnabled to set
     */
    void setCaptionsEnabled(Boolean captionsEnabled);

    /**
     * Sets the value of captionsFiles.
     * @param captionsFiles the captionsFiles to set
     */
    void setCaptionsFiles(String captionsFiles);

    /**
     * Sets the value of captionsLabels.
     * @param captionsLabels the captionsLabels to set
     */
    void setCaptionsLabels(String captionsLabels);

    /**
     * Sets the value of downloadsEnabled.
     * @param downloadsEnabled the downloadsEnabled to set
     */
    void setDownloadsEnabled(Boolean downloadsEnabled);

    /**
     * Sets the value of downloadsCount.
     * @param count the downloadsCount to set
     */
    // void setDownloadsCount(int count);

    /**
     * Sets the value of downloadsMeta1.
     * @param url the url to set
     */
    void setDownloadsMeta1(String url);

    /**
     * Sets the value of downloadsMeta2.
     * @param url the url to set
     */
    void setDownloadsMeta2(String url);

    /**
     * Sets the value of downloadsMeta3.
     * @param url the url to set
     */
    void setDownloadsMeta3(String url);

    /**
     * Sets the value of downloadsMeta4.
     * @param url the url to set
     */
    void setDownloadsMeta4(String url);

    /**
     * Sets the value of downloadsMeta5.
     * @param url the url to set
     */
    void setDownloadsMeta5(String url);

    /**
     * Sets the value of downloadsMeta6.
     * @param url the url to set
     */
    void setDownloadsMeta6(String url);

    /**
     * Sets the value of downloadsText1.
     * @param url the url to set
     */
    void setDownloadsText1(String url);

    /**
     * Sets the value of downloadsText2.
     * @param url the url to set
     */
    void setDownloadsText2(String url);

    /**
     * Sets the value of downloadsText3.
     * @param url the url to set
     */
    void setDownloadsText3(String url);

    /**
     * Sets the value of downloadsText4.
     * @param url the url to set
     */
    void setDownloadsText4(String url);

    /**
     * Sets the value of downloadsText5.
     * @param url the url to set
     */
    void setDownloadsText5(String url);

    /**
     * Sets the value of downloadsText6.
     * @param url the url to set
     */
    void setDownloadsText6(String url);

    /**
     * Sets the value of downloadsUrl1.
     * @param url the url to set
     */
    void setDownloadsURL1(String url);

    /**
     * Sets the value of downloadsUrl2.
     * @param url the url to set
     */
    void setDownloadsURL2(String url);

    /**
     * Sets the value of downloadsUrl3.
     * @param url the url to set
     */
    void setDownloadsURL3(String url);

    /**
     * Sets the value of downloadsUrl4.
     * @param url the url to set
     */
    void setDownloadsURL4(String url);

    /**
     * Sets the value of downloadsUrl5.
     * @param url the url to set
     */
    void setDownloadsURL5(String url);

    /**
     * Sets the value of downloadsUrl6.
     * @param url the url to set
     */
    void setDownloadsURL6(String url);

    /**
     * Sets the value of downloadTitle.
     * @param downloadTitle the downloadTitle to set
     */
    void setDownloadTitle(String downloadTitle);

    /**
     * Sets the value of gaproEnabled.
     * @param gaproEnabled the gaproEnabled to set
     */
    void setGaproEnabled(Boolean gaproEnabled);

    /**
     * Sets the value of gaproKey.
     * @param gaproKey the gaproKey to set
     */
    void setGaproKey(String gaproKey);

    /**
     * Sets the value of imageAlt.
     * @param imageAlt the imageAlt to set
     */
    void setImageAlt(String imageAlt);

    /**
     * Sets the value of imageURL.
     * @param imageURL the imageURL to set
     */
    void setImageURL(String imageURL);

    /**
     * Sets the videoURL.
     * @param videoURL the url of the video
     */
    void setVideoURL(String videoURL);

}
