package chapter3_basic_syntax.hackerank;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reverseStr = new  StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        System.out.println(reverseStr);
    }
}
