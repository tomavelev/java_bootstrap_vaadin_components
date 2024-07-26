package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

/**
 * A custom UI component that represents a vertical layout.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
public class VerticalLayout extends Div {

    /**
     * Initializes a new instance of VerticalLayout with the given components.
     *
     * @param components an array of components to add to this layout
     */
    public VerticalLayout(Component... components) {
        add(components);
    }
}
