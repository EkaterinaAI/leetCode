package src.Practice.Day9.Task2;

public class Circle extends Figure{
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * r * Math.PI;
    }
}
