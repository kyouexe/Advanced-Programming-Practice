class Employee {
    double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    double base = 50000;
    double bonus = 10000;

    double calculateSalary() {
        return base + bonus;
    }
}

class Developer extends Employee {
    double base = 40000;
    double overtime = 5000;

    double calculateSalary() {
        return base + overtime;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}
