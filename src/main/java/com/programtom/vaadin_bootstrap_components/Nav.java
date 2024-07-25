package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Anchor;

import java.util.List;

@SuppressWarnings("unused")
@Tag("nav")
public class Nav extends Component implements HasComponents {
    public Nav(List<Component> title, String titleHref, NavItemContainer navItemContainer) {
        setClassName("navbar shadow-sm");

        Anchor anchor = new Anchor(titleHref, title.toArray(Component[]::new));
        anchor.addClassName("navbar-brand");
        add(anchor, navItemContainer);
    }

    public Nav(String title, String titleHref) {
        setClassName("navbar shadow-sm");

        Anchor anchor = new Anchor(titleHref, title);
        anchor.addClassName("navbar-brand");
        add(anchor);
    }
}
