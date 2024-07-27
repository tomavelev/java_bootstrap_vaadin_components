package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;

/**
 * A custom UI component that represents a navigation item.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("a")
public class NavItem extends Anchor {

    /**
     * Initializes a Nav Item with only a label.
     *
     * @param label the label of the nav item
     */
    public NavItem(String label) {
        init(label, null, null);
    }

    private void init(String label,
                      String href,
                      ComponentEventListener<ClickEvent<Button>> clickListener) {

        setClassName("nav-link");
        setText(label);
        if (href != null) {
            setHref(href);
        } else {
            removeHref();
        }

        if (clickListener != null) {
            getElement().addEventListener("click", domEvent -> {
                clickListener.onComponentEvent(null);
                String jsScript = """
                        const parent = $0.parentNode;
                        parent.childNodes.forEach(function(item) {
                            if (item.nodeType === Node.ELEMENT_NODE && item !== $0) {
                                item.classList.remove('active');
                            }
                        });
                        if(!$0.classList.contains('active')) {
                           $0.classList.add("active");
                        }
                        """;
                getElement().executeJs(jsScript, getElement());
            });
        }
    }

    /**
     * Initializes a Nav Item with a label and href.
     *
     * @param label the label of the nav item
     * @param href  the href attribute of the nav item
     */
    public NavItem(String label, String href) {
        init(label, href, null);
    }

    /**
     * Initializes a Nav Item with a label and click listener.
     *
     * @param label         the label of the nav item
     * @param clickListener the component event listener for the nav item
     */
    public NavItem(String label, ComponentEventListener<ClickEvent<Button>> clickListener) {
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
        init(label, href, clickListener);
    }
}
