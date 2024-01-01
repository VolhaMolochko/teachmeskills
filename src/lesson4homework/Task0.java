package lesson4homework;

import java.util.Random;
import java.util.Scanner;

//Создайте трехмерный массив из целых чисел
//С помощью циклов "пройти" по всему массиву и увеличить каждый элеиент на
//заданное число (число задавать из консоли)
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int razm0 = scanner.nextInt();
        int razm1 = scanner.nextInt();
        int razm2 = scanner.nextInt();
        int chislo = scanner.nextInt();
        int[][][] mas = new int[razm0][razm1][razm2];
        for (int x = 0; x < mas.length; x++) {
            for (int y = 0; y < mas[x].length; y++) {
                for (int z = 0; z < mas[x][y].length; z++) {
                    mas[x][y][z] = random.nextInt(20);
                    System.out.print(mas[x][y][z] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Увеличенный массив");
        for (int x = 0; x < mas.length; x++) {
            for (int y = 0; y < mas[x].length; y++) {
                for (int z = 0; z < mas[x][y].length; z++) {
                    mas[x][y][z] = mas[x][y][z] + chislo;
                    System.out.print(mas[x][y][z] + " ");
                }
            }
            System.out.println();
        }
    }
}

