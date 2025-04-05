package javaa.data_structures;

import java.util.*;

public class Array_List {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        System.out.print("Enter no of lines : ");
        int n = sc.nextInt();
        Array_List.noOfLine(list,n);
        System.out.println("_____________");
         Array_List.findElement(list);
    }

    public static void noOfLine(List<List<Integer>> list,int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("Enter size of Array : ");
            int size = sc.nextInt();
            List<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                arrayList.add(sc.nextInt());
            }
            list.add(arrayList);

//            System.out.println("Array List : " + arrayList);
//            System.out.println("List : " + list);
        }

        for (List<Integer> i : list) {
            System.out.println(i);
        }

    }

    public static void findElement( List<List<Integer>> list){
        System.out.println("Enter No of Lines : ");
        int query=sc.nextInt();
        
        while (query>0){
            System.out.println("Enter Row And Position :");
            int row=sc.nextInt();
            int pos=sc.nextInt();
            try {
                System.out.println("Element in row "+row+" at position "+pos+"  : "+list.get(row-1).get(pos-1));
            } catch (Exception e){
                System.out.println("Error");
            }
            query--;
        }
      sc.close();

    }
}
