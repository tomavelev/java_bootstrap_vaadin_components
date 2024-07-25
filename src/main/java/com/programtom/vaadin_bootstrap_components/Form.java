package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

@SuppressWarnings("unused")
@Tag("form")
public class Form extends Component implements HasComponents {
    public Form(Component... components) {
        add(components);
    }
}