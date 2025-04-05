package javaa.data_structures;

import java.util.*;

public class Array_1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No. of  Elements :");
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scan.next()); //converts String to Integer
        }
        scan.close();
        System.out.println("Elements of Array :");
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.print("| "+a[i]+" | ");
        }
    }
}