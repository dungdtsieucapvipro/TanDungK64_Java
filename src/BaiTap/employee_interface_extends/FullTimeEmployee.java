package BaiTap.employee_interface_extends;

public class FullTimeEmployee extends Employee implements IEmployee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * 100;
    }

}
