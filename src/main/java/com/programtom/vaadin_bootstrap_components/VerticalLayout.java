package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings("unused")
public class VerticalLayout extends Div {

    public VerticalLayout(Component... components) {
        add(components);
    }
}
