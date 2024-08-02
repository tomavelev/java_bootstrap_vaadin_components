package com.programtom.vaadin_bootstrap_components;

/**
 * Enum representing different input types in HTML forms.
 */
public enum InputType {
    /**
     * A button element that can be used to submit a form or perform some other action.
     */
    BUTTON,

    /**
     * A checkbox element, which allows users to select one or more options from a list of values.
     */
    CHECKBOX,

    /**
     * A color input field that allows the user to enter a color value using a color picker interface.
     */
    COLOR,

    /**
     * A date input field that allows the user to enter a date in the format specified by the HTML5 date type.
     */
    DATE,

    /**
     * A datetime-local input field that allows the user to enter a date and time in the format specified by the HTML5 datetime-local type.
     */
    DATETIME_LOCAL,

    /**
     * An email input field that allows the user to enter an email address.
     */
    EMAIL,

    /**
     * A file input field that allows users to select files from their device for upload.
     */
    FILE,

    /**
     * A hidden input field that is not displayed on the page, but can be used to pass data between pages or to a server.
     */
    HIDDEN,

    /**
     * An image button element, which is similar to an HTML button element but displays an image instead of text.
     */
    IMAGE,

    /**
     * A month input field that allows the user to enter a month in the format specified by the HTML5 month type.
     */
    MONTH,

    /**
     * A number input field that allows the user to enter a number within a certain range or set of steps.
     */
    NUMBER,

    /**
     * A password input field, which masks the text entered by the user for security reasons.
     */
    PASSWORD,

    /**
     * A radio button element, which is similar to an HTML checkbox element but allows only one option to be selected at a time.
     */
    RADIO,

    /**
     * A range input field that allows the user to select a value from a continuous range of numbers.
     */
    RANGE,

    /**
     * A reset button element, which resets all form fields to their default values.
     */
    RESET,

    /**
     * A search input field, which allows users to enter text for searching purposes.
     */
    SEARCH,

    /**
     * A submit button element, which submits the form when clicked.
     */
    SUBMIT,

    /**
     * A tel input field that allows the user to enter a telephone number.
     */
    TEL,

    /**
     * A text input field that allows users to enter any type of text.
     */
    TEXT,

    /**
     * A time input field that allows the user to enter a time in the format specified by the HTML5 time type.
     */
    TIME,

    /**
     * AN url input field, which allows the user to enter a URL.
     */
    URL,

    /**
     * A week input field that allows the user to enter a week date in the format specified by the HTML5 week type.
     */
    WEEK;


    /**
     * @return Returns the HTML type of the input element.
     */
    public String getHTMLType() {
        return switch (this) {
            case BUTTON:
                yield "button";
            case CHECKBOX:
                yield "checkbox";
            case COLOR:
                yield "color";
            case DATE:
                yield "date";
            case DATETIME_LOCAL:
                yield "datetime-local";
            case EMAIL:
                yield "email";
            case FILE:
                yield "file";
            case HIDDEN:
                yield "hidden";
            case IMAGE:
                yield "image";
            case MONTH:
                yield "month";
            case NUMBER:
                yield "number";
            case PASSWORD:
                yield "password";
            case RADIO:
                yield "radio";
            case RANGE:
                yield "range";
            case RESET:
                yield "reset";
            case SEARCH:
                yield "search";
            case SUBMIT:
                yield "submit";
            case TEL:
                yield "tel";
            case TEXT:
                yield "text";
            case TIME:
                yield "time";
            case URL:
                yield "url";
            case WEEK:
                yield "week";
        };
    }
}