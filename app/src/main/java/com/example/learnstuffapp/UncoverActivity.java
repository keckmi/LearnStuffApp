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
    private String lernfeld_string;
    private Question[] currentLernfeld;
    Term[] terms;
    Question[] Questions;
    private final Term[] termsLF2 = Terms.getTermsLF2();
    private final Term[] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF9 = Terms.getTermsLF9();
    private final Question[] questionsLF2 = Schoolstuff.getQuestionsLF2();
    private final Question[] questionsLF3 = Schoolstuff.getQuestionsLF3();
    private final Question[] questionsLF4 = Schoolstuff.getQuestionsLF4();
    private final Question[] questionsLF6 = Schoolstuff.getQuestionsLF6();
    private TextView txtTerm;
    private Button btnAufdecken;
    private TextView txtContent;
    private Button btnNext;
    private int currentTermNumber;
    //private int termCount;


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
        lernfeld_string = intent.getStringExtra(LERNFELD);
        String currentLernfeld = lernfeld_string;
        switch (currentLernfeld) {
            case "2":
                terms = termsLF2;
                //Questions = questionsLF2;
                break;
            case "3":
                terms = termsLF3;
                //Questions = questionsLF3;
                btnTitleLF.setText("LF 3: Clients in Rechnernetzwerke einbinden");
                break;
            case "4":
                terms = termsLF4;
                //Questions = questionsLF4;
                btnTitleLF.setText("LF 4: Schutzbedarfsanalyse im eigenen Arbeitsbereich durchführen");
                break;
            case "6":
                terms = termsLF6;
                //Questions = questionsLF6;
                btnTitleLF.setText("LF 6: Serviceanfragen bearbeiten");
                break;
            case "7":
                terms = termsLF7;
                btnTitleLF.setText("LF 7: Cyberphysische Systeme ergänzen");
                break;
            case "9":
                terms = termsLF9;
                btnTitleLF.setText("LF 9: Netzwerkbereitstellung nach unterschiedlichen Unternehmensanforderungen unterscheiden");
                break;
        }

        //List<Question> questionsList = Arrays.asList(Questions);

        //Questions = questionsList.toArray(Questions);

        //txtTerm.setText(Questions[0].getQuestion());
        txtTerm.setText(terms[0].getTerm());


        /*String txtContent1 = "";
        String txtContent2 = "";
        String txtContent3 = "";
        String txtContent4 = "";
        String txtContent5 = "";
        String txtContent6 = "";

        if (Questions[0].getAnswerNrs()[0]){txtContent1 = Questions[0].getOption1() + "\n";}
        if (Questions[0].getAnswerNrs()[1]){txtContent2 = Questions[0].getOption2() + "\n";}
        if (Questions[0].getAnswerNrs()[2]){txtContent3 = Questions[0].getOption3() + "\n";}
        if (Questions[0].getAnswerNrs()[3]){txtContent4 = Questions[0].getOption4() + "\n";}
        if (Questions[0].getAnswerNrs()[4]){txtContent5 = Questions[0].getOption5() + "\n";}
        if (Questions[0].getAnswerNrs()[5]){txtContent6 = Questions[0].getOption6() + "\n";}*/

        //txtContent.setText(txtContent1 + txtContent2 + txtContent3 + txtContent4 + txtContent5 + txtContent6);

        txtContent.setText(terms[0].getContent());

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
        //if (currentTermNumber < Questions.length) {
        if (currentTermNumber < terms.length) {
            currentTermNumber++;
            //termCount++;

            //txtTerm.setText(Questions[currentTermNumber].getQuestion());
            txtTerm.setText(terms[currentTermNumber].getTerm());

            /*String txtContent1 = "";
            String txtContent2 = "";
            String txtContent3 = "";
            String txtContent4 = "";
            String txtContent5 = "";
            String txtContent6 = "";

            if (Questions[currentTermNumber].getAnswerNrs()[0]){txtContent1 = Questions[currentTermNumber].getOption1() + "\n";}
            if (Questions[currentTermNumber].getAnswerNrs()[1]){txtContent2 = Questions[currentTermNumber].getOption2() + "\n";}
            if (Questions[currentTermNumber].getAnswerNrs()[2]){txtContent3 = Questions[currentTermNumber].getOption3() + "\n";}
            if (Questions[currentTermNumber].getAnswerNrs()[3]){txtContent4 = Questions[currentTermNumber].getOption4() + "\n";}
            if (Questions[currentTermNumber].getAnswerNrs()[4]){txtContent5 = Questions[currentTermNumber].getOption5() + "\n";}
            if (Questions[currentTermNumber].getAnswerNrs()[5]){txtContent6 = Questions[currentTermNumber].getOption6() + "\n";}*/

            //txtContent.setText(txtContent1 + txtContent2 + txtContent3 + txtContent4 + txtContent5 + txtContent6);

            txtContent.setText(terms[currentTermNumber].getContent());

            btnAufdecken.setVisibility(Button.VISIBLE);
            txtContent.setVisibility(View.INVISIBLE);
            btnNext.setVisibility(Button.INVISIBLE);

        }else {
            //finishQuiz();
            finish();
        }

    }
}