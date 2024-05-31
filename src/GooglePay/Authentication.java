package GooglePay;
import java.util.Scanner;

public class Authentication {

    Scanner scanner;
    LoginController loginController;

    public Authentication() {
        scanner = new Scanner(System.in);
        loginController = new LoginController();
    }

    public void handleLogin() {
        System.out.print("Enter your mobile-number:");
        String mobileNumber = scanner.nextLine();

        if (!loginController.isUserAlreadySignedUp(mobileNumber)) {
            System.out.println("User haven't registered yet, kindly please sign-up before logging-in!!");
            return;
        }

        boolean isLoggedIn = false;
        int remainingAttempts = 3;
        while (remainingAttempts > 0) {
            System.out.print("Enter 4-digit G-Pay Login Pin:");
            int gpayLoginPin = Integer.parseInt(scanner.nextLine());
            if (!loginController.isGpayLoginPinMatching(mobileNumber, gpayLoginPin)) {
                System.out.println("Incorrect pin, still " + (remainingAttempts - 1) + " attempts left");
            } else {
                isLoggedIn = true;
                break;
            }
            remainingAttempts -= 1;
        }

        if (isLoggedIn) {
            System.out.println("Successfully Logged in");
            this.handleLoginMenu(mobileNumber);
        } else {
            System.out.println("Your account got blocked for next 24 hours");
        }
    }

    public void handleSignUp() {
        System.out.print("Enter your mobile-number:");
        String mobileNumber = scanner.nextLine();
        if (loginController.isUserAlreadySignedUp(mobileNumber)) {
            System.out.println("User already signed-up with this mobile number, please login!!");
            return;
        }

        System.out.print("Enter 4-digit OTP (sent to your mobile number):");
        int otp = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your full-name:");
        String fullName = scanner.nextLine();

        while (true) {
            System.out.print("Set 4-digit G-Pay Login Pin:");
            int gpayLoginPin1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Confirm the 4-digit  G-Pay Login PIN:");
            int gpayLoginPin2 = Integer.parseInt(scanner.nextLine());

            if (gpayLoginPin1 != gpayLoginPin2) {
                System.out.println("Pins are different during 2 entries, Please try again!!");
            } else {
                loginController.addNewUserToDB(fullName, mobileNumber, gpayLoginPin2);
                break;
            }
        }
        
        System.out.println("Hurray..." + fullName + ", your account registered successfully");
    }

    public void handleLoginMenu(String mobileNumber) {
        while (true) {
            System.out.println("\n\n\n**********************************************************");
            System.out.println("1 - Add new Bankaccount");
            System.out.println("2 - Check Balance");
            System.out.println("3 - Check Previous Transactions");
            System.out.println("4 - Send Money to others");
            System.out.println("5 - Self Transfer");
            System.out.println("6 - Deposit money at CDM");
            System.out.println("7 - Logout");
            System.out.println("**********************************************************\n\n\n");
            System.out.print("Choose the option");
            int option = Integer.parseInt(scanner.nextLine());
            

            boolean shouldLogout = false;
            switch (option) {
                case 1:
                    loginController.addNewBankAccount(mobileNumber);
                break;

                case 2:
                    loginController.checkBalance(mobileNumber);
                break;

                case 3:
                    loginController.checkPreviousTransactions(mobileNumber);
                break;

                case 4:
                    loginController.sendMoneyToOthers(mobileNumber);
                break;

                case 5:
                    System.out.println("Handle Self Transfer");
                break;

                case 6:
                    loginController.depositMoneyAtCDM(mobileNumber);
                break;

                case 7:
                    shouldLogout = true;
                break;

                default:
                    System.out.println("Choose the appropriate option");
            }

            if (shouldLogout) {
                System.out.println("Logging out!!!");
                break;
            }
        }
    }
}
