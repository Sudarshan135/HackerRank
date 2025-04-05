package javaa.big_numbers;

import java.io.*;
import java.math.*;


public class Primality_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger big=new BigInteger(n);
        System.out.println(big.isProbablePrime(10)?"prime":"not prime");
        bufferedReader.close();

    }


}

