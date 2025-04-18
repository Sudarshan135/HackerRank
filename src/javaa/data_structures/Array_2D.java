package javaa.data_structures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Array_2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //  System.out.print(arr.get(i).get(j));
                if (i > 1 && j > 1) {
                    int sum =
                            arr.get(i).get(j) + arr.get(i).get(j - 1) + arr.get(i).get(j - 2) + arr.get(i - 1).get(j - 1)
                                    + arr.get(i - 2).get(j) + arr.get(i - 2).get(j - 1) + arr.get(i - 2).get(j - 2);

//                    System.out.println(i + "  " + j);
//                    System.out.print(arr.get(i).get(j) + " ");
//                    System.out.print(arr.get(i).get(j - 1) + " ");
//                    System.out.print(arr.get(i).get(j - 2) + " ");
//                    System.out.print(arr.get(i - 1).get(j - 1) + " ");
//                    System.out.print(arr.get(i-2).get(j)+ " ");
//                    System.out.print(arr.get(i-2).get(j-1)+ " ");
//                    System.out.print(arr.get(i-2).get(j-2)+ " ");
                    if (sum > max) {
                        max = sum;
                    }

//                   System.out.println("\n Sum : " + sum);
//                    System.out.println("Max : " + max);
                }
            }

        }
        System.out.println(max);
        bufferedReader.close();
    }
}
