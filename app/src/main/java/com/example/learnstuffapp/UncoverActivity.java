package com.example.learnstuffapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class UncoverActivity extends AppCompatActivity {

    public static final String LERNFELD = "LERNFELD";
    Term[][] terms2D;
    Term[] terms;

    private final Term[][] termsLF1 = Terms.getTermsLF1();
    private final Term[][] termsLF2 = Terms.getTermsLF2();
    private final Term[][] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF5 = Terms.getTermsLF5();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF8 = Terms.getTermsLF8();
    private final Term[] termsLF9 = Terms.getTermsLF9();
    private final Term[] termsLF10 = Terms.getTermsLF10a();
    private final Term[] termsLF11 = Terms.getTermsLF11();
    private TextView txtTerm;
    private Button btnAufdecken;
    private TextView txtContent;
    private Button btnNext;
    private int currentTermNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uncover);

        btnNext = findViewById(R.id.btnNext);
        Button btnTitleLF = findViewById(R.id.btnTitleLF);
        btnAufdecken = findViewById(R.id.btnAufdecken);
        txtTerm = findViewById(R.id.txtTerm);
        txtContent = findViewById(R.id.txtContent);
        txtContent.setVisibility(View.INVISIBLE);

        btnNext.setVisibility(Button.INVISIBLE);

        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);
        btnTitleLF.setText(Learnfield.getLearnfieldTitleByNumber(lernfeld));
        switch (lernfeld) {
            case "1": terms2D = termsLF1;break;
            case "2": terms2D = termsLF2;break;
            case "3": terms2D = termsLF3;break;
            case "4": terms = termsLF4; break;
            case "5": terms = termsLF5; break;
            case "6": terms = termsLF6; break;
            case "7": terms = termsLF7; break;
            case "8": terms = termsLF8; break;
            case "9": terms = termsLF9; break;
            case "10": terms = termsLF10; break;
            case "11": terms = termsLF11; break;
        }

        if (lernfeld.equals("1") || lernfeld.equals("2") || lernfeld.equals("3")){
            txtTerm.setText(terms2D[0][0].getTerm());
            txtContent.setText(terms2D[0][0].getContent());
        } else {
            txtTerm.setText(terms[0].getTerm());
            txtContent.setText(terms[0].getContent());
        }


        btnAufdecken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnAufdecken.setVisibility(Button.INVISIBLE);
                txtContent.setVisibility(View.VISIBLE);
                btnNext.setVisibility(Button.VISIBLE);
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnNext.getText().equals("Next")) {
                    showNextTerm();
                } else  {
                    finish();
                }
            }
        });

    }

    private void showNextTerm() {
        if (currentTermNumber < terms.length) {
            currentTermNumber++;

            txtTerm.setText(terms[currentTermNumber].getTerm());

            txtContent.setText(terms[currentTermNumber].getContent());

            btnAufdecken.setVisibility(Button.VISIBLE);
            txtContent.setVisibility(View.INVISIBLE);
            btnNext.setVisibility(Button.INVISIBLE);

        }else {
            finish();
        }

    }
}