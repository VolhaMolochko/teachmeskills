package lesson2homework;
//Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
//Для определения четности числа используйте операцию получения остатка от деления %2

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner num = new Scanner(System.in);
        int chislo = Integer.parseInt(num.nextLine());
        if ((chislo%2)==0) {System.out.println("Odd number");} else {
            System.out.println("Even number");
        }
    }
}
