class Movie{
    String title;
    String genre;
    double rating;
    Movie(String title,String genre,double rating){
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
    void Details(){
        System.out.println("Title: "+title);
        System.out.println("Genre: "+genre);
        System.out.println("Rating: "+rating);
    }
}
public class Movies{
    public static void main(String[] args){
        Movie movie=new Movie("Superman 2025", "Superhero", 9.5);
        movie.Details();
    }
}
