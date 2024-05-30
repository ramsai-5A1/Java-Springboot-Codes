package GooglePay;

public class BankAccount {
    private AvailableBanks bankName;
    private int currentBalance;
    private int upiPin;
    private boolean isDefaultAccount;

    public BankAccount() {
        this.bankName = null;
        this.currentBalance = 0;
        this.upiPin = 0;
        this.isDefaultAccount = false;
    }

    public void setBankName(AvailableBanks bankName) {
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

    public AvailableBanks getBankName() {
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
