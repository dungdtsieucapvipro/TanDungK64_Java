package BaiTap.Pizza;

public class Circle implements IShape {
    private double radius;

    public Circle(double _radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_radius=" + radius +
                '}';
    }
}
