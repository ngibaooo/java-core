package oop.encapsulation.B1_QuanLiSinhVien;

public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student (String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        }
        else{
            this.age = age;
        }
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 10) {
            System.out.println("Invalid gpa");
        }
        else{
            this.gpa = gpa;
        }
    }
    public void displayInfo(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + gpa);
    }
}
