/*
Input Format:
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers
describing the respective ai, bi, ni and  values for that query.

Output Format:
For each query, print the corresponding series on a new line.
Each series must be printed in order as a single line of  space-separated integers.

Sample Input:
2 (t)
0(a) 2(b) 10(n)
5(a) 3(b) 5(n)

Sample Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */
package chapter3_basic_syntax.hackerank;
import java.util.*;
import java.io.*;

public class loop2 {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int multiple=0;
            int sum=0;
            for (int j=0; j<n; j++) {
                int power = j;
                multiple = multiple + ((int) Math.pow(2, power) * b);

                sum = a + multiple;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
