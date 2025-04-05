package javaa.data_structures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Elements : ");
        int n=sc.nextInt();
        int q;
        List<Integer> l=new ArrayList<Integer>();
        System.out.print("Enter elements of array : ");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for (Integer integer : l) {
            System.out.print(integer + " ");
        }
        System.out.println("Enter Query :");
         q=sc.nextInt();
        while(q>0){
            System.out.println("Enter Operation (Insert)");
            sc.nextLine();

            if(sc.nextLine().equals("Insert")){
                l.add(sc.nextInt(),sc.nextInt());
            }else{
                l.remove((int)sc.nextInt());
            }
            q--;
        }
        for (Integer integer : l) {
            System.out.print(integer + " ");
        }
    }
}
