package com.programtom.vaadin_bootstrap_components;

import com.vaadin.flow.component.html.Div;
/**
 * A custom UI component that represents an <a href="https://getbootstrap.com/docs/5.3/forms/input-group/">input group</a>.
<br>
 Here is a sample usage example:
<pre>
 // Create an input component
 Input input = new Input();

 // Create a button component
 Button button = new Button("Click me!");

 // Create an input group with the input and button components
 InputGroup group = new InputGroup(input, button);

 // Add the input group to a container
 container.add(group);
</pre>
 */
@SuppressWarnings("unused")
public class InputGroup extends Div {

    /**
     * Initializes a new instance of InputGroup with the given input and button components.
     *
     * @param input   the input component to add to this group
     * @param button  the button component to add to this group
     */
    public InputGroup(Input input, Button button) {
        setClassName("input-group"); // Set the CSS class name for styling
        add(input, button); // Add both components to the container
    }
}