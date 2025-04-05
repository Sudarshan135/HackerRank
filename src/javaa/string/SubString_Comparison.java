package javaa.string;

import java.util.Scanner;
    //comparing substring according to dictionary order
public class SubString_Comparison{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String d = sc.nextLine();
        int l= sc.nextInt();
        sc.close();
        compareSubString(d,l);
    }

    public  static  void compareSubString(String d,int l){
        String small = d.substring(0, l);
        String large = d.substring(0, l);

        for (int i = 0; i <= d.length() - l; i++) {
            String sub = d.substring(i, i + l);
            if (small.compareTo(sub) > 0) {
                small= sub;
//                System.out.println("smallest : "+small);
            }
            if (large.compareTo(sub)< 0) {
                large = sub;
//                System.out.println("largest : "+large);
            }

        }
        System.out.println("Smallest  Sub string in dict : "+small);
        System.out.println("largest  Sub string in dict  : "+large);


    }
}


