package com.tw.example.movie.moviebooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
    }

    public void openDesc(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) linearLayout.getChildAt(1);
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(DetailsActivity.NAME, textView.getText());
        this.startActivity(intent);
    }
}
