package module2;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount;
        myAccount = new Account("Ram", 40);

        //takes inputs via Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s, you have Rs. %.2f \nEnter amount to deposit: \n", myAccount.getName(), myAccount.getMainBalance());
        double depositAmount = scanner.nextDouble();
        //method from Account
        myAccount.deposit(depositAmount);
        System.out.printf("Deposit Success, Total Balance: %s", myAccount.getMainBalanceString());
        System.out.println("\n------------------");
    }
}
