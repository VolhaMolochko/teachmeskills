package lesson7homework;

//Написать иерархию классов "Фигуры"
// треугольник, прямоугольник и круг это фигуры
//Реализовать функцию подсчета площади и периметрп для каждого типа фигуры
//Создать массив из 5 фигур
//Вывести на экран сумму периметра всех фигур в массиве
public abstract class Figures {
    public abstract double getArea();
    public abstract double getPerimeter();
}
