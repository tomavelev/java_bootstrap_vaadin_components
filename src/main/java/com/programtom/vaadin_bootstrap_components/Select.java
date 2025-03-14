package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.ArrayList;
import java.util.Arrays;
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

    /*
        A flag indicating if selecting multiple values is enabled.
     */
    private boolean multiSelect;
    /**
     * The Options of the Select Element.
     */
    private final List<Option> list = new ArrayList<>();

    /**
     * The selected item's value.
     */
    private String selectedValue;
    /**
     * The selected items values.
     */
    private final List<String> selectedValues = new ArrayList<>();

    /**
     * Empty Constructor
     */
    public Select() {
        this.setClassName("form-select");
    }

    /**
     * Set Options and return the select for chaining other configuration.
     */
    public Select setOptions(List<Option> pList) {
        removeAll();
        selectedValue = null;
        selectedValues.clear();
        list.clear();
        list.addAll(pList);
        for (Option option : list) {
            add(option);
            if (option.isSelected()) {
                if (multiSelect) {
                    selectedValues.add(option.getValue());
                } else {
                    selectedValue = option.getValue();
                    break;
                }
            }
        }
        if (!multiSelect && selectedValue == null && !list.isEmpty()) {
            selectedValue = list.getFirst().getValue();
        }
        return this;
    }

    /**
     * @param multiSelect whether the user could select only one value or multiple at ance
     */
    public Select setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
        getElement().setAttribute("multiple", "");
        return this;
    }

    /**
     * Set Element's ID
     */
    public Select setElementId(String id) {
        if (id != null) {
            getElement().setAttribute("id", id);
        }
        return this;
    }

    /**
     * Sets Initially selected option
     */
    public Select setSelectedIndex(Integer initialSelectedIndex) {
        if (initialSelectedIndex != null) {
            this.selectedIndex = initialSelectedIndex;
            if (list.size() > initialSelectedIndex) {
                this.selectedValue = list.get(initialSelectedIndex).getValue();
                getElement().executeJs("this.selectedIndex = $0", initialSelectedIndex);
            }
        }
        return this;
    }

    /**
     * Adds On Change Event Listener
     */
    public void addEventListener(SerializableConsumer<Integer> onChange) {
        getElement().addEventListener("change", (DomEventListener) event ->
                getElement().executeJs(multiSelect ? "return Array.from(this.selectedOptions).map(({ value }) => value).toString()"

                                : "return this.selectedIndex")
                        .then(jsonValue -> {
                            selectedValues.clear();
                            if (multiSelect) {
                                String[] strings = jsonValue.asString().split(",");
                                if(strings.length == 1) {
                                    if(!strings[0].isEmpty()) {
                                        selectedValues.add(strings[0]);
                                    }
                                } else {
                                    selectedValues.addAll(Arrays.asList(strings));
                                }
                            } else {
                                selectedIndex = Integer.parseInt(jsonValue.asString());
                                if (list.size() > selectedIndex && !list.isEmpty()) {
                                    selectedValue = list.get(selectedIndex).getValue();
                                }
                            }
                            if (onChange != null) {//TODO handle case multiple
                                onChange.accept(selectedIndex);
                            }

                        }));
    }

    /**
     * Initializes a new instance of Select with the given list, id, initial selected index and onChange callback.
     *
     * @param list                 the list of options to add to this select
     * @param id                   the id of the select element (optional)
     * @param initialSelectedIndex the initial selected index (optional)
     * @param onChange             a callback function that is called when the selection changes
     * @param multiSelect          whether the user could select only one value or multiple at ance
     */
    public Select(List<Option> list,
                  String id,
                  Integer initialSelectedIndex,
                  SerializableConsumer<Integer> onChange,
                  boolean multiSelect) {
        this();
        setOptions(list)
                .setElementId(id)
                .setSelectedIndex(initialSelectedIndex)
                .setMultiSelect(multiSelect)
                .addEventListener(onChange);
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

    /**
     * Returns the selected value(s) of the select element.
     *
     * @return the value of the select element.
     */
    public List<String> getSelectedValues() {
        return selectedValues;
    }
}