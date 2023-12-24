package lesson3homework;

import java.util.Arrays;

//Создайте 2  массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднеарифметическое элементов каждого массива и сообщите
//для какого из массивов это значение оказалось больше либо они равны.
public class Task4 {
    public static void main(String[] args) {
        int[] zorka = {12, 8, 5, 13, 42};
        int[] spadaroznik = {12, 8, 5, 13, 42};
        System.out.println(Arrays.toString(zorka));
        System.out.println(Arrays.toString(spadaroznik));
        double sum1 = 0;
        double sum2 = 0;
        double sred1;
        double sred2;

        for (int i = 0; i < zorka.length; i++) {
            sum1 = sum1 + zorka[i];
        }
        sred1 = sum1 / 5;
        System.out.println(sred1);

        for (int i = 0; i < spadaroznik.length; i++) {
            sum2 = sum2 + spadaroznik[i];
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
