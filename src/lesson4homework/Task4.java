package lesson4homework;

import java.util.Arrays;
import java.util.Random;

//Создайте двухмерный массив.
//Выведите на консоль диагонали массива
public class Task4 {
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
        int k = 0;
        int[] diag1 = new int[l];                       //главная диагональ
        for (int i = 0; i < mas.length; i++) {
            diag1[k] = mas[i][i];
            k++;
        }
        System.out.println(Arrays.toString(diag1));

        int m = 0;                                      //побочная диагональ
        int[] diag2 = new int[l];
        for (int i = 0; i < mas.length; i++) {
            diag2[m] = mas[i][mas.length - i-1];
            m++;
        }
        System.out.println(Arrays.toString(diag2));
    }

}


