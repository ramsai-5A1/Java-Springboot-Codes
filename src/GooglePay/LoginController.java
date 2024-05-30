package GooglePay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LoginController {

    private HashMap<String, User> dataStore;
    private Scanner scanner;

    public LoginController() {
        dataStore = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public boolean isUserAlreadySignedUp(String mobileNumber) {
        if (dataStore.containsKey(mobileNumber)) {
            return true;
        }
        return false;
    }

    public void addNewUserToDB(String fullName, String mobileNumber, int gpayLoginPin) {
        User user = new User();
        user.setFullName(fullName);
        user.setMobileNumber(mobileNumber);
        user.setGpayLoginPin(gpayLoginPin);
        dataStore.put(mobileNumber, user);        
    }

    public boolean isGpayLoginPinMatching(String mobileNumber, int gpayLoginPin) {
        User user = dataStore.get(mobileNumber);
        if (user.getGpayLoginPin() == gpayLoginPin) {
            return true;
        }
        return false;
    }

    private boolean isBankAccoutAlreadyPresent(ArrayList<BankAccount> oldAccounts, AvailableBanks bank) {
        for (BankAccount account: oldAccounts) {
            if (account.getBankName().equals(bank)) {
                return true;
            }
        }
        return false;
    }

    public void addNewBankAccount(String mobileNumber) {
        User user = dataStore.get(mobileNumber);
        ArrayList<BankAccount> oldLinkedBankAccounts = user.getLinkedBankAccounts();
        System.out.println("Enter the bank name:");
        String bankName = scanner.nextLine().toLowerCase();
        BankAccount currentBankAccount = new BankAccount();

        if (bankName.contains("state bank")) {
            if (isBankAccoutAlreadyPresent(oldLinkedBankAccounts, AvailableBanks.STATE_BANK_OF_INDIA)) {
                System.out.println("Already account was added earlier");
                return;
            }
            currentBankAccount.setBankName(AvailableBanks.STATE_BANK_OF_INDIA);
        } else if (bankName.contains("hdfc")) {
            if (isBankAccoutAlreadyPresent(oldLinkedBankAccounts, AvailableBanks.HDFC)) {
                System.out.println("Already account was added earlier");
                return;
            }
            currentBankAccount.setBankName(AvailableBanks.HDFC);
        } else if (bankName.contains("icici")) {
            if (isBankAccoutAlreadyPresent(oldLinkedBankAccounts, AvailableBanks.ICICI)) {
                System.out.println("Already account was added earlier");
                return;
            }
            currentBankAccount.setBankName(AvailableBanks.ICICI);
        } else {
            System.out.println("Need to handle yet");
        }
        oldLinkedBankAccounts.add(currentBankAccount);
        user.setLinkedBankAccounts(oldLinkedBankAccounts);

        if (oldLinkedBankAccounts.size() == 1) {
            user.setDefaultBankAccount(currentBankAccount);
        } else {
            System.out.println("Do you want to keep " + currentBankAccount.getBankName() + " as default account ? (y or n)");
            Character option = scanner.nextLine().charAt(0);
            if (option == 'y') {
                user.setDefaultBankAccount(currentBankAccount);
            }
        }
        System.out.println(currentBankAccount.getBankName() + " account added successfully");
    }

    public void checkBalance(String mobileNumber) {
        User user = dataStore.get(mobileNumber);
        int value = 1;
        for (BankAccount bank: user.getLinkedBankAccounts()) {
            System.out.println(value + " - " + bank.getBankName());
            value += 1;
        }
        System.out.println("Choose the bank name (provide its respective value):");
        value = Integer.parseInt(scanner.nextLine());
        int balance = user.getLinkedBankAccounts().get(value - 1).getCurrentBalance();
        System.out.println("Current Balance is: " + balance);
    }


    public void sendMoneyToOthers(String mobileNumber) {
        System.out.println("Enter the mobile number of the receiver:");
        String receiverMobileNumber = scanner.nextLine();

        if (!dataStore.containsKey(receiverMobileNumber)) {
            System.out.println("User not registered on GPay");
            return;
        }
        User senderUser = dataStore.get(mobileNumber);
        User receiverUser = dataStore.get(receiverMobileNumber);
        System.out.println("Name is: " + receiverUser.getFullName());
        System.out.println("Is the above name correct one (y or n):");
        Character option = scanner.nextLine().charAt(0);

        if (option == 'y') {
            System.out.println("How much amount do you want to transfer?");
            int amountToBeSent = Integer.parseInt(scanner.nextLine());
            int senderBankBalance = senderUser.getDefaulBankAccount().getCurrentBalance();
            int receiverBankBalance = receiverUser.getDefaulBankAccount().getCurrentBalance();
            receiverBankBalance += amountToBeSent;
            senderBankBalance -= amountToBeSent;

            senderUser.getDefaulBankAccount().setCurrentBalance(senderBankBalance);
            receiverUser.getDefaulBankAccount().setCurrentBalance(receiverBankBalance);
            System.out.println("Transferred " + amountToBeSent + " rupees successfully");
        }
    }
}
