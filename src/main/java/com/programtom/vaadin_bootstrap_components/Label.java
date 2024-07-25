package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("label")
public class Label extends Component {

    public Label(String text, String forInput) {
        getElement().setText(text);
        getElement().getStyle().set("backgroundColor", "transparent");
        if (forInput != null) {
            getElement().setAttribute("for", forInput);
        }
    }
}
