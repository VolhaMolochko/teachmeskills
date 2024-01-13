package lesson6homework;

//Напишите программу, которая создает три объекта класса CreditCard у которых
//заданы номер счета и начальная сумма.

public class ProgrammCreditCard {
    public static void main(String[] args) {
        CreditCard CreditCard1 = new CreditCard(540, 11000);
        CreditCard CreditCard2 = new CreditCard(541, 11250);
        CreditCard CreditCard3 = new CreditCard(542, 11500);

        CreditCard1.addCash(200);
        CreditCard2.addCash(200);
        CreditCard3.outCash(200);

        System.out.println(CreditCard1.info());
        System.out.println(CreditCard2.info());
        System.out.println(CreditCard3.info());
    }
}
