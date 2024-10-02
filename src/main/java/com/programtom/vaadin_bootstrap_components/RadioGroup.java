package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Component;

import java.util.List;

/**
 * Group Radio Inputs together
 */
@SuppressWarnings("unused")
public class RadioGroup extends HorizontalLayout {


    /**
     * Construct Radio with the provided radio inputs
     *
     * @param radios - a list of radio inputs
     */
    public RadioGroup(List<Radio> radios) {
        super(HorizontalLayout.DisplayMode.GRID, radios.toArray(new Component[]{}));

        radios.forEach(radio -> radio.
                getElement().addEventListener("click", domEvent -> {
                    if (radio.getValue()) {
                        return;
                    }
                    radios.forEach(radio1 -> radio1.setValue(radio1 == radio));
                }));
    }
}
