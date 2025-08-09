package Day12.userdefinedexp;

public class StudentService {

    // Sets marks for a student after validating each mark
    public void setMarks(Student student, int[] marks) throws InvalidMarksException {
        for (int mark : marks) {
            // Validate marks range 0 to 100
            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException("Invalid marks found: " + mark + ". Marks should be between 0 and 100.");
            }
        }
        // Set marks if all are valid
        student.setMarks(marks);
        // Calculate and update the percentage
        calculatePercentage(student);
    }

    // Calculates the percentage based on marks and updates student
    private void calculatePercentage(Student student) {
        int[] marks = student.getMarks();
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        float percentage = (float) sum / marks.length;
        student.setPer(percentage);
    }
}
