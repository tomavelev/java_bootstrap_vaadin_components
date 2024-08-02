package com.programtom.vaadin_bootstrap_components;

/**
 * A custom UI component that represents an input field.
 *
 * @author Toma Velev
 */
public class Input extends com.vaadin.flow.component.html.Input {
    /**
     * Constructs a new Input instance.
     */
    public Input() {
        super();
        setClassName("form-control");
        setType(InputType.TEXT.getHTMLType());
    }

    /**
     * Constructs a new Input instance with the given type, id and placeholder.
     *
     * @param type        the input type
     * @param id          the input id
     * @param placeholder the input placeholder text
     */
    public Input(InputType type, String id, String placeholder) {
        super();
        setType(type.getHTMLType());
        setClassName("form-control");
        setPlaceholder(placeholder);

        if (id != null) {
            getElement().setAttribute("id", id);
        }
    }
}
