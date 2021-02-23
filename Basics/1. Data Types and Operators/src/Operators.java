public class Operators {

    public void printAll() {
        System.out.println(" ");
        System.out.println("Operators:");
        System.out.println("-------------------------- ");

        System.out.println("Arithmetic Operators:");
        System.out.println();
        ArithmeticOperators();
        System.out.println();

        System.out.println("Relational Operators:");
        System.out.println();
        RelationalOperators();
        System.out.println();

        System.out.println("Bitwise Operators:");
        System.out.println();
        BitwiseOperators();
        System.out.println();

        System.out.println("Logical Operators:");
        System.out.println();
        LogicalOperators();
        System.out.println();

        System.out.println("Assignment Operators:");
        System.out.println();
        AssignmentOperators();
        System.out.println();

        System.out.println("Misc Operators:");
        System.out.println();
        MiscOperators();
        System.out.println();

    }

    public void ArithmeticOperators() {
        int num1 = 10;
        int num2 = 20;

        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);
        System.out.println();

        int answer = num1 + num2;
        System.out.println("+ (Addition) Output: " + answer);

        answer = num1 - num2;
        System.out.println("- (Subtraction) Output: " + answer);

        answer = num1 * num2;
        System.out.println("* (Multiplication)  Output: " + answer);

        answer = num2 / num1;
        System.out.println("/ (Division) Output: " + answer);

        answer = num2 % num1;
        System.out.println("% (Modulus) Output: " + answer);

        answer = num2++;
        System.out.println("++ (Increment) Output: " + answer);

        answer = num2--;
        System.out.println("-- (Decrement) Output: " + answer);

    }

    public void RelationalOperators() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);
        System.out.println();

        System.out.println("num1 and num2 are equal: " + (num1 == num2));
        System.out.println("num1 and num2 are not equal: " + (num1 != num2));
        System.out.println("num1 is greater than num2: " + (num1 > num2));
        System.out.println("num1 is less than num2: " + (num1 < num2));
        System.out.println("num1 is greater than or equal to num2: " + (num1 >= num2));
        System.out.println("num1 is less than or equal to num2: " + (num1 <= num2));

    }

    public void BitwiseOperators() {

        int num1 = 60; /* 11 = 00001011 */
        int num2 = 13; /* 22 = 00010110 */
        int result = 0;

        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);
        System.out.println();

        result = num1 & num2;
        System.out.println("num1 & num2: " + result);

        result = num1 | num2;
        System.out.println("num1 | num2: " + result);

        result = num1 ^ num2;
        System.out.println("num1 ^ num2: " + result);

        result = ~num1;
        System.out.println("~num1: " + result);

        result = num1 << 2;
        System.out.println("num1 << 2: " + result);
        result = num1 >> 2;
        System.out.println("num1 >> 2: " + result);

        result = num1 >>> 2;
        System.out.println("num1 >>> 2: " + result);
    }

    public void LogicalOperators() {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("BOOLEAN 1: " + b1 + " BOOLEAN B2: " + b2);
        System.out.println();
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
    }

    public void AssignmentOperators() {
        int num1 = 10;
        int num2 = 20;
        int answer = 0;

        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);
        System.out.println();

        num2 = num1;
        System.out.println("= Output: " + num2);

        System.out.println();
        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);

        answer = num2 += num1;
        System.out.println("+= Output: " + answer);

        answer = num2 -= num1;
        System.out.println("-= Output: " + answer);

        answer = num2 *= num1;
        System.out.println("*= Output: " + answer);

        answer = num2 /= num1;
        System.out.println("/= Output: " + answer);

        answer = num2 %= num1;
        System.out.println("%= Output: " + answer);

        answer = num2 <<= num1;
        System.out.println("<<= Output: " + answer);

        answer = num2 >>= num1;
        System.out.println(">>= Output: " + answer);

        answer = num2 &= num1;
        System.out.println("&= Output: " + answer);

        answer = num2 ^= num1;
        System.out.println("^= Output: " + answer);

        answer = num2 |= num1;
        System.out.println("!= Output: " + answer);

    }

    public void MiscOperators() {

        int num1 = 10;
        int num2 = 20;
        boolean answer = num1 == num2 ? true : false;
        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);
        System.out.println("Conditional Operator: is number 1 equal to number 2? " + answer);
        String name = "James";
        boolean result = name instanceof String;
        System.out.println("Instanceof: is James a string? " + result);
    }

}
