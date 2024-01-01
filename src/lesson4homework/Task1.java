package lesson4homework;

//Шахматная доска
//Создать программу для расскраски шахматной доски с помощью цикла
//Создать двухмерный массив String 8х8. С помощью циклов задать элементам
//цикла знчаения B(Black) или W(White).
public class Task1 {
    public static void main(String[] args) {
        String [][] mas = new String[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        mas[i][j] ="W";
                    } else mas[i][j] = "B";
                } else {
                    if (j % 2 != 0) {
                        mas[i][j] = "W";
                    } else mas[i][j] = "B";
                }
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

