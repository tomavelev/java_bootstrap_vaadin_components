package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Anchor;

import java.util.List;

/**
 * A custom UI component that represents a navigation menu.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("nav")
public class Nav extends Component implements HasComponents {
    /**
     * Constructs a new Nav instance with the given title, titleHref and navItemContainer.
     *
     * @param title            the title of the navigation
     * @param titleHref        the href attribute of the title
     * @param navItemContainer the container for the navigation items
     */
    public Nav(List<Component> title, String titleHref, NavItemContainer navItemContainer) {
        setClassName("navbar shadow-sm");

        Anchor anchor = new Anchor(titleHref, title.toArray(Component[]::new));
        anchor.addClassName("navbar-brand");
        add(anchor, navItemContainer);
    }

    /**
     * Constructs a new Nav instance with the given title and titleHref.
     *
     * @param title     the title of the navigation
     * @param titleHref the href attribute of the title
     */
    public Nav(String title, String titleHref) {
        setClassName("navbar shadow-sm");

        Anchor anchor = new Anchor(titleHref, title);
        anchor.addClassName("navbar-brand");
        add(anchor);
    }
}
