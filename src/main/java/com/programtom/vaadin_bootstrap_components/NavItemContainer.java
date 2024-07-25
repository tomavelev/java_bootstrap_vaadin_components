package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;

@Tag("ul")
public class NavItemContainer extends Component implements HasComponents {

    public NavItemContainer(NavItem... items) {
        for (int i = 0; i < items.length; i++) {
            add(items[i]);
        }
        setClassName("nav  justify-content-center");
    }
}
