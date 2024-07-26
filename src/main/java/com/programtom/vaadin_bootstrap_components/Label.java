package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

/**
 * A custom UI component that represents a label.
 *
 * @author Toma Velev
 */
@Tag("label")
public class Label extends Component {
    /**
     * Constructs a new Label instance with the given text and for input.
     *
     * @param text     the label text
     * @param forInput the ID of the input field this label is associated with
     */
    public Label(String text, String forInput) {
        getElement().setText(text);
        getElement().getStyle().set("backgroundColor", "transparent");
        if (forInput != null) {
            getElement().setAttribute("for", forInput);
        }
    }
}
