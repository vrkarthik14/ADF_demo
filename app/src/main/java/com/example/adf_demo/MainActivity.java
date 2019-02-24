package com.example.adf_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score_count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView score = findViewById(R.id.total_score);

        Button addButton = findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Just displays at bottom of screen
                Toast.makeText(MainActivity.this, "Score incremented.", Toast.LENGTH_SHORT).show();
                score_count = score_count + 1;
                // Score count is current score value
                score.setText("SCORE: " + score_count);
            }
        });

        //substract action for sub ID in xml
        Button substactButton = findViewById(R.id.sub);
        substactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Just displays at bottom of screen
                Toast.makeText(MainActivity.this, "Score incremented.", Toast.LENGTH_SHORT).show();
                score_count = score_count - 1;
                // Score count is current score value
                score.setText("SCORE: " + score_count);
            }
        });

    }
}
