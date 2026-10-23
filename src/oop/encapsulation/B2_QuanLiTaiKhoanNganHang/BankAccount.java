package oop.encapsulation.B2_QuanLiTaiKhoanNganHang;

public class BankAccount {
    private String accountNum;
    private double balance;
    private String ownerName;
    public BankAccount (String accountNum, double balance, String ownerName) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else{
            balance += amount;
        }
        return this.balance;
    }
    public double withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds");
        }
        else{
            this.balance -= amount;
        }
        return this.balance;
    }
    public void displayBalance(){
        System.out.println("Your balance is: " + this.balance);
    }
}
