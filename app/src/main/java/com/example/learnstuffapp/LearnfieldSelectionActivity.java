package com.example.learnstuffapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LearnfieldSelectionActivity extends AppCompatActivity {

    public static final String WHERE = "WHERE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnfieldselection);

        TextView txtWhere = findViewById(R.id.txtWhere);

        Button btnLernfeld1 = findViewById(R.id.btnLernfeld1);
        Button btnLernfeld2 = findViewById(R.id.btnLernfeld2);
        Button btnLernfeld3 = findViewById(R.id.btnLernfeld3);
        Button btnLernfeld4 = findViewById(R.id.btnLernfeld4);
        Button btnLernfeld5 = findViewById(R.id.btnLernfeld5);
        Button btnLernfeld6 = findViewById(R.id.btnLernfeld6);
        Button btnLernfeld7 = findViewById(R.id.btnLernfeld7);
        Button btnLernfeld8 = findViewById(R.id.btnLernfeld8);
        Button btnLernfeld9 = findViewById(R.id.btnLernfeld9);
        Button btnLernfeld10 = findViewById(R.id.btnLernfeld10);
        Button btnLernfeld11 = findViewById(R.id.btnLernfeld11);

        Intent intent = getIntent();
        txtWhere.setText(intent.getStringExtra(WHERE));

        btnLernfeld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "1");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "1");
                startActivity(i);
            }
        });
        btnLernfeld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "2");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "2");
                startActivity(i);
            }
        });
        btnLernfeld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "3");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "3");
                startActivity(i);
            }
        });
        btnLernfeld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "4");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "4");
                startActivity(i);
            }
        });
        btnLernfeld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "5");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "5");
                startActivity(i);
            }
        });
        btnLernfeld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "6");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "6");
                startActivity(i);
            }
        });
        btnLernfeld7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "7");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "7");
                startActivity(i);
            }
        });

        btnLernfeld8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "8");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "8");
                startActivity(i);
            }
        });
        btnLernfeld9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "9");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "9");
                startActivity(i);
            }
        });
        btnLernfeld10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "10");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "10");
                startActivity(i);
            }
        });
        btnLernfeld11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                if (intent.getStringExtra(WHERE).equals("LEXIKON")) {
                    i = new Intent(LearnfieldSelectionActivity.this, TermListActivity.class);
                    i.putExtra(TermActivity.LERNFELD, "11");}
                if (intent.getStringExtra(WHERE).equals("AUFDECKEN")) {
                    i = new Intent(LearnfieldSelectionActivity.this, UncoverActivity.class);}
                if (intent.getStringExtra(WHERE).equals("QUIZ")) {
                    i = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);}
                i.putExtra(QuizActivity.LERNFELD, "11");
                startActivity(i);
            }
        });

    }

    private void startQuiz() {
        Intent intent = new Intent(LearnfieldSelectionActivity.this, QuizActivity.class);
        startActivity(intent);
    }

}