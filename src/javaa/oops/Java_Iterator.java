package javaa.oops;

import java.util.*;
public class Java_Iterator {

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element =it.next();
            if(element instanceof String)//Hints: use instanceof operator

                break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Int :");
        int n = sc.nextInt();
        System.out.println("Enter No. of String :");
        int m = sc.nextInt();

        System.out.println("Enter Integers :");
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        System.out.println("Enter String :");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
