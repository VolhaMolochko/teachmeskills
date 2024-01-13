package lesson6homework;

//Классы для RAM и HDD должны иметь констркутор по умолчанию и конструктор со всеми параметрами
//класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний)
public class HDD {
    private String name;
    private int amount;
    private String type;

    public HDD() {
    }

    public HDD(String name, int amount, String type) {
        this.name = String.valueOf(name);
        this.amount = amount;
        this.type = String.valueOf(type);
    }

    public String hddInfo() {
        return (name + " " + amount + " " + type);
    }
}