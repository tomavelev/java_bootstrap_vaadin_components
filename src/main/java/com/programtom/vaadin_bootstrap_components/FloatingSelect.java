package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.List;

@Tag("div")
public class FloatingSelect extends Component implements HasComponents {
    private final Select select;

    public FloatingSelect(List<Option> list, String label, String id, Integer initialSelectedIndex, SerializableConsumer<Integer> onChange) {
        this.setClassName("form-floating");
        this.select = new Select(list, id, initialSelectedIndex, onChange);
        this.select.getElement().setAttribute("aria-label", label);
        add(this.select);
        add(new Label(label, id));
    }

    public int selectedIndex() {
        return this.select.selectedIndex();
    }
}