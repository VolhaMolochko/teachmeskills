package lesson2homework;
//написать программу для вывода названия поры года по номеру месяца, используя if else
public class Task2 {
    public static void main (String [] args) {
        int mon;
        mon = 4;
        boolean sp=((mon>=3)&&(mon<=5));
        boolean sam=((mon>=6)&&(mon<=8));
        boolean aut=((mon>=9)&&(mon<=11));
        boolean win=((mon==12)||(mon==1)||(mon==2));
        if(win){
            System.out.println("Winter");
        }else if(sp) {
            System.out.println("Spring");
        }else if(sam) {
            System.out.println("Summer");
        }else System.out.println("Autumn");
        }
    }

//public class Task2 {
//    public static void main (String [] args) {
//        int mon;
//        mon = 6;
//        if((mon==1)||(mon==2)||(mon==12)) {
//            System.out.println("Winter");
//        }else if((mon=>3)&&(mon<=5)) {
//            System.out.println("Spring");
//        }else if((mon=>6)&&(mon<=9)) {
//            System.out.println("Summer");
//        }else System.out.println("Autumn");
//    }
//}