import java.util.Scanner;

public class ECommerce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        double total = 0;

        System.out.print("Enter number of orders placed today: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of order " + i + ": ");
            double price = sc.nextDouble();
            total += price;
        }

        System.out.println("\nTotal price of today's orders: ₹" + total);
    }
}