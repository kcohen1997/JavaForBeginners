public class Operators {

    public void printAll() {
        System.out.println(" ");
        System.out.println("Operators:");
        System.out.println("-------------------------- ");

        System.out.println("Assignment Operators:");
        System.out.println();
        AssignmentOperators();
        System.out.println();

        System.out.println("Logical Operators:");
        System.out.println();
        LogicalOperators();
        System.out.println();

        System.out.println("Relational Operators:");
        System.out.println();

        RelationalOperators();
        System.out.println();

    }

    public void AssignmentOperators() {
        int num1 = 10;
        int num2 = 20;

        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);

        num2 = num1;
        System.out.println("= Output: " + num2);

        num2 += num1;
        System.out.println("+= Output: " + num2);

        num2 -= num1;
        System.out.println("-= Output: " + num2);

        num2 *= num1;
        System.out.println("*= Output: " + num2);

        num2 /= num1;
        System.out.println("/= Output: " + num2);

        num2 %= num1;
        System.out.println("%= Output: " + num2);

    }

    public void LogicalOperators() {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("BOOLEAN 1: " + b1 + " BOOLEAN B2: " + b2);
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));
    }

    public void RelationalOperators() {
        int num1 = 10;
        int num2 = 50;
        System.out.println("NUMBER # 1: " + num1 + " NUMBER #2: " + num2);

        if (num1 == num2) {
            System.out.println("num1 and num2 are equal");
        } else {
            System.out.println("num1 and num2 are not equal");
        }

        if (num1 != num2) {
            System.out.println("num1 and num2 are not equal");
        } else {
            System.out.println("num1 and num2 are equal");
        }

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num1 is not greater than num2");
        }

        if (num1 >= num2) {
            System.out.println("num1 is greater than or equal to num2");
        } else {
            System.out.println("num1 is less than num2");
        }

        if (num1 < num2) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is not less than num2");
        }

        if (num1 <= num2) {
            System.out.println("num1 is less than or equal to num2");
        } else {
            System.out.println("num1 is greater than num2");
        }

    }

    public void BitwiseOperators() {

        int num1 = 11; /* 11 = 00001011 */
        int num2 = 22; /* 22 = 00010110 */
        int result = 0;

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
    }
}
