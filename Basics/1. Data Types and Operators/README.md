# Data Types and Operators

Welcome to Data Types and Operators. Run App.java to see examples

Source: https://www.tutorialspoint.com/java

# Data Types

### Primitive Data Types

Primitive datatypes are predefined by the language and named by a keyword.

##### byte
- data type an 8-bit signed two's complement integer
- minimum value is -128 (-2^7), maximum value is 127 (inclusive)(2^7 -1)
- default value is 0
- byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.
- Example: byte a = 100, byte b = -50

##### short
- data type is a 16-bit signed two's complement integer
- minimum value is -128 -32,768 (-2^15), maximum value is 32,767 (inclusive) (2^15 -1)
- default value is 0
- can also be used to save memory as byte data type. 
- 2 times smaller than an integer
- example: short s = 10000, short r = -20000

##### int
- data type is a 32-bit signed two's complement integer.
- minimum value is - 2,147,483,648 (-2^31), maximum value is 2,147,483,647(inclusive) (2^31 -1)
- is generally used as the default data type for integral values unless there is a concern about memory.
- default value is 0
- Example: int a = 100000, int b = -200000

##### long
- data type is a 64-bit signed two's complement integer
- minimum value is -9,223,372,036,854,775,808(-2^63), maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
- used when a wider range than int is needed
- Default value is 0L
- Example: long a = 100000L, long b = -200000L

##### float
- data type is a single-precision 32-bit IEEE 754 floating point
- mainly used to save memory in large arrays of floating point numbers
- default value is 0.0f
- data type is never used for precise values such as currency
- float f1 = 234.5f

##### double
- data type is a double-precision 64-bit IEEE 754 floating point
- data type is generally used as the default data type for decimal values, generally the default choice
- data type should never be used for precise values such as currency
- default value is 0.0d
- example: double d1 = 123.4

##### boolean
- data type represents one bit of information. There are only two possible values: true and false
- data type is used for simple flags that track true/false conditions
- Default value is false
- Example: boolean one = true

##### char
- char data type is a single 16-bit Unicode character
- minimum value is '\u0000' (or 0)
- maximum value is '\uffff' (or 65,535 inclusive)
- char data type is used to store any character
- Example: char letterA = 'A'

### Reference Datatypes

- are created using defined constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy, etc.
- Class objects and various type of array variables come under reference datatype.
- Default value of any reference variable is null.
- can be used to refer any object of the declared type or any compatible type.
- Example: Animal animal = new Animal("giraffe"); 

# Operators

### Arithmetic Operators

Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra.

Assume integer variable A holds 10 and variable B holds 20.

| Operator  | Example |
| ------------- | ------------- |
| + (Addition)  | 	A + B will give 30 |
| - (Subtraction)  | A - B will give -10  |
| * (Multiplication)  | A * B will give 200 |
| / (Division) | B / A will give 2  |
| % (Modulus)  | B % A will give 0 |
| ++ (Increment)  | B++ gives 21 |
| -- (Decrement)  | B-- gives 19  |


### Relational Operators

Relational operators directly compare two variables.

Assume integer variable A holds 10 and variable B holds 20.

| Operator  | Example |
| ------------- | ------------- |
| == (equal to) | 	(A == B) is not true. |
| != (not equal to)  | (A != B) is true. |
| > (greater than)  | (A > B) is not true. |
| < (less than) | (A < B) is true.  |
| >= (greater than or equal to)  | (A >= B) is not true. |
| <= (less than or equal to) | (A <= B) is true. |


### Bitwise Operators

Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte.

Bitwise operator works on bits and performs bit-by-bit operation. Assume if a = 60 and b = 13; now in binary format they will be as follows:

a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011

Assume integer variable A holds 60 and variable B holds 13.

| Operator  | Description | Example |
| ------------- | ------------- |  ------------- |
| & (bitwise and)  | 	Binary AND Operator copies a bit to the result if it exists in both operands. | (A & B) will give 12 which is 0000 1100 | (A & B) will give 12 which is 0000 1100  |
 | (bitwise or) | Binary OR Operator copies a bit if it exists in either operand. | (A | B) will give 61 which is 0011 1101 |
| ^ (bitwise XOR) | Binary XOR Operator copies the bit if it is set in one operand but not both. | (A ^ B) will give 49 which is 0011 0001 | 
| ~ (bitwise compliment) | Binary Ones Complement Operator is unary and has the effect of 'flipping' bits. | (~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number. |
| << (left shift) | Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand. | A << 2 will give 240 which is 1111 0000 |
| >> (right shift) | Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.  | A >> 2 will give 15 which is 1111 |
| >>> (zero fill right shift) | Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros. | A >>>2 will give 15 which is 0000 1111 |


### Logical Operators

Assume Boolean variables A holds true and variable B holds false

| Operator  |  Example |
| ------------- | ------------- |
| && (logical and)  | (A && B) is false | 
| \|\| (logical or)  | (A \|\| B) is true | 
| ! (logical not) |  !(A && B) is true | 

### Assignment Operators

| Operator  | Description | Example |
| ------------- | ------------- |  ------------- |
| = | Simple assignment operator. Assigns values from right side operands to left side operand. | C = A + B will assign value of A + B into C | C = A + B will assign value of A + B into C |
| += | Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand. | C += A is equivalent to C = C + A |
| -= | Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand. | C -= A is equivalent to C = C – A |
| *= | Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand. | C *= A is equivalent to C = C * A |
| /= | Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand. | C /= A is equivalent to C = C / A |
| %= | Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand. | C %= A is equivalent to C = C % A |
| <<= | Left shift AND assignment operator. | C <<= 2 is same as C = C << 2 |
| >>= | Right shift AND assignment operator. | C >>= 2 is same as C = C >> 2 |
| &= | 	Bitwise AND assignment operator. | C &= 2 is same as C = C & 2 |
| ^= | bitwise exclusive OR and assignment operator. | C ^= 2 is same as C = C ^ 2 |
| \|= | bitwise inclusive OR and assignment operator. | C \|= 2 is same as C = C \| 2 |


### Misc Operators

##### Conditional Operator (? : )

Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable.

variable x = (expression) ? value if true : value if false

##### instanceof Operator

This operator is used only for object reference variables. The operator checks whether the object is of a particular type (class type or interface type).

##### Examples:
 String name = "James";
 boolean result = name instanceof String;

# Java Literals

A literal is a source code representation of a fixed value. They are represented directly in the code without any computation.

Literals can be assigned to any primitive type variable. 


##### Examples:
- byte a = 68;
- char a = 'A';

byte, int, long, and short can be expressed in decimal(base 10), hexadecimal(base 16) or octal(base 8) number systems as well. Prefix 0 is used to indicate octal, and prefix 0x indicates hexadecimal when using these number systems for literals. 

##### Examples:
- int decimal = 100;
- int octal = 0144;
- int hexa =  0x64;

String literals in Java are specified like they are in most other languages by enclosing a sequence of characters between a pair of double quotes. 

##### Examples:
- "Hello World"
- "two\nlines"
- "\"This is in quotes\""

String and char types of literals can contain any Unicode characters. 

##### Examples:
- char a = '\u0001';
- String a = "\u0001";

Java language supports few special escape sequences for String and char literals as well. 

| Operator  | Example |
| ------------- | ------------- |
| \n  | Newline (0x0a) |
| \r  | Carriage return (0x0d)  |
| \f  | Formfeed (0x0c) |
| \b | Backspace (0x08)  |
| \s  | Space (0x20)  |
| \t  | tab |
| \"  | Double quote  |
| \'  | Single quote |
| \\  | backslash  |
| \ddd  | Octal character (ddd)  |
| \uxxxx  | Hexadecimal UNICODE character (xxxx)  |









