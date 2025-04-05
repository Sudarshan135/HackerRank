package javaa.string;

import java.util.*;

public class Token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String s1=s.trim();
        //check if string is empty
        if (s1.length()==0){
            System.out.println(s1.length());
            return;
        }

        String [] tokens=s1.split("[\\s+!,._'?@]+");

        System.out.println(tokens.length);
        for(String t:tokens){

            System.out.println(t);
        }

        scan.close();
    }
}

