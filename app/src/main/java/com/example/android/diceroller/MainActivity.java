package com.example.android.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgview;
    private Button button;

    private int current_image;
    int[] images = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
    R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgview = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        buttonClick();
    }

    public void buttonClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random number = new Random();
                current_image = number.nextInt(6)+1;
                imgview.setImageResource(images[current_image]);

            }
        });

    }



}
