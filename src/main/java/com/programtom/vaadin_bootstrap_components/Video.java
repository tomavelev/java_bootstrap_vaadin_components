package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Tag;

/**
 * A custom Vaadin component for playing video.
 */
@SuppressWarnings("unused")
@Tag("video")
public class Video extends BaseContent {

    /**
     * Тhe track element associated with this video component.
     */
    private Track track;

    /**
     * Оbject fit property of the video component, which specifies how the video should be resized to fill its container.
     */
    private ObjectFit objectFit = ObjectFit.none;

    /**
     * Width of the video component (e.g. "100px", etc.).
     */
    private String width;

    /**
     * Height of the video component (e.g. "100px", "50%", etc.).
     */
    private String height;

    /**
     * Constructs a new Video component with no data.
     */
    public Video() {
        super();
    }

    /**
     * Constructs a new Video component with the specified source and preload options.
     *
     * @param src     the URL of the video file to play
     * @param preload the preload option for the video element
     */
    public Video(String src, Preload preload) {
        super(src, preload);
    }

    /**
     * Gets the height of the video component (e.g. "100px", etc.).
     *
     * @return the height of the video component
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the height of the video component to the specified value.
     *
     * @param height the new height of the video component
     */
    public Video setHeight(String height) {
        this.height = height;
        getElement().setAttribute("height", height);
        return this;
    }

    /**
     * Gets the width of the video component (e.g. "100px", etc.).
     *
     * @return the width of the video component
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the width of the video component to the specified value.
     *
     * @param width the new width of the video component
     */
    public Video setWidth(String width) {
        this.width = width;
        getElement().setAttribute("width", width);
        return this;
    }

    /**
     * Gets the object fit property of the video component, which specifies how the video should be resized to fill its container.
     *
     * @return the object fit property (e.g. {@link ObjectFit}, etc.)
     */
    public ObjectFit getObjectFit() {
        return objectFit;
    }

    /**
     * Sets the object fit property of the video component to the specified value.
     *
     * @param objectFit the new object fit property
     */
    public Video setObjectFit(ObjectFit objectFit) {
        this.objectFit = objectFit;
        getElement().getClassList().add(objectFit.cssClass());
        return this;
    }

    /**
     * Gets the track element associated with this video component.
     *
     * @return the track element, or null if none is set
     */
    public Track getTrack() {
        return track;
    }

    /**
     * Sets the track element for this video component to the specified value.
     *
     * @param track the new track element
     */
    public Video setTrack(Track track) {
        this.track = track;
        return this;
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        if (track != null) {
            add(track);
        }
    }

    /**
     * Object fit CSS variation
     */
    public enum ObjectFit {

        contain, cover, fill, scale, none;

        /**
         * @return the Bootstrap CSS class
         */
        String cssClass() {
            return "object-fit-" + name();
        }
    }

}