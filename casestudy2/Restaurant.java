package casestudy2;
import java.util.*;
public class Restaurant {
	String name;
    Map<String, MenuItem> menu = new HashMap<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenuItem(String itemName, double price) {
        menu.put(itemName.toLowerCase(), new MenuItem(itemName, price));
    }

    public MenuItem getMenuItem(String itemName) throws MenuItemNotFoundException {
        MenuItem item = menu.get(itemName.toLowerCase());
        if (item == null) throw new MenuItemNotFoundException(itemName + " not found in menu.");
        return item;
    }
}
