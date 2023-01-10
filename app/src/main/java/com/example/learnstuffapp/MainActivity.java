package com.example.learnstuffapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String WHERE = "WHERE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtWhere = findViewById(R.id.txtWhere);

        Button btnLernfeld2 = findViewById(R.id.btnLernfeld2);
        Button btnLernfeld3 = findViewById(R.id.btnLernfeld3);
        Button btnLernfeld4 = findViewById(R.id.btnLernfeld4);
        Button btnLernfeld6 = findViewById(R.id.btnLernfeld6);
        Button btnLernfeld7 = findViewById(R.id.btnLernfeld7);
        Button btnLernfeld9 = findViewById(R.id.btnLernfeld9);

        Intent intent = getIntent();
        txtWhere.setText(intent.getStringExtra(WHERE));

        btnLernfeld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "2");
                startActivity(i);
            }
        });
        btnLernfeld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "3");
                startActivity(i);
            }
        });
        btnLernfeld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "4");
                startActivity(i);
            }
        });
        btnLernfeld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "6");
                startActivity(i);
            }
        });
        btnLernfeld7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "7");
                startActivity(i);
            }
        });
        btnLernfeld9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(MainActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(MainActivity.this, MainActivity2.class);}
                i.putExtra(MainActivity2.LERNFELD, "9");
                startActivity(i);
            }
        });

    }

    private void startQuiz() {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

}