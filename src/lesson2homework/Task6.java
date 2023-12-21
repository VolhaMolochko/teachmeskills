package lesson2homework;

// При помощи цикла for высести на экран нечетные числа от 1 до 99.
// При решении используйте операцию инкремента (++)
public class Task6 {
    public static void main(String[] args) {
        int nech;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                nech = i;
                System.out.println(nech);
            }
        }
    }
}
