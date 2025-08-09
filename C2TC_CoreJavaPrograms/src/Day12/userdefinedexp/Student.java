package Day12.userdefinedexp;

import java.util.Arrays;

public class Student {
    private int rollNo;          // Student roll number
    private String name;         // Student name
    private int[] marks;         // Array of marks for subjects
    private int noOfSubjects;    // Number of subjects
    private float per;           // Percentage score

    // Getter and Setter for rollNo
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for marks array
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Getter and Setter for number of subjects
    public int getNoOfSubjects() {
        return noOfSubjects;
    }
    public void setNoOfSubjects(int noOfSubjects) {
        this.noOfSubjects = noOfSubjects;
    }

    // Getter and Setter for percentage
    public float getPer() {
        return this.per;
    }
    public void setPer(float per) {
        this.per = per;
    }

    // Override toString to display student details
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks)
                + ", noOfSubjects=" + noOfSubjects + ", Percentage=" + per + "]";
    }
}
