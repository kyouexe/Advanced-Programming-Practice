class Book{
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    double discount(double percent){
        return price - (price * percent / 100);
    }
}

public class Books{
    public static void main(String[] args){
        Book book = new Book("Oshi No Ko", "Aka Akasaka", 500);
        double finalprice = book.discount(10);
        System.out.println("Discounted Price: " + finalprice);
    }
}
