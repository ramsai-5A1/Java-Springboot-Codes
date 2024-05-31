package GooglePay;

public class Transaction {

    private String receiverName;
    private String senderName;
    private int totalAmountSent;
    private AvailableBanks senderBank;
    private AvailableBanks receiverBank;

    public Transaction() {
        this.senderBank = null;
        this.receiverBank = null;
        this.totalAmountSent = 0;
        this.receiverName = "None";
        this.senderName = "None";
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setTotalAmountSent(int totalAmountSent) {
        this.totalAmountSent = totalAmountSent;
    }

    public void setSenderBank(AvailableBanks senderBank) {
        this.senderBank = senderBank;
    }

    public void setReceiverBank(AvailableBanks receiverBank) {
        this.receiverBank = receiverBank;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public AvailableBanks getSenderBank() {
        return this.senderBank;
    }
    public AvailableBanks getReceiverBank() {
        return this.receiverBank;
    }

    public int getTotalAmountSent() {
        return this.totalAmountSent;
    }
}
