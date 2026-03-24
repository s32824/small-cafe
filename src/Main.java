public class Main {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");
        MenuItem m3 = new MenuItem("D-01", "Cheesecake", 16.0, "dessert");

        CafeCustomer customer = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Order order = new Order(customer);
        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        System.out.println(customer);
        System.out.println(order);

        System.out.println("Total value: " + order.calculateTotal());
        System.out.println("Number of items: " + order.countItems());
        System.out.println("Global products created: " + MenuItem.getProductCount());

        MenuItem espressoCopy = new MenuItem("C-01", "Espresso duplicate", 9.0, "coffee");

        System.out.println("Are the products equal? " + m1.equals(espressoCopy));

        order.markAsPaid();

        System.out.println(order);
    }
}