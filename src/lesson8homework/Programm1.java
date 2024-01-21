package lesson8homework;

public class Programm1 {
    public static void main(String[] args) {
        Phone Phone1 = new Phone("558", "iPhone", 578);
        Phone Phone2 = new Phone("376", "Android");
        Phone Phone3 = new Phone();

        System.out.println(Phone1.getNumber() + " " + Phone1.getModel() + " " + Phone1.getWeight());
        System.out.println(Phone2.getNumber() + " " + Phone2.getModel() + " " + Phone2.getWeight());
        System.out.println(Phone3.getNumber() + " " + Phone3.getModel() + " " + Phone3.getWeight());

        Phone1.receiveCall("Liza");
        Phone2.receiveCall("Pavel", "748965");
        Phone3.receiveCall("Lena");

        Phone1.sendMessage("258", "5722", "456", "44");

    }
}
