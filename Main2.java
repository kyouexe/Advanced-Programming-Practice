class Customer {
    double getDiscount() {
        return 0.0;
    }
}

class RegularCustomer extends Customer {
    double getDiscount() {
        return 5.0;
    }
}

class PremiumCustomer extends Customer {
    double getDiscount() {
        return 10.0;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Customer c1 = new RegularCustomer();
        Customer c2 = new PremiumCustomer();
        System.out.println("Regular Customer Discount: " + c1.getDiscount() + "%");
        System.out.println("Premium Customer Discount: " + c2.getDiscount() + "%");
    }
}
