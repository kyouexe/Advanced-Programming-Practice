import java.util.Scanner;

class Employee {
    int id;
    String name;
    double[] salaries;

    Employee(int id, String name, double[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }
    double getTotalSalary() {
        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }
        return total;
    }
}
public class HighestSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            double[] salaries = new double[6];
            System.out.println("Enter salaries for last 6 months:");
            for (int j = 0; j < 6; j++) {
                salaries[j] = sc.nextDouble();
            }
            sc.nextLine();

            employees[i] = new Employee(id, name, salaries);
        }
        Employee topEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getTotalSalary() > topEmployee.getTotalSalary()) {
                topEmployee = employees[i];
            }
        }
		
        System.out.println("Employee with highest total salary in 6 months:");
        System.out.println("ID: " + topEmployee.id);
        System.out.println("Name: " + topEmployee.name);
        System.out.println("Total Salary: " + topEmployee.getTotalSalary());

        sc.close();
    }
}
