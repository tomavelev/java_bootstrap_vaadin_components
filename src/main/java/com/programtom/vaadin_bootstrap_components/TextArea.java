package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

/**
 * A custom UI component that represents a text area.
 *
 * @author Toma Velev
 */
@Tag("textarea")
public class TextArea extends Component implements HasComponents {
    /**
     * The internal value of the text area.
     */
    private String internalValue = "";

    /**
     * Initializes a new instance of TextArea with the given id and label.
     *
     * @param id    the id of the textarea element (optional)
     * @param label the label for the textarea element (optional)
     */
    public TextArea(String id, String label) {
        if (id != null) {
            getElement().setAttribute("id", id);
            getElement().setAttribute("placeholder", label);
        }
        getElement().addEventListener("change", e ->
                getElement().executeJs("return this.value").then(jsonValue ->
                        internalValue = jsonValue.asString()
                )
        );
    }

    /**
     * Returns the current value of the textarea.
     *
     * @return the current value
     */
    public String getValue() {
        return internalValue;
    }

    /**
     * Sets a custom initial value for the textarea. This can be used to pre-populate the textarea with a specific value.
     *
     * @param initialValue the initial value to set for the textarea
     */
    public void setCustomValue(String initialValue) {
        getElement().executeJs("this.value = $0", initialValue);
        internalValue = initialValue;
    }
}
