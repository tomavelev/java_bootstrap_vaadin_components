package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Style;

import java.util.List;

/**
 * A custom UI component that represents a horizontal layout.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
public class HorizontalLayout extends Div {

    /**
     * The Display Mode of the Horizontal Layout (GRID, FLEX, BLOCK)
     */
    private final DisplayMode displayMode;

    /**
     * Constructs a new HorizontalLayout with the given components.
     *
     * @param components the components to add to this layout
     */
    public HorizontalLayout(Component... components) {
        this(DisplayMode.BLOCK, components);
    }

    /**
     * Constructs a new HorizontalLayout with the given components and display mode.
     *
     * @param displayMode the display mode
     * @param components  the components to add to this layout
     */
    public HorizontalLayout(DisplayMode displayMode, Component... components) {
        this.displayMode = displayMode;
        switch (displayMode) {
            case FLEX -> getElement().getStyle().setDisplay(Style.Display.FLEX);
            case GRID -> {
                getElement().getStyle().setDisplay(Style.Display.GRID);
                getElement().getStyle().set("grid-auto-flow", "column");
                getElement().getStyle().set("grid-column-gap", "5px");

            }
            case BLOCK -> getElement().getStyle().setDisplay(Style.Display.BLOCK);
        }
        addHorizontalComponents(components);

    }


    /**
     * Adds the given components to this layout, horizontally aligned.
     *
     * @param components the components to add
     * @param flex       the flex amount to set
     */
    public void addHorizontalComponents(List<Component> components, List<Integer> flex) {
        assert displayMode == DisplayMode.FLEX;
        assert components.size() == flex.size();


        for (int i = 0; i < components.size(); i++) {
            components.get(i).getElement().getStyle().set("flex", String.valueOf(flex.get(i)));
        }
        add(components);
    }

    /**
     * Adds the given components to this layout, horizontally aligned.
     *
     * @param components the components to add
     */
    public void addHorizontalComponents(Component... components) {
        for (Component component : components) {
            switch (displayMode) {
                case GRID -> {
                    //nothing needed here
                }
                case FLEX -> component.getElement().getStyle().set("flex", "1");
                case BLOCK -> component.getElement().getStyle().setDisplay(Style.Display.INLINE_BLOCK);
            }
        }
        add(components);
    }

    /**
     * The mode of display of the Horizontal Layout
     */
    public enum DisplayMode {
        GRID,
        FLEX,
        BLOCK
    }
}
