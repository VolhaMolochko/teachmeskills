package lesson7homework;

//java.lang.Math;

//площадь круга  s=пи * r2 (в квадрате)
//p = 2*пи*r
//Math.PI
public class Circle extends Figures {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return (rad * rad * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (2 * rad * Math.PI);
    }
}
