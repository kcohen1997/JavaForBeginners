public class BuiltInFunctions {

    public void printAll() {

        System.out.println("NUMBER ");
        Integer x = 5; // boxes int to an Integer object
        System.out.println("NUMBERS " + x);
        x = x + 10; // unboxes the Integer to a int
        System.out.println("NEW NUMBERS " + x);
        System.out.println();
        char c = 'c';

        System.out.println("CHARACTERS ");
        System.out.println(c);
        System.out.println("METHODS EXAMPLE: isUpperCase");
        System.out.println("Result: " + Character.toUpperCase(c));

        System.out.println();
        String str = "sample string";
        System.out.println("STRING");
        System.out.println(str);
        System.out.println("Result: " + str.replace("s", "S"));

        int[] integerArray = { 1, 2, 3 };
        int[] integerArray2 = { 1, 2, 3 };

        System.out.println();
        System.out.println("ARRAYS");
        System.out.println("ARRAY 1");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
        System.out.println();

        System.out.println("INTEGER");
        System.out.println("ARRAY 2");
        for (int i = 0; i < integerArray2.length; i++) {
            System.out.print(integerArray2[i] + " ");
        }
        System.out.println();

        System.out.println("METHODS EXAMPLE: equals ");
        System.out.println("Result: " + integerArray.equals(integerArray2));

    }
}