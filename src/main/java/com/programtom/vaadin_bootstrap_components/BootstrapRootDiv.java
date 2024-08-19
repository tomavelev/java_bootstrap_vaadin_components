package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;

/**
 * A subclass of Div that uses Bootstrap CSS styles from a CDN and should be the root of your web page.
 *
 * @author Toma Velev
 * @version 1.0
 */
@SuppressWarnings("unused")
@StyleSheet("https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css")
public class BootstrapRootDiv extends Div {

    /**
     * Creates new Div with Bootstrap CSS included
     */
    public BootstrapRootDiv(){

    }
}