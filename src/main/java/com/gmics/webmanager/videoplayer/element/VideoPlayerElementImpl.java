/*
 * Copyright (c) 2012 GMICS
 */
package com.gmics.webmanager.videoplayer.element;

import nl.gx.webmanager.cms.element.implementation.ElementImpl;
import nl.gx.webmanager.foundation.JcrUtil;
import nl.gx.webmanager.jcr.annotation.Interfaces;
import nl.gx.webmanager.jcr.annotation.Namespace;
import nl.gx.webmanager.jcr.annotation.NodeType;
import nl.gx.webmanager.jcr.annotation.Property;
import nl.gx.webmanager.springmvc.element.ElementBase;

import com.gmics.webmanager.videoplayer.api.VideoPlayerElement;
import com.gmics.webmanager.videoplayer.api.WCBConstants;

/**
 * Implementation of the VideoPlayer element. This class represents the entity class containing the business logic of
 * the element. The element itself is not managed by the entity manager.
 */

@SuppressWarnings("unchecked")
// Namespace properties needed to register the node type in the JCR
@Namespace(prefix = WCBConstants.NAMESPACE_PREFIX, URI = WCBConstants.NAMESPACE_URI)
// Node type definition properties needed to register the node type in the JCR
@NodeType(name = WCBConstants.NAMESPACE_PREFIX + ":" + WCBConstants.ELEMENT_NODE_TYPE_NAME,
supertype = ElementImpl.NODETYPE)
// Interfaces assosiated with the node type defined in this class
@Interfaces("com.gmics.webmanager.videoplayer.api.VideoPlayerElement")
public class VideoPlayerElementImpl extends ElementBase implements VideoPlayerElement {

    /**
     * {@inheritDoc}
     */
    @Property
    public String getAudiodescription() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audiodescription");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public Boolean getAudioDescriptionEnabled() {
        return JcrUtil.getBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audioDescriptionEnabled");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getAudioDescriptionFile() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audioDescriptionFile");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getCaptions() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captions");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public Boolean getCaptionsEnabled() {
        return JcrUtil.getBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsEnabled");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getCaptionsFiles() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsFiles");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getCaptionsLabels() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsLabels");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public Boolean getDownloadsEnabled() {
        return JcrUtil.getBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsEnabled");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta1() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta1");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta2() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta2");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta3() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta3");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta4() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta4");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta5() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta5");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsMeta6() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta6");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText1() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText1");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText2() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText2");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText3() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText3");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText4() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText4");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText5() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText5");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsText6() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText6");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL1() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl1");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL2() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl2");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL3() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl3");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL4() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl4");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL5() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl5");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadsURL6() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl6");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getDownloadTitle() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadtitle");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getEditElementHeader() {
        return getLanguageResourceMessage("element.headertitle");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public Boolean getGaproEnabled() {
        return JcrUtil.getBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":gaproEnabled");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getGaproKey() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":gaproKey");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getIcon() {
        return "/wm/b/wcb/" + WCBConstants.BUNDLE_ID + "/smallVideoPlayerElementIcon.gif";
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getImageAlt() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":imagealt");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getImageURL() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":imageurl");
    }

    /**
     * {@inheritDoc}
     */
    @Property
    public String getVideoURL() {
        return JcrUtil.getString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":videourl");
    }

    /**
     * {@inheritDoc}
     */
    public void setAudiodescription(String audiodescription) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audiodescription", audiodescription);
    }

    /**
     * {@inheritDoc}
     */
    public void setAudioDescriptionEnabled(Boolean audioDescriptionEnabled) {
        JcrUtil.setBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audioDescriptionEnabled",
                audioDescriptionEnabled.booleanValue());
    }

    /**
     * {@inheritDoc}
     */
    public void setAudioDescriptionFile(String audioDescriptionFile) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":audioDescriptionFile", audioDescriptionFile);
    }

    /**
     * {@inheritDoc}
     */
    public void setCaptions(String captions) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captions", captions);
    }

    /**
     * {@inheritDoc}
     */
    public void setCaptionsEnabled(Boolean captionsEnabled) {
        JcrUtil.setBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsEnabled",
                captionsEnabled.booleanValue());
    }

    /**
     * {@inheritDoc}
     */
    public void setCaptionsFiles(String captionsFiles) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsFiles", captionsFiles);
    }

    /**
     * {@inheritDoc}
     */
    public void setCaptionsLabels(String captionsLabels) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":captionsLabels", captionsLabels);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsEnabled(Boolean downloadsEnabled) {
        JcrUtil.setBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsEnabled",
                downloadsEnabled.booleanValue());
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta1(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta1", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta2(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta2", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta3(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta3", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta4(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta4", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta5(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta5", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsMeta6(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsMeta6", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText1(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText1", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText2(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText2", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText3(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText3", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText4(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText4", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText5(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText5", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsText6(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsText6", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL1(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl1", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL2(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl2", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL3(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl3", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL4(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl4", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL5(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl5", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadsURL6(String url) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadsurl6", url);
    }

    /**
     * {@inheritDoc}
     */
    public void setDownloadTitle(String downloadTitle) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":downloadtitle", downloadTitle);
    }

    /**
     * {@inheritDoc}
     */
    public void setGaproEnabled(Boolean gaproEnabled) {
        JcrUtil.setBoolean(getNode(), WCBConstants.NAMESPACE_PREFIX + ":gaproEnabled", gaproEnabled.booleanValue());
    }

    /**
     * {@inheritDoc}
     */
    public void setGaproKey(String gaproKey) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":gaproKey", gaproKey);
    }

    /**
     * {@inheritDoc}
     */
    public void setImageAlt(String imageAlt) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":imagealt", imageAlt);
    }

    /**
     * {@inheritDoc}
     */
    public void setImageURL(String imageURL) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":imageurl", imageURL);
    }

    /**
     * {@inheritDoc}
     */
    public void setVideoURL(String videoURL) {
        JcrUtil.setString(getNode(), WCBConstants.NAMESPACE_PREFIX + ":videourl", videoURL);
    }
}
