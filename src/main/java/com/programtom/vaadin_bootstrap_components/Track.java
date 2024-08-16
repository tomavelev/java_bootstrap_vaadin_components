package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;


/**
 * A Vaadin component for a <track> element.
 */
@SuppressWarnings("unused")
@Tag("source")
public class Track extends Component {
    /**
     * The label of track
     */
    private String label;

    /**
     * The kind of track (e.g. "captions", etc.).
     */
    private String kind;

    /**
     * Constructs a new instance of the TrackElement with the specified src option.
     *
     * @param src the URL of the text file to display
     */
    public Track(String src) {
        super();
        getElement().setAttribute("src", src);
    }

    /**
     * Sets whether this is a default track.
     *
     * @param default_ whether this is a default track
     */
    public Track setDefault(boolean default_) {
        getElement().setAttribute("default", Boolean.toString(default_));
        return this;
    }

    /**
     * Sets the label for this <track> element
     *
     * @param label the source language code for this track
     */
    public Track setLabel(String label) {
        getElement().setAttribute("label", label);
        return this;
    }

    /**
     * Sets the srclang for this <track> element (e.g. "en").
     *
     * @param srclang the source language code for this track
     */
    public Track setSrcLang(String srclang) {
        getElement().setAttribute("srclang", srclang);
        return this;
    }
}