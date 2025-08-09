package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

    // Reads a line of text from console, may throw IOException
    static String acceptText() throws IOException {
        // Using try-with-resources to auto-close BufferedReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the string: ");
            String str = br.readLine();  // Read a line from input
            return str;
        }
    }
}
