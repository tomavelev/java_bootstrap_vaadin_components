package com.programtom.vaadin_bootstrap_components;


public class Input extends com.vaadin.flow.component.html.Input {

    public Input() {
        super();
    }

    public Input(String type, String id, String placeholder) {
        super();
        setType(type);
        setClassName("form-control");
        setPlaceholder(placeholder);

        if (id != null) {
            getElement().setAttribute("id", id);
        }
    }

}
