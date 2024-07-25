package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings("unused")
public class Column extends Div {

    public Column(int col, Component... components) {
        add(components);
        setClassName("col-" + col);
    }
}
