package com.example.learnstuffapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

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
    Question[] QuestionsArray;

    private int currentQuestionNumber = 0;
    private int questionCount = 1;
    private final Question[] questionsLF1 = com.example.learnstuffapp.Questions.getQuestionsLF1();
    private final Question[] questionsLF2 = Questions.getQuestionsLF2();
    private final Question[] questionsLF3 = Questions.getQuestionsLF3();
    private final Question[] questionsLF4 = Questions.getQuestionsLF4();
    private final Question[] questionsLF5 = Questions.getQuestionsLF5();
    private final Question[] questionsLF6 = Questions.getQuestionsLF6();
    private final Question[] questionsLF7 = Questions.getQuestionsLF7();

    private final Question[] questionsLF8 = Questions.getQuestionsLF8();
    private final Question[] questionsLF9 = Questions.getQuestionsLF9();
    private final Question[] questionsLF10 = Questions.getQuestionsLF10();
    private final Question[] questionsLF11 = Questions.getQuestionsLF11();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        btnTitleLF = findViewById(R.id.btnTitleLF);
        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);
        btnTitleLF.setText(Learnfield.getLearnfieldTitleByNumber(lernfeld));
        switch (lernfeld) {
            case "1": QuestionsArray = questionsLF1; break;
            case "2": QuestionsArray = questionsLF2; break;
            case "3": QuestionsArray = questionsLF3; break;
            case "4": QuestionsArray = questionsLF4; break;
            case "5": QuestionsArray = questionsLF5; break;
            case "6": QuestionsArray = questionsLF6; break;
            case "7": QuestionsArray = questionsLF7; break;
            case "8": QuestionsArray = questionsLF8; break;
            case "9": QuestionsArray = questionsLF9; break;
            case "10": QuestionsArray = questionsLF10; break;
            case "11": QuestionsArray = questionsLF11; break;
        }

        List<Question> questionsList = Arrays.asList(QuestionsArray);

        Collections.shuffle(questionsList);

        QuestionsArray = questionsList.toArray(QuestionsArray);

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
        if (QuestionsArray[0].getOption3() != null) {cbs[2] = findViewById(R.id.checkBox3);}
        if (QuestionsArray[0].getOption4() != null) {cbs[3] = findViewById(R.id.checkBox4);}
        if (QuestionsArray[0].getOption5() != null) {cbs[4] = findViewById(R.id.checkBox5);}
        if (QuestionsArray[0].getOption6() != null) {cbs[5] = findViewById(R.id.checkBox6);}
        txtAnswerNr = findViewById(R.id.textViewAnswerNr);
        textViewQuestionCount = findViewById(R.id.textViewQuestionCount);
        txtLernfeld = findViewById(R.id.textLernfeld);
        btn1 = findViewById(R.id.button1);
        //btnGetLernfeld = findViewById(R.id.btnGetLernfeld);

        if (QuestionsArray[currentQuestionNumber].getOption3().equals("")) {cbs[2].setVisibility(CheckBox.INVISIBLE);}
        if (QuestionsArray[currentQuestionNumber].getOption4().equals("")) {cbs[3].setVisibility(CheckBox.INVISIBLE);}
        if (QuestionsArray[currentQuestionNumber].getOption5().equals("")) {cbs[4].setVisibility(CheckBox.INVISIBLE);}
        if (QuestionsArray[currentQuestionNumber].getOption6().equals("")) {cbs[5].setVisibility(CheckBox.INVISIBLE);}

        txtQuestion.setText(QuestionsArray[0].getQuestion());

        cbs[0].setText(QuestionsArray[0].getOption1());
        cbs[1].setText(QuestionsArray[0].getOption2());
        if (QuestionsArray[0].getOption3() != null){cbs[2].setText(QuestionsArray[0].getOption3());}
        if (QuestionsArray[0].getOption4() != null){cbs[3].setText(QuestionsArray[0].getOption4());}
        if (QuestionsArray[0].getOption5() != null){cbs[4].setText(QuestionsArray[0].getOption5());}
        if (QuestionsArray[0].getOption6() != null){cbs[5].setText(QuestionsArray[0].getOption6());}


        textViewQuestionCount.setText("Question: " + questionCount + "/" + QuestionsArray.length);
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
        for (int i = 0; i < QuestionsArray[currentQuestionNumber].getAnswerNrs().length; i++) {
            if (QuestionsArray[currentQuestionNumber].getAnswerNrs()[i]) {
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

        if (currentQuestionNumber < QuestionsArray.length) {
            currentQuestionNumber++;
            questionCount++;
            textViewQuestionCount.setText("Question: " + questionCount + "/" + QuestionsArray.length);
            txtQuestion.setText(QuestionsArray[currentQuestionNumber].getQuestion());

            cbs[2].setVisibility(CheckBox.VISIBLE);
            cbs[3].setVisibility(CheckBox.VISIBLE);
            cbs[4].setVisibility(CheckBox.VISIBLE);
            cbs[5].setVisibility(CheckBox.VISIBLE);

            if (QuestionsArray[currentQuestionNumber].getOption3().equals("")) {cbs[2].setVisibility(CheckBox.INVISIBLE);}
            if (QuestionsArray[currentQuestionNumber].getOption4().equals("")) {cbs[3].setVisibility(CheckBox.INVISIBLE);}
            if (QuestionsArray[currentQuestionNumber].getOption5().equals("")) {cbs[4].setVisibility(CheckBox.INVISIBLE);}
            if (QuestionsArray[currentQuestionNumber].getOption6().equals("")) {cbs[5].setVisibility(CheckBox.INVISIBLE);}

            //TODO: Optionenarrays machen!
            cbs[0].setText(QuestionsArray[currentQuestionNumber].getOption1());
            cbs[1].setText(QuestionsArray[currentQuestionNumber].getOption2());
            cbs[2].setText(QuestionsArray[currentQuestionNumber].getOption3());
            cbs[3].setText(QuestionsArray[currentQuestionNumber].getOption4());
            cbs[4].setText(QuestionsArray[currentQuestionNumber].getOption5());
            cbs[5].setText(QuestionsArray[currentQuestionNumber].getOption6());

            btn1.setText("Confirm");

        }else {
            //finishQuiz();
            finish();
        }

    }

    private void updateTxtAnswerNr(){
        int richtig = 0;
        for (int i = 0; i < QuestionsArray[currentQuestionNumber].getAnswerNrs().length; i++) {
            if (QuestionsArray[currentQuestionNumber].getAnswerNrs()[i]) {
                richtig++;
            }
        }
        txtAnswerNr.setText("Anzahl richtige Antworten: " + richtig + "\nanswers["+currentQuestionNumber+"] = " + Arrays.toString(QuestionsArray[currentQuestionNumber].getAnswerNrs()));

    }


    private void checkAnswer() {
        boolean[] userAnswerNr = new boolean[QuestionsArray[currentQuestionNumber].getAnswerNrs().length];
        for (int i = 0; i < userAnswerNr.length; i++) {
            userAnswerNr[i] = cbs[i].isChecked();
        }
        for (int i = 0; i < QuestionsArray[currentQuestionNumber].getAnswerNrs().length; i++) {
            boolean answerNr = QuestionsArray[currentQuestionNumber].getAnswerNrs()[i];
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
            if (QuestionsArray[current].getAnswerNrs()[i]) {
                cbs[i].setTextColor(Color.GREEN);
            } else {
                cbs[i].setTextColor(Color.RED);
            }
        }

        if (questionCount < QuestionsArray.length) {
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