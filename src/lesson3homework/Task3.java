package lesson3homework;

import java.util.Arrays;
import java.util.Scanner;

//Создайте и заполните массив случайными числами и выведите min и max и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Размер массива вводится с консоли.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        double  sum = 0;
        double srednee;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 6); // в скобочках умножение на 6, потому что math.random генерит числа от 0 до <1
            sum += massiv[i];
        }
        System.out.println(Arrays.toString(massiv));

        int min = massiv[0];
        int max = massiv[0];

        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i] > max) {
                max = massiv[i];
            }
        }
        srednee = sum/n;

        System.out.println(min);
        System.out.println(max);
        System.out.println(srednee);
    }
}
