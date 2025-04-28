package casestudy2;

public class OrderLimitExceedException extends Exception {
    public OrderLimitExceedException(String message) {
        super(message);
    }
}
