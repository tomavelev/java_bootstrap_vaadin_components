package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;

/**
 * A custom UI component that represents a navigation item.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("li")
public class NavItem extends Component implements HasComponents {

    /**
     * Initializes an empty Nav Item.
     */
    protected Anchor anchor = new Anchor("", "");

    /**
     * Initializes a Nav Item with only a label.
     *
     * @param label the label of the nav item
     */
    public NavItem(String label) {
        add(anchor);
        init(label, null, null);
    }

    private void init(String label,
                      String href,
                      ComponentEventListener<ClickEvent<Button>> clickListener) {

        setClassName("nav-item");
        anchor.setClassName("nav-link");
        anchor.setText(label);
        if (href != null) {
            anchor.setHref(href);
        } else {
            anchor.removeHref();
        }

        if (clickListener != null) {
            anchor.getElement().addEventListener("click", domEvent -> clickListener.onComponentEvent(null));
        }
    }

    /**
     * Initializes a Nav Item with a label and href.
     *
     * @param label the label of the nav item
     * @param href  the href attribute of the nav item
     */
    public NavItem(String label, String href) {
        add(anchor);
        init(label, href, null);
    }

    /**
     * Initializes a Nav Item with a label and click listener.
     *
     * @param label         the label of the nav item
     * @param clickListener the component event listener for the nav item
     */
    public NavItem(String label, ComponentEventListener<ClickEvent<Button>> clickListener) {
        add(anchor);
        init(label, null, clickListener);
    }

    /**
     * Initializes a Nav Item with a label, href, and click listener.
     *
     * @param label         the label of the nav item
     * @param href          the href attribute of the nav item
     * @param clickListener the component event listener for the nav item
     */
    public NavItem(String label, String href, ComponentEventListener<ClickEvent<Button>> clickListener) {
        add(anchor);
        init(label, href, clickListener);
    }
}
