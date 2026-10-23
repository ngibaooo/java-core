package chapter3_basic_syntax.hackerank;

import java.util.Scanner;

public class java_output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            /*
            %-15s: in chuỗi căn trái 15 kí tự
                - %: bắt đầu 1 định dạng
                - -: căn trái
                - 15: dành độ rộng 15 kí tự
                - s: kiểu dữ liệu String

            %03d: In số nguyên với 3 chữ số
                - %: bắt đầu một định dạng.
                - 0: thêm số 0 vào bên trái nếu chưa đủ độ rộng.
                - 3: độ rộng tối thiểu là 3 ký tự.
                - d: dữ liệu kiểu số nguyên.
            %n: Sau khi in xong chuỗi và số nguyên, %n chuyển sang dòng tiếp theo.
             */
        }
        System.out.println("================================");

    }
}

