package lesson2homework;

//Вывечти 10 первых чисел последовательности 0, -5, -10, -15...
//
public class Task10 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(j);
            j = j - 5;
        }
    }
}
