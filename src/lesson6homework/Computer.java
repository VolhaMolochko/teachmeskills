package lesson6homework;

//Создать класс для описания компьютера, в этом классее должны быть поля: стоимость, модель, RAM, HDD.
//Для полей RAM и HDD следует создать свои собственные классы
//Классы для RAM и HDD должны иметь констркутор по умолчанию и конструктор со всеми параметрами
//класс RAM имеет поля "название" и "объем"
//класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний)
//Класс Computer должен иметь 2 конструктора:
// - с параметрами стоимость и модель
// - со всеми полями
//При создании объекта "компьютер" с помощью 1го конструктора должны создаваться поля RAM и HDD
//с помощью конструкторов по умолчанию
//В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и значений"
public class Computer {
    private int cost;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }
    public Computer(int cost, String model, HDD hdd, RAM ram) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }
    public String ComputerInfo() {
        return (cost + " " + model + " " + hdd.hddInfo() + " " + ram.ramInfo());
    }
}