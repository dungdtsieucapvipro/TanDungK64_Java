package BaiTap.Point_Triangle_vertice_x_y;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Nhap toa do cua cac canh Hinh Tam Giac---");

        System.out.println("--Toa do diem canh a: ");
        System.out.print("Toa do x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Toa do y1: ");
        int y1 = scanner.nextInt();

        System.out.println("--Toa do diem canh b: ");
        System.out.print("Toa do x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Toa do y2: ");
        int y2 = scanner.nextInt();

        System.out.println("--Toa do diem canh c: ");
        System.out.print("Toa do x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Toa do y3: ");
        int y3 = scanner.nextInt();

        Triangle triangle = new Triangle(x1,y1,x2,y2,x3,y3);

        System.out.print("--Chu vi Hinh tam giac la: " + triangle.getPerimeter());

    }
}
