package lesson12homework.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private final LocalDate registrationDate;
    private final String name;
    private final int age;
    private final List<Order> orders;

    public Client(LocalDate registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Client{" +
                "registrationDate=" + registrationDate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}

