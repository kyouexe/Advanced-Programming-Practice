class Account{
    int number;
    String holder;
    double balance;
    Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    void display(){
        System.out.println("Account Holder: "+holder);
        System.out.println("Account Number: "+number);
        System.out.println("Current Balance: "+balance);
    }
}
public class Banks{
    public static void main(String[] args){
        Account account = new Account(45949849, "James Bond", 150000);
        account.display();
    }
}
