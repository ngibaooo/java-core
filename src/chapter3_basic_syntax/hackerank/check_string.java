/*
Bài 2 — Phân tích chuỗi

Kiến thức: String, length(), charAt(), for-each với mảng ký tự.
Nhập một chuỗi bất kỳ. Hãy đếm:
        - Số ký tự là chữ cái.
        - Số ký tự là chữ số.
        - Số ký tự là khoảng trắng.
Ví dụ:
Input:
Java 123 Core

Output:
Letters = 8
Digits = 3
Spaces = 2


Gợi ý: Bạn có thể dùng Character.isLetter(), Character.isDigit() và
Character.isWhitespace().
Thử giải bằng cách chuyển chuỗi thành mảng ký tự với toCharArray() rồi dùng for-each.
 */
package chapter3_basic_syntax.hackerank;

import java.util.Scanner;

public class check_string {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str =  sc.nextLine();
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                digits++;
            }
            else if (Character.isLetter(str.charAt(i))){
                letters++;
            }
            else {
                spaces++;
            }
        }
        System.out.println("Letters: " +  letters);
        System.out.println("Digits: " +  digits);
        System.out.println("Spaces: " +  spaces);
    }
}
