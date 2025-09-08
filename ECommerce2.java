import java.util.Scanner;

class Order {
    private double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class ECommerce2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders placed today: ");
        int n = sc.nextInt();

        Order[] orders = new Order[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of order " + (i + 1) + ": ");
            double price = sc.nextDouble();
            orders[i] = new Order(price); 
        }

        for (int i = 0; i < orders.length; i++) {
        total += orders[i].getPrice();
}


        System.out.println("\nTotal price of today's orders: ₹" + total);
    }
}
