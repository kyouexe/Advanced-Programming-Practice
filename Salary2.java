import java.util.Scanner;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Salary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(salary);
        }

        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < n; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }

        System.out.println("\nHighest salary : " + maxSalary);
    }
}
