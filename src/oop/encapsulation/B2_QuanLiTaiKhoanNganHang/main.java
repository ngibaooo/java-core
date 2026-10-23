package oop.encapsulation.B2_QuanLiTaiKhoanNganHang;

public class main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("001", 1000000, "An");
        account.deposit(500);
//        account.withdraw(500);
        account.displayBalance();
    }
}
