package lesson6homework;

//Создать класс CreditCard с полями номер счета, текущая сумма на счету.
//Добавьте метод, кототрый позволяет начислять некоторую сумму на картую
//Добавьте метод, кототрый позволяет снимать некоторую сумму с карты
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых
//заданы номер счета и начальная сумма.
public class CreditCard {                                       //класс
    private int accountNumber;
    private double accountAmount;

    CreditCard(int accountNumber, double accountAmount) {      //констркутор
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    public double addCash(double addAmount) {                   //метод добавления денег
        accountAmount += addAmount;
        return accountAmount;
    }

    public double outCash(double outAmount) {                  //метод снятия денег
        accountAmount -= outAmount;
        return accountAmount;
    }

    public String info() {
        return (accountNumber + " " + accountAmount);   //метод вывода информации
    }
}
