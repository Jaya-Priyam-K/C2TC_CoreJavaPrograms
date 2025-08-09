package Day12.userdefinedexp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            
            Student student = new Student();
            
            System.out.println();
            System.out.println("Enter the roll no: ");
            int rollNo = sc.nextInt();
            student.setRollNo(rollNo);
            
            System.out.println("Enter your name: ");
            sc.nextLine(); // Consume leftover newline
            String name = sc.nextLine();
            student.setName(name);
            
            System.out.println("Enter the no.of subjects ");
            int sub = sc.nextInt();
            
            if (sub > 0) {
                student.setNoOfSubjects(sub);
                
                System.out.println("Enter the marks for " + sub + " subjects:");
                int[] marks = new int[sub];
                for (int i = 0; i < sub; i++)
                    marks[i] = sc.nextInt();
                
                StudentService studentService = new StudentService();
                studentService.setMarks(student, marks);  // Validate and set marks
                
                System.out.println(student); // Display student details
                
            } else {
                System.out.println("Enter valid subjects");
            }
            
        } catch (InvalidMarksException e) {
            // Handle invalid marks exception
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            // Handle input mismatch (e.g., non-integer input)
            System.err.println("Enter Valid Input");
        }
    }
}
