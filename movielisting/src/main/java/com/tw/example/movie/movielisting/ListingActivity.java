package com.tw.example.movie.movielisting;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tw.example.movie.moviebooking.movielisting.R;

public class ListingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
    }

    public void openDesc(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) linearLayout.getChildAt(1);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://moviebooking.com/detail?name=" + textView.getText()));
        intent.setPackage("com.tw.example.movie.moviebooking");
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        this.startActivity(intent);
    }
}
