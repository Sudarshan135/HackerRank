package javaa.oops;

import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceOf {

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            System.out.println(element);
            if(element instanceof Student)
            a++;
            if(element instanceof Rockstar)
                b++;
            if(element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
            return ret;
        }


    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NO.");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter Class Name :");
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
           
        }
        System.out.println(count(mylist));
    }
}
