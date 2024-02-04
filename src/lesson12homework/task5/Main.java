package lesson12homework.task5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();

        Student student1 = new Student("Alice");
        Student student2 = new Student("Gleb");
        Student student3 = new Student("Pavel");
        Student student4 = new Student("Pavel");
        Student student5 = new Student("Gleb");

        Teacher teacher1 = new Teacher("Alla Ivanovna");
        Teacher teacher2 = new Teacher("Alla Ivanovna");
        Teacher teacher3 = new Teacher("Nikolay Antonovich");

        uniqueNames.add(student1.getName());
        uniqueNames.add(student2.getName());
        uniqueNames.add(student3.getName());
        uniqueNames.add(student4.getName());
        uniqueNames.add(student5.getName());
        uniqueNames.add(teacher1.getName());
        uniqueNames.add(teacher2.getName());
        uniqueNames.add(teacher3.getName());


        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

