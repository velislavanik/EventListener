package com.example.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        b.setOnClickListener(v -> {
            TextView txtView = findViewById(R.id.textView);
            txtView.setTextSize(18);
        });

        b2.setOnClickListener(v -> {
            TextView txtView = findViewById(R.id.textView);
            txtView.setTextSize(50);

        });
    }



}