package BaiTap.shape_interface_test_remake;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong HCN: ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai HCN : ");
        double length = scanner.nextDouble();
        IShape hcn =  new Rectangle(width,length);
        System.out.println("Dien tich HCN: " + hcn.getArea());
        System.out.println("Chu vi HCN: " + hcn.getPerimeter());
        System.out.print("Nhap ban kinh HT: ");
        double radius = scanner.nextDouble();
        IShape ht = new Circle(radius);
        System.out.println("Dien tich HT: " + ht.getArea());
        System.out.println("Chu vi HT: " + ht.getPerimeter());

    }
}
