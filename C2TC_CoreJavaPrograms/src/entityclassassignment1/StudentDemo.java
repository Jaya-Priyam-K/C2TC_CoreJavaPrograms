package entityclassassignment1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Jaya", "CSE");
        Student s2 = new Student(102, "Priya", "ECE");
        Student s3 = new Student(103, "Rahul", "EEE");

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);
        System.out.println("Student 3: " + s3);
    }
}
