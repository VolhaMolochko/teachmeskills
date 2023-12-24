package lesson3homework;

import java.util.Arrays;
import java.util.Scanner;

//Создайте массив целых чисел. Замените все вхождения данного числа в массив на -1.
//Пусть число задается из консоли. Если такого числа нет, то выведите сообщение об этом
//Результатом должен быть новый массив
public class Task2 {
    public static void main(String[] args) {
        int[] massiv = {2, 9, 15, 42, 7, 12, 42, 4, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое будем менять");
        int chis = scanner.nextInt();
        int zer = 0;

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == chis) {
                zer++;
            }
        }

        if (zer == 0) {
            System.out.println("Нету такого числа в массиве");
        }
        if (zer != 0) {
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = massiv[i] - 1;
            }
            System.out.println(Arrays.toString(massiv));
        }
    }
}
