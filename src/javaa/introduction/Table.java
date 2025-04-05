package javaa.introduction;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A No : ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result=0;
        for(int i=1;i<=10;i++){
            result=N*i;
            System.out.println(N+" x "+i+" = "+result);

        }

        bufferedReader.close();
    }
}
