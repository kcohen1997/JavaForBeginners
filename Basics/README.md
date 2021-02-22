# Java Basics

Welcome to Java Basics. Here we will be discussing data types, objects, and loops.
Run App.js to see examples

Source: https://www.tutorialspoint.com/java

# Data Types

Primitive Data Types

Primitive datatypes are predefined by the language and named by a keyword.

byte
- data type an 8-bit signed two's complement integer
- minimum value is -128 (-2^7), maximum value is 127 (inclusive)(2^7 -1)
- default value is 0
- byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.
- Example: byte a = 100, byte b = -50

short
- data type is a 16-bit signed two's complement integer
- minimum value is -128 -32,768 (-2^15), maximum value is 32,767 (inclusive) (2^15 -1)
- default value is 0
- can also be used to save memory as byte data type. 
- 2 times smaller than an integer
- example: short s = 10000, short r = -20000

int
- data type is a 32-bit signed two's complement integer.
- minimum value is - 2,147,483,648 (-2^31), maximum value is 2,147,483,647(inclusive) (2^31 -1)
- is generally used as the default data type for integral values unless there is a concern about memory.
- default value is 0
- Example: int a = 100000, int b = -200000

long
- data type is a 64-bit signed two's complement integer
- minimum value is -9,223,372,036,854,775,808(-2^63), maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
- used when a wider range than int is needed
- Default value is 0L
- Example: long a = 100000L, long b = -200000L

float
- data type is a single-precision 32-bit IEEE 754 floating point
- mainly used to save memory in large arrays of floating point numbers
- default value is 0.0f
- data type is never used for precise values such as currency
- float f1 = 234.5f

double
- data type is a double-precision 64-bit IEEE 754 floating point
- data type is generally used as the default data type for decimal values, generally the default choice
- data type should never be used for precise values such as currency
- default value is 0.0d
- example: double d1 = 123.4

boolean
- data type represents one bit of information. There are only two possible values: true and false
- data type is used for simple flags that track true/false conditions
- Default value is false
- Example: boolean one = true

char
- char data type is a single 16-bit Unicode character
- minimum value is '\u0000' (or 0)
- maximum value is '\uffff' (or 65,535 inclusive)
- char data type is used to store any character
- Example: char letterA = 'A'

Reference Datatypes

- are created using defined constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy, etc.
- Class objects and various type of array variables come under reference datatype.
- Default value of any reference variable is null.
- can be used to refer any object of the declared type or any compatible type.
- Example: Animal animal = new Animal("giraffe"); 
- See "Objects" section for more details

Java Literals

A literal is a source code representation of a fixed value. They are represented directly in the code without any computation.

Literals can be assigned to any primitive type variable. 

<br>
Examples:
- byte a = 68;
- char a = 'A';
-
byte, int, long, and short can be expressed in decimal(base 10), hexadecimal(base 16) or octal(base 8) number systems as well. Prefix 0 is used to indicate octal, and prefix 0x indicates hexadecimal when using these number systems for literals. 

<br>
Examples:
- int decimal = 100;
- int octal = 0144;
- int hexa =  0x64;

String literals in Java are specified like they are in most other languages by enclosing a sequence of characters between a pair of double quotes. 

Examples:
- "Hello World"
- "two\nlines"
- "\"This is in quotes\""

String and char types of literals can contain any Unicode characters. 

Examples:
- char a = '\u0001';
- String a = "\u0001";

Java language supports few special escape sequences for String and char literals as well. 

| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |


## Varaibles

There are three types of variables.

### Local Variables
- declared in methods, constructors, or blocks
- visible only within a declared method constructor or block
- will be destroyed once it exits the method, constructor or block
- access modifiers cannot be used 
##### -implemented at a stack level internally?
- has no default value, so they must be declared and an initial value should be assigned before first use

#### Example: 
public void printInteger(int n) {
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
   private static double salary;
<br>
 Constant:
 <br>
   public static final String DEPARTMENT = "Development ";
   <br>
