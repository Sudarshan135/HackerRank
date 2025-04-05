package javaa.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String :");
        String S = in.next();
        System.out.println("Enter Start End :");
        int start = in.nextInt();
        int end = in.nextInt();
        S=S.substring(start,end);
        System.out.println(S);
    }
}
