package lesson12homework.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, 100.0));
        orders.add(new Order(2, 50.0));
        orders.add(new Order(3, 75.0));

        for (Order order : orders) {
            System.out.println(order);
        }

        Collections.sort(orders, new OrderComparator());

        System.out.println(" ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

