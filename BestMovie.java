import java.util.Scanner;

class Movie {
    String title;
    int[] ratings;

    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    double getAverage() {
        double sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.length;
    }
}

public class BestMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];

        for (int i = 0; i < movies.length; i++) {
            System.out.print("Enter title of movie " + (i + 1) + ": ");
            String title = sc.nextLine();

            int[] ratings = new int[5];
            System.out.println("Enter ratings from 5 viewers (1–10):");
            for (int j = 0; j < ratings.length; j++) {
                ratings[j] = sc.nextInt();
            }
            sc.nextLine();

            movies[i] = new Movie(title, ratings);
        }

        Movie bestMovie = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getAverage() > bestMovie.getAverage()) {
                bestMovie = movies[i];
            }
        }

        System.out.println("Movie with the best average rating:");
        System.out.println("Title: " + bestMovie.title);
        System.out.println("Average Rating: " + bestMovie.getAverage());

        sc.close();
    }
}
