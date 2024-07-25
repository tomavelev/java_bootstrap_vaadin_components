package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Element;

@SuppressWarnings("unused")
@Tag("div")
public class FloatingTextArea extends Component implements HasComponents {

    private final TextArea textArea;

    /**
     * @param label - Floating label for the text area
     * @param id - the id of the textarea field
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

    public void setMinTextAreaHeight(String minHeight) {
        textArea.getElement().getStyle().set("minHeight", minHeight);
    }

    public String getValue() {
        return textArea.getValue();
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

    private void addError(String error) {
        Div errorDiv = new Div();
        errorDiv.setText(error);
        errorDiv.setClassName("invalid-feedback");
        errorDiv.getStyle().set("display", "block");
        add(errorDiv);
    }
}
