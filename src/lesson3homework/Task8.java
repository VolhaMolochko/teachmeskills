package lesson3homework;

import java.lang.reflect.Array;
import java.util.Arrays;

//Реализуйте алгоритм сортировки пузырьком
public class Task8 {
    public static void main(String[] args) {
        int[] zorka = {12, 7, 4, 42, 13, 8, 2};
        int buf;
        boolean otsortirovan = false;
        while (!otsortirovan) {    //флаг для того, чтобы понять когда перестать выполнять цикл
            otsortirovan = true;
            for (int i = 0; i < zorka.length - 1; i++) {
                if (zorka[i] > zorka[i + 1]) {
                    otsortirovan = false;
                    buf = zorka[i];
                    zorka[i] = zorka[i + 1];
                    zorka[i + 1] = buf;
                    System.out.println(Arrays.toString(zorka));
                }
            }
        }
    }
}

