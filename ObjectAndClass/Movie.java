package BasicsOfJava.ObjectAndClass;

public class Movie {

    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void displayDetail() {
        System.out.println("Title: " + title + ",Genre: " + genre);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Science Fiction");
        movie1.displayDetail();

        Movie movie2 = new Movie("THE Dark Knight", "Action");
        movie2.displayDetail();
    }
}
