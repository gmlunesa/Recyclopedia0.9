package com.example.recyclopedia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    // initialize the UI objects
    TextView answer_textview;
    TextView details_textview;
    ImageView img_imageview;

    Button continue_button;

    int score;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Game");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // assign the different views
        answer_textview = (TextView) findViewById(R.id.result);
        details_textview = (TextView) findViewById(R.id.result_details);
        img_imageview = (ImageView) findViewById(R.id.result_image);
        continue_button = (Button) findViewById(R.id.result_button);


    }

}
