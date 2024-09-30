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
     * Constructor with only a label
     */
    public FloatingSelect(String label) {
        this.setClassName("form-floating");
        this.select = new Select();
        select.setElementId(label);
        this.select.getElement().setAttribute("aria-label", label);
        add(this.select);
        add(new Label(label, label));
    }

    /**
     * Constructor with only a label and element id
     */
    public FloatingSelect(String label, String id) {
        this.setClassName("form-floating");
        this.select = new Select();
        select.setElementId(id);
        this.select.getElement().setAttribute("aria-label", label);
        add(this.select);
        add(new Label(label, id));
    }

    /**
     * Set Options and return the select for chaining other configuration.
     */
    public FloatingSelect setOptions(List<Option> pList) {
        select.setOptions(pList);
        return this;
    }

    /**
     * Returns the Selected Item Value
     */
    public String getSelectedValue() {
        return select.getSelectedValue();
    }

    /**
     * Set Element's ID
     */
    public FloatingSelect setElementId(String id) {
        select.setElementId(id);
        return this;
    }

    /**
     * Sets Initially selected option
     */
    public FloatingSelect setSelectedIndex(Integer initialSelectedIndex) {
        select.setSelectedIndex(initialSelectedIndex);
        return this;
    }

    /**
     * Adds On Change Event Listener
     */
    public void addEventListener(SerializableConsumer<Integer> onChange) {
        select.addEventListener(onChange);
    }

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
        this.select = new Select();
        select.setElementId(id).setOptions(list).setSelectedIndex(initialSelectedIndex).addEventListener(onChange);
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

    /**
     * Sets if the field is not type-able
     *
     * @param isReadonly - if the field is Read only
     */
    public void setReadonly(boolean isReadonly) {

        if (isReadonly) {
            select.getElement().setAttribute("readonly", "");
        } else {
            select.getElement().removeAttribute("readonly");
        }
    }
}