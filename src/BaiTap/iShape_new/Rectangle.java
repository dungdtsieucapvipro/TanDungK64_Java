package BaiTap.iShape_new;

public class Rectangle implements IShape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return 2* (this.length + this.width);
    }
}
