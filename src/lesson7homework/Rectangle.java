package lesson7homework;

//площадь прямоугольника s=a*b
//p = (a+b)*2
public class Rectangle extends Figures {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public double getArea() {
        return (a * b);
    }

    @Override
    public double getPerimeter() {
        return ((a + b) * 2);
    }
}
