## Java Basics

Welcome to Java Basics. Here we will be discussing data types, objects, and loops.
Run App.js to see examples

Source: https://www.tutorialspoint.com/java

## Data Types

byte:

## Varaibles

There are three types of variables.

Local Variables
- declared in methods, constructors, or blocks
- visible only within a declared method constructor or block
- will be destroyed once it exits the method, constructor or block
- access modifiers cannot be used 
- implemented at a stack level internally?
- has no default value, so they must be declared and an initial value should be assigned before first use

Ex: public void printInteger(int n) {
  System.out.println(n);
}

Instance Variables
- declared in a class, but outside of method, constructor or any block
- When a space is allocated for an object in the heap, a slot for each instance variable value is created?
- hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class
- can be declared in class level before or after use
- access modifiers can be given for instance variables.
- visible for all methods, constructors and block in the class. Normally, it is recommended to make these variables private (access level). However, visibility for subclasses can be given for these variables with the use of access modifiers.
- have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.
- can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name.

Ex: 
- public boolean hasLettuce;
- private int orderNo:

Access Modifiers:
Default:	declarations are visible only within the package (package private)
Private:	declarations are visible within the class only
Protected:	declarations are visible within the package or all subclasses
Public:	declarations are visible everywhere

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).
