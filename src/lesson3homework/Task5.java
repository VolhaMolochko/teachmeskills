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
        System.out.println("Введите количество элементов массива");
        int n = scanner.nextInt();
        int m;

        Random random = new Random();
        if (((n <= 5) || (n > 10))) {
            while ((n <= 5) || (n > 10)) {
                System.out.println("Веденное число не подохдит");
                System.out.println("Введите количество элементов массива еще раз");
                m = scanner.nextInt();
                n = m;
            }
        } else {
            int[] massiv = new int[n];
            for (int i = 0; i <= massiv.length; i++) {
                massiv[i] = random.nextInt();
            }
            System.out.println(Arrays.toString(massiv));
        }
    }
}
