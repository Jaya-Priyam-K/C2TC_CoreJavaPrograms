package Day12;

import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            // Call method that may throw IOException
            String str = CheckedException.acceptText();
            System.out.println("Your string is " + str);
        } catch (IOException e) {
            // Handle input/output exceptions
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
