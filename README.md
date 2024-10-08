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

4) Let your root component (one that has @Route)
   extend <a href="https://github.com/tomavelev/bootstrap_vaadin_components/blob/master/com/programtom/vaadin_bootstrap_kotlin_components/BootstrapRootDiv.kt">
   BootstrapRootDiv</a>

## Examples

Here are some sample usage examples for the `Select`, `TextArea`, and `VerticalLayout` components:

### Input Fields

As an individual influenced by Material Design, I've implemented FloatingInput, but you also have the power to use plain
Input. It has exposed:

- id
- Input Type
- AutoComplete Type
- placeholder

```
//initialize floating input with floating label "Name"
FloatingInput nameField = new FloatingInput("Name");

nameField.setError("Required"); // Dispaly error to the user - after clicking save button 

nameField.focus(); // request focus to the field

nameField.setAutoComplete(AutoCompleteFieldType.BDAY);// set autocomplete type (from the long list of types - name, address, etc

nameField.setValue("new Value");

nameField.getValue();//get the value of the input field
```

### Select Component

```java
// Create a list of options
List<Option> options = new ArrayList<>();
options.

add(new Option("Option 1", "option-1"));
        options.

add(new Option("Option 2", "option-2"));

// Create a select component with the options and an initial selected index
Select select = new Select(options, null, 0, event -> {
    // Handle the selection change event
    System.out.println("Selected option: " + event);
});

// Add the select component to a container
container.

add(select);
```

### TextArea Component

```java
// Create a text area with an initial value
TextArea textarea = new TextArea(null, "Enter your message");
textarea.

setCustomValue("Initial message");

// Add the text area to a container
container.

add(textarea);

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
container.

add(layout);
```

Here's an example of how you could use these components together:

```java
// Create some components
List<Option> options = new ArrayList<>();
options.

add(new Option("Option 1", "option-1"));
        options.

add(new Option("Option 2", "option-2"));

Component component1 = new Label("Label");
Component component2 = new TextArea(null, "Enter your message");

Select select = new Select(options, null, 0, event -> {
    // Handle the selection change event
    System.out.println("Selected option: " + event);
});

VerticalLayout layout = new VerticalLayout(component1, select);
layout.

add(component2);

// Add the layout to a container
container.

add(layout);
```

## Audio and Video Components

Audios and Videos Could Be added to the UI with defaults:

```
verticalLayout.add(new Audio(src, BaseContent.Preload.none));

Video video = new Video(src, BaseContent.Preload.auto);

//set custom parameters
video.setAutoplay(false);
video.setLoop(false);
video.setControls(true);
video.setMuted(false);

or video.setAutoplay(false).setLoop(false).setControls(true) /* ... */;

verticalLayout.add(video);
```

### Creating responsive Grid

```

//A responsive grid requires a container and a row
add(new Container(new Row(..............)));

//Example 1 - Create a UI where you have two items on left and side and a space between them for bigger screens

 Column(6, [my items]).withSize(ResponsiveSize.medium, 4)
 new Column(4, (new Text(""))).hidden(ResponsiveSize.small),
 Column(6, [my items]).withSize(ResponsiveSize.medium, 4)
 
 
 // Example 2 - Create a UI - that expands to full width on small screens, 1/2 on small and 1/3 - on larger screens
 new Column([my items])
 .withSize(ResponsiveSize.extraSmall, 12)
 .withSize(ResponsiveSize.small, 6)
 .withSize(ResponsiveSize.medium, 4),

```

## Navigation Component

You could create a Navigation with:

```
        NavItem logoutButton = new NavItem("logout", buttonClickEvent -> {
         //logout
        });
        NavItem menuItem1 = new NavItem("menuItem1", buttonClickEvent -> {
          //menuItem1
        });
        NavItemContainer navContainer = new NavItemContainer(menuItem1, logoutButton);
        
        //Maybe I should make a component for brand icon
        Image image = new Image("icons/icon.png", "icon");
        image.setWidth("30px");
        image.setHeight("30px");
        image.getStyle().setMarginLeft("10px");
        image.getStyle().setMarginRight("10px");
        Nav navBar = new Nav(Arrays.asList(
                image,
                new Span("My Title")

        ), "#", navContainer);
```

TODOs

- Better samples for remaining components
- Live (Showcase) Demo