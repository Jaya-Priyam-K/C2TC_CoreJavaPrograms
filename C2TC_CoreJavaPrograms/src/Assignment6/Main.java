package Assignment6;

//Main class to demonstrate deposit and withdrawal with exception handling
public class Main {
 public static void main(String[] args) {
     // Create a BankAccount instance
     BankAccount myAccount = new BankAccount(12345, 5000.0);

     // Display initial balance
     myAccount.displayBalance();

     // Try deposit and withdrawal
     try {
         myAccount.deposit(2000);   // Valid deposit
         myAccount.withdraw(1000);  // Valid withdrawal

         myAccount.deposit(-500);   // Invalid deposit
     } catch (InvalidAmountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         System.out.println("Deposit and withdrawal operations attempted.\n");
     }

     // Try withdrawal with insufficient balance
     try {
         myAccount.withdraw(7000);  // Invalid: exceeds balance
     } catch (InvalidAmountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         System.out.println("Second withdrawal operation attempted.\n");
     }

     // Final balance display
     myAccount.displayBalance();
 }
}
