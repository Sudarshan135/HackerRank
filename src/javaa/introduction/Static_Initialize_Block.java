package javaa.introduction;

import java.util.*;

public class Static_Initialize_Block {

    static boolean flag;
    static int B;
    static int H;

    static{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter B & H");
        B=sc.nextInt();
        H=sc.nextInt();

        if(B>0 && H>0){
            flag=true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

