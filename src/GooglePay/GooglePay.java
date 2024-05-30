package GooglePay;
import java.util.Scanner;

public class GooglePay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();

        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Welcome to GPay");
            System.out.println("1 - Login");
            System.out.println("2 - Signup");
            System.out.println("3 - Exit");
            System.out.println("--------------------------------------------------------");
            System.out.print("Choose the option:");
            int option = scanner.nextInt();

            boolean shouldGoOut = false;

            switch (option) {
                case 1:
                    auth.handleLogin();
                break;

                case 2:
                    auth.handleSignUp();
                break;

                case 3:
                    shouldGoOut = true;
                break;

                default:
                    System.out.println("Invalid option, Choose the correct one!!!");
            }

            if (shouldGoOut) {
                System.out.println("Thanks for using GPay, hope you had a great experience");
                break;
            }
        }
    }
}
