package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 A custom UI component that represents an option in a select element.

 @author Toma Velev
 */
@Tag("option")
public class Option extends Component {
    /**
     * Initializes a new instance of Option with the given text, value and selected status.
     *
     * @param text     The text of the HTML option
     * @param value    The value of the option (not displayed to the user)
     * @param selected Whether the option is initially selected
     */
    public Option(String text, String value, boolean selected) {
        getElement().setText(text);
        getElement().setAttribute("value", value);
        if (selected) {
            getElement().setAttribute("selected", "selected");
        }
    }


    /**
     * Empty constructor that initializes an empty option.
     */
    public Option() {
        this("", "", false);
    }

    /**
     * Initializes a new instance of Option with the given text and default value and selected status.
     *
     * @param text The text of the HTML option
     */
    public Option(String text) {
        this(text, "", false);
    }


    /**
     * Initializes a new instance of Option with the given text and value, and default selected status.
     *
     * @param text  The text of the HTML option
     * @param value The value of the option (not displayed to the user)
     */
    public Option(String text, String value) {
        this(text, value, false);
    }


    /**
     * The value of the Option that is ideally hidden - not the same as the label displayed to the user.
     *
     * @return the option's (internal) value
     */
    public String getValue() {
        return getElement().getAttribute("value");
    }
}