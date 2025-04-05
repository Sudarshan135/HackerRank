package javaa.introduction;

import java.util.*;
import java.io.*;

public class Loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter  a b n :");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;

            for (int j = 0; j < n; j++) {

                int temp = (int) ( Math.pow(2, j) ) * b;

                if (j == 0) {
                    result = result + a + temp;
                    System.out.println(result);
                } else {
                    result = result + temp;
                }

                System.out.print(result + " ");

            }
            System.out.println();

        }
        in.close();
    }
}
