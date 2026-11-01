
package com.movieticket.data;

import com.movieticket.model.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {

    private static final List<Movie> movies = new ArrayList<>();

    static {
        movies.add(new Movie(
            1, "Pushpa 2", "Action", "Telugu",
            "https://placehold.co/400x550?text=Pushpa+2", 220
        ));

        movies.add(new Movie(
            2, "Kalki 2898 AD", "Sci-Fi", "Telugu",
            "https://placehold.co/400x550?text=Kalki", 250
        ));

        movies.add(new Movie(
            3, "RRR", "Action", "Telugu",
            "https://placehold.co/400x550?text=RRR", 200
        ));

        movies.add(new Movie(
            4, "Animal", "Drama", "Hindi",
            "https://placehold.co/400x550?text=Animal", 180
        ));

        movies.add(new Movie(
            5, "Jawan", "Action", "Hindi",
            "https://placehold.co/400x550?text=Jawan", 200
        ));

        movies.add(new Movie(
            6, "Leo", "Action", "Tamil",
            "https://placehold.co/400x550?text=Leo", 180
        ));
    }

    public static List<Movie> getAllMovies() {
        return new ArrayList<>(movies);
    }

    public static Movie getMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}
