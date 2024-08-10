package com.programtom.vaadin_bootstrap_components;

/**
 * The common sizes - used in Bootstrap to accomplish Responsive Design
 */
public enum ResponsiveSize {

    /**
     * This describes <576px screen size
     */
    extraSmall,
    /**
     * Indicates screen size between 576px <=> 768px
     */
    small,
    /**
     * Indicates screen size between 768px <=> 992px
     */
    medium,
    /**
     * Indicates screen size between 992px <=> 1200px
     */
    large,
    /**
     * Indicates screen size between 1200px <=> 1400px
     */
    extraLarge,
    /**
     * Indicates screen size beyond 1400px
     */
    extraExtraLanguage;

    /**
     * @return The CSS class that indicates the size
     */
    public String cssClass() {
        return switch (this) {
            case extraSmall -> "xs";
            case small -> "sm";
            case medium -> "md";
            case large -> "lg";
            case extraLarge -> "xl";
            case extraExtraLanguage -> "xxl";
        };
    }
}