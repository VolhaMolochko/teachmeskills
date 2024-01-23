package lesson7homework;

public class ProgrammTask2 {
    public static void main (String [] args){
        Position director = new Director();
        Position wokman = new WorkMan();
        Position accoutant = new Accountant();

        director.printPosition();
        wokman.printPosition();
        accoutant.printPosition();
     }

}