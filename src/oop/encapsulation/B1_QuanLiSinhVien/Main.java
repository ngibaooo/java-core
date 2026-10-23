package oop.encapsulation.B1_QuanLiSinhVien;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van A", 20, 4.5);
        s1.displayInfo();
        s1.setAge(-1);
        System.out.println("\n");
        s1.displayInfo();
    }
}
