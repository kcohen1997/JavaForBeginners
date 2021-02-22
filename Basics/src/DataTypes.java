public class DataTypes {
    byte b = 100;
    short s = 200;
    int i = 5;
    long l = -12332252626L;
    double d = -42937737.9d;
    float f = 21.98f;
    boolean bool = true;
    char ch = 'Z';
    Integer x = 5; // boxes int to an Integer object
    String str = "String";

    public void printDataTypes() {

        System.out.println("See README for more details ");
        System.out.println("Numbers (Ex: 3), can come in several types: byte, short, i, long, and float ");
        System.out.println(
                "Text can be printed in two different types: String and characters (characters can be represented as integer values)");
        System.out.println("EX: String: " + str + " Char: " + ch + " Char (int form): " + (int) ch);

    }

    public void printAll() {
        System.out.println();
        System.out.println("Data Types: ");
        System.out.println("--------------------------");
        printDataTypes();

    }

}
