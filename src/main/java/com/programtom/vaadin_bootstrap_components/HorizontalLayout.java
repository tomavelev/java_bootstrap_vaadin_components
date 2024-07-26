package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Style;

/**
 * A custom UI component that represents a horizontal layout.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
public class HorizontalLayout extends Div {
    /**
     * Constructs a new HorizontalLayout with the given components.
     *
     * @param components the components to add to this layout
     */
    public HorizontalLayout(Component... components) {
        getElement().getStyle().setDisplay(Style.Display.GRID);
        getElement().getStyle().set("grid-auto-flow", "column");
        getElement().getStyle().set("grid-column-gap", "5px");
        addHorizontalComponents(components);

    }

    /**
     * Adds the given components to this layout, horizontally aligned.
     *
     * @param components the components to add
     */
    public void addHorizontalComponents(Component... components) {
        for (Component component : components) {
            component.getElement().getStyle().setDisplay(Style.Display.INLINE_BLOCK);
        }
        add(components);

    }
}
