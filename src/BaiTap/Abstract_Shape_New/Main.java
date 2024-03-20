package BaiTap.Abstract_Shape_New;

public class Main {
    public static void main(String[] args) {
        Shape hv1 = new Square(5);
        Shape hv2 = new Square("black", true, 10);
        System.out.println(hv1);
        System.out.println(hv2);

    }
}
