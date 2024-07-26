package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

/**
 * A custom UI component that represents a form.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("form")
public class Form extends Component implements HasComponents {
    /**
     * Constructs a new Form with the given components.
     *
     * @param components - the components to add to this form
     */
    public Form(Component... components) {
        add(components);
    }
}