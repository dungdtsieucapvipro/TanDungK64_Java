package BaiTap.Pizza_Fix;

public class Circle implements IShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}