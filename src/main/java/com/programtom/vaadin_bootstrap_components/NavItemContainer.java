package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

@Tag("ul")
public class NavItemContainer extends Component implements HasComponents {

    public NavItemContainer(NavItem... items) {
        for (NavItem item : items) {
            add(item);
        }
        setClassName("nav  justify-content-center");
    }
}
