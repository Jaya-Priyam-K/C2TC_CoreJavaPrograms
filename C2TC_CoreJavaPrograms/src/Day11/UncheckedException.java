package Day11;

public class UncheckedException {

    public static void main(String[] args) {
        
        int x[]; // Declaration of integer array reference
        
        try {
            // Initializing the array with 4 elements (indices: 0 to 3)
            x = new int[] { 1, 2, 3, 4 };
            
            // Attempting to access index 6 (which doesn't exist) → will throw ArrayIndexOutOfBoundsException
            System.out.println(x[6]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception and printing an error message to the error stream
            // e.getMessage() gives the invalid index that was accessed
            System.err.println("Specified index does not exist. " + e.getMessage());
        }
    }
}
