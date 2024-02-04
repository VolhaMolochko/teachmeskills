package lesson12homework.task4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(LocalDate.now(), "Alice", 30);
        client1.addOrder(new Order(75.0, "A"));
        client1.addOrder(new Order(50.0, "B"));

        Client client2 = new Client(LocalDate.now(), "Bob", 25);
        client2.addOrder(new Order(75.0, "C"));

        Map<String, Client> clientsMap = new HashMap<>();
        clientsMap.put(PassportNumbers.PASSPORT_1, client1);
        clientsMap.put(PassportNumbers.PASSPORT_2, client2);
        System.out.println(" ");
        for (Map.Entry<String, Client> entry : clientsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(" ");
        Iterator<Map.Entry<String, Client>> iterator = clientsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(" ");
        for (String key : clientsMap.keySet()) {
            System.out.println(key);
        }
        System.out.println(" ");
        for (Client client : clientsMap.values()) {
            System.out.println(client);
        }
    }
}

