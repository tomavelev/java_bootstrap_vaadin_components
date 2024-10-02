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
     * The internal Input component that handles the radio's value and state.
     */
    private final Input input;
    /**
     * internal cache of the value
     */
    private boolean internalValue;

    /**
     * Constricts new Radio with the provided parameters
     *
     * @param id           - element ID
     * @param text         - the label of the radio
     * @param name         - the html name attribute - used to group radio buttons
     * @param initialValue - if this is the radio selected
     */
    public Radio(String id, String text, String name, boolean initialValue) {
        input = new Input(InputType.RADIO, id, "");
        input.setClassName("form-check-input");
        setValue(initialValue);
        internalValue = initialValue;
        input.getElement().setAttribute("name", name);

        Label label = new Label(text, id);
        label.setClassName("form-check-label");
        add(input, label);

        setClassName("form-check");
    }

    /**
     * sets a new Value
     *
     * @param value the value
     */
    public void setValue(boolean value) {
        internalValue = value;
        input.setChecked(value);
    }

    /**
     * Returns the current value of the checkbox.
     *
     * @return true if the checkbox is checked, false otherwise
     */
    public boolean getValue() {
        return internalValue;
    }
}