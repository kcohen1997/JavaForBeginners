public class Loops {

    public void forLoop() {

        String[] names = { "James", "Larry", "Tom", "Lacy" };

        System.out.print("For Loop Example: ");
        for (String i : names) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    public void whileLoop() {

        String[] names = { "Larry", "James", "Tom", "Lacy" };

        System.out.print("While Loop Example: ");
        int i = 0;
        while (i < names.length) {
            System.out.print(names[i]);
            System.out.print(", ");
            i++;
        }

        System.out.println();

    }

    public void doWhileLoop() {

        String[] names = { "Larry", "James", "Lacy", "Tom" };

        System.out.print("Do Loop Example: ");

        int i = 0;
        do {
            System.out.print(names[i]);
            System.out.print(", ");
            i++;
        } while (i < names.length);

        System.out.println();

    }

    public void breakExample() {
        System.out.print("Break Example: ");
        int i = 0;
        while (i < 10) {
            System.out.print(i + ", ");
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println();
    }

    public void continueExample() {
        System.out.print("Continue Example: ");
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.print(i + ", ");
            i++;
        }
        System.out.println();
    }

    public void printAll() {
        System.out.println();
        System.out.println("Loops: ");
        System.out.println("--------------------------");
        forLoop();
        whileLoop();
        doWhileLoop();
        breakExample();
        continueExample();
        System.out.println();

    }

}
