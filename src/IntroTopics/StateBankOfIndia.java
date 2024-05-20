package IntroTopics;

public class StateBankOfIndia implements RBIRules {

    private int currentBalance;

    public StateBankOfIndia() {
        this.currentBalance = 0;
    }

    public void sendMoney(int amount) {
        if (amount > this.currentBalance) {
            System.out.println("Insufficient balance");
            return;
        }
        this.currentBalance -= amount;
        System.out.println("Money sent successfully");
    }

    public void receiveMoney(int amount) {
        this.currentBalance += amount;
        System.out.println("Money received successfully");
    }

    public void printBalance() {
        System.out.println("Current bank balance is: " + this.currentBalance);
    }
}
