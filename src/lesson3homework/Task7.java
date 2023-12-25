package lesson3homework;

import java.util.Arrays;

//Создайте массив строк. Заполните его произвольными именами людей.
//Отсортируйте массив
//Результаты выведите на консоль
public class Task7 {
    public static void main (String [] args){
        String [] names = { "Igor", "Alina", "Petr", "Egor", "Elena"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}

