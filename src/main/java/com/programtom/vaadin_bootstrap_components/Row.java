package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class Row extends Div {
    public Row(Component... components) {
        for (Component component : components) {
            add(component);
        }
        setClassName("row");
    }
}
