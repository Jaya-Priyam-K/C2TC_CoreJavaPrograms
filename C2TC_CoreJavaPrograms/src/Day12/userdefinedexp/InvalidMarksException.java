package Day12.userdefinedexp;

// Custom checked exception for invalid marks
public class InvalidMarksException extends Exception {

    // Default constructor
    public InvalidMarksException() {
        super();
    }

    // Constructor that accepts an error message
    public InvalidMarksException(String message) {
        super(message);
    }
}
