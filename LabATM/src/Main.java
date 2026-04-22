import java.util.Scanner;

class BankAccount {
    double balance;

    // TODO A1: Add a constructor that sets balance
BankAccount(double b){
    balance = b;
}
    // TODO A2: Add a method withdraw(double amount)
    //   - If amount <= balance: subtract and print
    //       "Withdrew $<amount>. Balance = $<balance>"
    //   - Else: print "Not enough funds!"
    void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrew $" + amount + ". Balance = $" + balance);
        }
        else
            System.out.println("Not enough funds!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO B1: Ask user for starting balance
        System.out.println("What's your balance?");
        double balance = sc.nextInt();
        // TODO B2: Create a BankAccount object
BankAccount b1 = new BankAccount(balance);

        // TODO C1: Ask for amount to withdraw (0 to exit)
        System.out.println("How much would you like to withdraw? You can't say 0");
        double amount = sc.nextInt();
        // TODO C2: While amount != 0

        //   - Call withdraw(amount)
        while(amount != 0) {
            b1.withdraw(amount);

        //   - Ask for next amount
            //System.out.println("How much more do you want to withdraw? Say 0 when you are done.");
            //amount = sc.nextInt();
            if (b1.balance > 0) {
                System.out.println("How much more would you like to withdraw? You can't say 0");
                amount = sc.nextInt();
            } else {
                System.out.println("You're broke. Stop spending money. We're done");
                amount = 0;
            }
        }


        // After loop ends:
        //   Print "Goodbye!"
        System.out.println("Thanks for using the Road Trip Funds Bank. Goodbye.");
    }
}