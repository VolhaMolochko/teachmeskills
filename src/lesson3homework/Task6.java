package lesson3homework;

import java.util.Arrays;

//Создайте массив и заполните массив.
//Выведите массив на экран в строку
//Замените кадый нечетный элемент с нечетным индексом на 0
//Снова выведите массив на экран в отдельной строке

public class Task6 {
    public static void main(String[] args) {
        int[] mas = {1, 15, 6, 14, 7, 2, 2};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {                     //нумерация элементов начинается с 0, по этому 2й по счету элемент (в моем массиве это 15), имеет индекс 1
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
