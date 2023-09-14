package com.example.learnstuffapp;

public class Learnfield {


    static String getLearnfieldTitleByNumber(String learnfield) {
        switch (learnfield) {
            case "1":
                learnfield = "LF 1: Das Unternehmen und die eigene Rolle im Betrieb beschreiben";
                break;
            case "2":
                learnfield = "LF2: Arbeitsplätze nach Kundenwunsch anpassen";
                break;
            case "3":
                learnfield = "LF 3: Clients in Rechnernetzwerke einbinden";
                break;
            case "4":
                learnfield = "LF 4: Schutzbedarfsanalyse im eigenen Arbeitsbereich durchführen";
                break;
            case "5":
                learnfield = "LF 5: Software zur Verwaltung von Daten anpassen";
                break;
            case "6":
                learnfield = "LF 6: Serviceanfragen bearbeiten";
                break;
            case "7":
                learnfield = "LF 7: Cyberphysische Systeme ergänzen";
                break;
            case "8":
                learnfield = "LF 8: Daten systemübergreifend bereitstellen";
                break;
            case "9":
                learnfield = "LF 9: Netzwerkbereitstellung nach unterschiedlichen Unternehmensanforderungen unterscheiden";
                break;
            case "10a":
                learnfield = "Benutzerschnitstellen gestalten und entwickeln";
                break;
            case "11":
                learnfield = "Funktionalitäten in Anwendungen realisieren";
                break;
            case "12":
                learnfield = "Kundenspezifische Anwendungsentwicklung durchführen";
            case "WK":
                learnfield = "Wirtschaftskunde";
                break;
            case "GK":
                learnfield = "Gemeinschaftskunde";
                break;
        }
        return learnfield;
    }
}
