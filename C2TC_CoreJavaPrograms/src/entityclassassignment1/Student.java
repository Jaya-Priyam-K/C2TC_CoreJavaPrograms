package entityclassassignment1;

public class Student {
    private int studentId;
    private String name;
    private String department;

    // Constructor
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // toString method to print student details
    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Name: " + name +
               ", Department: " + department;
    }
}
