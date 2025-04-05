package javaa.string;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        // Complete the function
        boolean result=false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        int pos=0;
        String temp=b;

        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                pos=temp.indexOf(a.charAt(i));
                if(pos>=0){
                    temp=temp.substring(0,pos)+temp.substring(pos+1,temp.length());
                }
            }
            if(temp.length()==0){
                result=true;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
//            converting primitive type to string
//            String string2 = "" + chars[i];
//            String str=String.valueOf(chars[i] );
//            String string2 = Character.toString(chars[i]);