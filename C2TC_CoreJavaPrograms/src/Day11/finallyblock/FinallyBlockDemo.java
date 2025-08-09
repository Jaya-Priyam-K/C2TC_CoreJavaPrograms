package Day11.finallyblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompting the user for a number
            System.out.print("Enter the number : ");
            
            // Reading an integer input
            int number = scanner.nextInt();
            
            // Using the ternary operator to check if the number is even or odd
            System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
            
        } catch (InputMismatchException e) {
            // This block executes if the user enters a non-integer value
            System.out.println("Invalid input...");
            
        } finally {
            // The 'finally' block always executes, regardless of whether an exception occurs
            // Commonly used for cleanup tasks such as closing resources
            System.out.println("In Finally....");
            scanner.close(); // Closing the Scanner to free system resources
        }
    }
}
