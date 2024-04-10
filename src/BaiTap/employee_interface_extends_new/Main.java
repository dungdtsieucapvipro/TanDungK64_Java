package BaiTap.employee_interface_extends_new;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Nhap thong tin nhan vien---");
        System.out.print("Nhap ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap luong theo gio: ");
        int paymentPerHour = scanner.nextInt();

        int employeeType;
        do{
            System.out.print("Nhap loai nhan vien (1.Part-time | 2.Full time): ");
            employeeType = scanner.nextInt();
            if (employeeType !=1 && employeeType != 2){
                System.out.print("ERROR: Vui long nhap dung loai nhan vien!");
            }
        }while (employeeType !=1 && employeeType != 2);

        Employee employee;
        if (employeeType ==1){
            System.out.print("So gio lam viec - (part-time): ");
            int workingPerHours = scanner.nextInt();
            employee = new PartTimeEmployee(name, paymentPerHour, workingPerHours);
        }
        else {
            employee = new FullTimeEmployee(name, paymentPerHour);
        }

        System.out.println("---Hien thi thong tin nhan vien---");
        System.out.println("Ten nhan vien: " +employee.getName());
        System.out.print("Loai nhan vien: ");
        if (employeeType ==1){
            System.out.print("(Part-time)");
        }
        else {
            System.out.print("Full-time)");
        }
        System.out.println("\nLuong theo gio: " +employee.getPaymentPerHour());
        System.out.println("Tong luong: " +employee.calculateSalary());

        scanner.close();

    }
}
