package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.dom.DomEvent;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.function.SerializableConsumer;

import java.util.List;

@Tag("select")
public class Select extends Component implements HasComponents {
    private int selectedIndex = 0;

    public Select(List<Option> list, String id, Integer initialSelectedIndex, SerializableConsumer<Integer> onChange) {
        this.setClassName("form-select");
        list.forEach(this::add);
        if (id != null) {
            getElement().setAttribute("id", id);
        }
        if (initialSelectedIndex != null) {
            this.selectedIndex = initialSelectedIndex;
            getElement().executeJs("this.selectedIndex = $0", initialSelectedIndex);
        }
        getElement().addEventListener("change", new DomEventListener() {
            @Override
            public void handleEvent(DomEvent event) {
                getElement().executeJs("return this.selectedIndex")
                        .then(jsonValue -> {
                            selectedIndex = Integer.parseInt(jsonValue.asString());
                            if (onChange != null) {
                                onChange.accept(selectedIndex);
                            }
                        });
            }
        });
    }

    public int selectedIndex() {
        return selectedIndex;
    }
}