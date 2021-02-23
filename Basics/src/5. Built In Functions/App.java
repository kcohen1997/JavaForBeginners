
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("WELCOME TO JAVA BASICS: ");
        System.out.println("------------------------------------------- ");

        DataTypes dt = new DataTypes();
        dt.printAll();

        Operators op = new Operators();
        op.printAll();

        ObjectTest test = new ObjectTest();
        test.printEmployees();

        Loops l = new Loops();
        l.printAll();

    }

}
