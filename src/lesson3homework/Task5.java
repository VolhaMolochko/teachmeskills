package lesson3homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создайте массив из n случайных целых чисел и выведите его на экран.
//Размер массива задается из консоли и размер массива >5 && <=10.
//Если n не удовлетворяет условию выше, то сообщить об этом.
//Если пользователь ввел неподходящее число, то попросить повторить ввод
//Создайте второй массив только из четных элементов первого массива, если они там есть и выведите его на экран
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        do {
            System.out.println("Введите количество элементов массива");
            n = scanner.nextInt();
        }
        while ((n <= 5) || (n > 10));
        int[] massiv = new int[n];
        int[] massiv2 = new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(massiv));

        int chetn = 0;
        for (int i : massiv) {
            if (i % 2 == 0) {
                chetn++;
            }
        }
        if (chetn == 0) {
            System.out.println("В массиве нет четных элементов");
        } else {
            int l = 0;
            for (int i = 0; i < massiv.length; i++) {
                if (massiv[i] % 2 == 0) {
                    massiv2[l] = massiv[i];
                    l++;
                }
            }
            System.out.println(Arrays.toString(massiv2));
        }
    }
}
