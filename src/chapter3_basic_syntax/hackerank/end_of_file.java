package chapter3_basic_syntax.hackerank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class end_of_file {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int lineNum = 1;
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            System.out.println(lineNum + " " + s1);
            lineNum++;
        }
    }
}
