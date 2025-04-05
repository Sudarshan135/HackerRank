package javaa.introduction;

import java.util.*;
import java.text.*;

public class Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Currency :");
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat numberFormat1=NumberFormat.getCurrencyInstance(Locale.US);
        String us=numberFormat1.format(payment);

        Locale in =new Locale("en","IN");
        NumberFormat numberFormat2=NumberFormat.getCurrencyInstance(in);
        String india=numberFormat2.format(payment);

        NumberFormat numberFormat3=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=numberFormat3.format(payment);

        NumberFormat numberFormat4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=numberFormat4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
