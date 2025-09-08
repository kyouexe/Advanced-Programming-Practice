import java.util.Scanner;

public class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        double[] salaries = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
        }
        double maxSalary = salaries[0];
        for (int i = 1; i < n; i++){
            if (salaries[i] > maxSalary){
                maxSalary = salaries[i];
            }
        }
        System.out.println("\nHighest salary in the department: " + maxSalary);
    }
}
