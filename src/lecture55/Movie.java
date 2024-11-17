package lecture55;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode


public class Movie {
    private int movieId;
    private String movieName;
    private int movieRating;
    public static void main(String[] args) {
        Movie movie = new Movie(1, "SIngam", 5);
        Movie movie1 = new Movie();
        System.out.println(movie);
        System.out.println(movie1);

    }
}
