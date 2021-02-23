# Java Basics

Welcome to Built In Functions. Here we will be showing built-in functions for Numbers characters, strings, and arrays 
Run App.js to see examples

Source: https://www.tutorialspoint.com/java

# Numbers

Normally, when we work with Numbers, we use primitive data types such as byte, int, long, double, etc.

However, in development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper classes.

All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.

Integer x = 5; // boxes int to an Integer object

x =  x + 10;   // unboxes the Integer to a int

|  Method | Description |
|  ------------- |  ------------- |
| xxxValue() | Converts the value of this Number object to the xxx data type and returns it.  |
|  compareTo() | Compares this Number object to the argument. |
| equals() | Determines whether this number object is equal to the argument.  |
| valueOf() | Returns an Integer object holding the value of the specified primitive. |
|   toString() | Returns a String object representing the value of a specified int or Integer. |
|  parseInt() | This method is used to get the primitive data type of a certain String. |
| abs()  |  Returns the absolute value of the argument.  |
| ceil()  |  Returns the smallest integer that is greater than or equal to the argument. Returned as a double. |
| floor()  |  Returns the largest integer that is less than or equal to the argument. Returned as a double. |
| rint()   | Returns the integer that is closest in value to the argument. Returned as a double. |
| round()  |  Returns the closest long or int, as indicated by the method's return type to the argument. |
| min()  |  Returns the smaller of the two arguments.  |
| max()  | Returns the larger of the two arguments. |
| exp()  |  Returns the base of the natural logarithms, e, to the power of the argument. |
| log()  |  Returns the natural logarithm of the argument. |
| pow()  | Returns the value of the first argument raised to the power of the second argument.|
|  sqrt() | Returns the square root of the argument.  |
|  sin()  | Returns the sine of the specified double value. |
| cos()  |  Returns the cosine of the specified double value. |
|  tan()  | Returns the tangent of the specified double value. |
| asin()  |  Returns the arcsine of the specified double value. |
| acos()  |  Returns the arccosine of the specified double value. |
|  atan()   |Returns the arctangent of the specified double value. |
| atan2() |  Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta. |
| toDegrees()  |  Converts the argument to degrees. |
| toRadians()  |  Converts the argument to radians. |
| random()  |  Returns a random number. |


# Characters

## Escape Sequences

A character preceded by a backslash (\) is an escape sequence and has a special meaning to the compiler.

The newline character (\n) has been used frequently in this tutorial in System.out.println() statements to advance to the next line after the string is printed.

|  Escape Sequence | Description |
| \t  | 	Inserts a tab in the text at this point.  |
| \b  |  	Inserts a backspace in the text at this point. |
| \n  |  	Inserts a backspace in the text at this point. |
| \r  | Inserts a carriage return in the text at this point. |
| \f  | Inserts a form feed in the text at this point.  |
| \'  | Inserts a single quote character in the text at this point.  |
| \"  | Inserts a double quote character in the text at this point.  |
| \\  |  Inserts a backslash character in the text at this point. |

## Character Methods

|  Method | Description |
|  ------------- |  ------------- |
| 	isLetter() | Determines whether the specified char value is a letter. |
| isDigit()	| Determines whether the specified char value is a digit. |
| 	isWhitespace()	|  Determines whether the specified char value is white space. |
| 		isUpperCase() | Determines whether the specified char value is uppercase. |
| 	isLowerCase()	|  Determines whether the specified char value is lowercase. |
| toUpperCase()	|  Returns the uppercase form of the specified char value. |
| toLowerCase()	| Returns the lowercase form of the specified char value. |
| 	toString()	| Returns a String object representing the specified character value that is, a one-character string. |


# Strings

|  Method | Description |
|  ------------- |  ------------- |
| char charAt(int index) | Returns the character at the specified index. |
| int compareTo(Object o) | Compares this String to another Object. |
| int compareTo(String anotherString) | Compares two strings lexicographically. |
| int compareToIgnoreCase(String str) | Compares two strings lexicographically, ignoring case differences. |
| String concat(String str) | Concatenates the specified string to the end of this string. |
| boolean contentEquals(StringBuffer sb) | Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer. |
| static String copyValueOf(char[] data) | Returns a String that represents the character sequence in the array specified. |
| static String copyValueOf(char[] data, int offset, int count) | Returns a String that represents the character sequence in the array specified. |
| boolean endsWith(String suffix) | Tests if this string ends with the specified suffix. |
| boolean equals(Object anObject) | Compares this string to the specified object. |
| boolean equalsIgnoreCase(String anotherString) | Compares this String to another String, ignoring case considerations. |
| byte[] getBytes() | Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array. |
| byte[] getBytes(String charsetName) | Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array. |
| void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) | Copies characters from this string into the destination character array. |
| int hashCode() | Returns a hash code for this string. |
| int indexOf(int ch) | Returns the index within this string of the first occurrence of the specified character. |
| int indexOf(int ch, int fromIndex) | Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index. |
| String intern()  | Returns a canonical representation for the string object.|
| int lastIndexOf(int ch) | Returns the index within this string of the last occurrence of the specified character. |
| int lastIndexOf(int ch, int fromIndex) | Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index. |
| int lastIndexOf(String str) | Returns the index within this string of the rightmost occurrence of the specified substring. |
| int lastIndexOf(String str, int fromIndex) | Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index. |
| int length() | Returns the length of this string. |
| boolean matches(String regex) | Tells whether or not this string matches the given regular expression. |
| boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) | Tests if two string regions are equal. |
| boolean regionMatches(int toffset, String other, int ooffset, int len) | Tests if two string regions are equal.|
| String replace(char oldChar, char newChar) | Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.|
| String replaceAll(String regex, String replacement | Replaces each substring of this string that matches the given regular expression with the given replacement.|
|  String replaceFirst(String regex, String replacement) | Replaces the first substring of this string that matches the given regular expression with the given replacement. |
| String[] split(String regex) | Splits this string around matches of the given regular expression. |
| String[] split(String regex, int limit) | Splits this string around matches of the given regular expression. |
| boolean startsWith(String prefix) | Tests if this string starts with the specified prefix. |
| boolean startsWith(String prefix, int toffset) | Tests if this string starts with the specified prefix beginning a specified index. |
| CharSequence subSequence(int beginIndex, int endIndex) | Returns a new character sequence that is a subsequence of this sequence.|
| String substring(int beginIndex) | Returns a new string that is a substring of this string. |
| String substring(int beginIndex, int endIndex) | Returns a new string that is a substring of this string. |
| char[] toCharArray() | Converts this string to a new character array. |
| String toLowerCase() | Converts all of the characters in this String to lower case using the rules of the default locale. |
| String toLowerCase(Locale locale) | Converts all of the characters in this String to lower case using the rules of the given Locale. |
| String toString() | This object (which is already a string!) is itself returned. |
| String toUpperCase() | Converts all of the characters in this String to upper case using the rules of the default locale. |
| String toUpperCase(Locale locale) | Converts all of the characters in this String to upper case using the rules of the given Locale. |
| String trim() | Returns a copy of the string, with leading and trailing whitespace omitted. |
| static String valueOf(primitive data type x) | Returns the string representation of the passed data type argument. |

# Arrays

|  Method | Description |
|  ------------- |  ------------- |
| public static int binarySearch(Object[] a, Object key) |  Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; otherwise, it returns ( – (insertion point + 1)). |
| public static boolean equals(long[] a, long[] a2) | Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. This returns true if the two arrays are equal. Same method could be used by all other primitive data types (Byte, short, Int, etc.) |
| public static void fill(int[] a, int val) | Assigns the specified int value to each element of the specified array of ints. The same method could be used by all other primitive data types (Byte, short, Int, etc.) |
| public static void sort(Object[] a) | Sorts the specified array of objects into an ascending order, according to the natural ordering of its elements. The same method could be used by all other primitive data types ( Byte, short, Int, etc.) |



