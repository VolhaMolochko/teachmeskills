package lesson4homework;

import java.util.Random;

//Создайте двухмерный массив целых чисел.
//Выведите на консоль сумму всех элементов массива.
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int l = 4;
        int[][] mas = new int[l][l];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(40);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sum = sum + mas[i][j];
            }
        }
        System.out.println(sum);
    }
}