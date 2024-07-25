package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

@Tag("textarea")
public class TextArea extends Component implements HasComponents {

    private String internalValue = "";

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

    public String getValue() {
        return internalValue;
    }

    public void setCustomValue(String initialValue) {
        getElement().executeJs("this.value = $0", initialValue);
        internalValue = initialValue;
    }
}
