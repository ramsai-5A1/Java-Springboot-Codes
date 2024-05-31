package GooglePay;
import java.util.ArrayList;

public class User {

    private String fullName;
    private String mobileNumber;
    private int gpayLoginPin;
    private BankAccount defaultBankAccount;
    private ArrayList<BankAccount> linkedBankAccounts;
    private ArrayList<Transaction> previousTransactions;

    public User() {
        this.fullName = "None";
        this.mobileNumber = "None";
        this.gpayLoginPin = -1;
        this.defaultBankAccount = null;
        this.linkedBankAccounts = new ArrayList<>();
        this.previousTransactions = new ArrayList<>();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setLinkedBankAccounts(ArrayList<BankAccount> linkedBankAccounts) {
        this.linkedBankAccounts = linkedBankAccounts;
    }

    public void setGpayLoginPin(int gpayLoginPin) {
        this.gpayLoginPin = gpayLoginPin;
    }

    public void setPreviousTransactions(ArrayList<Transaction> previousTransactions) {
        this.previousTransactions = previousTransactions;
    }

    public void setDefaultBankAccount(BankAccount defaultBankAccount) {
        this.defaultBankAccount = defaultBankAccount;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public ArrayList<BankAccount> getLinkedBankAccounts() {
        return this.linkedBankAccounts;
    }

    public int getGpayLoginPin() {
        return this.gpayLoginPin;
    }

    public ArrayList<Transaction> getPreviousTransactions() {
        return this.previousTransactions;
    }

    public BankAccount getDefaulBankAccount() {
        return this.defaultBankAccount;
    }
}
