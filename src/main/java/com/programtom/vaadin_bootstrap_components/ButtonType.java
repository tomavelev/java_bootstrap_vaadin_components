package com.programtom.vaadin_bootstrap_components;

/**
 * An enumeration of button types used to customize the appearance of buttons.
 *
 * @author Toma Velev
 * @version 1.0
 */
public enum ButtonType {
    /**
     * The primary button type, which typically has a solid color.
     */
    PRIMARY,

    /**
     * The secondary button type, which typically has a lighter or more muted color.
     */
    SECONDARY,

    /**
     * The success button type, which typically indicates successful action.
     */
    SUCCESS,

    /**
     * The danger button type, which typically indicates warning or error.
     */
    DANGER,

    /**
     * The warning button type, which typically indicates caution or attention.
     */
    WARNING,

    /**
     * The info button type, which typically provides additional information.
     */
    INFO,
    /**
     * The light button type, which typically has a lighter color.
     */
    LIGHT,
    /**
     * The dark button type, which typically has a darker color.
     */
    DARK,
    /**
     * The link button type, which typically is used to represent an external URL.
     */
    LINK;

    /**
     * Returns the CSS class name corresponding to this button type.
     *
     * @return the CSS class name
     */
    String className() {
        return switch (this) {
            case PRIMARY -> "btn btn-primary";
            case SECONDARY -> "btn btn-secondary";
            case SUCCESS -> "btn btn-success";
            case DANGER -> "btn btn-danger";
            case WARNING -> "btn btn-warning";
            case INFO -> "btn btn-info";
            case LIGHT -> "btn btn-light";
            case DARK -> "btn btn-dark";
            case LINK -> "btn btn-link";
        };
    }
}