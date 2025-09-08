import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = sc.nextLine();

            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = sc.nextLine();

            books[i] = new Book(title, author);
        }

        System.out.print("\nEnter author name to search books: ");
        String searchAuthor = sc.nextLine();

        printBooksByAuthor(books, searchAuthor);

        sc.close();
    }

    static void printBooksByAuthor(Book[] books, String authorName) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equalsIgnoreCase(authorName)) {
                System.out.println("Title: " + books[i].title);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for author: " + authorName);
        }
    }
}
