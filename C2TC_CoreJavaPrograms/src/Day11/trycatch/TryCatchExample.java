package Day11.trycatch;

public class TryCatchExample {

    // Integer division with exception handling
    static int performDivision(int x, int y) {
        System.out.println("I am in method");
        int z = 0;
        try {
            System.out.println("I am in try block");
            z = x / y; // May throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("I am in catch block: " + e.getMessage());
        }
        return z;
    }

    // Float division (no exception for division by zero)
    static float performDivision(float a, float b) {
        return a / b;
    }
}
