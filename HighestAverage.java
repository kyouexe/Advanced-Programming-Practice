import java.util.Scanner;
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        double sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
}
public class HighestAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            int[] marks = new int[n];
            System.out.println("Enter marks for " + name + ": ");
            for (int j = 0; j < n; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            students[i] = new Student(name, marks);
        }

        Student topStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }

        System.out.println("\nStudent with highest average marks:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Average Marks: " + topStudent.getAverage());

        sc.close();
    }
}
