package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Style;

@SuppressWarnings("unused")
public class HorizontalLayout extends Div {

    public HorizontalLayout(Component... components) {
        getElement().getStyle().setDisplay(Style.Display.GRID);
        getElement().getStyle().set("grid-auto-flow", "column");
        getElement().getStyle().set("grid-column-gap", "5px");
        addHorizontalComponents(components);

    }

    public void addHorizontalComponents(Component... components) {
        for (Component component : components) {
            component.getElement().getStyle().setDisplay(Style.Display.INLINE_BLOCK);
        }
        add(components);

    }

}
