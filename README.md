Vaadin Components that use Bootstrap CSS as a basis.

### Set Up

1) Download the source code
2) execute - ``` mvn install ``` from this project's folder
3) Include the following maven dependency: 

        <dependency>
            <groupId>com.programtom</groupId>
            <artifactId>java_bootstrap_vaadin_components</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

### Examples
Here are some sample usage examples for the `Select`, `TextArea`, and `VerticalLayout` components:

**Select Component**
```java
// Create a list of options
List<Option> options = new ArrayList<>();
options.add(new Option("Option 1", "option-1"));
options.add(new Option("Option 2", "option-2"));

// Create a select component with the options and an initial selected index
Select select = new Select(options, null, 0, event -> {
    // Handle the selection change event
    System.out.println("Selected option: " + event);
});

// Add the select component to a container
container.add(select);
```
**TextArea Component**
```java
// Create a text area with an initial value
TextArea textarea = new TextArea(null, "Enter your message");
textarea.setCustomValue("Initial message");

// Add the text area to a container
container.add(textarea);

// Get the current value of the text area
String currentValue = textarea.getValue();
```
**VerticalLayout Component**
```java
// Create some components
Component component1 = new Label("Label 1");
Component component2 = new Button("Button 1");

// Create a vertical layout with the components
VerticalLayout layout = new VerticalLayout(component1, component2);

// Add the layout to a container
container.add(layout);
```
Here's an example of how you could use these components together:
```java
// Create some components
List<Option> options = new ArrayList<>();
options.add(new Option("Option 1", "option-1"));
options.add(new Option("Option 2", "option-2"));

Component component1 = new Label("Label");
Component component2 = new TextArea(null, "Enter your message");

Select select = new Select(options, null, 0, event -> {
    // Handle the selection change event
    System.out.println("Selected option: " + event);
});

VerticalLayout layout = new VerticalLayout(component1, select);
layout.add(component2);

// Add the layout to a container
container.add(layout);
```

TODOs
- Better samples for all components
- Live (Showcase) Demo