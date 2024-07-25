package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class Container extends Div {

    public Container(Component... components) {
        add(components);
        setClassName("container");
    }
}
