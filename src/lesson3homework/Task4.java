package lesson3homework;

import java.util.Arrays;

//Создайте 2  массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднеарифметическое элементов каждого массива и сообщите
//для какого из массивов это значение оказалось больше либо они равны.
public class Task4 {
    public static void main(String[] args) {
        int[] zorka = {10, 8, 5, 13, 42};
        int[] spadaroznik = {10, 8, 5, 13, 42};
        System.out.println(Arrays.toString(zorka));
        System.out.println(Arrays.toString(spadaroznik));
        double sum1 = 0;
        double sum2 = 0;
        double sred1;
        double sred2;

        for (int i : zorka) {
            sum1 = sum1 + i;
        }
        sred1 = sum1 / 5;
        System.out.println(sred1);

        for (int i : spadaroznik) {
            sum2 = sum2 + i;
        }
        sred2 = sum2 / 5;
        System.out.println(sred2);

        if (sred1 > sred2) {
            System.out.println("Среднее число массива 1 оказалось больше");
        } else {
            if (sred1 < sred2) {
                System.out.println("Среднее число массива 2 оказалось больше");
            } else {
                System.out.println("Средние числа обоих массивов равны");
            }
        }
    }
}
