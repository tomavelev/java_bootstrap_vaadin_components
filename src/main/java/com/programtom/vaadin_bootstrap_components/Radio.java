package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;

/**
 * A component that represents a radio input field, often used in forms to collect user input about true/false flag toggle between options.
 *
 * @author Toma Velev
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Radio extends Div {

    /**
     * Constricts new Radio with the provided parameters
     *
     * @param id           - element ID
     * @param text         - the label of the radio
     * @param name         - the html name attribute - used to group radio buttons
     * @param initialValue - if this is the radio selected
     */
    public Radio(String id, String text, String name, boolean initialValue) {

        Input input = new Input(InputType.RADIO, id, "");
        input.setClassName("form-check-input");
        input.setChecked(initialValue);
        input.getElement().setAttribute("name", name);

        Label label = new Label(text, id);
        label.setClassName("form-check-label");
        add(input, label);

        setClassName("form-check");
    }
}