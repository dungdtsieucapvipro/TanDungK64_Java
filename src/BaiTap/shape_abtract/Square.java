package BaiTap.shape_abtract;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side){}
    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Rectangle [side=" + this.width + ", color=" + this.color + ", filled=" + this.filled + "]";
    }
}
