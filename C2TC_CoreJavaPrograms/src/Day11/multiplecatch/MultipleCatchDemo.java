package Day11.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        
        // Entry point of the program
        System.out.println("I am in main method");
        
        int numberOne, numberTwo, numberThree; // Variables for input and result
        Scanner sc = new Scanner(System.in);   // Scanner for user input
        
        System.out.println("Enter two numbers: ");
        
        // Infinite loop to repeatedly prompt user until valid input or unrecoverable exception
        while (true) {
            try {
                // Reading two integers from the user
                numberOne = sc.nextInt();
                numberTwo = sc.nextInt();
                
                // Performing division (may cause ArithmeticException if numberTwo is zero)
                numberThree = numberOne / numberTwo;
                
                // Displaying the result
                System.out.println("Division is " + numberThree);
                
                // Exit loop after successful division
                break;
                
            } catch (InputMismatchException e) {
                // Thrown when the user enters non-integer input
                System.out.println("Invalid input. Please enter integers only.");
                
                // Clear the invalid input from the scanner buffer
                sc.nextLine();
                
            } catch (ArithmeticException e) {
                // Handles division by zero or other arithmetic errors
                System.out.println("Exception caught: " + e.getMessage());
                break;
                
            } catch (Exception e) {
                // Catches any other unforeseen exceptions
                System.out.println("Exception caught: " + e.getMessage());
                break;
            }
        }
        
        // Closing the Scanner to release system resources
        sc.close();
    }
}
