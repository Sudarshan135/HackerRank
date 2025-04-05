package javaa.data_structures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sub_Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new  int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;

        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){

                sum=sum+arr[j];
                System.out.print(arr[j]+ " ");
                if (sum<0){
                    count++;
                }

            }
            System.out.println();
        }
        System.out.println(count);
    }
}