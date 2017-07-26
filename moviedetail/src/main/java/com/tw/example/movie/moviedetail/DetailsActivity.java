package com.tw.example.movie.moviedetail;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tw.example.movie.moviebooking.movie.Movie;
import com.tw.example.movie.moviebooking.movie.MovieRepository;
import com.tw.example.movie.moviebooking.moviedetail.R;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Uri appLinkData = getIntent().getData();
        String movieName = appLinkData.getQueryParameter("name");
        Movie movie = MovieRepository.getMovie(movieName);
        ImageView imageView = (ImageView) findViewById(R.id.poster);
        imageView.setImageResource(movie.getPoster());
        TextView textView = (TextView) findViewById(R.id.desc);
        textView.setText(movie.getDescription());
    }
}
