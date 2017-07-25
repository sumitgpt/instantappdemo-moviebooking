package com.tw.example.movie.moviebooking;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tw.example.movie.moviebooking.movie.Movie;
import com.tw.example.movie.moviebooking.movie.MovieRepository;

public class DetailsActivity extends Activity {

    public static String NAME = "com.tw.example.movie.moviebooking.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String name = getIntent().getStringExtra(NAME);
        Movie movie = MovieRepository.getMovie(name);
        ImageView imageView = (ImageView) findViewById(R.id.poster);
        imageView.setImageResource(movie.getPoster());
        TextView textView = (TextView) findViewById(R.id.desc);
        textView.setText(movie.getDescription());
    }
}
