abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        return 0;
    }
}

class LoanAccount extends BankAccount {
    public LoanAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        return balance * 0.10;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(10000);
        BankAccount acc2 = new CurrentAccount(10000);
        BankAccount acc3 = new LoanAccount(10000);

        System.out.println("Savings Interest: " + acc1.calculateInterest());
        System.out.println("Current Interest: " + acc2.calculateInterest());
        System.out.println("Loan Interest: " + acc3.calculateInterest());
    }
}
