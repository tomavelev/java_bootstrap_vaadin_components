package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

/**
 * A custom UI component that represents a row in a grid or table.
 */
@SuppressWarnings("unused")
public class Row extends Div {
    /**
     * Initializes a new instance of Row with the given components.
     *
     * @param components the components to add to this row
     */
    public Row(Component... components) {
        add(components);
        setClassName("row");
    }
}
