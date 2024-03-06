package BaiTap.Shape_Interface_Test_Remake;

public class Rectangle implements IShape {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
}
