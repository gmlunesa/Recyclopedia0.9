package com.example.recyclopedia;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mariz on 2/19/2017.
 */
public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        String title = "Help";
        String detail = "oh okay";
        String location = "wew lad";

        TextView placeDetail = (TextView) findViewById(R.id.place_detail);
        TextView placeLocation =  (TextView) findViewById(R.id.place_location);
        ImageView placePicture = (ImageView) findViewById(R.id.image);

        collapsingToolbar.setTitle(title);
        placeDetail.setText(detail);
        placeLocation.setText(location);

        placePicture.setImageResource(R.drawable.help);

    }

}
