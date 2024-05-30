package GooglePay;
import java.util.ArrayList;

public class User {

    private String fullName;
    private String mobileNumber;
    private int gpayLoginPin;
    private ArrayList<BankAccount> linkedBankAccounts;

    public User() {
        this.fullName = "None";
        this.mobileNumber = "None";
        this.gpayLoginPin = -1;
        this.linkedBankAccounts = new ArrayList<>();
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
}
