package com.example.joj.discovercluj;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // programmatically set font to title text
        TextView textview = (TextView) findViewById(R.id.title_textView);
        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "font/yanonekaffeesatz_regular.ttf");
        textview.setTypeface(font);

        final ImageButton firstButton = (ImageButton) findViewById(R.id.image_button_1);
        firstButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access map";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton secondButton = (ImageButton) findViewById(R.id.image_button_2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access games";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton thirdButton = (ImageButton) findViewById(R.id.image_button_3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access home";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton fourthButton = (ImageButton) findViewById(R.id.image_button_4);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access connections";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton fifthButton = (ImageButton) findViewById(R.id.image_button_5);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Access settings";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent(MainActivity.this, OpenSettings.class);
                startActivity(intent);
            }
        });

        final ImageButton searchButton = (ImageButton) findViewById(R.id.search_image_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                String msg = "Search";
                Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton exitButton = (ImageButton) findViewById(R.id.exit_image_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                finish();
                System.exit(0);
            }
        });
    }
}
