package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;

@SuppressWarnings("unused")
@Tag("li")
public class NavItem extends Component implements HasComponents {

    protected Anchor anchor = new Anchor("", "");

    /**
     * Init Nav Item - with only label
     *
     * @param label - the label
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

    public NavItem(String label, String href) {
        add(anchor);
        init(label, href, null);
    }

    public NavItem(String label, ComponentEventListener<ClickEvent<Button>> clickListener) {
        add(anchor);
        init(label, null, clickListener);
    }

    public NavItem(String label, String href, ComponentEventListener<ClickEvent<Button>> clickListener) {
        add(anchor);
        init(label, href, clickListener);
    }
}
