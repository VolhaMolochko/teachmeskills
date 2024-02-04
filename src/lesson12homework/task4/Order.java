package lesson12homework.task4;

public class Order {
    private final double price;
    private final String description;

    public Order(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

