package BaiTap.Shape_Abtract;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông số hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double ht_radius = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình tròn: ");
        String ht_color = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình tròn (true/false): ");
        boolean ht_filled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Nhập thông số hình chữ nhật
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double hcn_width = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double hcn_length = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình chữ nhật: ");
        String hcn_color = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình chữ nhật (true/false): ");
        boolean hcn_filled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Nhập thông số hình vuông
        System.out.print("Nhập cạnh hình vuông: ");
        double hv_side = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số

        System.out.print("Nhập màu sắc hình vuông: ");
        String hv_color = scanner.nextLine().trim();

        System.out.print("Nhập trạng thái tô hình vuông (true/false): ");
        boolean hv_filled = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập boolean

        // Tạo các hình
        Circle circle = new Circle(ht_radius, hcn_color, ht_filled);
        Rectangle rectangle = new Rectangle(hcn_width, hcn_length, hcn_color, hcn_filled);
        Square square = new Square(hv_side, hv_color,hv_filled);

        // In thông tin các hình
        System.out.println("Hình tròn:");
        System.out.println(circle.toString());

        System.out.println("Hình chữ nhật:");
        System.out.println(rectangle.toString());

        System.out.println("Hình vuông:");
        System.out.println(square.toString());
    }
}
