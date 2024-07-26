package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;

/**
 * A custom button component that extends the Vaadin Flow Button component and sets Bootstrap specific properties.
 *
 * @author Toma Velev
 * @version 1.0
 */
@SuppressWarnings("unused")
@Tag("button")
public class Button extends com.vaadin.flow.component.button.Button {
    /**
     * Creates a new instance of the Button with default text and primary button  type.
     */
    public Button() {
        setText("");
        setClassName(ButtonType.PRIMARY.className());
    }

    /**
     * Creates a new instance of the Button with the given text and primary button type.
     *
     * @param text The text to display on the button
     */
    public Button(String text) {
        setText(text);
        setClassName(ButtonType.PRIMARY.className());
    }

    /**
     * Creates a new instance of the Button with the given text and type.
     *
     * @param text The text to display on the button
     * @param type The type of the button (primary, secondary, etc.)
     */
    public Button(String text, ButtonType type) {
        setText(text);
        setClassName(type.className());
    }

    /**
     * Creates a new instance of the Button with the given text, type, and click listener.
     *
     * @param text          The text to display on the button
     * @param type          The type of the button (primary, secondary, etc.)
     * @param clickListener A listener to be executed when the button is clicked
     */
    public Button(String text, ButtonType type, ComponentEventListener<ClickEvent<com.vaadin.flow.component.button.Button>> clickListener) {
        this(text, clickListener);
        setClassName(type.className());
    }

    /**
     * Creates a new instance of the Button with the given text and click listener.
     *
     * @param text          The text to display on the button
     * @param clickListener A listener to be executed when the button is clicked
     */
    public Button(String text, ComponentEventListener<ClickEvent<com.vaadin.flow.component.button.Button>> clickListener) {
        setText(text);
        addSingleClickListener(clickListener);
        setClassName(ButtonType.PRIMARY.className());
    }
}