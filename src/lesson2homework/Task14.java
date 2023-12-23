package lesson2homework;

//Напишите программу, которая выводит на консоль таблицу умножения
public class Task14 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                c = a * b;
                System.out.println(a + "*" + b + "=" + c);
            }

        }

    }
}
