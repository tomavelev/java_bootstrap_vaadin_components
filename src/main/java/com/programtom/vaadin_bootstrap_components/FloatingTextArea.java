package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

/**
 * A custom UI component that represents a floating text area.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("div")
public class FloatingTextArea extends Component implements HasComponents {

    /**
     * The underlying TextArea component.
     */
    private final TextArea textArea;

    /**
     * Constructs a new FloatingTextArea with the given label, ID, and initial value.
     *
     * @param label        - Floating label for the text area
     * @param id           - the id of the textarea field
     * @param initialValue - initial content
     */
    public FloatingTextArea(String label, String id, String initialValue) {
        textArea = new TextArea(id, label);
        textArea.setCustomValue(initialValue);
        textArea.setClassName("form-control");

        add(textArea);
        add(new Label(id, label));

        setClassName("form-floating");
    }

    /**
     * Sets the minimum height of the TextArea.
     *
     * @param minHeight - the minimum height to set
     */
    public void setMinTextAreaHeight(String minHeight) {
        textArea.getElement().getStyle().set("minHeight", minHeight);
    }

    /***
     * Gets the current value of the TextArea.
     *
     * @return the current value
     */
    public String getValue() {
        return textArea.getValue();
    }

    /**
     * Sets an error message for this form control.
     */
    public void setError(String error) {
        clearError();
        addError(error);
    }

    /**
     * Clears any error message currently displayed.
     */
    private void clearError() {
        getElement().getChildren()
                .filter(child -> child.getClassList().contains("invalid-feedback"))
                .forEach(Element::removeFromParent);
    }

    /**
     * Adds an error message to this form control.
     *
     * @param error the error message to display
     */
    private void addError(String error) {
        Div errorDiv = new Div();
        errorDiv.setText(error);
        errorDiv.setClassName("invalid-feedback");
        errorDiv.getStyle().set("display", "block");
        add(errorDiv);
    }
}
