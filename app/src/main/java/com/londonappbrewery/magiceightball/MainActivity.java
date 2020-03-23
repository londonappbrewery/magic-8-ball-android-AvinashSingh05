package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    AppCompatImageView ball_image;
    Button ask_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ball_image = (AppCompatImageView) findViewById(R.id.ball_image);
        ask_button = (Button) findViewById(R.id.ask_button);

        final int[] ball_array = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random_num = new Random();
                int number = random_num.nextInt(5);
                ball_image.setImageResource(ball_array[number]);
            }
        });

    }
}
