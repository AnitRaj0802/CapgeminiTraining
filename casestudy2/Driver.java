package casestudy2;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Test 1: Successful Order");
        try {
            Restaurant restaurant = new Restaurant("Food Palace");
            restaurant.addMenuItem("Noodles", 10.0);
            restaurant.addMenuItem("Biryani", 12.5);
            restaurant.addMenuItem("Chicken Butter Masala", 11.0);
            restaurant.addMenuItem("Naan", 13.0);
            restaurant.addMenuItem("Mutton Rogan Josh", 14.0);

            Customer customer = new Customer("Amit", true);
            Order order = new Order(customer, restaurant);

            order.addItem("Noodles");
            order.addItem("Biryani");
            order.addItem("Chicken Butter Masala");
            order.addItem("Naan");
            order.addItem("Mutton Rogan Josh");

            order.showOrder();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n---------------------------\n");

        System.out.println("Test 2: Item Not Found");
        try {
            Restaurant restaurant = new Restaurant("Burger Barn");
            restaurant.addMenuItem("Cheeseburger", 8.0);
            restaurant.addMenuItem("Fries", 3.0);

            Customer customer = new Customer("Bob", true);
            Order order = new Order(customer, restaurant);

            order.addItem("Pizza");  
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n---------------------------\n");

        System.out.println("Test 3: Order Limit Exceeded");
        try {
            Restaurant restaurant = new Restaurant("Food Palace");
            restaurant.addMenuItem("Noodles", 9.0);
            restaurant.addMenuItem("Biryani", 3.5);
            restaurant.addMenuItem("Chicken Butter Masala", 7.0);
            restaurant.addMenuItem("Naan", 12.0);
            restaurant.addMenuItem("Mutton Rogan Josh", 6.0);
            restaurant.addMenuItem("Green Tea", 2.5);

            Customer customer = new Customer("Charlie", true);
            Order order = new Order(customer, restaurant);

            order.addItem("Noodles");
            order.addItem("Biryani");
            order.addItem("Chicken Butter Masala");
            order.addItem("Naan");
            order.addItem("Mutton Rogan Josh");
            order.addItem("Green Tea");  

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n---------------------------\n");

        System.out.println("Test 4: Not Logged-in Customer");
        try {
            Restaurant restaurant = new Restaurant("Food Place");
            restaurant.addMenuItem("Pizza", 15.0);

            Customer customer = new Customer("Raj", false);  
            Order order = new Order(customer, restaurant);

            order.addItem("Pizza");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


