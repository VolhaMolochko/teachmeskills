package lesson2homework;

import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 7? от суммы.
//Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
//А банк вычисляет конечную сумму вклада с учетом начисления процента за каждый месяц.
//Для вычисления суммы с учетом процентов используйци цикл for. Пусть сумма вклада будет предствалть тип float.
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //задаем переменную сканер, значение которой будем выводить с клавиатуры
        System.out.println("Введите сумму вклада");
        float sum = scanner.nextFloat(); //это уже само значение которое потом можно будет использовать
        System.out.println("Введите количество месяцев");
        float m = scanner.nextFloat(); //это уже само значение которое потом можно будет использовать
        float pers;
        for (int i = 1; i <= m; i++) {
            pers = (sum / 100) * 7;
            sum = sum + pers;
        }
        System.out.println(sum);
    }
}
