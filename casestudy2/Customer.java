package casestudy2;
public class Customer {
    String name;
    boolean loggedIn;

    public Customer(String name, boolean loggedIn) {
        this.name = name;
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
