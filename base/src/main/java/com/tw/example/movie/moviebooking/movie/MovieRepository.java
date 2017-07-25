package com.tw.example.movie.moviebooking.movie;

import com.tw.example.movie.moviebooking.base.R;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private static List<Movie> movies = new ArrayList<>();

    static {
        movies.add(new Movie(R.mipmap.himmatwala, "Himmatwala", "An evil landlord falsely accuses a temple priest of stealing money, causing him to commit suicide. Years later, his son decides to take revenge on the man responsible for his death."));
        movies.add(new Movie(R.mipmap.dabangg, "Dabangg", "Chulbul Pandey is a cop who has his own way of dealing with corruption. His detractor Cheddi Singh manages to create a rift between Chulbul and his step-brother and use it to his advantage."));
        movies.add(new Movie(R.mipmap.khiladi_786, "Khiladi 786", "Mansukh's father runs a marriage bureau and believes that his son is a failure in life. In order to prove him wrong, Mansukh takes on the task of finding a match for a gangster's sister."));
        movies.add(new Movie(R.mipmap.ye_jawaani_hai_deewani, "Yeh Jawaani Hai Deewani", "Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds."));
        movies.add(new Movie(R.mipmap.tanu_weds_manu, "Tanu Weds Manu", "Manu, an NRI doctor comes to India in search of a bride and falls in love with Tanu. But, Tanu, a fun-loving girl has absolutely no plans of marrying him."));
        movies.add(new Movie(R.mipmap.shor_in_the_city, "Shor In The City", "In the city of Mumbai, an NRI businessman, a small-time crook and a budding cricketer grapple with life-changing choices during the chaotic period of the festival of Ganesh Chaturthi."));
    }

    public static List<Movie> getMovies() {
        return movies;
    }

    public static Movie getMovie(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }
}
