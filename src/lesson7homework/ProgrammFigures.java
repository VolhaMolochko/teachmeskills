package lesson7homework;

public class ProgrammFigures {
    public static void main(String[] args) {
        double totalPerimeter = 0;
        Figures[] figures = new Figures[5];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(8, 6);
        figures[2] = new Square(3);
        figures[3] = new Circle(17);
        figures[4] = new Triangle(14, 7, 2);
        for (int i = 0; i <= figures.length-1; i++) {
            totalPerimeter += figures[i].getPerimeter();
        }
        System.out.println(totalPerimeter);
    }
}
