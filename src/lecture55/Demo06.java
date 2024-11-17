package lecture55;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Demo06 {
    public static void main(String[] args) {
        class Movie {
            private int movieId;
            private String movieName;
            private int movieRating;
        }
        lecture55.Movie movie = new lecture55.Movie(1, "SIngam", 5);
        lecture55.Movie movie1 = new lecture55.Movie();
        System.out.println(movie);
        System.out.println(movie1);
    }
}
