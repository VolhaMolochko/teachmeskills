package lesson6homework;
//Классы для RAM и HDD должны иметь констркутор по умолчанию и конструктов со всеми параметрами
//класс RAM имеет поля "название" и "объем"

public class RAM {
    private  String name;
    private  int amount;

    public RAM() {
    }
    public RAM(String name, int amount) {
        this.name = String.valueOf(name);
        this.amount = amount;
    }

    public  String ramInfo() {
        return (name + " " + amount);
    }
}