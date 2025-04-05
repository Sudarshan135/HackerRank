package javaa.string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Check {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<test;i++){
            String  pattern=sc.nextLine();
            if (isValid(pattern)){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }
    }
    public static boolean isValid(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException p){
             return false;
        }

    }
}
