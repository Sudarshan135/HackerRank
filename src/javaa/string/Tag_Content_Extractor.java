package javaa.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tag_Content_Extractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Test Cases: ");
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            System.out.println("Enter Line :");
            String line = in.nextLine();
            String regex="<(.+)>(([^<>]+))</\\1>";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(line);
            if(matcher.find()==false){
                System.out.println("None");
            }
            matcher.reset();
            while(matcher.find()==true){
                System.out.println(matcher.group(2));
            }
            testCases--;
        }

    }
}



