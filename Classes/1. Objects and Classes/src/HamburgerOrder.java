
public class HamburgerOrder {

    // public: variable is visible in any child class
    public boolean hasLettuce;
    public boolean hasTomatoes;
    public boolean hasOnions;
    public boolean hasPickles;
    public boolean hasMayo;

    // private: variable is visible in class only
    private int orderNo;

    // Default constructor for the class HamburgerOrder
    public HamburgerOrder() {
        this.hasLettuce = true;
        this.hasTomatoes = true;
        this.hasOnions = true;
        this.hasPickles = true;
        this.hasMayo = true;
        this.orderNo = 0;
    }

    // Parameterized constructor for the class HamburgerOrder
    public HamburgerOrder(int num, boolean l, boolean t, boolean o, boolean p, boolean m) {
        this.hasLettuce = l;
        this.hasTomatoes = t;
        this.hasOnions = o;
        this.hasPickles = p;
        this.hasMayo = m;
        this.orderNo = num;
    }

    public boolean getOnions() {
        return hasOnions;
    }

    public void setOnions(boolean b) {
        hasOnions = b;
    }

    public void setOrderNo(int num) {
        orderNo = num;
    }

    public int getOrderNo() {
        return orderNo;
    }

    /* Print the Hamburger order details */
    public void printOrder() {
        System.out.println("Does it have lettuce? " + hasLettuce);
        System.out.println("Does it have tomatoes? " + hasTomatoes);
        System.out.println("Does it have onions? " + hasOnions);
        System.out.println("Does it have pickles? " + hasPickles);
        System.out.println("Does it have mayo? " + hasMayo);
        System.out.println("Order No: " + orderNo);
        System.out.println();

    }
}