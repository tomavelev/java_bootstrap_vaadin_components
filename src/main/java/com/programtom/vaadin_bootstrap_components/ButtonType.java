package com.programtom.vaadin_bootstrap_components;

public enum ButtonType {
    PRIMARY,
    SECONDARY,
    SUCCESS,
    DANGER,
    WARNING,
    INFO,
    LIGHT,
    DARK,
    LINK;

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