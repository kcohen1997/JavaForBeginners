# Objects and Classes

Welcome to Objects and Classes. Run App.java to see the examples

Source: https://www.tutorialspoint.com/java

## Definitions
- Objects: A representation of a real world entity, like an animal or a person. An object has many characteristics that can be represented/changed inside of a class
- Classes: the blueprint of an object. An object describes an objects behavior and/or states.
- Methods: an operation done on an object. Getters and setters are very common examples of methods within a class, setters update a value while getters return a value 
- Instance Variables: a variable defined in a class. Each object has its own unique set of instance variables
- Constructor: a special method used to create objects. There are two types of constructors: default (no default values given) and parameterized (specfic default values are provided)

## Variables in a Class

There are three types of variables inside of a class.

### Local Variables
- declared in methods, constructors, or blocks
- visible only within a declared method constructor or block
- will be destroyed once it exits the method, constructor or block
- access modifiers cannot be used 
##### -implemented at a stack level internally?
- has no default value, so they must be declared and an initial value should be assigned before first use

#### Example: 
public void printInteger() {
int n= 0;
  System.out.println(n);
}

### Instance Variables
- declared in a class, but outside of method, constructor or any block
##### - When a space is allocated for an object in the heap, a slot for each instance variable value is created?
- hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class
- can be declared in class level before or after use
- access modifiers can be given for instance variables.
- visible for all methods, constructors and block in the class. Normally, it is recommended to make these variables private (access level). However, visibility for subclasses can be given for these variables with the use of access modifiers.
- have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.
- can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name.

#### Examples: 
public boolean hasLettuce;
<br>
private int orderNo:
<br>

#### Access Modifiers:
- Default:	declarations are visible only within the package (package private)
- Private:	declarations are visible within the class only
- Protected:	declarations are visible within the package or all subclasses
- Public:	declarations are visible everywhere

### Class/Static Variables
- are declared with the static keyword in a class, but outside a method, constructor or a block.
- It is rare to use static variables other than declared final and used as either public or private constants
  - Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value)
- are stored in the static memory
- are created when a program starts and destroyed when the program stops
- visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.
- default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.
- can be accessed by calling with the class name ClassName.VariableName.
- when declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.

#### Examples:
   - private static double salary;
   - public static final String DEPARTMENT = "Development "; // Constant
