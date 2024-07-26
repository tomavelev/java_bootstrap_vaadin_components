package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

/**
 * A custom UI component that represents a floating input field.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
public class FloatingInput extends Div {
    /**
     * The underlying Input component.
     */
    private final Input input;

    /**
     * Constructs a new FloatingInput with the given ID, type, label, error message, and initial value.
     *
     * @param id           the unique identifier for this component
     * @param type         the type of the input field (e.g. "text", "password", etc.)
     * @param label        the text displayed as a label above the input field
     * @param error        an optional error message to display below the input field
     * @param initialValue the initial value of the input field
     */
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

    /**
     * Adds an error message to the component with a default style class and sets the focus on the input field.
     *
     * @param error the error message to display
     */
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

    /**
     * Gets the current value of the underlying Input component.
     *
     * @return the current value of the input field
     */
    public String getValue() {
        return input.getValue();
    }

    /**
     * Sets an error message to display below the input field. If an existing error is cleared, a new error message is displayed.
     *
     * @param error the error message to display
     */
    public void setError(String error) {
        clearError();
        addError(error);
    }

    /**
     * Clears any existing error message and removes it from the component's tree.
     */
    private void clearError() {
        getElement().getChildren()
                .filter(child -> child.getClassList().contains("invalid-feedback"))
                .forEach(Element::removeFromParent);
    }
}
