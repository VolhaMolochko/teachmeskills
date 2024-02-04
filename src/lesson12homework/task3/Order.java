package lesson12homework.task3;

//Создать свой класс для описания заказа.
//Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
//Создать несколько заказов и поместить их в коллекцию.
//Вывести коллекцию на экран.
//Отсортировать заказы и вывести отсортированную коллекцию на экран.
//Заказы сортируются по цене по возрастанию.
//Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).
public class Order {

    private final int orderId;
    private final double orderCost;

    public Order(int orderId, double orderCost) {
        this.orderId = orderId;
        this.orderCost = orderCost;
    }

    public double getOrderCost() {
        return orderCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderCost=" + orderCost +
                '}';
    }
}





