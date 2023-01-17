package com.example.learnstuffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class TermListActivity extends AppCompatActivity {

    public static final String LERNFELD = "LERNFELD";

    private final Term[] termsLF2 = Terms.getTermsLF2();
    private final Term[] termsLF3 = Terms.getTermsLF3();
    private final Term[] termsLF4 = Terms.getTermsLF4();
    private final Term[] termsLF6 = Terms.getTermsLF6();
    private final Term[] termsLF7 = Terms.getTermsLF7();
    private final Term[] termsLF9 = Terms.getTermsLF9();

    Button titleLF;
    ListView termListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_list);

        titleLF = findViewById(R.id.btnTitleLF);

        Intent intent = getIntent();
        String lernfeld = intent.getStringExtra(LERNFELD);

        titleLF.setText(lernfeld);

        LinkedList<String> termList = termList(lernfeld);

        termListView = (ListView) findViewById(R.id.termListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.activity_list_view, R.id.txtText, /*fruitList*/termList);
        termListView.setAdapter(arrayAdapter);

        termListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("LIST_VIEW", "Item is clicked @ position " + position);
                String /*fruit*/ term = parent.getItemAtPosition(position).toString();
                Intent i = new Intent(TermListActivity.this, TermActivity.class);
                i.putExtra(TermActivity.LERNFELD, intent.getStringExtra(LERNFELD));
                i.putExtra(TermActivity.TERM, /*fruit*/term);
                startActivity(i);

            }
        });
    }

    private LinkedList<String> termList (String lernfeld){
        LinkedList<String> termList = new LinkedList<String>();
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
            termList.add(terms[i].getTerm());
        }
        return termList;
    }
}