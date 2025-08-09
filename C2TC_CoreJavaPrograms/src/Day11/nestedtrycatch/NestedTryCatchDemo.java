package Day11.nestedtrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] a) {
        
        String name; // Stores user's name
        int pos;     // Stores the character position to access
        
        // Using try-with-resources so Scanner is automatically closed at the end
        try (Scanner sc = new Scanner(System.in)) {
            
            try {
                // Prompt and read user's name
                System.out.println("Enter your name : ");
                name = sc.next();
                
                // Prompt and read the position (index) of the character
                System.out.println("Enter the position : ");
                pos = sc.nextInt();
                
                // Inner try block: accessing a specific character from the name
                try {
                    System.out.println("character at index " + pos + " in '" + name + "' is " + name.charAt(pos));
                } catch (StringIndexOutOfBoundsException e) {
                    // Handles case where position is invalid (negative or >= name length)
                    System.out.println(e.getMessage());
                }
                
            } catch (InputMismatchException e) {
                // Handles non-integer input for position
                System.out.println("Please enter integer ");
            }
        }
    }
}
