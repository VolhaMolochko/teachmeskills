package lesson8homework;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private Phone phone;

    public Phone() {

    }

//    public Phone(Integer number, String model, double weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;
//    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("You have a call: " + name + " " + getNumber());
    }

    public void receiveCall(String name, String number) {
        System.out.println("You have a call: " + name + " " + number);
    }

    public void sendMessage(String... number) {
        System.out.print("Sending message to ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
