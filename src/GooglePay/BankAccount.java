package GooglePay;

public class BankAccount {
    private String bankName;
    private int currentBalance;
    private int upiPin;
    private boolean isDefaultAccount;

    public BankAccount() {
        this.bankName = "None";
        this.currentBalance = 0;
        this.upiPin = 0;
        this.isDefaultAccount = false;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }

    public void setIsDefaultAccount(boolean isDefaultAccount) {
        this.isDefaultAccount = isDefaultAccount;
    }

    public String getBankName() {
        return this.bankName;
    }

    public int getCurrentBalance() {
        return this.currentBalance;
    }

    public int getUpiPin() {
        return this.upiPin;
    }

    public boolean getIsDefaultAccount() {
        return this.isDefaultAccount;
    }
}
