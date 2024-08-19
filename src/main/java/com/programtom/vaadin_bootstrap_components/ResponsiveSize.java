package com.programtom.vaadin_bootstrap_components;

/**
 * The common sizes - used in Bootstrap to accomplish Responsive Design
 */
public enum ResponsiveSize {

    /**
     * This describes &lt; 576px screen size
     */
    extraSmall,
    /**
     * Indicates screen size between 576px &lt; = &gt; 768px
     */
    small,
    /**
     * Indicates screen size between 768px &lt; = &gt; 992px
     */
    medium,
    /**
     * Indicates screen size between 992px &lt; = &gt; 1200px
     */
    large,
    /**
     * Indicates screen size between 1200px  &lt; = &gt; 1400px
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