package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A component that represents a column in a grid layout, used to group related content.
 *
 * @author Toma Velev
 * @version 1.0
 */

public class Column extends Div {

    /**
     * Constructor for creating a new Column with the given number of columns and components.
     *
     * @param col        the value between 1-12 representing the column span
     * @param components the components to add to this column
     */
    public Column(int col, Component... components) {
        assert col > 0 && col <= 12;
        add(components);
        setClassName("col-" + col);
    }
}