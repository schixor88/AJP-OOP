package module2;

public class Account {

    private String name;
    private double mainBalance;


    public Account(String name, double startingBalance) {
        this.name = name;
        this.mainBalance = startingBalance;

    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            mainBalance = mainBalance + amount;
        }
    }

    public String getName() {
        return name;
    }

    public double getMainBalance() {
        return mainBalance;
    }

    public String getMainBalanceString() {
        return "Rs. " + mainBalance;
    }

}
