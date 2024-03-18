## News
18 Mar 24: APK File you can find in app > realease  

*more terms and questions are added from time to time*  

14 Sep: learnfields 10a, 11 & 12 added  
6 Jun: gemeinschaftskunde added  
5 Jun: wirtschaftskunde added  
23, 18 & 05 February: pics added  
25 January: chapters to new main function "Lexicon", yet not all posted in,  

# LearnStuffApp

inspiriert durch Coding in Flow, Multiple Choice Quiz App mit SQLite Integration  
Part 1: https://www.youtube.com/watch?v=PiCZQg4mhBQ&list=PLrnPJCHvNZuDCyg4Usq2gHMzz6_CiyQO7&index=1&t=525s  
Playlist: https://www.youtube.com/playlist?list=PLrnPJCHvNZuDCyg4Usq2gHMzz6_CiyQO7  

## Installation

APK File you can find in app > release  
download it and deploy it on your android

### Installation via Android Studio

download von github  
öffnen in android studio  

usb debugging auf handy in den entwickleroptionen aktivieren  
...Öffne die Einstellungen-App.  
...Scrolle nach unten bis zum Abschnitt Telefoninfo.  
...Rufe die Softwareinformationen auf.  
...Hier findest Du ein Eintrag Buildnummer.  
...Nachdem Du einige Male auf die Buildnummer gedrückt hast, folgt die Bestätigung „Der Entwicklermodus wurde aktiviert“.  
...nun findest du die entwickleroptionen unter einstellungen > system > erweitert > entwickleroptionen  
...hier kannst du das usb-debugging aktivieren  
...(dies kann bei deinem handy von meinem abweichen, falls das bei dir nicht so ist, findest du bestimmt im internet hilfe)  
...(dazu könntest du den handy namen und/oder die genaue modelbezeichnung und/oder den namen deines handybetriebssystems,)  
...(die du in den einstellungen > telefoninfo findest zusammen mit "entwickleroptionen aktivieren" suchen)  

handy in usb loch stecken  
nun finde ich in meinen benachrichtigungen  
...(die ich öffnen kann, indem ich von ganz oben am handy bildschirm nach unten streich)  
die meldung: Gerät wird über USB aufgeladen, für weitere Optionen tippen, die ich antippe  
in folgender auswahl wähle ich PTP  
ich werde gefragt ob ich USB-Debugging erlauben möchte, was ich bestätige  

in android studio ändert sich die Anzeige in dem länglichen kästchen mit runden ecken,  
das etwas rechts oben von der Bildschirmmitte ist, von "no Devices" entweder direkt zu dem namen deines handys  
oder zu "Device". Vielleicht kannst du etwas nachhelfen, indem du auf das kästchen klickst.  
klicke nun auf das grüne dreieck rechts neben dem kästchen.  

nach einigen Momenten sollte nun die App auf deinem Handy erscheinen.  
Sie müsste sich nun außerdem auch unter deinen Apps befinden.  
Du kannst das Handy nun von deinem Computer trennen.  

## Lernstoff hinzufügen

**Bild hinzufügen:**  
bisher nur eines je fachbegriff vorgesehen  
Bildname sollte nur kleinbuchstaben, keine leerzeichen haben  
Bild kopieren nach: res: drawable   
Javadatei TermActivity öffnen,  
runterscrollen bis zur methode private void setPicIfIs(String term)  
eine der if-anweisungs-blöcke kopieren und einfügen  
namen des fachbegriffes des bild erhalten soll in ("...") schreiben,  
und name des Bildes in zweiter zeile nach R.drawable.,  
sowie höhe des Bildes in die dritte zeile
(wenn höhenangabe die des bildes bei max breite übersteigt,  
wird es nicht gestreckt, sondern es entsteht freier raum ober und unterhalb)  

**Fachbegriff hinzufügen:**  
Javadatei "Terms" öffnen,  
zum entsprechenden Lernfeld scrollen  
jedem Lernfeld entspricht ein  
public static Term[] termsLF = { ... };  
bspw: dem Lernfeld 2 der public static Term[] termsLF2 = { ... }  
innerhalb dieser { ... }:  
new Term("Fachbegriffsbezeichnung", "Fachbegriffsbeschreibung")  
hinzufügbar, wobei zeilenumbrüche als \n und abschnitte als \n\n zu schreiben sind  

**Quizfrage hinzufügen:**  
Javadatei Questions öffnen,  
zum entsprechenden Lernfeld scrollen  
jedem Lernfeld entspricht ein  
private static Question[] questionsLF = { .. }  
bspw: dem Lernfeld 2 der private static Question[] questionsLF2 = { ... }  
innerhalb dieser { ... }:  
new Question ("Frage", "Antwortoption1", "Antwortoption2", "", "", "", "", answersLF[...])  
hinzufügbar, wobei mindestens zwei Antwortoptionen gegeben sein sollten  
maximal sind sechs gebbar, wobei für jede die leer bleibt "", zu schreiben ist.  
im anschluss sollte nicht vergessen werden in die [...] von answers[...] oder answersLF[...] eine nummer zu schreiben  
  
jedem Lernfeld entspricht ein  
private static boolean answersLF[][] = { {...}, {...}, ... }  
bspw: dem Lernfeld 2 der private static boolean answers[][] = { {...}, {...}, ... }  
bspw: dem Lernfeld 3 der private static boolean answersLF3[][] = { {...}, {...}, ... }  
innerhalb dieser { ... } in diesen { ... }:  
ist je richtiger antwortoption ein "true" und je falscher antwortoption ein "false" zu schreiben  
gibt es weniger antwortoptionen als sechs, sind für die leeren antwortoptionen "false" zu schreiben  
die reihenfolge ist zu beachten:  
lautet die new Question ("Frage", "Antwortoption1", "Antwortoption2", "", "", "", "", answersLF[...])  
und ist die Antwortoption1 richtig und die Antwortoption2 falsch,  
hat das private static boolean answersLF[][] = { {...}, {...}, ... , {true, false, false, false, false, false} } zu lauten  
  
nun zurück zur nummer, die nicht vergessen werden sollte in die answers[...] oder answersLF[...] geschrieben zu werden  
diese entspricht der stelle an der die { ... } mit den informationen welche antworten richtig sind  
in dem klammersorium aller dieser dieses Lernfeldes steht.  
befindet sie sich an dritter stelle: private static boolean answersLF[][] = { {...}, {...}, {true, false, false, false, false, false} },  
ist diese die 2. !hier wird bei 0 angefangen zu zählen!  
answers[...] oder answersLF[...] wäre hier also answers[2] oder answersLF[2]  
  
ich kann empfehlen die Liste einfach so weiter fortzusetzen  
dabei also je die nächst folgende nummer zu verwenden  
  
wobei anzumerken wäre, dass erweiterungen von mir folgen,  
die entsprechende Änderungen zur Folge haben könnten  
wenn ich bspw die neuen Quizfragen 20-30 des Lernfeldes 2 hinzufüge  
du sieh dir runter lädtst,  
aber zuvor bereits neue Quizfragen 20-40 selber hinzugefügt hast  
müssen die einen oder anderen umnummerriert werden  
  
wobei nazumerken werde, dass ich möglicherweise noch auf eine bessere  
idee komme diesen leichtfertigen murks zu programmieren  
ich habe nur auf die schnelle fertig werden wollen,  
da ich das programm zum lernen für die zwischenprüfung nutzen will, die bald ist  

## Ausblick und Feedback

Auswahl Lernfelder 1 - 3 in Rubrik Aufdecken schmieren ab  
Ursache und Lösung bekannt, Umsetzung folgt irgendwann  

Ich würde eine Datenbank anschließen, die über ein geeignetes Frontend füllbar ist.  
Diese würde die Fachbegriffe und Quizfragen, die direkt im Code stehen ersetzen.  

Von Rol Kam kam die Idee für ein Karteikartenbox System, bei dem die Fachbegriffe,   
die bereits oft genug richtig beantwortet werden konnten nicht mehr, oder selten vorkommen,  
solche die seltener richtig beantwortet wurden hingegen "nach vorne rutschen", also öfter angezeigt werden,  
die Überprüfung, ob man den Fachbegriff konnte, sollte durch Selbstkontrolle erfolgen.  
Ich würde diese Idee auch gerne hinzufügen.  

Weitere Ideen von dir nehme ich gerne.
