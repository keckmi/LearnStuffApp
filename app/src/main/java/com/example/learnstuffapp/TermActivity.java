package com.example.learnstuffapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
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
    private final Term[] termsLF10a = Terms.getTermsLF10a();
    private final Term[] termsLF11 = Terms.getTermsLF11();
    private final Term[] termsLF12 = Terms.getTermsLF12();
    private final Term[][] termsLFWK = Terms.getTermsLFWK();
    private final Term[][] termsLFGK = Terms.getTermsLFGK();

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
        content = content.replace("\n", "<br>");
        //System.out.println(content==null);
        titleLF.setText(Learnfield.getLearnfieldTitleByNumber(lernfeld));
        titleChapter.setText(chapter);
        txtTerm.setText(term);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txtContent.setText(Html.fromHtml(content, 5));
        }
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
            case "8": terms = termsLF8; break;
            case "9": terms = termsLF9; break;
            case "10a": terms = termsLF10a; break;
            case "11": terms = termsLF11; break;
            case "12": terms = termsLF12; break;
            case "WK": terms2D = termsLFWK; break;
            case "GK": terms2D = termsLFGK; break;
            default:
                throw new IllegalStateException("Unexpected value: " + lernfeld);
        }
        if (lernfeld.equals("1") || lernfeld.equals("2") || lernfeld.equals("3") || lernfeld.equals("WK") ||
            lernfeld.equals("GK")) {
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
            imgView.getLayoutParams().height=400;
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
        if (term.equals("Strukturierte Verkabelung")) {
            imgView.setImageResource(R.drawable.drei_stufige_verkabelungshierarchie);
            imgView.getLayoutParams().height=600;
        }
        if (term.equals("Internet Netzwerk Aufbau")) {
            imgView.setImageResource(R.drawable.internet_netzwerk_aufbau);
            imgView.getLayoutParams().height=1300;
        }
        if (term.equals("IPv4 Subnetting")) {
            imgView.setImageResource(R.drawable.ipv4subnetting);
            imgView.getLayoutParams().height=1800;
        }
        if (term.equals("Tilt, Swivel & Pivot")) {
            imgView.setImageResource(R.drawable.tiltswivelpivot);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Arbeitszeugnis")) {
            imgView.setImageResource(R.drawable.arbeitszeugnis);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("Anforderungsspezifikation")) {
            imgView.setImageResource(R.drawable.anforderungsspezifikation);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("Prozess der Anforderungsspezifikaion")) {
            imgView.setImageResource(R.drawable.prozessanforderungsspezifikation);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("Prozessanalyse Schritte")) {
            imgView.setImageResource(R.drawable.prozessanalyse_schritte);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Projekt Beispiele")) {
            imgView.setImageResource(R.drawable.projekte_beispiele);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Projekt Phasen")) {
            imgView.setImageResource(R.drawable.projekt_phasen);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Benutzerschnitstellen in den Kontext der Softwarearchitektur einordnen")) {
            imgView.setImageResource(R.drawable.schnitstellen_software);
            imgView.getLayoutParams().height=600;
        }
        if (term.equals("Drei-Schichten-Architektur")) {
            imgView.setImageResource(R.drawable.drei_schichten_architektur);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Client-Server-Architektur")) {
            imgView.setImageResource(R.drawable.client_server_architektur);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Model View Controller")) {
            imgView.setImageResource(R.drawable.model_view_controller);
            imgView.getLayoutParams().height=400;
        }
        if (term.equals("User Experience UX Design")) {
            imgView.setImageResource(R.drawable.uxdesign);
            imgView.getLayoutParams().height=400;
        }
        if (term.equals("Den Designprozess und Designwerkzeuge präsentieren")) {
            imgView.setImageResource(R.drawable.designprozess);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Reine Projektorganisation")) {
            imgView.setImageResource(R.drawable.reine_projektorganisation);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("Stabsprojektorganisation")) {
            imgView.setImageResource(R.drawable.stabsprojektorganisation);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Matrixprojektorganisation")) {
            imgView.setImageResource(R.drawable.matrixprojektorganisation);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("ereignisorientierte Prozesskette EPK")) {
            imgView.setImageResource(R.drawable.ereignisgesteuerte_prozesskette);
            imgView.getLayoutParams().height=700;
        }
        if (term.equals("Projektrisiken bewerten")) {
            imgView.setImageResource(R.drawable.projektrisiken_bewerten);
            imgView.getLayoutParams().height=500;
        }
        if (term.equals("Projektorganisationsformen")) {
            imgView.setImageResource(R.drawable.projektorganisationsformen);
            imgView.getLayoutParams().height=1500;
        }
        if (term.equals("EU Länder")) {
            imgView.setImageResource(R.drawable.eulaeder);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("Euro Länder")) {
            imgView.setImageResource(R.drawable.eurolaender);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Marktpreis grafisch")) {
            imgView.setImageResource(R.drawable.marktpreis);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Optimale Bestellmenge")) {
            imgView.setImageResource(R.drawable.optimale_bestellmenge);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("Bilanz")) {
            imgView.setImageResource(R.drawable.bilanz);
            imgView.getLayoutParams().height=600;
        }
        if (term.equals("Einfacher Buchungssatz")) {
            imgView.setImageResource(R.drawable.einfacher_buchungssatz);
            imgView.getLayoutParams().height=1500;
        }
        if (term.equals("Break Even Point")) {
            imgView.setImageResource(R.drawable.breakevenpoint);
            imgView.getLayoutParams().height=800;
        }
        if (term.equals("Risikoanalyse")) {
            imgView.setImageResource(R.drawable.risikoanalyse);
            imgView.getLayoutParams().height=4500;
        }
        if (term.equals("Konjunkturschwankungen")) {
            imgView.setImageResource(R.drawable.konjunkturschwankungen);
            imgView.getLayoutParams().height=1300;
        }
        if (term.equals("Kupferkabel Verdrill & Schirm")) {
            imgView.setImageResource(R.drawable.kupferkabel_verdrill_schirm);
            imgView.getLayoutParams().height=1000;
        }
        if (term.equals("Multi & Singlemode")) {
            imgView.setImageResource(R.drawable.multi_singlemode);
            imgView.getLayoutParams().height=1300;
        }
        if (term.equals("Betriebsabrechnungsbogen")) {
            imgView.setImageResource(R.drawable.betriebsabrechnungsbogen);
            imgView.getLayoutParams().height=2200;
        }

    }
}