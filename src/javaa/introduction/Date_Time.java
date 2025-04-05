package javaa.introduction;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int year, int month, int day) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Date : " + sdf.format(calendar.getTime()));

        String[] days = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("Day : " + days[dayOfWeek - 1]);

        return days[dayOfWeek - 1];
    }

}

public class Date_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year Month(0-11) day :");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        String s = Result.findDay(year, month, day);
        System.out.println(s);
    }
}
