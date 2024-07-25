package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;

public class CheckBox extends Div {

    private Input input;

    public CheckBox(String id, String text, boolean initialValue) {
        setClassName("form-check");

        input = new Input("checkbox", id, "");
        input.setClassName("form-check-input");
        if (initialValue) {
            input.getElement().setAttribute("checked", "checked");
        }

        Label label = new Label(text, id);
        label.setClassName("form-check-label");
        add(input, label);
    }

    public boolean getValue() {
        return "on".equals(input.getValue());
    }
}
