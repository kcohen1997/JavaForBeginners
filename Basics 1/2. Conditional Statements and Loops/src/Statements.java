public class Statements {

    public void IfStatement(int n) {

        System.out.println("If Statement:");

        if (n == 5) {
            System.out.println("Number is 5!");
        }

    }

    public void IfElseStatement(int n) {

        System.out.println("If Else Statement:");

        if (n != 5) {
            System.out.println("Number is not 5!");
        } else {
            System.out.println("Number is 5!");
        }

        System.out.println();

    }

    public void NestedIfStatement(int n) {

        System.out.println("Nested If Else Statement:");

        if (n != 5) {
            System.out.println("Number is not 5!");
        } else if (n == 5) {
            System.out.println("Number is 5!");
        } else {
            System.out.println("Is this even a number?!");
        }

    }

    public void SwitchStatement(int n) {

        System.out.println("Switch Statement:");

        switch (n) {
            case 0:
                break; // break keyword is necessary so we can leave the switch statement
            case 5:
                System.out.println("Number is 5!");
                break;
            default: // default should be in every switch statement
                System.out.println("Number is not 0 or 5");
        }
    }

    public void printAll() {
        System.out.println();
        System.out.println("Loops: ");
        System.out.println("--------------------------");
        System.out.println("SAMPLE INTEGER 5: ");
        IfStatement(5);
        IfElseStatement(5);
        NestedIfStatement(5);
        SwitchStatement(5);
        System.out.println();

    }

}
