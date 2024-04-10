package BaiTap.iShape_new;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int shapeType;
        do{
            System.out.print("Nhap loai hinh ma ban muon tinh (1.Hinh chu nhat | 2.Hinh tron):  ");
            shapeType = scanner.nextInt();
            if (shapeType != 1 && shapeType != 2) {
                System.out.print("ERROR: Da nhap sai! vui long nhap lai");
            }
        } while (shapeType != 1 && shapeType != 2);
        if (shapeType == 1){
            System.out.print("Nhap  chieu dai: ");
            double length = scanner.nextDouble();
            System.out.print("Nhap chieu rong: ");
            double width = scanner.nextDouble();
            IShape hcn = new Rectangle(length, width);
            System.out.println("Dien tich HCN la: " + hcn.getArea());
            System.out.println("Chu vi HCN la: " + hcn.getPerimeter());
        } else{
            System.out.print("Nhap ban kinh hih tron: ");
            double radius = scanner.nextDouble();
            IShape ht = new Circle(radius);
            System.out.println("Dien tich hinh tron: " + ht.getArea() );
            System.out.println("Chu vi hinh tron: " + ht.getPerimeter() );
        }

        scanner.close();
    }
}
