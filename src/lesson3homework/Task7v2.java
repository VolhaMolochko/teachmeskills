package lesson3homework;

import java.util.Arrays;

//создайте массив имен и в рамках него выбирайте случайные имена для нового массива.
public class Task7v2 {
    public static void main(String[] args) {
        String[] names = {"Igor", "Alina", "Petr", "Egor", "Elena"};
        String[] nnames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            int l = (int) (Math.random() * (names.length - 1));
            nnames[i] = names[l];
            System.out.println(Arrays.toString(nnames));
        }
    }
}


