package BaiTap.Abstract_Shape_New;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length =length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
