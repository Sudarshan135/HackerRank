package javaa.big_numbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Big_Integer {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBER :");
        BigInteger num1 = new BigInteger(scanner.next());
        BigInteger num2 = new BigInteger(scanner.next());

//        BigInteger num3=num1.add(num2);
//        BigInteger num4=num1.multiply(num2);

        System.out.println("ADDITION       : " + num1.add(num2));
        System.out.println("MULTIPLICATION : " + num1.multiply(num2));

    }
}