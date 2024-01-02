package lesson4homework;

//Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы)
//Напишите программу умножения двух матрицю
//Первый массив {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}}
//Второй массив {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}}
//Ожидаемый результат 1 2 3   1 1 1   0 0 0
public class Task2 {
    public static void main(String[] args) {
        int[][] masA = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] masB = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] masNew = new int[masA.length][masB[0].length];
        for (int i = 0; i < masNew.length; i++) {   //строка
            for (int j = 0; j < masNew[0].length; j++) { //колонка
                for (int x = 0; x < masA[0].length; x++) {
                    masNew[i][j] += masA[i][x] * masB[x][j];
                }
                System.out.print(masNew[i][j] + " ");
            }
            System.out.println();
        }
    }
}
