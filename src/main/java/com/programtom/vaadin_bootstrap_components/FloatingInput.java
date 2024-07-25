package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

public class FloatingInput extends Div {
    private final Input input;

    public FloatingInput(String id, String type, String label, String error, String initialValue) {
        input = new Input();
        input.setId(id);
        input.setPlaceholder(label);
        input.setValue(initialValue);

        setClassName("mt-2 mb-4 form-floating");
        add(input);
        add(new Label(label, id));

        if (!error.isEmpty()) {
            addError(error);
        }
    }

    private void addError(String error) {
        Div errorDiv = new Div();
        errorDiv.setText(error);
        errorDiv.setClassName("invalid-feedback");
        errorDiv.getStyle().set("display", "block");
        add(errorDiv);

        input.focus();
        input.addValueChangeListener(e -> {
            clearError();
            e.unregisterListener();
        });
    }

    public String getValue() {
        return input.getValue();
    }

    public void setError(String error) {
        clearError();
        addError(error);
    }

    private void clearError() {
        getElement().getChildren()
                .filter(child -> child.getClassList().contains("invalid-feedback"))
                .forEach(Element::removeFromParent);
    }
}
