package com.example.learnstuffapp;

public class Schoolstuff {

    private static boolean answersLF1 [][] = {{true, false, false, false, false, false}, {false, true, false, false, false, false},{false, true, false, false, false, false},{true,false,false,false,false,false},{false, true, false, false, false, false},
            {true, false, false, false, false, false},{false, true, false, false, false, false},{true, false, false, false, false, false},{true, false, false, false, false, false},{true, false, false, false, false, false}};

    private static Question[] questionsLF1 = {
        new Question("Ein Organigramm zeigt den Leistungsaufbau eines Unternehmens","richtig","falsch", "","","","", answersLF1[0]),
        new Question("Eine Instanz ist die Geschäftsleitung des Unternehmens", "richtig", "falsch", "", "","","", answersLF1[1]),
        new Question("Ein integriertes Management bedeutet die Integration der unteren Leistungsebene", "richtig", "falsch", "","","","", answersLF1[2]),
        new Question("Ein Profitcenter ist eine Division im Unternehmen mit eigener Verantwortung","richtig","falsch","","","","",answersLF1[3]),
        new Question("Eine Stabstelle ist eine Ausbilderstelle im Unternehmen","richtig","falsch","","","","",answersLF1[4]),
        new Question("Beim Mehrliniensystem hat ein Mitarbeit mehrere unterschiedliche Aufgaben","richtig","falsch","","","","", answersLF1[5]),
        new Question("Eine Matrixorganisation ist weniger für Projektarbeit geeignet","richtig","falsch","","","","",answersLF1[6]),
        new Question("Ein Vorteil des Einliniensystems sind die klaren Zuständigkeiten","richtig","falsch","","","","",answersLF1[7]),
        new Question("Eine Stabstelle gehört zwar zur Leistungsstelle, hat aber i.d.R. nichts zu entscheiden","richtig","falsch","","","","",answersLF1[8]),
        new Question("Ein Nachtteil des Einliniensystems ist eine mögliche Überlastung von Instanzen","richtig","falsch","","","","",answersLF1[9])
    };
    private static boolean answers[][] = {{true, true, false, false, true, true}, {true, false, true, false, true, false}, {true, false, true, true, false, false},
            {false, true, true, false, false, true}, {true, false, true, true, false, true}, {true, false, false, false, false, false}, {true, false, true, false, false, false},
            {true, false, true, false, false, false}, {false, true, false, true, false, true}, {true, false, true, false, true, true}, {/*10:*/false, true, false, true, false, false},
            {false, true, true, true, true, true}, {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, false, false}, {true, false, true, false, false, false},
            {false, true, false, true, true, false}, {true, true, false, true, true, true},
            /*2.8*/{true, false, false, false, false, false}, {false, true, false, false, false, false}};
    private static Question[] questionsLF2 = {
            new Question("Green-IT",
                    "Hardware umweltfreundlich", "Arbeitsplätze flexibel umweltgerecht", "Computer auf Toilette",
                    "Joints rauchen während Arbeit", "Energiekosten sparen", "Lieferant sollte Altgeräte mitnehmen", answers[0]),
            new Question("Green-IT",
                    "Software energiesparsam", "Mit baren füßen tippen", "Mitarbeiterberatung zur Umweltfreundlichkeit",
                    "Abfall im eigenen Mund entsorgen", "Verbrauchsmaterial sparen", "kompostierbare Hardware", answers[1]),
            new Question("Wie veränderte sich der Arbeitsplatz?",
                    "Ergonomische Möbel", "Ein kostenloses IPad zum Tennisspielen", "Flexible Arbeitszeit",
                    "weniger Papiergebrauch", "Arbeitskatzen als Mitarbeiter", "Drucker als Bildschirme", answers[2]),
            new Question("Wie veränderte sich der Arbeitsplatz?",
                    "Kakteen als Sitzmöbel", "Mehr (Eigen)Verantwortung", "Datentausch per Funk",
                    "Kostenloser Vodka zur 'Wasserkühlung' vom 'PC' ;)", "Gar nich Kranich", "virtuelle Konferenzräume", answers[3]),
            new Question("Wie veränderte sich der Arbeitsplatz?",
                    "Projektteam mit Gruppenleiter hat von jedem Berreich einen", "fliegende Schreibtischstühle", "früher wanderte Projekt langsam von Abteilung zu Abteilung",
                    "Abteilungen und ihre Leiter gibt es so nicht mehr", "früher gab es mehr Beinfreiheit", "Berreiche sind bspw: Planer, Entwickler, Verknüpfer, Tester, Kundenkontakt",
                    answers[4]),
            new Question("Testquestion",
                    "Option 1", "Option 2", "", "", "", "", answers[5]),
            new Question("Lineare Tastatur",
                    "Umschaltpunkt nicht spürbar", "Umschaltpunkt definiert spürbares klickgeräusch", "durchgehend gleiches Druckgefühl",
                    "Druckgefühl variiert", "", "", answers[6]),
            new Question("Lineare Tastatur",
                    "Schaltweg: <2mm (schnell, kürzer)", "Schaltweg >2 (langsamer, länger)", "Bereich: Gaming",
                    "Bereich: Büro", "", "", answers[7]),
            new Question("Taktil Tastatur",
                    "Umschaltpunkt nicht spürbar", "Umschaltpunkt definiert spürbares klickgeräusch", "Schaltweg < 2mm",
                    "Schaltweg > 2mm", "Berreich: Gaming", "Bereich: Büro", answers[8]),
            new Question("Tastatur Leistungskriterien",
                    "Haltbarkeit", "Gleitfähigkeit", "max Tastenschläge bspw: 50 Mio Standart",
                    "politische Einstellung", "Tastananzahl", "porgrammierbare Tasten", answers[9]),
            new Question("Tastatur Leistungskriterien",
                    "Character", "Schaltpunkt", "Sternzeichen", "Kompatibilität", "Farbe", "Marke", answers[10]),
            new Question("Tastatur Leistungskriterien",
                    "Name", "Trackpad/point", "Beleuchtung", "Ergonomie", "Reinigung", "Hygiene", answers[11]),
            new Question("OLED Monitor",
                    "organic light emitting diodes", "ospheric lumiscence emulating druides", "verschiedene organische Halbleiterschichten werden angestromt und leuchten",
                    "ähnliche Schichten aus gezürnten Halbmetallegierungen werden erhitzt und magnetisiert", "teuer, dünner", "billig, fett", answers[12]),
            new Question("OLED Monitor",
                    "höhere Auslösung", "niedrigere Auflösung", "energiesparsamer", "mehr energieverbrauch", "hoher Kontrast", "Kontrast geringer", answers[13]),
            new Question("OLED Monitor",
                    "perfekte Kanten", "runde Kanten", "höhere max Helligkeit", "geringere Helligkeit", "", "", answers[14]),
            new Question("ACM",
                    "adaptive contrast management", "absolute competition moment", "anpassung von kontrast in sehr hellen / dunklen Szenen", "erpassung von totalen wettbewerben", null, null, answers[15]),
            new Question("Monitor Standart",
                    "20-25 Zoll", "24-27 Zoll", "1280x720 HD", "1920x1080 Full HD", "1-5ms Reaktionszeit", "4-8ms Reaktionszeit", answers[16]),
            new Question("Monitor Panel (Display, eigentlich Leuchtfläche) Standart ",
                    "Standart: TN","Standrt VA" ,"Standart: BU", "Video-High-End-PC: IPS", "Video-High-End-PC: PVA","Video-High-End-PC: MVA", answers[17]),
            new Question("Mit der Zuschlagskalkulation werden rechnerisch Angebotspreise entsprechend den Einstandspreisen, Handlungskosten und sonstigen Konditionen ermittelt",
                    "richtig", "falsch" ,"", "", "","", answers[18]),
            new Question("Je höher der Lieferrabatt, desto höher der Bezugspreis", "richtig", "falsch" ,"", "", "","", answers[19]),
    };
    private static boolean answersLF3[][] = {{false, false, true, false, true, true}, {true, false, false, false, false, false}, {false, true, true, false, false, false},
            {true, false, false, true, true, true}, {false, true, false, false, true, true}, {false, true, true, true, false, false}, {true, false, true, false, true, true}};
    private static Question[] questionsLF3 = {
            new Question("Strukturelle Verkabelung",
                    "Zimmerverkabelung, Sekundärverkabelung, Lichtwellenleiter, Kupferkabel",
                    "Geländeverkabelung, Tertiärverkabelung, Kupferkabel",
                    "Campusverkabelung, Primärverkabelung, Lichtwellenleiter",
                    "Etagenverkabelung, Teritärverkabelung, Kupferkabel",
                    "Stockwertsverteilung, Sekundärverkabelung, Lichtwellenleiter, Kupferkabel",
                    "Etagenverkabelung, Primärverkabelung, Lichtwellenleiter" ,answersLF3[0]),
            new Question("Kabel",
                    "Singlemode-Fasern bieten die höchsten Übertragungsraten",
                    "Multimode-Fasern haben Vitamine A, E, C, B1, B2, B6 und B12, Niacin, Folsäure, Pantothensäure und Biotin. Vitamin D gehört nicht dazu, K nur selten.",
                    "Lichtwellenleiter haben immer einen Kern aus Glas",
                    "Glas hat immer einen Kern aus Lichtwellenleiter",
                    "Multimode-Fasern erlauben höhere Übertragungsraten, da mehrere Modi gleichzeitig ausbreitungsfähig sind ",
                    "Singlemode-Fasern eignen sich bessonders gut zum Verzehr bei windigem Wetter", answersLF3[1]
            ),
            new Question("Kabel",
                    "Um hohe Kosten für die Verlegung über lange Strecken zu kompensieren, werden meist preiswerte Fasern vergraben",
                    "Aufgrund hoher Kosten für die Verlegung über lange Strecken werden meist sehr hochwertige Fasern vergraben",
                    "Kunststofffasern sind für kurze Strecken (z.B. im Pkw) gut geeignet",
                    "Kunststofffasern sind scheu und verstecken sich oft im Busch wenn sich Menschen nähern",
                    "", "", answersLF3[2]
            ),
            new Question("IPv6",
                    "IPv4 und IPv6 können mithilfe geeigneter Mechanismen (z.B: Tunnelmechanismus) parallel betrieben werden",
                    "Der Adressraum vergrößert sich von IPv4 zu IPv6 um das Doppelte",
                    "A.B.C.D.E.F.1.2 ist eine gültige IPv6 Adresse",
                    "A:B:C:D:E:F:1:2 ist eine gültige IPv6 Adresse",
                    "Windows 10 unterstützt IPv6",
                    "Führende Nullen in einem Block von 4 Hexadezimal-Ziffern können weggelassen werden. Bsp: 002B -> 2B", answersLF3[3]),
            new Question("IPv6",
                    "Der Adressraum vergrößert sich von IPv4 zu Ipv6 aus das 100-fache",
                    "Benachbarte Blöcke von Nullen können durch :: ersetzt werden",
                    ":: kann an mehreren Stellen angewandt werden",
                    "A0000:0000:0000:0000:0000:0000:0000:000B -> A000:::::::B",
                    ":: kann nur an einer Stelle der IPv6 Adresse angewandt werden, wegen Eindeutigkeit",
                    "A0000:0000:0000:0000:0000:0000:0000:000B -> A000::B", answersLF3[4]),
            new Question("IPv6",
                    "AF00:0000:0000:E255:0000:0001:332D:81FA -> AF00::E255:0:1:332D:81FA",
                    "AF00:0000:0000:E255:0000:0001:332D:81FA -> AF00:::E255::1:332D:81FA",
                    "Ein Hauptgrund für die Entwicklung von IPv6 ist die Erweiterung des Adressraums",
                    "IPv6 hat 2^128 Möglichkeiten zur Bildung von Adressen",
                    "IPv6 hat 3^256 Möglichkeiten zur Bildung von Adressen",
                    "", answersLF3[5]),
            new Question("IPv6",
                    "Bei mehreren Blockfolgen aus Nullen wird längere ersetzt",
                    "Bei mehreren Blockfolgen aus Nullen wird kürzere ersetzt",
                    "Bei gleich langen Blockfolgen aus Nullen wird die erste ersetzt",
                    "BEAF:0776:00A0:E222:D000:0012:0000:0000 -> BEAF:0776:A0:E222:D000:12::: ",
                    "BEAF:0776:00A0:E222:D000:0012:0000:0000 -> BEAF:776:A0:E22:D000:12::",
                    "A21B:C756:0000:0000:1234:0000:0000:01AB -> A21B:C756:1234:0:0:1AB", answersLF3[6]),
    };
    private static boolean answersLF4[][] = {{true, false, false, true, true, false}, {true, false, false, true, false, true}, {true, false, true, false, true, false},
            {true, false, false, false, true, false}, {false, true, true, false, true, true}, {true, false, false, true, false, true}, {true, false, true, true, false, false}, {false, true, false ,true, false, false}};
    private static Question[] questionsLF4 = {
            new Question("Sicherheitsfragen IT-Unternehmen",
                    "Verantwortungszuweisung", "Sicherheitswesten", "Stahlkappenschuhe","Berechtigungsvergabe",
                    "Beaufssichtigung/Begleitung Fremdpersonen", "Aluminiumkopfbedeckungen für Mitarbeiter gegen feine Strahlung",  answersLF4[0]),
            new Question("Sicherheitsfragen IT-Unternehmen",
                    "Schutz sensibler Daten am Arbeitsplatz","Stacheldraht auf Maschendrahtzaun", "Eine Stange Knoblauch an der Eingangstür", "Geräte/Betriebsmittelverwaltung durch Leiter",
                    "Ein Rudel Chihuahuas zur Wache", "Reaktion auf Verletzung der Sicherheitsvorgaben durch Informationssicherheitsbeauftragten ISB", answersLF4[1]),
            new Question("Sicherstellung IT-Sicherheit",
                    "Pseudonymisierung & Verschlüsselung personen bezogener Daten, Vertraulichkeit Integrität Verfügbarkeit", "USB-Stick mit Vorhängeschloss abschließen",
                    "Belastbarkeit in zsmh mit ihrer Verarbeitung auf Dauer sicher zu stellen, Rasche wiederherstellung bei Zwischenfall", "Computer mit nach Hause nehmen",
                    "Regeln überprüfen Evaluierung Berwertung der Wirksamkeit", "Privat nicht über dei Arbeit sprechen", answersLF4[2]),
            new Question("Sicherstellung IT-Sicherheit",
                    "Schnutzniveau nach Wert (Schadenspotential) Berücksichtigen: Technischer Stand, Kosten, Umfang, Umstände, Risiko", "Passwort täglich wechseln", "die Kabel der Mäuse an die Monitore binden",
                    "mindestens 3 Firewalls installieren","Zugang nur auf Verantwortung Verantwortlicher außer Verpflichtung nach Recht EU bzw EU-Staat", ">Nicht klauen!< auf Datenträger schreiben", answersLF4[3]),
            new Question("DSGVO",
                    "11 Doppeltes Sanwich für jeden dem Daten verloren gehen", "12 Transparente Information, Kommunikation und Modalitäten zur Ausübung der Rechte", "13 Informationspflicht bei Erhebung von personenbezogenen Daten",
                    "13 Informationspflicht bei personenerhebenden Daten","14 Informationspflicht wenn Daten nicht bei der betroffenen Peerson erhoben wurden", "15 Auskunftsrecht der betroffenen Person", answersLF4[4]),
            new Question("DSGVO",
                    "16 Recht auf Berichtigung", "16 Recht auf Verfälschung", "17 Recht auf Einärscherung",
                    "17 Recht auf Löschung, Vergessenwerden","18 Recht auf Ausweitung der Verarbeitung",  "18 Recht Einschränkung der Verarbeitung", answersLF4[5]),
            new Question("DSGVO",
                    "19 Mitteilungspflicht im Zsmh mit Berichtigung, Löschung, Einschränkung", "19 Mitteilungspflicht in Zsmh mit kurzzeitiger Unerreichbarkeit", "20 Recht auf Datenübertragbarkeit,",
                    "21 Widerspruchsrecht","21 Einlagerecht",  "22 Ausgaberecht", answersLF4[6]),
            new Question("DSGVO",
                    "22 Automatisierte Werbegeschenke einschließlich Wunscherfüllung ", "22 Automatisierte Entscheidungen im Einzellfall einschließlich Profiling,", "23 Beschränkung der Rechte unverhältnismäßig",
                    "23 Beschränkungen der Rechte verhältnismäßig in besonderen Fällen","",  "", answersLF4[7]),
    };

    private static boolean answersLF6[][] = {{true, false, true, false, false, true}, {false, true, true, false, false, true}, {false, true, true, false, false, false},
            /*Einflüsse Servicebereitstellung*/ {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, true, false},
            /*Servicearten*/ {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, true, false}, {true, false, true, false, true, false},
            /*Serviceanalyse*/ {true, false, true, false, true, false}, {true, false, true, false, false, false},
            /*Aufgabenzuordnung, Rollenmuster nach R-A-C-I*/ {true, false, true, false, true, true},
            /*ITIL 3 Standart (Information Technology Infrastructure Library) werden Managementsysteme für Services unterschieden nach:*/ {true, true, false, true, true, false},
            /*ITIL 4: Wertschöpfungs-Kernaktivitäten (Grundprinzipien):*/ {true, false, true, false, true, false}, {true, false, true, false, true, false},
            /*ITIL 4: Best-Practices*/{true, false, true, false, true, false},
            /*ab hier 4D-Model:*/{true, false, true, false, true, true}, {true, false, false, true, false, true}, {true, false, true, false, true, false}, {true, false, false, false, true, false},
            /*Frameworks & Standarts */{true, false, false, true, false, false}, {true, true, false, true, false, false}, {false, false, false, true, true, false},
            /*Wichtige Gesetze/verordnungen in IT*/{true, false, true, false, true, true}, {true, false, true, false, true, false}, {true, true, true, false, false, false},
            /*bei Serviceaufnahme*/{true, false, true, false, false, true}, {true, false, true, true, false},
            /*Kundenzufriedenheit*/{true, false, true, false, true, true}, {false, true, true, false, true, true}, {false, true, false, true, true, false}, {true, false, false, true, true, false}, {true, false, true, false, true, true},
            /*Mitarbeiteranforderungen*/{false, true, false, true, false, true}, {true, false, true, false, true, false}, {true, false, false, true, false, true}
    };
    private static Question[] questionsLF6 = {
            new Question("Software Lebenszyklus",
                    "1 Beratung", "1 Begutachtung", "2 Beschaffung", "2 Besorgung", "3 Verfügungstellung", "3 Bereitstellung", answersLF6[0]),
            new Question("Software Lebenszyklus",
                    "5 Infostand Elektromarkt", "5 Helpdesk, Service Desk", "6 Kontrolle", "6 Überprüfung", "7 Reparatur", "7 Anpassung",   answersLF6[1]),
            new Question("Software Lebenszyklus",
                    "8 Austausch", "8 Ersatz", "9 Entsorgung",  "10 Wegwurf", "", "", answersLF6[2]),
            new Question("Einflüsse Servicebereitstellung",
                    "Verwendungszweck", "Haarfarbe",
                    "Ressourcen", "Lieblingslied",
                    "Mitarbeiter Rollen", "Appetit", answersLF6[3]),
            new Question("Einflüsse Servicebereitstellung",
                    "Partner", "Wetter",
                    "wohin, woher", "wonach, wobei",
                    "Dringlichkeit", "Häufigkeit",
                    answersLF6[4]),
            new Question("Einflüsse Servicebereitstellung",
                    "Service & Geschäftsmodellwandel, Schulungen, MA motivieren", "Körpergröße",
                    "Servicekette zu Teams unterschiedlicher Dienstleister", "Moral",
                    "welche: Prozesse, Objekte, Systeme", "Herkunft",
                    answersLF6[5]),
            new Question("Einflüsse Servicebereitstellung",
                    "Kunden", "Eltern",
                    "Gesetze", "Lieblingsspiel",
                    "Richtlinien", "Zimmermöbel",
                    answersLF6[6]),
            new Question("Einflüsse Servicebereitstellung",
                    "Servicearten", "Blumentopf",
                    "Richtlininen", "Haustier",
                    "Verfügbarkeit", "Bizepsumfang", answersLF6[7]),
            new Question("Servicearten",
                    "IT-Handel", "Briefmarkentausch",
                    "IT-Service", "Videoverleih",
                    "Cloud", "Earth", answersLF6[8]),
            new Question("Servicearten",
                    "Reperatur", "Bambusleitungsverlegung",
                    "Vor-Ort-Service", "Umzugsservice",
                    "Austausch-Service", "Eintausch-Service", answersLF6[9]),
            new Question("Servicearten",
                    "Chatbot", "Videochat",
                    "Live-Chat", "Post",
                    "Managed-Services", "Anarchistic-Services", answersLF6[10]),
            new Question("Servicearten",
                    "Wartung", "Erwartung",
                    "Schulung", "Verunkung",
                    "Helpdesk", "Fußbodenmontage", answersLF6[11]),
            new Question("Serviceanalyse",
                    "Vorgang neu?", "Gibts etwas zu Essen?",
                    "Was zu tun?" , "Konfortabel?",
                    "Beteiligte?", "Geruchsqualität", answersLF6[12]),
            new Question("Serviceanalyse",
                    "Welche Verpflichtungen gegenüber Kunden?", "Welche Möglichkeiten zur nervlichen Abreaktion",
                    "Reaktionszeit, MA & Ressourcen planen", "Ambitionen bündeln & Hände waschen", null, null, answersLF6[13]),
            new Question("Aufgabenzuordnung, Rollenmuster nach R-A-C-I",
                    "Responsible (durchführendverantwortlicher)", "Reputational (reputationsvergabefähiger)",
                    "Accountable (Kostenverantwortlicher)", "Answerable (beantwortungsfähiger)",
                    "Consulted (Berater)", "Informed (Personen die es wissen sollten)",  answersLF6[14]),
            new Question("ITIL 3 Standart (Information Technology Infrastructure Library) werden Managementsysteme für Services unterschieden nach:",
                    "Planung", "Koordinierung & Entwicklung", "Haftung & Ausschuss", "Transfer / Neuausrichtung (Transition)",
                    "Bereitstellung / Erbringung von Services (Operation)", "Erlass und Ermächtigung", answersLF6[15]),
            new Question("ITIL 4: 6 Wertschöpfungs-Kernaktivitäten (Grundprinzipien):",
                    "Planen", "Erdenken", "Verbessern", "Auftun", "Beteiligen", "Lachen", answersLF6[16]),
            new Question("ITIL 4: 6 Wertschöpfungs-Kernaktivitäten (Grundprinzipien):",
                    "Design & Überleitung", "Aufmachung & Unterschwellige Botschaften", "Beschaffen & Erstellen", "Ausnehmen & Verzehren",
                    "Ausliefern und unterstützen", "Umnieten und Zerfurchen", answersLF6[17]),
            new Question("ITIL 4: Definiert 34 offene, einfache und agile Best-Practices zur Steuerung und Überwachung der Service-Wertschöpfungskette: z.B:",
                    "Allgemeine Managementpraktiken z.B: Architecture Management, Projekt M, Relationship M, Risk M, Service Financial M, Info Security M", "Zwielichtige Managementpraktiken z.B: Abführmittel Management",
                    "Service Management Praktiken z.B: Availability M, Business M", "Service Management Theorien z.B: Sieben Phasen Modell nach Streich, Drei Phasen Modell nach Lewin",
                    "Technische Management Praktiken z.B: Deployment M, Infrastructure & Platform M, SW Development M", "Abstrakte Management Praktiken z.B: Void M", answersLF6[18]),
            new Question("4D-Model: Wertschöpfung erfolgt unter Verbindung von:",
                    "Organisationen & Personen", "Geistige Führer & Untergebene",
                    "Informationen & Technologien", "Elben, Menschen & Zwergen",
                    "Partner & Lieferanten",  "Wertströme & Prozesse", answersLF6[19]),
            new Question("4D-Model: Wertschöpfung erfolgt unter Verbindung von bspw: Organisationen & Personen und unter Berücksichtigung äußeren Randbedingungen:",
                    "rechtlichen", "geistlichen", "moralischen",
                    "technischen", "ethnischen", "wirtschaftlichen", answersLF6[20]),
            new Question("4D-Model: Wertschöpfung erfolgt unter Verbindung von bspw: Organisationen & Personen und unter Berücksichtigung äußeren Randbedingungen:",
                    "politischen", "persönlichen", "sozialen",
                    "unsichtbaren", "umweltfaktoren", "umsichtigen", answersLF6[21]),
            new Question("4D-Model: Wertschöpfung erfolgt unter Verbindung von bspw: Organisationen & Personen und unter Berücksichtigung äußeren Randbedingungen wie rechtlichen",
                    "sowie: KVP (kintinuierliche Verbesserung)", "KUG (krasse Unnachgiebigkeit)",
                    "EU (elende Unbesiegbarkeit)", "AS (astreine Sensation)",
                    "und: Beachtung von Regelungen & Leitbildern", "Bemerkung von Wiedersprüchen", answersLF6[22]),
            new Question("Wie kam es dass Frameworks & Standarts benötigt wurden?",
                    "Problem: Service Systeme sind komplex müssen untereinander passen & abgestimmt sein für Austausch, Beteiligte müssen zsm. Arbeiten: Begriffe, Verfahren, APIs benötigt",
                    "Problem: Service Systeme sind sturr und müssen gebändigt werden", "Problem: Service Systeme sind streitlustig und müssen versöhnt werden",
                    "Lösung: Rahmenwerke (Frameworks) + Normen & Zertifizierungen* zur Sicherung der einheitlichen Vorgaben.",
                    "Lösung: Zuckerbrot & Peitsche", "Lösung: Partnerberatung & Teambuilding", answersLF6[23]),
            new Question("Frameworks & Standarts: je nach Anwendungswunsch mehrere Normen & Organisationen:",
                    "BSI", "DGI", "GADAGANA", "compTIA",  "UMSKL", "HAGGAG", answersLF6[24]),
            new Question("Frameworks & Standarts: je nach Anwendungswunsch mehrere Normen & Organisationen:",
                    "puhskuk", "ESCHgel", "jo", "PMI", "IStQB", "puAT", answersLF6[25]),
            new Question("Wie kam es dass Rechtliche Vorgaben gebraucht wurden",
                    "Problem: Planung & Durchführung von Services bedeuten Risiken für Untenehmen", "Problem: Unternehmen würden gerne Zeit und Geld sparen",
                    "Lösung: Regelsysteme (Governance) einführen: Menschen müssen sich dran halten (Compliance(Einhaltung)) sonst wertlos.", "Lösung: Lohnerhöhung und Qualitätsverringerung",
                    "ein Service wird über ein SLA (Service-Level-Agreement) vertraglich mit dem Kunden geregelt, auch Eigen- bzw. Fremdleistung von Partnern müssen geregelt werden",
                    "Unternehmen müssen sich immer an aktuelle Rechtslage anpassen und ihre Kunden (möglicherweise auch Unternehmen) informieren, auch Standartverträge entsprechend anpassen", answersLF6[26]),
            new Question("Wichtige Gesetze/verordnungen in IT",
                    "BGB", "LOL","HGB", "BSST","UWG (unlauter WB)", "ICH", answersLF6[27]),
            new Question("Wichtige Gesetze/verordnungen in IT",
                    "Datenschutzgesetz", "DSGVO", "Urheberrecht",
                    "Kehrwoche", "Nettoprospekt", "Computergebrauchsanweisung", answersLF6[28]),
            new Question("bei Serviceaufnahme",
                    "1 kategorisieren", "1 hermetisieren", "2 klassifizieren", "2 vaporisieren", "3 notieren", "3 priorisieren", answersLF6[29]),
            new Question("bei Serviceaufnahme",
                    "","4 eskalieren?", "4 harmonisieren", "4 katalogisieren", "5 welcher Kunde? welcher Vertrag? besondere Anforderungen?",
                    "5 welcher Zustand? besondere Bedürfnisse? welcher Wochentag?", answersLF6[30]),
            new Question("Kundenzufriedenheit: Kunde will...",
                    "einfachen Service", "zweifachen Service", "im Mittelpunkt sein", "außen vor sein", "schnell", "unkompliziert", answersLF6[31]),
            new Question("Zur Kundenzufriedenheit: Auswertung von...",
                    "Anzeigen", "Tickets", "Reklamation, Beschwerden", "Gesundheitsrisiken", "Feedbacks / Bewerungen", "Weiterempfehlungsbreitschaft", answersLF6[32]),
            new Question("Zur Kundenzufriedenheit: Mitarbeiter reflektieren:",
                    "sexuelle Ausrichtung", "Selbstbild", "Kleidungsstil", "Vorgesetzte, Kollegen & Servicepartner", "interne & externe Kunden", "Musikgeschmack", answersLF6[33]),
            new Question("Zur Kundenzufriedenheit: IT Monitoring:",
                    "dauerhafte Systemüberwachung KPI-Werte", "regelmäßige Systemüberwachung KPI-Werte", "MOFS Meantime on funny Sites ",
                    "MTTR Meantime to Repair", "MTBF Meantime between failures", "MOT Meantime on Toilet", answersLF6[34]),
            new Question("Zur Kundenzufriedenheit: IT Monitoring: Vergleich Ist/Soll: bspw...",
                    "Anrufe pro Tag", "Klicks je Stunde", "Höchstwerte zu best. Zeit,", "Popups in der Woche", "Anzahl & Status der Tickets", "Verfügbarkeit eines Systems", answersLF6[35]),
            new Question("Mitarbeiteranforderungen zur Analyse, das Service Anfragen vielfältig:",
                    "Mundweite", "hohe Einsatzbereitschaft + Analysefähigkeit",
                    "Elastizität", "hohe Kunden & Serviceorientierung",
                    "Umfang", "Team & Kommunikationsfähigkeit", answersLF6[36]),
            new Question("Mitarbeiteranforderungen zur Analyse, das Service Anfragen vielfältig:",
                    "Eigeninitiative, Zuverlässigkeit, Belastbarkeit", "Umsicht",
                    "lösungsorientierte Denkweise", "Ehrlichkeit",
                    "technische Kenntnisse haben / erweitern", "Freundlichkeit", answersLF6[37]),
            new Question("Mitarbeiteranforderungen zur Analyse, das Service Anfragen vielfältig:",
                    "Fachkenntnisse von Startvorgang der verantworteten Systeme", "Fachkenntniss von Entsorgung der verantworteten Systeme",
                    "unterhaltsames Ausdrücken in Wort und Schrift","verständliches Ausdrücken in Wort und Schrift",
                    "häufige Probleme: Käfer in Hardware und fehlender Netzanschluss", "häufige Probleme: falsche Schlüsse & Hintergrund des Problems wird nicht erkannt", answersLF6[38]),

    };
    private static boolean answersLF7[][] = {{true, false, true, false, false, true},{true, false, true, false, false, true}};
    private static Question[] questionsLF7 = {
            new Question("Testquestion", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
            new Question("Testquestion2", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
    };

    private static boolean answersLF8[][] = {{true, false, true, false, false, true},{true, false, true, false, false, true}};

    private static Question[] questionsLF8 = {
            new Question("Testquestion", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
            new Question("Testquestion2", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
    };
    private static boolean answersLF9[][] = {{true, false, true, false, false, true},{true, false, true, false, false, true}};
    private static Question[] questionsLF9 = {
            new Question("Testquestion", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
            new Question("Testquestion2", "Option A", "Option B", "Option C", "", "",  "", answersLF7[0]),
    };

    public static boolean[][] getAnswersLF1() {
        return answersLF1;
    }

    public static Question[] getQuestionsLF1() {
        return questionsLF1;
    }
    public static boolean[][] getAnswers() {
        return answers;
    }
    public static void setAnswers(boolean[][] answers) {
        Schoolstuff.answers = answers;
    }
    public static Question[] getQuestionsLF2() {
        return questionsLF2;
    }
    public static void setQuestionsLF2(Question[] questionsLF2) {
        Schoolstuff.questionsLF2 = questionsLF2;
    }
    public static boolean[][] getAnswersLF3() {
        return answersLF3;
    }
    public static void setAnswersLF3(boolean[][] answersLF3) {
        Schoolstuff.answersLF3 = answersLF3;
    }
    public static Question[] getQuestionsLF3() {
        return questionsLF3;
    }
    public static void setQuestionsLF3(Question[] questionsLF3) {
        Schoolstuff.questionsLF3 = questionsLF3;
    }
    public static boolean[][] getAnswersLF4() {
        return answersLF4;
    }
    public static void setAnswersLF4(boolean[][] answersLF4) {
        Schoolstuff.answersLF4 = answersLF4;
    }
    public static Question[] getQuestionsLF4() {
        return questionsLF4;
    }
    public static void setQuestionsLF4(Question[] questionsLF4) {
        Schoolstuff.questionsLF4 = questionsLF4;
    }
    public static boolean[][] getAnswersLF6() {
        return answersLF6;
    }
    public static void setAnswersLF6(boolean[][] answersLF6) {
        Schoolstuff.answersLF6 = answersLF6;
    }
    public static Question[] getQuestionsLF6() {
        return questionsLF6;
    }
    public static void setQuestionsLF6(Question[] questionsLF6) {
        Schoolstuff.questionsLF6 = questionsLF6;
    }
    public static boolean[][] getAnswersLF7() {
        return answersLF7;
    }
    public static void setAnswersLF7(boolean[][] answersLF7) {
        Schoolstuff.answersLF7 = answersLF7;
    }
    public static Question[] getQuestionsLF7() {
        return questionsLF7;
    }
    public static void setQuestionsLF7(Question[] questionsLF7) {
        Schoolstuff.questionsLF7 = questionsLF7;
    }

    public static boolean[][] getAnswersLF8() {
        return answersLF8;
    }

    public static Question[] getQuestionsLF8() {
        return questionsLF8;
    }
    public static Question[] getQuestionsLF9() {
        return questionsLF9;
    }
    public static void setQuestionsLF9(Question[] questionsLF9) {
        Schoolstuff.questionsLF9 = questionsLF9;
    }






}
