package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A container component that represents a card, often used in layouts to group related content.
 *
 * @author Toma Velev
 * @version 1.0
 */
public class Card extends Div {

    /**
     * Constructor for creating a new Card component with the given components as its body.
     *
     * @param components the components to add to the card's body
     */
    public Card(Component... components) {
        setClassName("card");
        if (components.length > 0) {
            addBody(components);
        }
    }

    /**
     * Method for adding components to the card's body.
     *
     * @param components the components to add to the card's body
     */
    public void addBody(Component... components) {
        Div body = new Div();
        body.setClassName("card-body");
        body.add(components);
        add(body);
    }

    /**
     * Method for adding components to the card's header.
     *
     * @param components the components to add to the card's header
     */
    public void addHeader(Component... components) {
        Div body = new Div();
        body.setClassName("card-header");
        body.add(components);
        add(body);
    }

    /**
     * Method for adding components to the card's footer.
     *
     * @param components the components to add to the card's footer
     */
    public void addFooter(Component... components) {
        Div body = new Div();
        body.setClassName("card-footer");
        body.add(components);
        add(body);
    }
}