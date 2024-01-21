package lesson7homework;

//площадь треугольника s=корень квадратный из p/2, где p это периметр треугольника
//p = a+b+c
public class Triangle extends Figures {
    private double a, b, c, pp;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        pp = (a + b + c) / 2.0;
        return (Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }
}
