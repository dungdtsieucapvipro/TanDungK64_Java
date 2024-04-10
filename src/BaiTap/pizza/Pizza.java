package BaiTap.pizza;

public class Pizza implements IShape{
    private double price;
    private IShape shape;

    public Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public IShape getShape() {
        return shape;
    }

    @Override
    public double getArea() {
        return shape.getArea();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "_price=" + price +
                ", _shape=" + shape +
                '}';
    }
}
