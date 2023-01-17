package com.example.learnstuffapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        Button btnAufdecken = findViewById(R.id.btnAufdecken);
        Button btnLQuiz = findViewById(R.id.btnQuiz);
        Button btnLexikon = findViewById(R.id.btnTerms);

        btnLexikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMainActivity.this, MainActivity.class);
                i.putExtra(MainActivity.WHERE, "LEXIKON");
                startActivity(i);
            }
        });

        btnAufdecken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMainActivity.this, MainActivity.class);
                i.putExtra(MainActivity.WHERE, "AUFDECKEN");
                startActivity(i);
            }
        });

        btnLQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainMainActivity.this, MainActivity.class);
                i.putExtra(MainActivity.WHERE, "QUIZ");
                startActivity(i);
            }
        });
    }
}