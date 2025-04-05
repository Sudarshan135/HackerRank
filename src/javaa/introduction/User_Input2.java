package javaa.introduction;

import java.util.Scanner;

public class User_Input2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Int Double String :");
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
