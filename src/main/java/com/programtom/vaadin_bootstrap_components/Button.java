package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;

@SuppressWarnings("unused")
@Tag("button")
public class Button extends com.vaadin.flow.component.button.Button {

    public Button() {
        setText("");
        setClassName(ButtonType.PRIMARY.className());
    }

    public Button(String text) {
        setText(text);
        setClassName(ButtonType.PRIMARY.className());
    }

    public Button(String text, ButtonType type) {
        setText(text);
        setClassName(type.className());
    }

    public Button(String text, ButtonType type,  ComponentEventListener<ClickEvent<com.vaadin.flow.component.button.Button>> clickListener) {
        this(text,clickListener);
        setClassName(type.className());
    }



    public Button(String text, ComponentEventListener<ClickEvent<com.vaadin.flow.component.button.Button>> clickListener) {
        setText(text);
        addSingleClickListener(clickListener);
        setClassName(ButtonType.PRIMARY.className());
    }
}