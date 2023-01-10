package com.example.learnstuffapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Button btnTitleLF;
    private int score;
    private TextView textViewScore;
    private CheckBox[] cbs = new CheckBox[6];
    /*private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;*/
    private TextView txtAnswerNr;
    /*private int questionCounter = 1;
    private int questionCountTotal = 1;*/
    private Button btn1;
    private TextView txtQuestion;
    private TextView textViewQuestionCount;
    private TextView txtLernfeld;
    public static final String LERNFELD = "LERNFELD";
    private String lernfeld_string;
    private Question[] currentLernfeld;
    Question[] Questions;
    private int currentQuestionNumber = 0;
    private int questionCount = 1;
    private final Question[] questionsLF2 = Schoolstuff.getQuestionsLF2();
    private final Question[] questionsLF3 = Schoolstuff.getQuestionsLF3();
    private final Question[] questionsLF4 = Schoolstuff.getQuestionsLF4();
    private final Question[] questionsLF6 = Schoolstuff.getQuestionsLF6();
    private final Question[] questionsLF7 = Schoolstuff.getQuestionsLF7();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        btnTitleLF = findViewById(R.id.btnTitleLF);
        Intent intent = getIntent();
        lernfeld_string = intent.getStringExtra(LERNFELD);
        String currentLernfeld = lernfeld_string; //z.B: 2, 3
        switch (currentLernfeld) {
            case "2":
                Questions = questionsLF2;
                break;
            case "3":
                Questions = questionsLF3;
                btnTitleLF.setText("LF 3: Clients in Rechnernetzwerke einbinden");
                break;
            case "4":
                Questions = questionsLF4;
                btnTitleLF.setText("LF 4: Schutzbedarfsanalyse im eigenen Arbeitsbereich durchführen");
                break;
            case "6":
                Questions = questionsLF6;
                btnTitleLF.setText("LF 6: Serviceanfragen bearbeiten");
                break;
            case "7":
                Questions = questionsLF7;
                btnTitleLF.setText("LF 7: Cyberphysische Systeme ergänzen");
        }

        List<Question> questionsList = Arrays.asList(Questions);

        Collections.shuffle(questionsList);

        Questions = questionsList.toArray(Questions);

        textViewScore = findViewById(R.id.score);
        txtQuestion = findViewById(R.id.txtQuestion);
        /*cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb1.setText(exampleQuestion.getOption1());
        cb2.setText(exampleQuestion.getOption2());
        cb3.setText(exampleQuestion.getOption3());*/
        cbs[0] = findViewById(R.id.checkBox1);
        cbs[1] = findViewById(R.id.checkBox2);
        if (Questions[0].getOption3() != null) {cbs[2] = findViewById(R.id.checkBox3);}
        if (Questions[0].getOption4() != null) {cbs[3] = findViewById(R.id.checkBox4);}
        if (Questions[0].getOption5() != null) {cbs[4] = findViewById(R.id.checkBox5);}
        if (Questions[0].getOption6() != null) {cbs[5] = findViewById(R.id.checkBox6);}
        txtAnswerNr = findViewById(R.id.textViewAnswerNr);
        textViewQuestionCount = findViewById(R.id.textViewQuestionCount);
        txtLernfeld = findViewById(R.id.textLernfeld);
        btn1 = findViewById(R.id.button1);
        //btnGetLernfeld = findViewById(R.id.btnGetLernfeld);

        if (Questions[currentQuestionNumber].getOption3().equals("")) {cbs[2].setVisibility(View.INVISIBLE);}
        if (Questions[currentQuestionNumber].getOption4().equals("")) {cbs[3].setVisibility(View.INVISIBLE);}
        if (Questions[currentQuestionNumber].getOption5().equals("")) {cbs[4].setVisibility(CheckBox.INVISIBLE);}
        if (Questions[currentQuestionNumber].getOption6().equals("")) {cbs[5].setVisibility(CheckBox.INVISIBLE);}

        txtQuestion.setText(Questions[0].getQuestion());

        cbs[0].setText(Questions[0].getOption1());
        cbs[1].setText(Questions[0].getOption2());
        if (Questions[0].getOption3() != null){cbs[2].setText(Questions[0].getOption3());}
        if (Questions[0].getOption4() != null){cbs[3].setText(Questions[0].getOption4());}
        if (Questions[0].getOption5() != null){cbs[4].setText(Questions[0].getOption5());}
        if (Questions[0].getOption6() != null){cbs[5].setText(Questions[0].getOption6());}


        textViewQuestionCount.setText("Question: " + questionCount + "/" + Questions.length);
        txtLernfeld.setText("Lernfeld: " + lernfeld_string);

       /*
        btnGetLernfeld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                activityLauncher.launch(intent);
            }
        });*/

        int richtig = 0;
        for (int i = 0; i < Questions[currentQuestionNumber].getAnswerNrs().length; i++) {
            if (Questions[currentQuestionNumber].getAnswerNrs()[i]) {
                richtig++;
            }
        }
        //txtAnswerNr.setText("Anzahl richtige Antworten: " + richtig + "\nanswers["+currentQuestionNumber+"] = " + Arrays.toString(Questions[currentQuestionNumber].getAnswerNrs()));
        updateTxtAnswerNr();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //checkAnswer();

                if (btn1.getText().equals("Next")) {
                    showNextQuestion();
                    updateTxtAnswerNr();
                } else  if (btn1.getText().equals("Finish")) {
                    finish();
                } else {
                    checkAnswer();
                }

            }

        });
    }

    private void showNextQuestion() {
        //for (int current = 0; current < Questions.length; current++) {
        for (int i = 0; i < cbs.length; i++) {
            cbs[i].setTextColor(Color.BLACK);
            cbs[i].setChecked(false);
        }

        if (currentQuestionNumber < Questions.length) {
            currentQuestionNumber++;
            questionCount++;
            textViewQuestionCount.setText("Question: " + questionCount + "/" + Questions.length);
            txtQuestion.setText(Questions[currentQuestionNumber].getQuestion());

            //TODO: Optionenarrays machen!
            cbs[0].setText(Questions[currentQuestionNumber].getOption1());
            cbs[1].setText(Questions[currentQuestionNumber].getOption2());
            cbs[2].setText(Questions[currentQuestionNumber].getOption3());
            cbs[3].setText(Questions[currentQuestionNumber].getOption4());
            cbs[4].setText(Questions[currentQuestionNumber].getOption5());
            cbs[5].setText(Questions[currentQuestionNumber].getOption6());

            btn1.setText("Confirm");

        }else {
            //finishQuiz();
            finish();
        }

    }

    private void updateTxtAnswerNr(){
        int richtig = 0;
        for (int i = 0; i < Questions[currentQuestionNumber].getAnswerNrs().length; i++) {
            if (Questions[currentQuestionNumber].getAnswerNrs()[i]) {
                richtig++;
            }
        }
        txtAnswerNr.setText("Anzahl richtige Antworten: " + richtig + "\nanswers["+currentQuestionNumber+"] = " + Arrays.toString(Questions[currentQuestionNumber].getAnswerNrs()));

    }


    private void checkAnswer() {
        boolean[] userAnswerNr = new boolean[Questions[currentQuestionNumber].getAnswerNrs().length];
        for (int i = 0; i < userAnswerNr.length; i++) {
            userAnswerNr[i] = cbs[i].isChecked();
        }
        for (int i = 0; i < Questions[currentQuestionNumber].getAnswerNrs().length; i++) {
            boolean answerNr = Questions[currentQuestionNumber].getAnswerNrs()[i];
            System.out.println("answerNr: "+answerNr);
            if ((userAnswerNr[i] == answerNr) && answerNr) {
                score++;
            } else if (userAnswerNr[i] != answerNr && !answerNr) {
                score--;
            }

            textViewScore.setText("Score: " + score);
        }

        showSolution(currentQuestionNumber);

    }

    private void showSolution(int current) {

        for (int i = 0; i < cbs.length; i++) {
            if (Questions[current].getAnswerNrs()[i]) {
                cbs[i].setTextColor(Color.GREEN);
            } else {
                cbs[i].setTextColor(Color.RED);
            }
        }

        if (questionCount < Questions.length) {
            btn1.setText("Next");
        } else {
            btn1.setText("Finish");
        }
    }

    private void finishQuiz() {
        /*Intent resultIntent = new Intent();
        resultIntent.putExtra(EXTRA_SCORE, score);
        setResult(RESULT_OK, resultIntent);*/
        finish();
    }

}