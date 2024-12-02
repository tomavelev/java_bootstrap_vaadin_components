package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.Style;

/**
 * Icon that allows you to change your UI to light / dark theme - provided by Bootstrap CSS.
 */
public class ThemeWidget extends Div {
    private static final String LIGHT = "light";
    private static final String DARK = "dark";
    private String theme;

    /**
     * Create new Theme Widget
     */
    public ThemeWidget() {

        getElement().executeJs("return localStorage.getItem(\"theme\")").then(jsonValue -> {
            if (jsonValue != null) {
                if (DARK.equals(jsonValue.asString())) {
                    theme = DARK;
                    getElement().executeJs("document.getElementsByTagName(\"html\")[0].setAttribute(\"data-bs-theme\",\"dark\");localStorage.setItem(\"theme\", \"dark\");");
                    addSun();

                } else {
                    // the value - it is light
                    theme = LIGHT;
                    addMoon();
                }
            } else {
                // no value - it is light
                theme = LIGHT;
                addMoon();
            }
        });
        getElement().getStyle().setCursor("pointer");

        getElement().getStyle().setDisplay(Style.Display.INLINE_BLOCK);
        getElement().addEventListener("click", event -> {

            if (theme.equals(DARK)) {
                theme = LIGHT;
                addMoon();
                getElement().executeJs("document.getElementsByTagName(\"html\")[0].setAttribute(\"data-bs-theme\",\"light\"); localStorage.setItem(\"theme\", \"light\");");
            } else {
                theme = DARK;
                getElement().executeJs("document.getElementsByTagName(\"html\")[0].setAttribute(\"data-bs-theme\",\"dark\");localStorage.setItem(\"theme\", \"dark\");");
                addSun();
            }

        });
    }

    private void addMoon() {
        removeAll();
        add(new Html("<span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-moon-fill\" viewBox=\"0 0 16 16\">\n" +
                     "  <path d=\"M6 .278a.77.77 0 0 1 .08.858 7.2 7.2 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277q.792-.001 1.533-.16a.79.79 0 0 1 .81.316.73.73 0 0 1-.031.893A8.35 8.35 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.75.75 0 0 1 6 .278\"/>\n" +
                     "</svg></span>"));
        getElement().getStyle().setColor("gray");
    }

    private void addSun() {
        removeAll();
        add(new Html("<span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-sun-fill\" viewBox=\"0 0 16 16\">\n" +
                     "  <path d=\"M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8M8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0m0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13m8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5M3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8m10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0m-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0m9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707M4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708\"/>\n" +
                     "</svg></span>"));
        getElement().getStyle().setColor("yellow");
    }
}
