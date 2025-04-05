package javaa.string;
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z][\\w]{7,29}";

}


public class Valid_UserName {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no of user name :");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            System.out.println("Enter  User Name :"+n);
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}