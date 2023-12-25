package lesson3homework;

import java.util.Scanner;

//Создайте массив целых чисел. Напишите программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задачется из консоли
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //задаем переменную сканер, значение которой будем выводить с клавиатуры
        System.out.println("Введите число");
        int a=0;
        int chislo = scanner.nextInt(); //это уже само значение которое потом можно будет использовать
        int[] massiv = {2, 12, 46, 10, 35, 7};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == chislo) {
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Такое число отсутствует в массиве");
        } else {
            System.out.println("Такое число есть в массиве");
        }

    }

}








