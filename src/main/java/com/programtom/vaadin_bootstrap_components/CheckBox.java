package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A component that represents a checkbox input field, often used in forms to collect user input about true/false flag parameters.
 *
 * @author Toma Velev
 * @version 1.0
 */
public class CheckBox extends Div {

    /**
     * The internal Input component that handles the checkbox's value and state.
     */
    private final Input input;

    /**
     * Constructor for creating a new Checkbox component with the given ID, text, and initial value.
     *
     * @param id           the unique identifier for this checkbox
     * @param text         the text displayed next to the checkbox
     * @param initialValue whether the checkbox is initially checked (true) or not (false)
     */
    public CheckBox(String id, String text, boolean initialValue) {
        setClassName("form-check");

        input = new Input(InputType.CHECKBOX, id, "");
        input.setClassName("form-check-input");
        if (initialValue) {
            input.getElement().setAttribute("checked", "checked");
        }

        Label label = new Label(text, id);
        label.setClassName("form-check-label");
        add(input, label);
    }

    /**
     * Returns the current value of the checkbox.
     *
     * @return true if the checkbox is checked, false otherwise
     */
    public boolean getValue() {
        return "on".equals(input.getValue());
    }
}