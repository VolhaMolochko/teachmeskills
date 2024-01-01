package lesson4homework;

import java.util.Arrays;
import java.util.Random;

//Создайте двухмерный массив целых чисел.
// Отсортируйте элементы в строках двухмерного массива по возрастанияю.
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int l = 2;
        int m = 3;
        int[][] mas = new int[l][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(40);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("отсортировали");
        for (int i = 0; i < mas.length; i++) {
            Arrays.sort(mas[i]);                  //сортруем внутри строки
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

