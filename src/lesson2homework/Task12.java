package lesson2homework;

import java.util.Arrays;

//выведите на экран первые 11 членов последновательности Фибоначи
public class Task12 {
    public  static void main (String [] args){
        int n;
        n=11;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
