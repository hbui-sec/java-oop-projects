// This is my second attempt because I forgot the $ before the amount in the balance.

class BankAccount {

// ===== Part A: Class Definition =====
// TODO A: Create two properties
// - accountHolder (String)
// - balance (double)
String accountHolder;
double balance;

// ===== Part B: Method =====
// TODO B: Add a method displayInfo() in BankAccount class that prints:
// "Account Holder: [accountHolder], Balance: $[balance]"
void displayInfo(){
    //System.out.printf("Account Holder: " + accountHolder + ", Balance: $%.2f", balance, "\n");
    System.out.printf("Account Holder: " + accountHolder + ", Balance: $%.2f\n", balance);
}

// ===== Part C: Constructor =====
// TODO C: Add a constructor
// Inside the constructor, assign default values
// to accountHolder and balance
BankAccount(){
    accountHolder = "New Customer";
    balance = 0.00;
}
}

public class Main {
    public static void main(String[] args) {

// ===== Part D: Object Creation & Method Calls =====
// TODO D: Create two BankAccount objects
// Then manually change the accountHolder and balance values
// Call displayInfo() for both objects
BankAccount account1 = new BankAccount();
account1.accountHolder = "Poor Nguyen";
account1.balance = 98765432.10;
account1.displayInfo();
BankAccount account2 = new BankAccount();
account2.accountHolder = "Rich Nguyen";
account2.balance = 123456789.10;
account2.displayInfo();
BankAccount newAccount = new BankAccount();
newAccount.displayInfo();
    }
}