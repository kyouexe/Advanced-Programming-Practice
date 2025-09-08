import java.util.Scanner;

class Product {
    String productName;
    int[] stockHistory;

    Product(String productName, int[] stockHistory) {
        this.productName = productName;
        this.stockHistory = stockHistory;
    }

    int getLastMonthIncrease() {
        int n = stockHistory.length;
        return stockHistory[n - 1] - stockHistory[n - 2];
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of months of stock history: ");
            int months = sc.nextInt();

            int[] stockHistory = new int[months];
            System.out.println("Enter stock values for each month:");
            for (int j = 0; j < months; j++) {
                stockHistory[j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline

            products[i] = new Product(name, stockHistory);
        }

        Product maxIncreaseProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getLastMonthIncrease() > maxIncreaseProduct.getLastMonthIncrease()) {
                maxIncreaseProduct = products[i];
            }
        }

        System.out.println("\nProduct with highest stock increase last month:");
        System.out.println("Name: " + maxIncreaseProduct.productName);
        System.out.println("Increase: " + maxIncreaseProduct.getLastMonthIncrease());

        sc.close();
    }
}
