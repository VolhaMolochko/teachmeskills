package lesson2homework;
//Для введенного числа t (температура на улице) вывести
//Если t>-5 --> Тепло
//-5>=t Нормально
// -20>=t Холодно
public class Task4 {
    public static void main (String [] args){
        int t;
        t=-5;
        if (t>-5){
            System.out.println("Тепло");
        } else if ((t<=-5)&&(t>-20)) {
            System.out.println("Нормально");
        } else if (t<=+20) {
            System.out.println("Холодно");
        }
        }

    }


