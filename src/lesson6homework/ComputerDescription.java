package lesson6homework;

//При создании объекта "компьютер" с помощью 1го конструктора должны создаваться поля RAM и HDD
//с помощью конструкторов по умолчанию
//В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и значений"
public class ComputerDescription {
    public static void main(String[] args) {
        HDD hdd = new HDD("name_HDD_1", 12, "external");
        RAM ram = new RAM("name_RAM_1", 13);
//        HDD hdd = new HDD();
//        RAM ram = new RAM();
        Computer computer = new Computer(540, "New", hdd, ram);
        System.out.println(computer.ComputerInfo());
    }
}