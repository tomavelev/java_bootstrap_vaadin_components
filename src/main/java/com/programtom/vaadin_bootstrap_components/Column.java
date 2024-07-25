package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class Column extends Div {

    public Column(int col, Component... components) {
        for (Component component : components) {
            add(component);
        }
        setClassName("col-" + col);
    }
}
