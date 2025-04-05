package javaa.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex_CheckIp{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Ip:");
        while(in.hasNext()){

            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    private String zString="((0|1)\\d{2}|2[0-4]\\d|25[0-5]|\\d{1,2})";
    public String pattern=zString+ "\\."+zString+"\\."+zString+"\\."+zString;

}
