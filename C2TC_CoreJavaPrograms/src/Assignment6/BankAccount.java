package Assignment6;

//Represents a basic bank account with deposit, withdraw, and balance checking features
public class BankAccount {
 private int accountNumber;
 private double balance;

 // Constructor to initialize account number and starting balance
 public BankAccount(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than 0.");
     }
     balance += amount;
     System.out.println("Deposit successful! Current Balance: ₹" + balance);
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance for withdrawal.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful! Current Balance: ₹" + balance);
 }

 // Method to display the current balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
 }
}
