package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.List;

/***
 * A custom UI component that represents a floating select field.
 *
 * @author Toma Velev
 */

@SuppressWarnings("unused")
@Tag("div")
public class FloatingSelect extends Component implements HasComponents {
    /**
     * The underlying Select component.
     */
    private final Select select;

    /**
     * Constructs a new FloatingSelect with the given list of options, label, ID, initial selected index, and change handler.
     *
     * @param list                 a list of Option objects to populate the select field
     * @param label                the text displayed as a label above the select field
     * @param id                   the unique identifier for this component
     * @param initialSelectedIndex the initial selected index (0-based)
     * @param onChange             a callback function invoked when the selection changes
     */
    public FloatingSelect(List<Option> list, String label, String id, Integer initialSelectedIndex, SerializableConsumer<Integer> onChange) {
        this.setClassName("form-floating");
        this.select = new Select(list, id, initialSelectedIndex, onChange);
        this.select.getElement().setAttribute("aria-label", label);
        add(this.select);
        add(new Label(label, id));
    }

    /**
     * Gets the currently selected index of the underlying Select component.
     *
     * @return the selected index (0-based)
     */
    public int selectedIndex() {
        return this.select.selectedIndex();
    }
}