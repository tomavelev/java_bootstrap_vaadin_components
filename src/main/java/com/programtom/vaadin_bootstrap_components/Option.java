package com.programtom.vaadin_bootstrap_components;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
@Tag("option")
public class Option extends Component {
    public Option(String text, String value, boolean selected) {
        getElement().setText(text);
        getElement().setAttribute("value", value);
        if (selected) {
            getElement().setAttribute("selected", "selected");
        }
    }
    public Option() {
        this("", "", false);
    }
    public Option(String text) {
        this(text, "", false);
    }
    public Option(String text, String value) {
        this(text, value, false);
    }
}