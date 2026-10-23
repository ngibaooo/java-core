package chapter3_basic_syntax.hackerank;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=str.length() - 1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        if (str.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
