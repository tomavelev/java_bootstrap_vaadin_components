package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Tag;

/**
 * A custom Vaadin component for playing audio.
 */
@SuppressWarnings("unused")
@Tag("audio")
public class Audio extends BaseContent {

    /**
     * Constructs a new MyAudio component with the specified source and preload options.
     *
     * @param src  the URL of the audio file to play
     * @param preload  the preload option for the audio element
     */
    public Audio(String src, Preload preload) {
        super(src, preload);
    }

}