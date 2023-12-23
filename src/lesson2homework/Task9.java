package lesson2homework;

//Необходимо, чтобы программа выводила на экран такую поледовательность
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98
//в решении исполььзовать цикл while
public class Task9 {
    public static void main(String[] args) {
        int l = 7;
        while (l < 100) {
            System.out.println(l);
            l = l + 7;
        }
    }
}
