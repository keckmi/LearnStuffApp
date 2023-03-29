package com.example.learnstuffapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TermActivity extends AppCompatActivity {

    public static final String LERNFELD = "LERNFELD";
    public static final String CHAPTER = "CHAPTER";
    public static final String TERM = "TERM";

    Button titleLF;
    Button titleChapter;
    TextView txtTerm;
    TextView txtContent;
    ImageView imgView;

    private final Term[][] termsLF1 = Terms.getTermsLF1();
    private final Term[][] termsLF2 = Terms.getTermsLF2();
    private final Term[][] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF5 = Terms.getTermsLF5();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF8 = Terms.getTermsLF8();
    private final Term[] termsLF9 = Terms.getTermsLF9();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);

        titleLF = findViewById(R.id.btnTitleLF);
        titleChapter = findViewById(R.id.btnTitleChapter);
        txtTerm = findViewById(R.id.txtTerm);
        txtContent = findViewById(R.id.txtContent);
        imgView = findViewById(R.id.imgf);

        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);
        String chapter = intent.getStringExtra(CHAPTER);
        String term = intent.getStringExtra(TERM);
        String content = content(intent, lernfeld, term);
        System.out.println(content==null);
        titleLF.setText(Learnfield.getLearnfieldTitleByNumber(lernfeld));
        titleChapter.setText(chapter);
        txtTerm.setText(term);
        txtContent.setText(content);
        setPicIfIs(term);

    }

    private String content(Intent intent, String lernfeld, String term) {
        String content = "";
        Term [] terms = new Term[0];
        Term [][] terms2D = new Term[0][];
        switch(lernfeld) {
            case "1": terms2D = termsLF1; break;
            case "2": terms2D = termsLF2; break;
            case "3": terms2D = termsLF3; break;
            case "4": terms = termsLF4; break;
            case "5": terms = termsLF5; break;
            case "6": terms = termsLF6; break;
            case "7": terms = termsLF7; break;
            case "8": terms = termsLF8;; break;
            case "9": terms = termsLF9; break;
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }
        if (lernfeld.equals("1") || lernfeld.equals("2") || lernfeld.equals("3")){
            for (int i = 0; i < terms2D.length; i++) {
                for (int j = 0; j < terms2D[i].length; j++) {
                    if (term.equals(terms2D[i][j].getTerm())) {
                        content = terms2D[i][j].getContent();
                    }
                }
            }
        } else {
            for (int i = 0; i < terms.length; i++) {
                if (term.equals(terms[i].getTerm())) {
                    content = terms[i].getContent();
                }
            }
        }
        return content;
    }

    private void setPicIfIs(String term) {
        if (term.equals("Handelskalkulation")) {
            imgView.setImageResource(R.drawable.handelskalkulation);
            imgView.getLayoutParams().height=2000;
        }
        if (term.equals("Zuschlagskalkulation")) {
            imgView.setImageResource(R.drawable.zuschlagskalkulation);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Rückwärtskalkulation")) {
            imgView.setImageResource(R.drawable.rueckwaertskalkulation);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Gewinnkalkulation")) {
            imgView.setImageResource(R.drawable.gewinnkalkulation);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Nutzwertanalyse")) {
            imgView.setImageResource(R.drawable.nutzwertanalyse);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Druckkostenvergleich")) {
            imgView.setImageResource(R.drawable.druckkostenvergleich2);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("Darlehen")) {
            imgView.setImageResource(R.drawable.darlehen);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Netzplantechnik")) {
            imgView.setImageResource(R.drawable.netzplantechnik2);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Organigramm")) {
            imgView.setImageResource(R.drawable.organigramm);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("ERM")) {
            imgView.setImageResource(R.drawable.erm);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("ERM Notations")) {
            imgView.setImageResource(R.drawable.erm_notations);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Sortierverfahren")) {
            imgView.setImageResource(R.drawable.sortieralgorythmen);
            imgView.getLayoutParams().height=3000;
        }
        if (term.equals("3-Stufige Verkabelungshierarchie")) {
            imgView.setImageResource(R.drawable.drei_stufige_verkabelungshierarchie);
            imgView.getLayoutParams().height=600;
        }
        if (term.equals("Internet Netzwerk Aufbau")) {
            imgView.setImageResource(R.drawable.internet_netzwerk_aufbau);
            imgView.getLayoutParams().height=1300;
        }

    }
}