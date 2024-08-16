package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract base class for Vaadin content components.
 */
@SuppressWarnings("unused")
public abstract class BaseContent extends Component implements HasComponents {

    /**
     * The URL of the content file to display.
     */
    protected final List<Source> sourceList;
    /**
     * The URL of the content file to display.
     */
    protected final String src;

    /**
     * Whether the content should start playing automatically when loaded.
     */
    protected boolean autoplay = false;

    /**
     * Whether the content controls (play/pause, volume, etc.) should be displayed.
     */
    protected boolean controls = true;

    /**
     * Whether the content should loop indefinitely.
     */
    protected boolean loop = false;

    /**
     * Whether the content should start muted by default.
     */
    protected boolean muted = false;

    /**
     * The preload option for the content element (e.g. "none", "metadata", etc.).
     */
    protected Preload preload;


    /**
     * Provides a text description of the media element.
     */
    protected String ariaLabel;


    /**
     * References an element that provides a longer description of the media element.
     */
    protected String ariaDescribedBy;

    public BaseContent() {
        sourceList = new ArrayList<>();
        src = "";
        preload = Preload.none;
    }

    /**
     * Constructs a new instance of the base class with the specified source and preload options.
     *
     * @param src     the URL of the content file to display
     * @param preload the preload option for the content element
     */
    public BaseContent(String src, Preload preload) {
        this.src = src;
        this.preload = preload;
        sourceList = new ArrayList<>();
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);

        if (getSrc() != null) {
            getElement().setAttribute("src", getSrc());
        }
        getElement().setAttribute("autoplay", isAutoplay() ? "1" : "0");
        getElement().setAttribute("controls", Boolean.toString(isControls()));
        getElement().setAttribute("loop", Boolean.toString(isLoop()));
        getElement().setAttribute("muted", Boolean.toString(isMuted()));
        getElement().setAttribute("preload", getPreload().name());

        if (getAriaLabel() != null) {
            getElement().setAttribute("aria-label", getAriaLabel());
        }
        if (getAriaDescribedBy() != null) {
            getElement().setAttribute("aria-describedby", getAriaDescribedBy());
        }
        for (Source source : sourceList) {
            add(source);
        }
    }

    /**
     * Gets the URL of the content file to display.
     *
     * @return the source of the content file
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets whether the content should start playing automatically when loaded.
     *
     * @param autoplay whether the content should start playing automatically
     */
    public BaseContent setAutoplay(boolean autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    /**
     * Checks if the content should start playing automatically when loaded.
     *
     * @return whether the content should start playing automatically
     */
    public boolean isAutoplay() {
        return autoplay;
    }

    /**
     * Sets whether the content controls (play/pause, volume, etc.) should be displayed.
     *
     * @param controls whether the content controls should be displayed
     */
    public BaseContent setControls(boolean controls) {
        this.controls = controls;
        return this;
    }

    /**
     * Checks if the content controls (play/pause, volume, etc.) are being displayed.
     *
     * @return whether the content controls are being displayed
     */
    public boolean isControls() {
        return controls;
    }

    /**
     * Sets whether the content should loop indefinitely.
     *
     * @param loop whether the content should loop indefinitely
     */
    public BaseContent setLoop(boolean loop) {
        this.loop = loop;
        return this;
    }

    /**
     * Checks if the content should loop indefinitely.
     *
     * @return whether the content should loop indefinitely
     */
    public boolean isLoop() {
        return loop;
    }

    /**
     * Sets whether the content should start muted by default.
     *
     * @param muted whether the content should start muted
     */
    public BaseContent setMuted(boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * Checks if the content is currently muted.
     *
     * @return whether the content is muted
     */
    public boolean isMuted() {
        return muted;
    }

    /**
     * Gets the preload option for the content element (e.g. "none", "metadata", etc.).
     *
     * @return the preload option for the content element
     */
    public Preload getPreload() {
        return preload;
    }

    /**
     * The preload option for the content element (e.g. "none", "metadata", etc.).
     *
     * @param preload - auto, metadata, none
     * @return this - for chaining setting
     */
    public BaseContent setPreload(Preload preload) {
        this.preload = preload;
        return this;
    }

    /**
     * A text description of the media element.
     *
     * @return - short description of the media element
     */
    public String getAriaLabel() {
        return ariaLabel;
    }

    /**
     * @param ariaLabel short description of the media element
     * @return this - for chaining setting
     */
    public BaseContent setAriaLabel(String ariaLabel) {
        this.ariaLabel = ariaLabel;
        return this;
    }

    /**
     * Description of the media element
     *
     * @return this - for chaining setting
     */
    public String getAriaDescribedBy() {
        return ariaDescribedBy;
    }

    /**
     * References an element that provides a longer description of the media element.
     *
     * @param ariaDescribedBy - the description of the media element
     * @return this - for chaining setting
     */
    public BaseContent setAriaDescribedBy(String ariaDescribedBy) {
        this.ariaDescribedBy = ariaDescribedBy;
        return this;
    }

    /**
     * Preload parameter - that indicates if the content should be pre-fetched
     */
    public enum Preload {
        auto, metadata, none
    }
}
