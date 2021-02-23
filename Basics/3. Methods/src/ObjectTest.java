public class ObjectTest {

    public void printEmployees() {

        // Hamburger default: everything on the order
        HamburgerOrder orderOne = new HamburgerOrder();

        // Hamburger with no tomatoes, no onions, and no mayo
        HamburgerOrder orderTwo = new HamburgerOrder(1, true, false, false, true, false);

        System.out.println();
        System.out.println("Classes and Objects: ");
        System.out.println("--------------------------");

        // Print Order 1
        System.out.println("Order 1: Default");
        // Invoking methods for each object created
        orderOne.printHamburger();
        System.out.println();

        // Print Order 2
        System.out.println("Order 2: Specific Order");
        // Invoking methods for each object created
        orderTwo.printHamburger();
        System.out.println();

        // Change Order using Getters and Setters
        System.out.println("Order Change: No Onions ");
        orderOne.setOnions(false);
        System.out.println("Get Onions: " + orderOne.getOnions());
        // Print Updated Order
        System.out.println();
        System.out.println("Updated Order: ");
        orderOne.printHamburger();

    }
}