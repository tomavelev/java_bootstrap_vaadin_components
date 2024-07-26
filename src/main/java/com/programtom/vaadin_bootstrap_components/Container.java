package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings("ALL")
/**
 * A component that represents a container, often used in Bootstrap layouts to wrap content.
 * In Bootstrap, the "container" class is used to define a responsive grid system,
 * and this class provides a simple way to create such a container.
 *
 * @author Toma Velev
 * @version 1.0
 */
public class Container extends Div {

    /**
     * Constructor for creating a new Container with the given components.
     * The container will automatically have the "container" CSS class applied.
     *
     * @param components the components to add to this container
     */
    public Container(Component... components) {
        add(components);
        setClassName("container");
    }
}