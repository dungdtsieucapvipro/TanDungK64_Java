package BaiTap.Shape_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong HCN : ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai HCN: ");
        double length = scanner.nextDouble();
        IShape hcn = new Rectangle(width, length);
        System.out.println("Dien tich hinh chu nhat la:" + hcn.getArea());
        System.out.println("Chu vi hinh chu nhat la:" + hcn.getPerimeter());
        System.out.print("Nhap ban kinh Hinh tron: ");
        double radius = scanner.nextDouble();
        IShape ht = new Circle(radius);
        System.out.println("Dien tich hinh tron la: "+ ht.getArea());
        System.out.println("Chu vi hinh tron la:" + ht.getPerimeter());

        IShape c1 = new Circle(3.0);
        IShape c2 = new Circle(5.0);
        IShape r1 = new Rectangle(2,3);
        IShape r2 = new Rectangle(3,5);
        IShape [] list = {c1,c2,r1,r2};
        for (IShape s:list){
            System.out.println("Dien tich la: " + s.getArea());
        }
        scanner.close();
    }
}
