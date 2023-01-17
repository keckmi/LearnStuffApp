package com.example.learnstuffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TermActivity extends AppCompatActivity {

    public static final String LERNFELD = "LERNFELD";
    public static final String CHAPTER = "CHAPTER";
    public static final String TERM = "TERM";

    Button titleLF;
    Button titleChapter;
    TextView txtTerm;
    TextView txtContent;

    private final Term[] termsLF2 = Terms.getTermsLF2();
    private final Term[] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF9 = Terms.getTermsLF9();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);

        titleLF = findViewById(R.id.btnTitleLF);
        titleChapter = findViewById(R.id.btnTitleChapter);
        txtTerm = findViewById(R.id.txtTerm);
        txtContent = findViewById(R.id.txtContent);

        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);
        String chapter = intent.getStringExtra(CHAPTER);
        String term = intent.getStringExtra(TERM);
        String content = content(intent, lernfeld, term);
        System.out.println(content==null);
        titleLF.setText(lernfeld);
        titleChapter.setText(chapter);
        txtTerm.setText(term);
        txtContent.setText(content);

    }

    private String content(Intent intent, String lernfeld, String term) {
        String content = "";
        Term [] terms;
        switch(lernfeld) {
            case "2": terms = termsLF2; break;
            case "3": terms = termsLF3; break;
            case "4": terms = termsLF4; break;
            case "6": terms = termsLF6; break;
            case "7": terms = termsLF7; break;
            case "9": terms = termsLF9; break;
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }
        for (int i = 0; i < terms.length; i++) {
            if (term.equals(terms[i].getTerm())) {
                content = terms[i].getContent();
            }
        }
        return content;
    }
}