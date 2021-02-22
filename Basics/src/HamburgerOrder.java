
public class HamburgerOrder {

    // public: variable is visible in any child class
    public boolean lettuce;
    public boolean tomatoes;
    public boolean onions;
    public boolean pickles;
    public boolean mayo;

    // private: variable is visible in class only
    private int orderNo;

    // Default constructor for the class HamburgerOrder
    public HamburgerOrder() {
        lettuce = true;
        tomatoes = true;
        onions = true;
        pickles = true;
        mayo = true;
        orderNo = 0;
    }

    // Parameterized constructor for the class HamburgerOrder
    public HamburgerOrder(int num, boolean l, boolean t, boolean o, boolean p, boolean m) {
        lettuce = l;
        tomatoes = t;
        onions = o;
        pickles = p;
        mayo = m;
        orderNo = num;
    }

    public boolean getOnions() {
        return onions;
    }

    public void setOnions(boolean b) {
        onions = b;
    }

    public void setOrderNo(int num) {
        orderNo = num;
    }

    public int getOrderNo() {
        return orderNo;
    }

    /* Print the Hamburger details */
    public void printHamburger() {
        System.out.println("Does it have lettuce? " + lettuce);
        System.out.println("Does it have tomatoes? " + tomatoes);
        System.out.println("Does it have onions? " + onions);
        System.out.println("Does it have pickles? " + pickles);
        System.out.println("Does it have mayo? " + mayo);
        System.out.println("Order No: " + orderNo);

    }
}