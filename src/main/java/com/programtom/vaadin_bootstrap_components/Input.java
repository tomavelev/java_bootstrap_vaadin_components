package com.programtom.vaadin_bootstrap_components;

/**
 * A custom UI component that represents an input field.
 *
 * @author Toma Velev
 */
public class Input extends com.vaadin.flow.component.html.Input {
    /**
     * Constructs a new Input instance.
     */
    @SuppressWarnings("unused")
    public Input() {
        super();
        setClassName("form-control");
        setType(InputType.TEXT.getHTMLType());
        setAutocomplete(AutoCompleteFieldType.ON);
    }

    /**
     * Constructs a new Input instance with the given type, id and placeholder.
     *
     * @param placeholder the input placeholder text
     * @param type        the input type
     */
    public Input(String placeholder, InputType type) {
        super();
        setType(type.getHTMLType());
        setClassName("form-control");
        setPlaceholder(placeholder);
        setCustomType(type);
    }

    /*

    Set autocomplete from type
     */
    public void setCustomType(InputType type) {
        switch (type) {
            case BUTTON,
                 CHECKBOX,
                 DATE,
                 COLOR,
                 DATETIME_LOCAL,
                 FILE,
                 IMAGE,
                 MONTH,
                 HIDDEN,
                 NUMBER,
                 RADIO,
                 RESET,
                 WEEK,
                 TIME,
                 TEXT,
                 SUBMIT,
                 SEARCH,
                 RANGE -> setAutocomplete(AutoCompleteFieldType.OFF);
            case EMAIL -> setAutocomplete(AutoCompleteFieldType.EMAIL);
            case PASSWORD -> setAutocomplete(AutoCompleteFieldType.CURRENT_PASSWORD);
            case TEL -> setAutocomplete(AutoCompleteFieldType.TEL);
            case URL -> setAutocomplete(AutoCompleteFieldType.URL);
        }
    }

    /**
     * Set the autocomplete input property
     *
     * @param autoCompleteFieldType - the autocomplete value
     */
    public void setAutocomplete(AutoCompleteFieldType autoCompleteFieldType) {
        getElement().setProperty("autocomplete", autoCompleteFieldType.getHtmlValue());
    }

    /**
     * Constructs a new Input instance with the given type, id and placeholder.
     *
     * @param type        the input type
     * @param id          the input id
     * @param placeholder the input placeholder text
     */
    public Input(InputType type, String id, String placeholder) {
        super();
        setType(type.getHTMLType());
        setClassName("form-control");
        setPlaceholder(placeholder);
        setCustomType(type);

        if (id != null) {
            getElement().setAttribute("id", id);
        }
    }

    /**
     * Constructs a new Input instance with the given type, id and placeholder.
     *
     * @param type                  the input type
     * @param id                    the input id
     * @param placeholder           the input placeholder text
     * @param autoCompleteFieldType - the autocomplete type
     */
    @SuppressWarnings("unused")
    public Input(InputType type, String id, String placeholder, AutoCompleteFieldType autoCompleteFieldType) {
        super();
        setType(type.getHTMLType());
        setClassName("form-control");
        setPlaceholder(placeholder);
        setAutocomplete(autoCompleteFieldType);


        if (id != null) {
            getElement().setAttribute("id", id);
        }
    }

    /**
     * Sets the checked Attribute
     *
     * @param initialValue the new check value.
     */
    public void setChecked(boolean initialValue) {
        if (initialValue) {
            getElement().setAttribute("checked", "");
        } else {
            getElement().removeAttribute("checked");
        }
    }
}
