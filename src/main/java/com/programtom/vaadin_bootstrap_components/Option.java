package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@SuppressWarnings("unused")

@Tag("option")
public class Option extends Component {
    public Option(String text, String value, boolean selected) {
        getElement().setText(text);
        getElement().setAttribute("value", value);
        if (selected) {
            getElement().setAttribute("selected", "selected");
        }
    }

    /**
     * Empty Constructor
     */
    public Option() {
        this("", "", false);
    }

    /**
     * @param text The Text of the HTML Option
     */
    public Option(String text) {
        this(text, "", false);
    }

    /**
     * @param text  - The Text of the HTML Option
     * @param value - The Value of the Option (not displayed to the user)
     */
    public Option(String text, String value) {
        this(text, value, false);
    }
}