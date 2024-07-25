package com.programtom.vaadin_bootstrap_components;


import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.KeyPressEvent;
import com.vaadin.flow.dom.DomEventListener;

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

    public void requestFocus() {
        focus();
    }

}
