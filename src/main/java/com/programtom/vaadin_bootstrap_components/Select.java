package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.List;

/**
 * A custom UI component that represents a select element.
 *
 * @author Toma Velev
 */
@SuppressWarnings("unused")
@Tag("select")
public class Select extends Component implements HasComponents {

    /**
     * The selected index of the select element.
     */
    private int selectedIndex = 0;

    /**
     * The selected item's value.
     */
    private String selectedValue;


    /**
     * Initializes a new instance of Select with the given list, id, initial selected index and onChange callback.
     *
     * @param list                 the list of options to add to this select
     * @param id                   the id of the select element (optional)
     * @param initialSelectedIndex the initial selected index (optional)
     * @param onChange             a callback function that is called when the selection changes
     */
    public Select(List<Option> list, String id, Integer initialSelectedIndex, SerializableConsumer<Integer> onChange) {
        this.setClassName("form-select");
        list.forEach(this::add);
        if (id != null) {
            getElement().setAttribute("id", id);
        }
        if (initialSelectedIndex != null) {
            this.selectedIndex = initialSelectedIndex;
            this.selectedValue = list.get(initialSelectedIndex).getValue();
            getElement().executeJs("this.selectedIndex = $0", initialSelectedIndex);
        }
        getElement().addEventListener("change", (DomEventListener) event -> getElement().executeJs("return this.selectedIndex")
                .then(jsonValue -> {
                    selectedIndex = Integer.parseInt(jsonValue.asString());
                    if (list.size() > selectedIndex) {
                        selectedValue = list.get(selectedIndex).getValue();
                    }
                    if (onChange != null) {
                        onChange.accept(selectedIndex);
                    }
                }));
    }

    /**
     * Returns the selected index of the select element.
     *
     * @return the selected index
     */
    public int selectedIndex() {
        return selectedIndex;
    }

    /**
     * Returns the selected value of the select element.
     *
     * @return the value of the select element.
     */
    public String getSelectedValue() {
        return selectedValue;
    }
}