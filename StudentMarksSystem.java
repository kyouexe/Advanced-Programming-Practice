class Student {
    private int marks; 
    Student(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks, String role) {
        if (role.equalsIgnoreCase("Teacher")) {
            if (marks >= 0 && marks <= 100) {
                this.marks = marks;
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("Invalid marks! Enter between 0 and 100.");
            }
        } else {
            System.out.println("Access denied! Only teachers can update marks.");
        }
    }
}
public class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student(75);
        System.out.println("Student views marks: " + s1.getMarks());
        s1.setMarks(90, "Student");  
        s1.setMarks(90, "Teacher");  
        System.out.println("Student views marks: " + s1.getMarks());
    }
}