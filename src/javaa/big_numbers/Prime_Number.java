package javaa.big_numbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Prime_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number : ");
        String n = bufferedReader.readLine();
        int num=Integer.parseInt(n);
        bufferedReader.close();
        boolean result=isPrime(num);

        if(result){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    public  static boolean isPrime(int num){
        int div=2;
        boolean prime=true;
        while(div<num){
            if(num % div ==0){
                prime=false;
            }
            div++;
        }
        return prime;
    }
}


