package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

/**
 * A container component that holds a list of {@link NavItem} components.
 *
 * @author Toma Velev
 */
@Tag("ul")
public class NavItemContainer extends Component implements HasComponents {
    /**
     * Initializes a new instance of NavItemContainer with a variable number of NavItem components.
     *
     * @param items the NavItem components to add to this container
     */
    public NavItemContainer(NavItem... items) {
        add(items);
        setClassName("nav justify-content-center");
    }
}
