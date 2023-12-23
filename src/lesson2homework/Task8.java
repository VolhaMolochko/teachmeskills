package lesson2homework;

import java.util.Scanner;

//Напишитие программу, где пользователь вводит любое целое положительное число
//А программа суммирует все числа от 1 до введенного пользователем числа
//Для ввода числа воспользуйтесь классом Scanner
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chis = scanner.nextInt();
        int sum;
        sum = 0;
        for (int i = 1; i <= chis; i++) {
            if (chis > 0) {
                sum = sum + i;
                System.out.println(sum);
            }

        }
    }
}
