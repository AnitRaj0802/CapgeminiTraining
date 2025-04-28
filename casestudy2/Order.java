package casestudy2;
import java.util.ArrayList;
import java.util.List;
public class Order {
	 Customer customer;
	    Restaurant restaurant;
	    List<MenuItem> items = new ArrayList<>();

	    public Order(Customer customer, Restaurant restaurant) throws Exception {
	        if (!customer.isLoggedIn()) {
	            throw new Exception("Customer must be logged in to place an order.");
	        }
	        this.customer = customer;
	        this.restaurant = restaurant;
	    }

	    public void addItem(String itemName) throws MenuItemNotFoundException, OrderLimitExceedException {
	        if (items.size() >= 5) {
	            throw new OrderLimitExceedException("Cannot order more than 5 items.");
	        }
	        MenuItem item = restaurant.getMenuItem(itemName);
	        items.add(item);
	    }

	    public void showOrder() {
	        System.out.println("Order for " + customer.name + ":");
	        for (MenuItem item : items) {
	            System.out.println("- " + item.name + " Rs" + item.price);
	        }
	    }
}
