package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * A component that represents a column in a grid layout, used to group related content.
 *
 * @author Toma Velev
 * @version 1.0
 */
public class Column extends Div {
    /**
     * Constructor for creating a new Column with the components. You will need to add responsive CSS classes post-construct.
     *
     * @param components the components to add to this column
     */
    public Column(Component... components) {
        add(components);
    }

    /**
     * Constructor for creating a new Column with the given number of columns and components with max width.
     *
     * @param col        the value between 1-12 representing the column span or 0 for no column class
     * @param components the components to add to this column
     */
    public Column(int col, Component... components) {
        assert col >= 0 && col <= 12;
        add(components);
        if (col != 0) {
            setClassName("col-" + col);
        }
    }

    /**
     * Adds the CSS class according to the parameters - to make the column responsive
     *
     * @param size   - the width type
     * @param amount - width amount - between 1 and 12
     * @return the same Column
     */
    public Column withSize(ResponsiveSize size, int amount) {
        assert amount > 0 && amount <= 12;
        getClassNames().add("col-" + size.cssClass() + "-" + amount);
        return this;
    }

    /**
     * Adds a CSS class that hides the column on certain screen size
     *
     * @param size - the width type
     * @return the same Column
     */
    public Column hidden(ResponsiveSize size) {
        if (size == ResponsiveSize.extraExtraLanguage) {
            getClassNames().add("d-xxl-none");
            getClassNames().add("d-none");
        } else {
            getClassNames().add("d-none");
            getClassNames().add("d-" + size.cssClass() + "-none");
            getClassNames().add("d-" + ResponsiveSize.values()[size.ordinal() + 1].cssClass() + "-block");
        }
        return this;
    }

    /**
     * Adds a CSS class that makes the column visible on certain screen size
     *
     * @param size - the width type
     * @return the same Column
     */
    public Column visible(ResponsiveSize size) {
        if (size == ResponsiveSize.extraExtraLanguage) {
            getClassNames().add("d-none");
            getClassNames().add("d-xxl-block");
        } else {
            getClassNames().add("d-none");
            getClassNames().add("d-" + size.cssClass() + "-block");
            getClassNames().add("d-" + ResponsiveSize.values()[size.ordinal() + 1].cssClass() + "-none");
//
        }
        return this;
    }
}