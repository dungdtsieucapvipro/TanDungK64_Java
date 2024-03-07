package BaiTap.Employee_Interface_Extends;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Nhap thong tin nhan vien--");
        System.out.print("1.Ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.print("2.Luong theo gio: ");
        int paymentPerHour = scanner.nextInt();

        int employeeType;
        do {
            System.out.print("3.Chon loai nhan vien (1 - Part-time, 2 - Full-time): ");
            employeeType = scanner.nextInt();

            if (employeeType != 1 && employeeType != 2) {
                System.out.println("ERROR: Lua chon khong hop le! vui long chon 1 hoac 2.");
            }
        } while (employeeType != 1 && employeeType != 2);

        Employee employee;
        if (employeeType == 1) {
            System.out.println("4.So gio lam viec: ");
            int workingHours = scanner.nextInt();
            employee = new PartTimeEmployee(name, paymentPerHour, workingHours);
        } else {
            employee = new FullTimeEmployee(name, paymentPerHour);
        }

        System.out.println("--Xuat thong tin nhan vien--");
        System.out.println("1.Ten nhan vien: " + employee.getName());
        System.out.println("2.Luong theo gio: " + employee.getPaymentPerHour());
        System.out.println("3.Luong thang: " + employee.calculateSalary());

        scanner.close();

    }
}
