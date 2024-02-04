package lesson12homework.task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//
//Создать коллекцию целых чисел.
//Заполните коллекцию рандомными числами.
//Пусть размер коллекции задается с консоли.
//Предусмотреть возможно ошибок при получении размера коллекции с консоли.
//Предусмотреть проверку введенного размера коллекции на валидность.
//Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        while (true) {
            try {
                System.out.println("Enter collection size");
                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    Random random = new Random();
                    for (int i = 0; i < size; i++) {
                        numbers.add(random.nextInt(50));
                    }

                    int sum = 0;
                    for (int num : numbers) {
                        sum += num;
                    }

                    double average = (double) sum / size;
                    System.out.println(average);
                    break;
                } else {
                    System.out.println("Collection size must be >0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a positive integer");
            }


        }
    }
}

