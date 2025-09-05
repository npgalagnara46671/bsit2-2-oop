public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");

        System.out.println("Creating orders and adding items...");

        // Create 3 orders
        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        try {
            order1.addItem("Pizza", 12.99);
            order1.addItem("Pasta", 8.75);
            order1.addItem("Salad", 2.99);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order2.addMultipleItems(
                    new String[]{"Burger", "Fries", "Soda", "Nuggets", "Ice Cream"},
                    8.50, 3.25, 2.00, 6.20, 12.50
            );
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addItem("Hotdog", -5.00); // Invalid price
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addItem("", 5.50); // Invalid item name
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addMultipleItems(
                    new String[]{"Taco", "Juice"},
                    7.25, 8.25
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order[] allOrders = {order1, order2, order3};
        Order largestOrder = allOrders[0];
        for (Order o : allOrders) {
            if (o.getTotalAmount() > largestOrder.getTotalAmount()) {
                largestOrder = o;
            }
        }

        System.out.printf("Largest order: %s ($%.2f)\n",
                largestOrder.getCustomerName(), largestOrder.getTotalAmount());
    }
}
