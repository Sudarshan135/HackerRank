package javaa.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_Of_File {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n=0;
        while(scanner.hasNext())
        {
            String s =scanner.nextLine();
            if (s.equalsIgnoreCase("exit")){
                System.out.println("Exit");
                break;
            }
            System.out.println(++n +" "+s);
        }

    }
}
