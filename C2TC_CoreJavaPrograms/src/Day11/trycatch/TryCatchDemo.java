package Day11.trycatch;

import Day11.trycatch.TryCatchExample;

public class TryCatchDemo {
    public static void main(String[] args) {
        
        System.out.println("I am in main method"); 
        
        int result;
        
        // Integer division by zero
        result = TryCatchExample.performDivision(12, 0);
        if (result != 0)
            System.out.println("Division is " + result);
        
        System.out.println("------------------------------");
        
        // Integer division (valid)
        result = TryCatchExample.performDivision(12, 3);
        if (result != 0)
            System.out.println("Division is " + result);
        
        System.out.println("------------------------------");
        
        // Float division (valid)
        System.out.println(TryCatchExample.performDivision(12f, 5f));
        
        System.out.println("------------------------------");
        
        // Float division by zero
        System.out.println(TryCatchExample.performDivision(12f, 0f));
    }
}
