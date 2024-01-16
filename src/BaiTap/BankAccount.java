package BaiTap;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Ban vua nap vao: "+ amount + "VND , So du hien tai la: "+this.balance);
    }
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Ban da rut thanh cong so tien: " + amount);
        } else {
            System.out.println("Tai khoan khong du so du");
        }
    }
    public static void main(String[]args){
        BankAccount account1 = new BankAccount("Dung");
        account1.deposit(1000);
        account1.withdraw(200);
    }
}
