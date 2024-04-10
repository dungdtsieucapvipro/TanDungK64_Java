package BaiTap.employee_interface_extends;

public class PartTimeEmployee extends Employee implements IEmployee{
    int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
