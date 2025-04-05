package javaa.exception_handling;

import java.util.*;

public class Try_Catch {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            int z= x/y;
            System.out.println(z);
        }catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            scanner.close();
        }

    }
}
