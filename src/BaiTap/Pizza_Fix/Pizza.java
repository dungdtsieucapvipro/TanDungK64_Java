package BaiTap.Pizza_Fix;

public class Pizza {
    private double price;
    private IShape shape;

    public Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;
    }

    public IShape getShape() {
        return shape;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Price=" + price +
                ", Area=" + shape.getArea() +
                '}';
    }
}
