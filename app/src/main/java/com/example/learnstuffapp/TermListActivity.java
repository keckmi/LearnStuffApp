package com.example.learnstuffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class TermListActivity extends AppCompatActivity {

    public static final String LERNFELD = "LERNFELD";
    public static String CHAPTER = "CHAPTER";

    String [] kapitelLF;
    private final String [] kapitelLFYetUnpost = Terms.getKapitelLFYetUnpost();

    private final String [] kapitelLF1 = Terms.getKapitelLF1();
    private final String [] kapitelLF2 = Terms.getKapitelLF2();
    private final String [] kapitelLF3 = Terms.getKapitelLF3();


    private final Term[][] termsLF1 = Terms.getTermsLF1();
    private final Term[][] termsLF2 = Terms.getTermsLF2();
    private final Term[][] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF5 = Terms.getTermsLF5();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF8 = Terms.getTermsLF8();
    private final Term[] termsLF9 = Terms.getTermsLF9();
    private final Term[] termsLF10a = Terms.getTermsLF10a();
    private final Term[] termsLF11 = Terms.getTermsLF11();
    private final Term[] termsLF12 = Terms.getTermsLF12();
    private final Term[] termsLFWK = Terms.getTermsLFWK();
    private final Term[] termsLFGK = Terms.getTermsLFGK();

    //VERÄNDERUNG

    //Term[] termsLF2c1 = termsLF2[0][];

    Button titleLF;
    ListView termListView;

    Spinner spinner;

    /*String [] bands = {"Alle Bands", "Hayley", "Avril", "Taylor"};
    String [] hayley = {"Hayley", "Hayley", "Hayley"};
    String [] avril = {"Avril", "Avril", "Avril"};
    String [] taylor = {"Taylor", "Taylor", "Taylor"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_list);

        titleLF = findViewById(R.id.btnTitleLF);
        termListView = (ListView) findViewById(R.id.termListView);

        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);
        //int chapter = Integer.parseInt(intent.getStringExtra(CHAPTER));

        titleLF.setText(Learnfield.getLearnfieldTitleByNumber(lernfeld));

        switch (lernfeld) {
            case "1":
                kapitelLF = kapitelLF1; break;
            case "2":
                kapitelLF = kapitelLF2; break;
            case "3":
                kapitelLF = kapitelLF3; break;
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10a":
            case "11":
            case "12":
            case "WK":
            case "GK":
                kapitelLF = kapitelLFYetUnpost; break;
        }

        String [] kapitel = new String [1+kapitelLF.length];
        kapitel[0] ="▼ Alle Kapitel";
        for (int i = 0; i < kapitelLF.length; i++) {
            kapitel[1+i] = kapitelLF[i];
        }

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(TermListActivity.this, R.layout.item_file/*android.R.layout.simple_spinner_item*/, kapitel);
        spinnerAdapter.setDropDownViewResource(R.layout.item_file/*android.R.layout.simple_spinner_dropdown_item*/);
        spinner.setAdapter(spinnerAdapter);

        LinkedList<String> termList = termList(lernfeld);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, termList);
        termListView.setAdapter(arrayAdapter);
        termListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Log.i("LIST_VIEW", "Item is clicked @ position " + position);
                String /*fruit*/ term = parent.getItemAtPosition(position).toString();
                Intent i = new Intent(TermListActivity.this, TermActivity.class);
                i.putExtra(TermActivity.LERNFELD, lernfeld);
                i.putExtra(TermActivity.CHAPTER, getChapter(lernfeld, term));
                i.putExtra(TermActivity.TERM, /*fruit*/term);
                startActivity(i);

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                /*String value = parent.getItemAtPosition(position).toString();
                Toast.makeText(TermListActivity.this, value, Toast.LENGTH_SHORT).show();*/
                String chapter = parent.getItemAtPosition(position).toString();
                System.out.println(position);

                CHAPTER = Integer.toString(position);

                //termsLF2[position-1][];

                System.out.println(position);

                if (position == 0) {
                    termListView.setAdapter(arrayAdapter);
                }

                if (position > 0) {
                    showTermChapterList(lernfeld, position - 1);
                }

                /*if (position.equals("3")) {
                    termListView.setAdapter(termChapterAdapter);
                }*/

                //kapitel[position]

                /*for(int i = -1; i < kapitel.length; i++) {
                   if (chapter.equals(kapitel[i])) {
                       position =
                   }
                }**/


            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void /*LinkedList<String>*/ showTermChapterList (String lernfeld, int chapter){
        LinkedList<String> termList = new LinkedList<>();
        Term [][] terms2D;
        //Term [] termsChapter;
        switch(lernfeld) {
            case "1": terms2D = termsLF1; break;
            case "2": terms2D = termsLF2; break;
            case "3": terms2D = termsLF3; break;
            /*case "4": terms2D = termsLF4; break;
            case "6": terms2D = termsLF6; break;
            case "7": terms2D = termsLF7; break;
            case "8": terms2D = termsLF8; break;
            case "9": terms2D = termsLF9; break;*/
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }

        //termsChapter = terms2D[chapter];

        //System.out.println(chapter);

        //System.out.println(Arrays.toString(terms2D[chapter]));

        for (int i = 0; i < terms2D[chapter].length; i++) {
            termList.add(terms2D[chapter][i].getTerm());
        }

        ArrayAdapter<String> termsChapterAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, termList);

        //termListView.setAdapter(termChapterAdapter);

        /*ArrayAdapter<String> hayleyAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, hayley);

        ArrayAdapter<String> avrilAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, avril);

        ArrayAdapter<String> taylorAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, taylor);*/

        termListView.setAdapter(termsChapterAdapter);

        //return termList;

    }

    private LinkedList<String> termList (String lernfeld){
        LinkedList<String> termList = new LinkedList<String>();
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
            case "8": terms = termsLF8; break;
            case "9": terms = termsLF9; break;
            case "10a": terms = termsLF10a; break;
            case "11": terms = termsLF11; break;
            case "12": terms = termsLF12; break;
            case "WK": terms = termsLFWK; break;
            case "GK": terms = termsLFGK; break;
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }

        if (lernfeld.equals("1") || lernfeld.equals("2") || lernfeld.equals("3")){
            for (int i = 0; i < terms2D.length; i++) {
                for (int j = 0; j < terms2D[i].length; j++) {
                    termList.add(terms2D[i][j].getTerm());
                }
            }
        }

        for (int i = 0; i < terms.length; i++) {
            termList.add(terms[i].getTerm());
        }
        return termList;
    }

    private String getChapter (String lernfeld, String term) {
        int chapterNr = 0;
        String chapter = "";
        Term [][] terms2D = new Term[0][];
        switch(lernfeld) {
            case "1": terms2D = termsLF1; break;
            case "2": terms2D = termsLF2; break;
            case "3": terms2D = termsLF3; break;
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10a":
            case "11":
            case "12":
            case "GK":
            case "WK":
                chapter = "Chapter yet unknown"; break;
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }

        if (lernfeld.equals("1") || lernfeld.equals("2") || lernfeld.equals("3")){
            for (int i = 0; i < terms2D.length; i++) {
                for (int j = 0; j < terms2D[i].length; j++) {
                    if (term.equals(terms2D[i][j].getTerm())) {
                        chapterNr = i;
                    }
                }
            }
            if (lernfeld.equals("1")) {chapter = kapitelLF1[chapterNr];}
            if (lernfeld.equals("2")) {chapter = kapitelLF2[chapterNr];}
            if (lernfeld.equals("3")) {chapter = kapitelLF3[chapterNr];}
        }

        return chapter;
    }

}