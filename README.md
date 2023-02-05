# News
more terms and questions are added from time to time

05 February: pics added to zuschlags, rückwärts & gewinnkalkulation
25 January: chapters to new main function "Lexicon", yet not all posted in,
will be slowly done trugh learning process for next exam till end of april,
17 January: new main function "Lexicon"

# LearnStuffApp

inspiriert durch Coding in Flow, Multiple Choice Quiz App mit SQLite Integration  
Part 1: https://www.youtube.com/watch?v=PiCZQg4mhBQ&list=PLrnPJCHvNZuDCyg4Usq2gHMzz6_CiyQO7&index=1&t=525s  
Playlist: https://www.youtube.com/playlist?list=PLrnPJCHvNZuDCyg4Usq2gHMzz6_CiyQO7  

## Installation

download von gitlab  
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

Fachbegriff hinzufügen:  
Javadatei "Terms" öffnen,  
zum entsprechenden Lernfeld scrollen  
jedem Lernfeld entspricht ein  
public static Term[] termsLF = { ... };  
bspw: dem Lernfeld 2 der public static Term[] termsLF2 = { ... }  
innerhalb dieser { ... }:  
new Term("Fachbegriffsbezeichnung", "Fachbegriffsbeschreibung")  
hinzufügbar, wobei zeilenumbrüche als \n und abschnitte als \n\n zu schreiben sind  

Quizfrage hinzufügen:  
Javadatei Schoolstuff öffnen,  
zum entsprechenden Lernfeld scrollen  
jedem Lernfeld entspricht ein  
private static Question[] questionsLF = { .. }  
bspw: dem Lernfeld 2 der private static Question[] questionsLF2 = { ... }  
innerhalb dieser { ... }:  
new Question ("Frage", "Antwortoption1", "Antwortoption2", "", "", "", "", answersLF[...])  
hinzufügbar, wobei mindestens zwei Antwortoptionen gegeben sein sollten  
maximal sind sechs gebbar, wobei für jede die leer bleibt "", zu schreiben ist.  
im anschluss sollte nicht vergessen werden in die [...] von answers[...] oder answersLF[...] eine nummer zu schreiben  
...  
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
...  
nun zurück zur nummer, die nicht vergessen werden sollte in die answers[...] oder answersLF[...] geschrieben zu werden  
diese entspricht der stelle an der die { ... } mit den informationen welche antworten richtig sind  
in dem klammersorium aller dieser dieses Lernfeldes steht.  
befindet sie sich an dritter stelle: private static boolean answersLF[][] = { {...}, {...}, {true, false, false, false, false, false} },  
ist diese die 2. !hier wird bei 0 angefangen zu zählen!  
answers[...] oder answersLF[...] wäre hier also answers[2] oder answersLF[2]  
...  
ich kann empfehlen die Liste einfach so weiter fortzusetzen  
dabei also je die nächst folgende nummer zu verwenden  
...  
wobei anzumerken wäre, dass erweiterungen von mir folgen,  
die entsprechende Änderungen zur Folge haben könnten  
wenn ich bspw die neuen Quizfragen 20-30 des Lernfeldes 2 hinzufüge  
du sieh dir runter lädtst,  
aber zuvor bereits neue Quizfragen 20-40 selber hinzugefügt hast  
müssen die einen oder anderen umnummerriert werden  
...  
wobei nazumerken werde, dass ich möglicherweise noch auf eine bessere  
idee komme diesen leichtfertigen murks zu programmieren  
ich habe nur auf die schnelle fertig werden wollen,  
da ich das programm zum lernen für die zwischenprüfung nutzen will, die bald ist  

## Ausblick und Feedback

Ich würde eine Datenbank anschließen, die über ein geeignetes Frontend füllbar ist.  
Diese würde die Fachbegriffe und Quizfragen, die direkt im Code stehen, was ein Graus ist, ersetzen.  

Von Rol Kam kam die Idee für ein Karteikartenbox System, bei dem die Fachbegriffe,   
die bereits oft genug richtig beantwortet werden konnten nicht mehr, oder selten vorkommen,  
solche die seltener richtig beantwortet wurden hingegen "nach vorne rutschen", also öfter angezeigt werden,  
die Überprüfung, ob man den Fachbegriff konnte, sollte durch Selbstkontrolle erfolgen.  
Ich würde diese Idee auch gerne hinzufügen.  

Weitere Ideen von dir nehme ich gerne.


## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/pp-ausbildung/zweier/learnstuffapp.git
git branch -M main
git push -uf origin main
```

## Integrate with your tools

- [ ] [Set up project integrations](https://gitlab.com/pp-ausbildung/zweier/learnstuffapp/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

# Editing this README

When you're ready to make this README your own, just edit this file and use the handy template below (or feel free to structure it however you want - this is just a starting point!). Thank you to [makeareadme.com](https://www.makeareadme.com/) for this template.

## Suggestions for a good README
Every project is different, so consider which of these sections apply to yours. The sections used in the template are suggestions for most open source projects. Also keep in mind that while a README can be too long and detailed, too long is better than too short. If you think your README is too long, consider utilizing another form of documentation rather than cutting out information.

## Name
Choose a self-explaining name for your project.

## Description
Let people know what your project can do specifically. Provide context and add a link to any reference visitors might be unfamiliar with. A list of Features or a Background subsection can also be added here. If there are alternatives to your project, this is a good place to list differentiating factors.

## Badges
On some READMEs, you may see small images that convey metadata, such as whether or not all the tests are passing for the project. You can use Shields to add some to your README. Many services also have instructions for adding a badge.

## Visuals
Depending on what you are making, it can be a good idea to include screenshots or even a video (you'll frequently see GIFs rather than actual videos). Tools like ttygif can help, but check out Asciinema for a more sophisticated method.

## Installation
Within a particular ecosystem, there may be a common way of installing things, such as using Yarn, NuGet, or Homebrew. However, consider the possibility that whoever is reading your README is a novice and would like more guidance. Listing specific steps helps remove ambiguity and gets people to using your project as quickly as possible. If it only runs in a specific context like a particular programming language version or operating system or has dependencies that have to be installed manually, also add a Requirements subsection.

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Contributing
State if you are open to contributions and what your requirements are for accepting them.

For people who want to make changes to your project, it's helpful to have some documentation on how to get started. Perhaps there is a script that they should run or some environment variables that they need to set. Make these steps explicit. These instructions could also be useful to your future self.

You can also document commands to lint the code or run tests. These steps help to ensure high code quality and reduce the likelihood that the changes inadvertently break something. Having instructions for running tests is especially helpful if it requires external setup, such as starting a Selenium server for testing in a browser.

## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.
