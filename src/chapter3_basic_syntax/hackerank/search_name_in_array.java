package chapter3_basic_syntax.hackerank;

import java.util.Scanner;

public class search_name_in_array {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] names = {"An", "Binh", "Chi", "an", "An"};
        String inputName =  sc.nextLine();
        boolean found = false;
        int count = 0;
        for (String name : names) {
            if (name.equals(inputName)){
                found = true;
                count ++;
            }
        }
        System.out.println("Found: " + found);
        System.out.println("Occurrences: " + count);
    }
}
