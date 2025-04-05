package javaa.string;

import java.util.Scanner;
      //check whether string is palindrome

public class Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        StringBuffer str=new StringBuffer(A);
        System.out.println(str);

        String rev= String.valueOf(str.reverse());
       //String rev=str.reverse().toString();
        //convert string buffer to string
        
        if (rev.equals(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        /* Enter your code here. Print output to STDOUT. */
       B.main();


    }
}

class  B{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        String  rev="";
        for (int i=A.length()-1;i>=0;i--){
            rev=rev+A.charAt(i);
        }
        
        System.out.println(rev);
    }

    public  boolean isPalindrom(String string){

        int left=0;
        int right=string.length()-1;

        while (left<right){
            if(string.charAt(left) == string.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


