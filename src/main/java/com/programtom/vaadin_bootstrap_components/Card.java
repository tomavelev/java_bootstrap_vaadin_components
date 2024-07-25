package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

public class Card extends Div {

    public Card(Component... components) {
        setClassName("card");

        if (components.length > 0) {
            addBody(components);
        }
    }

    public void addBody(Component... components) {
        Div body = new Div();
        body.setClassName("card-body");
        for (Component component : components) {
            body.add(component);
        }
        add(body);
    }

    public void addHeader(Component... components) {
        Div body = new Div();
        body.setClassName("card-header");
        for (Component component : components) {
            body.add(component);
        }
        add(body);
    }

    public void addFooter(Component... components) {
        Div body = new Div();
        body.setClassName("card-footer");
        for (Component component : components) {
            body.add(component);
        }
        add(body);
    }
}