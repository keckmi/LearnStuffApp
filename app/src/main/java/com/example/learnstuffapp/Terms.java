package com.example.learnstuffapp;

public class Terms {

    private static String[] kapitelLFYetUnpost = {"▼ Kapitel noch einzufügen"};

    private static String [] kapitelLF1 = {"▼ It-Ausbildungsberufe und Beteiligte im dualen System vorstellen",
            "▼ Die eigene Rolle im Betrieb beschreiben", "▼ Den Ausbildungsbetrieb beschreiben",
            "▼ Das Marktumfeld des Ausbildungsbetriebes beschreiben", "▼ Den Ausbildungsbetrieb präsentieren"};

    private static String[] kapitelLF2 = {"▼ Eine Einführung in die IT für Arbeitsplätze geben", "▼ Das Leistungsportfolio im Ausbildungsbetrieb präsentieren",
            "▼ Auswahlkriterien zu IT-Produkten allgemein unterscheiden", "▼ Komponenten eines Arbeitsplatzcomputers unterscheiden",
            "▼ Kundenanforderungen im Leistungsprozess berücksichtigen und Projektmanagement vorbereiten", "▼ Badarfs- und Andorderungsnanalysen durchführen",
            "▼ Pflichtenheft erstellen", "▼ Angebote und Stundensätze kalkulieren und die Rendite berücksichtigen",
            "▼ Angebotsvergleiche bei Beschaffungsmaßnahmen durchführen", "▼ Lieferung, Installation und Übergabe vornehmen"};

    private static String [] kapitelLF3 = {"▼ Eine Einführung in das Netzwerk des Ausbildungsbetriebes geben", "▼ Hauptbestandteile von Computernetzen unterscheiden",
            "▼ Grundlage der Datenübertragung in Netzen", "▼ Netzwerkstrukturen, -komponenten, -standarts, und -modelle unterscheiden",
            "▼ Selbstständig die Integration von Clients in ein Netzwerk planen und druchführen", "▼ Die Netzwerkfunktion der Clients prüfen und warten",
            "▼ Netzwerkkomponenten auswählen und konfigurieren", "▼ Grundlage der Daten- und Netzwerksicherheit beschreiben"};

    private static Term[][] termsLF1 = {
              {//Die Eigene Rolle im Betrieb beschreiben
                  new Term("Keine Fachbegriffe 1.1", "Für dieses Kapitel noch keine Fachbegriffe"),
                  new Term("Leitbild & Ziele", "ökologisch, ökonomisch, sozial"),
                  new Term("Shareholder","Anteileigner (haben Aktien)"),
                  new Term("Stakeholder","Jeder der irgendwie mit Unternehmen in Verbindung steht"),
              },
              {//Den Ausbildungsbetrieb beschreiben
                  new Term("Keine Fachbegriffe 1.2", "Für dieses Kapitel noch keine Fachbegriffe"),
              },
              {//Die Eigene Rolle im Betrieb beschreiben
                  new Term("Organigram",
                      "Buch S.65-73 - Bilder einfügen?\n" + "ABB S.54 - Bild einfügen?\n" +
                      "ABB S.53 + Ordner 2 - Bild einfügen?\n" + "Stabstelle: \"Keine Weisungsbefugnis\" in Elipse"),
                  new Term("Aufbau & Ablauforganisation","S.66\n" +
                      "zB Spartenorganisation, Funktionsorganisation, Einliniensystem (ein direkter Vorgesetzter), Mehrliniensystem (mehrere indirekte Vorgesetzte, zB Matrixorganisation)\n" +
                      "Ablauforganisation - Reihenfolge, wann, welche Arbeitsschritte\n" + "Aufbauorganisation - Organigramm"),
                  new Term("Firma","Name unter dem Kaufmann eine Geschäfte treibt und unterschreibt"),
                  new Term("Handelsregister","HR Firma die hier steht erlangt Kaufmannseigenschaft, muss HGB einhalten\n"),
                  new Term("Vollmacht",
                      "A) allgemeine Handlungsvollmacht - Menschen Vollmacht für alle gewöhnlichen Geschäfte geben\n" +
                      "B) Einzelvollmacht - nur für 1 Vertrag\n" + "C) Artvollmacht - Menschen Vollmacht über Verträge einer Art zu geben\n" +
                      "durch mndl, schriftl, schlüssiges Handeln\n" + "müssen nicht ins HR einngetragen werden\n" +
                      "Unterschrifftkürzel i.A.Keck (im Auftrag) (B), i.V.Keck (in Vollmacht) (A,C)\n" +
                      "Erlischt durch Wiederruf der Beendigung des Arbeitsverhältnisses"),
                  new Term("prokura",
                      "prokura = bessondere Vollmacht für außergewöhnliche Geschäfte wie gerichtsverhandlung, grundstückkauf\n" +
                      "muss ausdrücklich erteilt werden (mndl, schriftl),\n" + "für Außenstehende einsichtig sein (in HR eingetragen werden)\n" +
                      "hat aber schon vorher gültigkeit\n" + "nicht übertragbar, nicht (extern) beschränkbar (außer auf Zweigniederlassungen mit anderen Namen)\n" +
                      "Einzelprokura = für einen Einzelnen\n" + "Gesamtprokura = für eine Gruppe\n" +
                      "Grenzen: A)Verkauf: Rechtsform oder Firma und Namensänderungen, Jahresabschluss unterzeichnen B) Insolvenz: prokuraerteilung, Verkauf & Belastung von Grundstücken\n" +
                      "Unterschrift: ppa. oder pp.\n" + "Erlischt durch Wiedeerruf, Aufgabe Geschäftsbtrieb, Beendigung Arbeitsverhältniss\n" +
                      "Generalvollmacht = noch mehr Befugnisse als bei prokura, so viel wie Geschäftsinhaber\n"),
                  new Term("Ziele",
                      "Zielharmonie - Die Maßnahmen zum Errreichen deines Zieles unterstützt zugleich die Zeilerreichung eines anderen Zieles\n" +
                      "Zielneutralität - Die Verfolgung des einen Zieles beeinträchtigt nicht die Erreichung des anderen Zieles\n" +
                      "Zielkonflikt - Die Verfolgung des einen Zieles verhindert die Erreichung eines anderen Zeiles\n\n" +
                      "Umsatzerhöhung <-> Gewinnsteigerung - Zielharmonie\n" +
                      "hoher Gewinn <-> mehr Umweltschutz - Zielkonflikt\n" +
                      "besseres Essen <-> weniger Fuhrparkkosten - Zielneutralität\n\n" +
                      "learningapps.org/display?v=pcc3zo7gc22\n"),
                  new Term("Wertschöpfungskette ","Buch S.81ff"),
                  new Term("CRM", "Costumer Relationship Management (Kundenbeziehungsmanagement)"),
                  new Term("ERP", "Enterprise Resource Planing Unternehmensresourcensteuerung\nzB Personal, Betriebsmittel, Software, Lager- &Finanzbuchhalltung"),
              },
              {//Das Marktumfeld des Ausbildungsbetriebes beschreiben
                  new Term("Marktstruktur Branche", "learning.apps.org/display3v=pej7ashqa22\n" + "Buch S.95"),
                  new Term("Unternehmensrechtsformen",
                      "1) Einzelunternehmen \n" +
                      "A) Freiberufler\n" + "B) Kleingewerbebetreibender\n" + "C) Gewerbetreibender Kaufmann\n" +
                      "1 Person ist Gesellschafter & Unternehmensführer \n" + "mit Steuernummer(A) bzw. Gewerbeschein(B,C)\n" +
                      "mit Vor&Nachname + Branchenname (A,B)\n" + "oder Vor&Nachname+e.K, Branchenname+e.K, Fantasiename+e.K\n" +
                      "Haftung beim Einzelunternehmer allein\n" + "Startkapital nicht vorgeschrieben\n" + "Gewinn bekommt Einzelunternehmer allein\n" +
                      "2) Personengesellschaften\n" + "A) Gesellschaft bürgerlichen Rechts GbR\n" +"B) Offene Handelsgesellschaft OHG\n" +
                      "C) Kommanditgesellschaft KG\n" + ">1 Person sind Gesellschfter & Unternehmensführer (A,B)\n" +
                      ">1 Person sind Gesellschafter (Komandisten(Kontrollrecht)) aber nur 1 Person ist Unternehmensführer (Komplementär) (KG)\n" +
                      "Anmeldung KLeingewerbe (Gewerbeschein?) (best. Jahresgehalt darf nicht überschritten werden) (A)\n" +
                      "Gewerbeschein, Handelsregistereintrag (B, C)\n" + "mit Vor&Nachname + Branchenname / Fantasiename + GbR (A)\n" +
                      "Name frei wählbar + OHG bzw. KG (B,C)\n" + "Stammkapital frei wählbar\n" + "Gesellschafter bzw. Geschäftsführer haften voll (A, B)\n" +
                      "Komplementär haftet mit privat & geschäftsvermmögen, Kommandist nur mit geschverm (C)\n" +
                      "Gewinn unter Gesellschaftern / Führern zu gleichen Teilen geteilt (A)\n" +
                      "Verzinsung 4% auf Anlagen (B,C)\n" + "andere Personengesellschaften: Partnergesellschaft, GmbH & OHG, GmbH & Co. KG\n" +
                      "3) Kapitalgesellschaft\n" + "A) Gesellschaft mit beschränkter Haftung GmbH\n" +
                      "B) Aktiengesellschaft AG\n" + ">1 Person sind Gesellschafter / Aktionäre (AG)\n" +
                      ">1 Person sind Geschäftsführung / Vorstand (AG)\n" + "Geld in Kapitalgesellschaften kommt von Gesellschaftern\n" +
                      "Gesellschafterversammlung wählt Geschäftsführung (A)\n" + "Gesellschafter heißen Aktionäre (B)\n" +
                      "Aufsichtsrat ernennt & kontrolliert Vorstand\n" + "Aufsichtsrat jährlich in Aktionärsversammlung gewählt\n" +
                      "Handelsregistereintrag, Gesellschaftsvertrag (A,B)\n" + "Stammkappital: A) 25 000 B) 50 000\n" +
                      "Name frei wählbar + GmbH / AG\n" + "Gewinn verteilt nach Anteilen\n" + "Haftung mit geschäftsvermögen gesellschafter\n"),
              },
              {//Den Ausbildungsbetrieb präsentieren
                  new Term("Keine Fachbegriffe 1.5", "Für dieses Kapitel noch keine Fachbegriffe"),
              }
      };
    private static Term[][] termsLF2 = {

            {//Eine Einführung in die IT für Arbeitsplätze geben
                /*new Term("Kompetenzen","Eigenverantwortung,\n Fachkompetenz,\n soziale Komptenz,\n Zielgerichtet"),*/
                new Term("Teamarbeit: Heterogene - Homogene Teams",
                    "Heterogene Teams:\nOXAI OXAI OXAI OXAI\nHomogene Teams:\nOOOO XXXX AAAA IIII"),
                new Term("Generalist", "der kann von allem etwas"),
                new Term("Spezialist", "der kann etwas besonderst gut"),
                new Term("Konfiguration",
                    "Zusammenstellung, Einstellung & Abstimmung von Komponenten, Geräten und Programmen in Bezug auf die Anwendung"),
                new Term("Technologische Entwicklung",
                    "Windows7->Windows10\nDiskettenlaufwerk->USB-Speicherstick\nLAN->WLAN\nKabel->Funk\nDiskette->CD\nMicrosoft Office->Open Office\n" +
                    "VGA->HDMI\nSATA->SSD\nEin-Kern-Prozessor->Mehr-Kern\nAlgorythmus->KI\nLochkarten->Maus,Tastatur"),
                //Kreuzworträtsel ABB S.92
            },
            {//Das Leistungsportfolio im Ausbildungsbetrieb präsentieren
                new Term("Wie veränderte sich der Arbeitsplatz?",
                    "Arbeitsplatztausch\nErgonomische Möbel\nFlexible Arbeitszeit\nweniger Papiergebrauch\n"+
                    "Mehr (Eigen)Verantwortung\nDatentausch per Funk\nvirtuelle Konferenzräume\n"+
                    "Projektteam mit Gruppenleiter hat von jedem Berreich einen\nBerreiche sind bspw: Planer, Entwickler, Verknüpfer, Tester, Kundenkontakt\n"+
                    "früher wanderte Projekt langsam von Abteilung zu Abteilung\nAbteilungen und ihre Leiter gibt es so nicht mehr\n"),
                new Term("Marktgängige Systeme",
                    "All in One, Mini-PC(Tower), Big Tower-PC, Device, Desktop-PC, AI, Embedded System, Firmware, IoT, Internet Of Things, LAN, Notebook, On-Premise, Open Source,\n" +
                    "Portable Apps, Proprietäre Software (herstellergebunden, eigenständig, speziell), Server Smart Home, Spezifikation, Standartsystem, Stick-PC, Smart Table, Smartphone,\n" +
                    "Thin-CLient, WLAN, Workstation, zero-Client "),
                //Präsentieren ABB S.95, Aufg6
            },
            {//Auswahlkriterien zu IT-Produkten allgemein unterscheidenn
                new Term("nach welchen Mängelarten werden Kundenreklamationen sortiert?",
                    "SM - Sachmanel:\n  Q - Qualität\n  M - Quantität\n  A - Artmangel\nR - Rechtsmangel\n" +
                    "Erkennbarkeit:\n  O - offen\n  V - versteckt\n  AV - arglistig verschwiegen\n" +
                    "Außmaß:\n  G - geringfügig\n  E - erheblich\n  B - behebbar\n  nicht behebbar (bzw. nur durch Neulieferung)"),
                new Term("Was muss bei Lieferungen eingehalten werden?",
                    "Standarts\nNormen\nFormfaktoren\nMarken\nReklamation zu Unrecht\nAufgabe: Siehe ABB S.98"),
                new Term("Green-IT",
                    "Hardware umweltfreundlich\nArbeitsplätze flexibel umweltgerecht\nEnergiekosten sparen\nLieferant sollte Altgeräte mitnehmen\n" +
                    "Software energiesparsam\nMitarbeiterberatung zur Umweltfreundlichkeit\nVerbrauchsmaterial sparen\nMehr ABB S.98"),
            },
            {//Komponenten eines Arbeitsplatzcomputers unterscheiden
                new Term("Motherboard",
                    " Input/Output Anschlüsse,\n CPU Sockel für Prozessor,\n RAM Slots für Arbeitsspeicher\n"+
                    "SATA Anschlüsse für Festplatten,\n Laufwerken,\n PCIe 3.0 für Pheripherie  z.B: Grafikkarte, WLAN Adapter, Sensoren, Schnittstellenkarte"),
                new Term("PCI - PCIe",
                    "R PCI - Peripherial Component Interconnect\nDas e in PCIe steht für express\n"+
                    "Bei PCI parallele Leitungen hängen miteinander, sind gemeinsam steuerbar\nBei PCIe Leitungen eletrisch unabhängig von einander und einzeln steuerbar"),
                new Term("Platinen",
                        "Haben mehrere Ebenen übereinander,\n Metal wird drauf gedampft, Kunststoff darüber,\n tragen elektrische Bauteile"),
                new Term("Prozessorvergleichseigenschaften",
                    "Taktfreuquenz,\n Kern Anzahl,\n Hyperthreading,\n Übertaktbar,\n Preis,\n TDP (Energieverbrauch),\n Speicher\n"),
                new Term("Wann sind mehr Prozessorkerne von Vorteil?",
                    "Mehr Kerne bringen Vorteil wenn Aufgabe teilbar ist\n"),
                new Term("Cache",
                    "Zwischenspeicher zwischen CPU (Prozessor) und RAM (Arbeitsspeicher)\nErhöht Geschwindigkeit\n"+
                    "Cache-Level:\nL1 ist der kleinste und schnellste,\nL2 größer und langsamer jedoch schneller als RAM,\n L3 dient Datenabgleich der Caches und Cores"),
                new Term("Prozessorenparallelisierungstechniken:",
                    "Siehe ABB S.104"),
                //Weitere mögliche Terms/Quizfragen ABB S.103
                new Term("RAM", "gelöscht bei PC aus"),
                new Term("Arbeitsspeichervergleichseigenschaften",
                    "Speicherkapazität\nAnzahl Speichermodule\nTaktfrequenz\nLatenzen\nDatenübertragungsrate\nEnergieverbrauch\nBeispiele ABB S.105"),
                new Term("passenden Arbeitsspeicher auswählen",
                    "Siehe ABB S.105"),
                new Term("P = U * I", "P = Leistung (Watt), I = Stromstärke (Ampere), U  = Spannung (Volt)"),
                new Term("Hotplugging","Geräte bei laufendem Betrieb an/aus stecken"),
                new Term("Netzteil", "Leistund Netzteil einfacher Büro-PC: 150-250 W\n\nWirkungsgrad: Nutzbare Energie der aufgenommenen Leistung\n"+
                    "Dieser liegt per Definition zwischen 0 und 1 (100%)\nWirkungsgrad ist Lastenabhängig, auf bestimmte Lasten optimierbar\n"+
                    "Der PC-Netzteilstandart, mit dem man versucht den Wirkungsgrad zu optimieren heißt: 80 Plus"),
                //PUI Rechnungen und Netzteile ABB S.106f
                new Term("Festplatte HDD",
                    "Hard Disk Drive\nseit 80ern\ndrehgeschwindigkeit/min 5400 - 7200,\n aus Alu oder Glas mit (Halb)metall-legierung, magnetisiert mit Stromimpulsen,\n" +
                    "größen: 2,5 & 3,5 Zoll,\n längere Lebenserwartung als SSD,\n Kostengünstiger als SSD\n"),
                new Term("Festplattenvergleichseigenschaften",
                    "Typ\nBauart\nSpeicherkapazität\nFormfaktor\nSchnitstelle\nCache\nÜbertragungsrate\nUmdrehung\nWatt\nCent/GB\nBeispiele ABB S.107"),
                new Term("SSDvergleichseigenschaften",
                    "Technologie\nVerwendungszweck\nKapazität\nLesen\nSchreiben\nFormfaktor\nSchnittstelle\nBeispiele siehe ABB S.1ß8"),
                new Term("NTFS",
                    "proprietäres Dateisystem von Microsoft, viele Fstpl sind damit vorformatiert"),
                new Term("Festplatten Einsatzbereiche & Bau/Speicherarten",
                    "Einsatzbereiche:\n Intern, Extern, Laptop, NAS, WLAN, USB-St, Gehäuse\n\nNeueres USB hat mehr Leistung(Watt)" +
                    "Bau/Speicherarten:\n HDD (Magnetscheibe),\n SSD (flash/Halbleiter),\n SSHD (beides/Hybrid),\n USB Sticks (Flash/Halbleiter),"),
                new Term("M.2 Format", "kleiner 40 oder 80mm\n\nSSDs mit 2,5 Zoll sind heutzutage nahezu verltet.\n"+
                    "Eine moderne Schnittstelle, Standart oder Bauform wäre NVMe M.2\nMVM Express ist ein 2011 Softwareprotokoll um SSDs mit PCIe zu verbinden\n"+
                    "ohne herstellerspezifische Treiber.\n=nonvolatile memory (nichtflüchtig)"),
                new Term("Festplatte mit 500GiB","Berechnen Sie Unterschied zwichen 500GiB und 500GB in MiB\n"+
                    "Bedeutung von GB nicht eidneutig, gehen Sie davon aus dass hier Vorsaatzzeichen in 1000er Schritten gezählt werden\n"+
                    "Hinweis: iB entspricht 2^10B\n\nK = 1000 = 10^3 = 10*10*10\nM = 100 000 = 1000K = 10^6\nG = 1000M = 10^9\nT = 1000G = 10^12\n\n"+
                    "Ki = 22^10 = 1024\nMi = 2^20 = 1024Ki\nGi = 2^30 = 1024Mi\nTi = 2^40 = 1024Gi\n\n"+
                    "Festplatte 1: 500Gi * 1024Mi * 1024Ki * 1024B\n- Festplatte 2: 500 000 000 000 B\n= (36 870 912 000 / 1024) KiB\n"+
                    "= ((36 870 912 000 / 1024)/ 1024) MiB\n= 35 162, 8417 MiB"),
                new Term("Schnitstellen", "PATA, SATA, SCSi, USB"),
                new Term("NAS", "Network Attached Storrage System,\n File Server,\n Alternative: Cloud-System,\n (für später:) RAID-Verbund (LF3.8) ,? LAN, DAS\n"),
                new Term("WLAN Festplatten", "haben eingebauten Akku"),
                new Term("Datentransferrate", "interner Anschluss entscheidend, Standart: STA M.2 von 150 - 600 MB/s\n"+ "CALCULATION METHOD FOLLOWS..."),
                new Term("Partition", "Datenbereich einer Festplatte"),
                //Festplatten Rechnungen ABB S.109
                //Wetere mögliche Terms/Quizfragen ABB S.110
                new Term ("Lineare Tastatur",
                    "Umschaltpunkt nicht spürbar\nUmschaltpunkt definiert spürbares klickgeräusch\ndurchgehend gleiches Druckgefühl"+
                    "Schaltweg: <2mm (schnell, kürzer)\nBereich: Gaming"),
                new Term ("Taktil Tastatur", "Umschaltpunkt definiert spürbares klickgeräusch\nSchaltweg > 2mm\nBerreich: Gaming\nBereich: Büro"),
                new Term("Tastatur Leistungskriterien",
                    "Haltbarkeit\nmax Tastenschläge bspw: 50 Mio Standart\nTastananzahl\nporgrammierbare Tasten\nSchaltpunkt\nKompatibilität"+
                    "Trackpad/point\nBeleuchtung\nErgonomie\nReinigung\nHygiene"),
                new Term("Monitor Standarts & Eigenschaften",
                    "24-27 Zoll\n1920x1080 Full HD\n1-5ms Reaktionszeit\nMHL-Port: Mobilelink\nHalterungen (VESA Standarts)"+
                    "Leistungsuafnahme: schlecht: 30W Betrieb, gut: 05 W Standbye\nKontrastverhältnis: 1000-3000\nBildhelligkeit Candela cd/m^3 250-370\nAbstand zum Bildschirm: min 50cm\n"+
                    "guter Blickwinkel = 160-180°\nPanel: Standart: TN, VA, High-End: IPS, PVA, MVA\n\nBildschirmauflösung zB 1920x1080 beschreibt noch nicht Punktgröße, dpi schon"),
                new Term("ACM",
                    "adaptive contrast management\nanpassung von kontrast in sehr hellen / dunklen Szenen"),
                new Term("Tilt, Swivel & Pivot",
                    "Tilt-Eigenschaften: horizontale Neigung,\n Swivel: vertikale Drehbarkeit,\n Pivot: höhenverstellbar horizontale Drehbarkeit"),
                new Term("OLED Monitor",
                    "organic light emitting diodes\nverschiedene organische Halbleiterschichten werden angestromt und leuchten\nteuer\ndünner\nperfekte Kanten\nhöhere max Helligkeit"),
                new Term("LCD","Liquid Crystal Technology\nVerarbeitungsart: Thin-Film-Transistor-Tec(TFT)\n"+
                    "Flüssigkristalle\neinnzelne Bildpunkte (Pixel), je 3 Farbfilter RGB, werden rückseitig beleuchtet (siehe nochmal buch) direkt beleuchtet oder indirekt?, unterschied zu LED (schwarz  dunkler)"),
                new Term("LED", "light emitting Diodes\ndirekt licht in RGB, restliche Farben durch Überlagerung"),
                //Monitoranschlüsse ABB  S.110
                //Monitorsichrprüfung ABB S.112f
                //Weiteres Wissen, mögliche Terms/Quizfragen ABB S.111
                //Monitor Rechnung ABB S.113f
                //Idealer Monitorarbeitsplatz ABB S.114ff
                new Term("Drucker Arten Beispiele",
                        "Tintenstrahl, Laser, Abteilung, Arbeitsplattz, Mobil"),
                new Term("Tintenstrahl Drucker",
                        "(+) Druckfarben Qualität und Leuchtkraft, Zwischentöne Farbverläufe, leise kein Lüfter, billig\n" +
                        "(-) Druckkosten, langsam, nicht wasserfest, kratzer "),
                new Term("Bubble Jet Verfahren",
                        " Druckknopf hat Kammer hinter winziger Öffnung aus der Tinte durch Erhitzen herausgeespritzt wird"),
                new Term("Piezo-Verfahren",
                        " durch Blättchenverformung durch eletrische Spannung,\n Name von: Piezo Kristall"),
                new Term("Laser-strahl Drucker",
                        "Abbild auf elektrisch geladener Bildtrommel wird elektrisch entladen. Toner (Pulver, Kohlenstoffverbidnung) wird von diesen Stellen angezogen.\n" +
                        "Bildtrommel presst auf Papier. Erhitzung. Abdruck auf Papier.\n" +
                        "(+)schnell, leise, schrift, Abbild, billiger Druck, wisch&kratzfest, Farbqualität, Tinte trocknet nicht ein, seltener Nachfüllen, robust, wartungarm  \n" +
                        "(-)Aufwärmzeit <20sec, kann Ozon (bei Tonerfixierung) und Feinstaub verteilen"),
                new Term("LED Drucker", "LEDs statt Laser - billiger, stabiler"),
                new Term("Dublexdruck", "beidseitiger Druck"),
                new Term("Matrixdrucker (Nadeldrucker)",
                        "Nadelmatrix gabs vor Tintenstrahl, Vorteile: Durchschläge druckbar (Das was du auf oberes Papier schreibst, ist auch auf dem Papier darunter deutlich lesbar)"),
                new Term("Drucker Leistungskriterien",
                        "Endverarbeitungsmöglichkeiten z.B: Lochen Falten Heften,\n Papiersorten größen gewicht,\n Druckgeschwindigkeit,\n Zuverlässigkeit,\n" +
                        "Druckmodi,\n Papierkasetten,\n Fassungsvermögen,\n Kosten,\n Ökologie,\n Stromverbrauch,\n Anschlüsse,\n Scan,\n Fax"),
                new Term("Druckkostenvergleiche",
                        "Verbrauchskosten =\n Seiten insgesamt * Verbrauchskosten je Seite (in Cent?) / 100\n" +
                        "Personalkosten = \n" +
                        "Druckkosteneinsparungen ABB S121 "),
                new Term("Scanner Arten",
                        "Flachbrett,\n Dokumenten,\n Mobil,\n Abteilung,\n Desktop"),
            },
            {//Kundenanforderungen im Leistungsprozess berücksichtigen und Projektmanagement vorbereiten",
                new Term("AIDA Prinzip",
                        "A Attention\nI Interest\nD Desire (Besitzwechsel)\nA Action (Abschlusshandlung)"),
                new Term("offene Fragen","wo sehen sie sich in 5 Jahren?\nstatt: wir brauchen in 5 Jahren einen HTML Programmierer. Sind Sie das?"),
                new Term("Netzplantechnik","ABB S.133 \n In Excel gelöste Aufg"),
            },
            {// Badarfs- und Andorderungsnanalysen durchführen",
                new Term("Keine Fachbegriffe 2.6",
                        "Zu diesem Kapitel sind hier keine Fachbegriffe"),
            },
            {// Pflichtenheft erstellen
                new Term("Keine Fachbegriffe 2.7",
                        "Zu diesem Kapitel sind hier keine Fachbegriffe"),
            },
            {// Angebote und Stundensätze kalkulieren und die Rendite berücksichtigen",
                new Term("Keine Fachbegriffe 2.8",
                        "Zu diesem Kapitel sind hier keine Fachbegriffe"),
                    new Term("Handlungskosten",
                        "Alle Kosten (betriebliche Aufwendungen),\n die aufgrund von Handelsgeschäften entstanden sind\n(Wareneinsatz nicht mitgerechnet)\nund in die Preise eingerechnet werden sollen\n\n"
                        +"z.B: Miete, Werbung, Wareneinsatz, Umsatzsteuer, Löhne"
                        +"Handlungskostensatz (HKS in %) =\n Handlungskosten * 100 / Wareneinsatz\n\n"+"Ermitteln Sie HK und HKaufschlagsatz in %.\nEs wurden IT-Systeme netto für 64 000 Euro eingekauft"+
                        "und diese bar für 110 000 Euro verkauft.\nEs wird mit einem Gewinnaufschlag von 10% kalkuliert.\n\nWareneinsatz(Einkaufspreis incl Bezugskosten): 64 000\n+Handlungskostenaufschlag: 56,25%: 36 000\n"+
                        "=Selbstkosten 100 000\n+Gewinnaufschlag: 10%: 10 000 (110 000/110*10)\n=Umsatzerlöse bar aus Wareneinsatz lt. GuV: 110 000 "),
                    new Term("Handelskalkulation",
                        "Bild ABB S.145 einfügen"),
                    new Term("Stundensatzkalkulation",
                        "Gesamtarbeitszeit umzulegen auf produktive Zeit.\nBei einer Stunde Fahrt und einer Stunde Arbeit,\n"+
                        "ist Fahrt in Arbeitsstundenpreis einzurechnen\n\nSelbstkostensatz =\nSelbstkosten (wenn keine Materialkosten etc = Bruttogehalt) / "+
                        "produktive (verrechenbare) Arbeitsstunden\nNetto-Stundensatz =\nSelbstkostensatz + Gewinnaufschlag\n"+
                        "Stundensatz incl 19% MwSt (bzw Brutto-Stundensatz) = Netto-Stundensatz * 1,19\n Bild ABB S.145 einfügen"),
                    new Term("Brutto-Stundensatz Bsp",
                        "Berechnen Sie den Stundensatz brutto,\n wenn Mitarbeiter die Kundenaufträge mit ihren Arbeitsstunden abrechnen,\n durchschnittlich 68 000 Euro Selbstkosten verursachen\n"+
                        "bei Kunden im Schnitt 1 400 Stunden abrechnen\n und ein Gewinnaufschlag von 12% kalkuliert werden soll\n\n"+
                        "a) Selbstkostensatz (pro Stunde)\n68K / 1,4K/h = 48,57\nb) Netto-Stundensatz (incl Gewinn)\n 48.57 * 1,12 = 54,40\n"+
                        "c) Brutto-Stundensatz (incl 19% USt.)\n54,40 * 1,19 = 64,74"),
                    new Term("Zuschlagskalkulation",
                        "von Listeneinkaufspreis bis Listenverkaufspreis\nbeinhaltet: Bezugskalkulation (bis Bezugspreis)\n& Verkaufskalkulation (bis Listenverkaufspreis)\n\n"+
                        "Bild einfügen"),
                    new Term("Rückwärtskalkulation", "bei Kundenpreisvorgabe\n\nBild einfügen"),
                    new Term("Gewinnkalkulation","zur Gewinnberechnung durch Auftragnehmer\n\nBild einfügen"),
                    new Term("Lieferskonto Kunden","darf abgezogen werden / wird erlassen,\n wenn in einer bestimmten Zeitfrist gekauft wird"),
                    new Term("Akquise","Bie Kunden um Produkt werben,\n Kunde beraten, unterhalten,\nungeldliche Arbeit (unproduktiv)"),
                    new Term("Rüstzeit","Maschine wird umgestell"),
                    new Term("Verteilzeit", "Mitarbeiter arbeiten unterschiedlich schnell"),
                    new Term("freiwillige Firmenleistungen","Weihnachtsgeld\nWasser & Snacks\nUrlaubsgeld\nKita im Haus\nFahrtgeld\nDienstwagen\nBoni"),
                    new Term("Einstandspreis","Bezugspreis"),
                    new Term("Amortisation", "ab wann sich Maschine lohnt\n\nBsp S.253,2\nErfolg:\n300 * 32 + 5000 * 12 * 4 = 700 800 Euro \n/\n"+
                            "Kosten:\n 160K + 20K + 16K + 5K = 201 000 Euro\n= 3,48\nAmortisationsdauer: 48 Monate / 3,48 = 13,8 Monate\n"),
                    new Term("ROI","Return of Investment\n\nROI=\nTotalerfolg / Investitionskosten\n\nROI=\nRückflüsse / Investitionskosten"),
                    new Term("Kommissionierung","Zusammenstellung von bestelltem Gut in Versandform"),

            },
            {// Angebotsvergleiche bei Beschaffungsmaßnahmen durchführen
                new Term("ABC-Analyse", "Produkteinteilung nach Nutzwert\nA = bestes\num zu wissen in welche mehr Zeit gesteckt werden sollte"),
                new Term("XYZ-Analyse", "Berücksichtigt Kontext\nzB Badehosen werden besser im Sommer verkauft"),
                new Term("Marktpreis","Preis kann auf Markt höher ausfallen als in Kalkulation\n"+
                        "Hersteller interessiert an möglichst hohem Preis\nKalkulation spielt Rolle wenn Konkurenz Preise senken"),
                new Term("Werkvertrag","Verpflichtung für bestimmtes Werk (z.B: ein Computerprogramm)"),
                new Term("Dienstvertrag","Zeit (Aufwand) wird vergolten (wird länger bezahlt, wenn etwas nicht klappt)"),
                new Term("Einkaufsgenossenschaft", "zB Edeka: Einzelhändler, Fachgeschäfte(Händler), tun sich zusammen und bieten Hersteller Rahmenverträge an"),
                new Term("BTC","Business to Consumer"),
                new Term("BTB", "Business to Business\nIndustrie verkaufen an Händler mit Gewerbeschein"),
                new Term("ERP System","Enterprise Resource Planing\nZur Verwaltung interner Firmenprozesse\nzB Lieferantenliste"),
                new Term("E-Procurement","eigene elektronische Beschaffungssysteme\n(Lieferanten geben hier Angebote ein)"),
                new Term("EAP System","Bestandslagerüberwachungs-system\nkann manchmal automatisch nachbestellen"),
                new Term("Diff in % von 2 Preisen","(1 - (kleinerer Preis / größerer Preis)) * 100\n\n"+
                        "zB\nUli kaufte heute mittag eine Butterbrezel für 2 Euro. Gestern kaufte er eine für 1 Euro. Berechne die Preisdifferenz in %\n"+
                        "(1-(1/2))*100=50%"),
            },
            {//Lieferung, Installation und Übergabe vornehmen
                new Term("Rollout Produktauslieferung",
                        "1. Planung auf Grundlage der Kundenanforderungen:\n1.1 Rollout-Konzept erstellen mit Überischten Terminen,\n 1.2 Kalkulation der Arbeiten und Ressourcen die es bedarf,\n 1.3 Bereitstellung des Projektleiters und der Techniker\n" +
                        "2. Bestellung und Konfiguaration\n 2.1 Bestellung Geräte und passender Software,\n 2.2 Lageranlieferungsorganisation,\n 2.3 Lieferungskontrolle,\n 2.4 Geräte-vorinstallation & konfigauration,\n Begleitdokumentenerstellung\n" +
                        "3. Anlieferung und Installation\n 3.1 Gerätelieferung, 3.2 Aufbau an vorhergesehenen Standorten,\n 3.3 Installation und Inventarisierung,\n 3.4 Inbetriebnahme und Funktionstests,\n" +
                        "3.5 Unterstützung IT-Abteilung bei Geräteeinbindung in Unternehmensnetzwerk,\n 3.6 Nutzereinweisung 3.7 Altgerätedeinstallation\n" +
                        "4. Elektronische Dokumentation\n" +
                        "4.1 Übergrabeprotokolle,\n 4.2 Konfigurationsseiten,\n 4.3 Rolloutauswertung,\n 4.4 Übergabe aller Dokumente als elektronische Dokumentation\n" +
                        "5. Entsorgung von Altgeräten und Verpackungen\n 5.1 Protokollierung ")
            }
    };

    private static Term[][] termsLF3 = {
            {//Eine Einführung in das Netzwerk des Ausbildungsbetriebes geben
                    new Term("properietär", "waren die ersten Rechnerverbindungen,\n d.h: Systeme unterschiedlicher Hersteller, unkompatibel"),
                    new Term("TK-Anlage", "Telefonanlage"),
                    new Term("Clients", "Kunden eines Servers,\n Datenendgeräte:\nPC, Telefon, Drucker, Beamer, Alarmanlage, Videoüberwachung, Zutrittskontrolle"),
                    new Term("Netzwerkgeräte", "Switch, Router, Speicher, file Server, Datensicherung (LTO-LW Magnetbänder)"),
                    new Term("Software im Netzwerk", "CRM, ERP, Datenbanken, Buchhaltung, Branchensoftware"),
                    new Term("Kabeltypen", "Lichtwellenleiter\nGlasfaßer, Licht, schneller, weiter\n <-> Patchkabel\nKupfer, Strom, einfacher, geringere Fehlerquote, günstiger"+
                            "niedrige Datenraten weil gedämpft, hohe Datenraten nur über kurze Distanz zB 100m\n"+
                            "es konnten zwar früher auch über lange Distanz Daten geschickt werden aber nur sehr wenige, langsam"),
                    new Term("LAN, MAN, WAN, GAN", "LAN Local Area Network,\nMAN Metropolitan,\nWAN Wide,\nGAN Global"),
                    new Term("End to Site <-> Site to Site", "End to Site: User -> Netzwerk z.B: Home Office\n" +
                            "Site to Site: Firmenstandort -> Firmenstandort\n" + "End to End: Rechner -> Rechner z.B: User installiert etwas auf PC in Firma"),
            },
            {//Hauptbestandteile von Computernetzen unterscheiden
                    new Term("VPN", "Virtual Priate Network\n" + "Authenzität, Vertraulichkeit, Integrität\n" + "Tunnel = verschlüsselte Übertragungsstrecke\n" + "Ziel IP auch verschlüsselbar"),
                    new Term("Peer to Peer <-> Client-Server Netzwerk", "Peer to Peer - PC-PC, jeder ist gleichberechtigt, Direktverbdinung, Physikalisch: LAN-Kabel, WLAN, Logisch: IP-tunnerling (VPN) (z.B: Musiktauschportal)\n\n" +
                            "Client-Server Netzwerk - Clients nutzen Dienste und Ressourcen (Speicher, Webserver,...), Server stellt Dienste zur Verfügung: file-, mail-, print-, Web-Server..."),
                    new Term("Switch", "aktive Netzwerkkomponente, braucht Strom, leitet Frame an richtige MAC \n\n"+
                            "leiten weiter bis zum Ziel, innerhalb eines Netzes: direkt zugestellt, an externe Rechner: an default Gateway, den Router in andere Netze"),
                    new Term("Frames",
                            "werden auf Netzwerkmedium übertragen, beinhalten: Hardware-Adressen (MAC) von Absender zu Adressaten"),
                    new Term("VLAN", "Virtual local Area Network: rein logisches Netzwerk, basiert auf tatsächlich physischem, bietet mehr Flexibilität, Performance & Security"),

            },
            {//Grundlage der Datenübertragung in Netzen
                    new Term("Signallaufzeiten",
                            "Lichtgeschwindigkeit (Vakuum) - 2999 792 km/s,\n" +
                                    "in dichteren Medien wie Metall oder Glas reduziert sie sich auf Signallaufzeit c,\n" +
                                    "diese errechnet sich aus Verkürzungsfaktor,\n" +
                                    "TP Kabel = 0,6, LWL = 0,67\n" +
                                    "Twisted Pair Kabel c = 179 875 km/s\n" +
                                    "Glasfaserkabel c = 200860 km/s\n" +
                                    "100 m lange Glasfaserleitung\n" +
                                    "t = L(Strecke?s?)/V = 100 km = 200860 km/s = 0,5ms = 50 µs = 0,0003"),
                    new Term("Datenübertragung ABB 3.3 S.176ff",
                            "Digitalradioverzögerung, da Empfang von redudanten & komprimierten Daten vorm Senden umgewandelt werden muss.\n" +
                                    "NVP = verkürzungsfaktor, Co = Vakuum Lichtgeschwindigkeit, n = Kernberechnungsindex\n" +
                                    "Datenrate = Datengröße/Downloaddauer z.B: Mbit/s = MB/s\n" +
                                    "c = Co * NVP, c = s/t, c=Co/n, V=s/t"),
            },
            {//Netzwerkstrukturen, -komponenten, -standarts, und -modelle unterscheiden
                    new Term("On Premise <-> Off Premise","On Premise:\n Firmendaten im eigenen Haus:\n (+) max Kontrolle, Datenzugriff ohne Internet, Keine Weitergabe an Dritte. \n" +
                            "(-) Eigenverantwortung, Mehrarbeit, Verfügbarkeit, Wartung, Updates und Backup obliegen dem Unternehmen, Höhere Kosten, betrieb lokaler Rechenzentren\n\n" +
                            "Off Premise:\n Cloud Lösung:\n (+) günstig, kein eigenes Personal Serverkomponenten Software, flexible Skalierbar, Komponenten zuwählbar, Räumliche Unabhängigkeit durch Datenzugriff via Internetverbindung,\n" +
                            "Zugriff auf fachliches Know-How, Betrieb Backup Wartung und Updates durch Spezialisten\n" +
                            "(-) Datenweitergabe, Abokosten, Abhängigkeit, Verfügbarkeit, Kapazität, Starke und Zuverlässige Internetverbidnung erforderlich"),
                    new Term("Cloud Typen","public cloud,\n private cloud,\n hybrid"),
                    new Term("Netztopologie", "Bus(chain), Stern, Stern-Bus, Baum, Maschen (falls 1 Kabel ausfällt)\n" +
                            "V = N(N-1)/2\n\n" + "Bus-Topologie\n" + "+einfach installierbar, kurze Leitungen, - Netzausdehnung begrenzt, bei Kabelbruch fällt Natz aus, aufwendige Zugriffsmethoden\n\n" +
                            "Stern-Topologie\n" + "+verteilte Steuerung, große Netzausdehnung, -aufwendige Fehlersuche, bei Störungen Netzausfall, hoher Verkabelungsaufwand\n\n" +
                            "Ring-Topologie\n" + "+weniger Schnittstellen als Stern, -höhere Bandbreitenanforderungen als Stern\n\n" +
                            "Baum-Topologie\n" + "Ausfall Endgerät („Blatts“) harmlos, erweiterbar, auch auf große Entfernungen, -Ausfall VerteilerGerät (Strukturinnern) hat Folgeausfälle,"),
                    new Term("3-Stufige Verkabelungshierarchie",
                            "Geländeverkabelung (Primärverkabelung):\nSV Standortverteiler|x|Router---LWL(meist mehrere 100m, max 150m)---\n" +
                            "Gebäudeverkabelung (Sekundärverkabelung):\nGV Gebäudeverteiler|x|Router,Switch(wenn nicht so viele)---Ausfallsicherung(av)---GV2---LWL,Patch(>100m, max 500m)---\n" +
                            "Etagenverkabelung (Tertiärverkabelung): Sterntopologie, EV Etagenverteiler|x|Switch---av---EV2--av--EV3---av---EV---(LWL),Patch(<100m)---\n" +
                            "TA Technischer ANschluss --- Endgerät\n\n stattdessen Bild einfügen"),
                    new Term("Strukturelle Verkabelung",
                            "Campusverkabelung, Primärverkabelung, Lichtwellenleiter\nStockwertsverteilung, Sekundärverkabelung, Lichtwellenleiter, Kupferkabel" +
                            "EV Etagenverteiler, Etagenverkabelung, Primärverkabelung, Lichtwellenleiter"),
                    new Term("Strukturierte Verkabelung Anforderungen",
                            "Kabellängen dürfen nicht überschritten werden, sollten möglichst kurz sein, bessere Übertragung\n" +
                            "Patchfeld, Switch, Hubs & Router als Bindeglied"),
                    new Term("Welches Kabel bei <100m?", "Kat 7 Patch\n(bei länger: Switch oder LWL)"),
                    new Term("Welches Kabel bei >10Gbit Übertragungsrate?", "Cat 7"),
                    new Term("LWL",
                            "Glasfaserkabel, Lichtwellenleiter\n(+) kein Stör durch Funk,\n kein Nebensprechen,\n keine Abhängigkeit von Frequenzen,\n hohe Datenrate,\n unterschiedliche Freq (Farb) gleiche Leitung\n\n"+
                            "Aufbau:\nKern, Mantel, Schutzbeschichtung\n" +
                            "Schichten aus unterschiedlichen Plastik Zusammensetzungen\n" +
                            "Brechungsindex nKern > nMantel (=meist aus reinem Quarzglas)\n" +
                            "dadurch Totalreflexion (Strahlungsführung) an Schichtgrenze\n" +
                            "Wellenleiter die elektromagnetischen Strahl von ultraviolet bis infrarot Spektralbereich (350-2500nm)\n" +
                            "Schwingungsmodenarten abhängig von Geometrie & Beschaffenheit"),
                    new Term("Netzwerkkabel",
                            "8 Leitungen 4 Paare\n" +
                            "jedes Paar kann geschirmt sein + zusätzliche Schirmung um alle Leitungen, um all das: Plastikhülle\n"),
                    new Term("Verdrillen","der Adernpaare verhindert Aussenden magnetischer Störstrahlung\n"+
                            "ebenso haben sich Störungen bei von außen eingestrahlten Störungen gegenseitig auf"),
                    new Term("Schirm",
                            "Schützt vor Störfrequenzen anderer Leitungen, Umhüllung Adernpaare, erhöht Verträglichkeit, Abhörsicherheit, verhindert Übersprechen"),
                    new Term("EMV",
                            "Elektro Magnetische Verträglichkeit: Realisierung bei Datenübertragung durch Schirmung durch Verdrillung,\n" +
                            "es entstehen entgegengesetzte Ausgleichsströme deren Magnetfelder sich aufheben\n"),
                    new Term("Monomodefaser/Singlemodefaser",
                            "OS μm Kern-> 9/125 <-Mantel\n_Π_eingangsimpuls BILD Ω ausgangsimpuls\n" +
                            "Mode am Ausgang, der Durchschnitt in der Größenordnung  der Wellenlänge\n" +
                            "theoretisch keine Begrenzung in der Frequenzen: Längen >100 km möglich"),
                    new Term("Multimodefaser",
                            "mit Stufenindexprofil OM 50/125\n_Π_eingangsimpuls BILD Ω ausgangsimpuls\n" +
                            "unterschiedliche Wellenlängen für Licht von Signal, am Ende verbreiterung von Signal (vrgl Taschenlampenkreis)\n" +
                            "-> Begrenzung Datenrate & Länge"),
                    new Term("Kabel",
                            "Singlemode-Fasern bieten die höchsten Übertragungsraten\n Aufgrund hoher Kosten für die Verlegung über lange Strecken werden meist sehr hochwertige Fasern vergraben" +
                            "Kunststofffasern sind für kurze Strecken (z.B. im Pkw) gut geeignet"),
                    new Term("AWG", "American Wire Gaug,\n Codierung Drahtdurchmesser\n Amerikanisches Dichtmaß"),
                    new Term("Standartkabel", "1000 Base-SX, 10 GbaseT"),
                    new Term("??..", "Höhere Frequenz, höhere Dämpfung, mehr magnetische Effekte"),
                    new Term("Kabelverlegung in Boden", "bestimmte Kabel verlegen,\n da Boden aufmachen sehr teuer\n" +
                            "100-200 Euro/m, Kabelpreis:1 Euro/m"),
                    new Term("Glasfaserbaugebiet Recherchieren",
                            "deutsche-glasfaser.de/netzausbau/baden-württemberg"),
                    new Term("Erdschleifen",
                            "eine zur Schleife geschl Massenverbindung (bei Erdung), wenn Potentiale der Massen unterschiedlich kommt es zu Ausgleichsströmen (Störungen möglich)"),
                    new Term("Patchfeld", "passive Netzwerkkomponente, braucht kein Strom"),
                    new Term("IEEE", "Institute of Electrical & Electronics Engineers"),
                    new Term("IEE 802.11", "Grupppe von Standarts für n Funknetzwerk auf Basis von Ethernet WLAN auf Basis von 802.11"),
                    new Term(" IEEE - 802.11n | 802.11ac | 802.11ad",
                            "year:                    1999 | 2003       | 2006\n" +
                                    "max Übertrgrate:   600 MBit/s | 1,3 GBit/s | 6,9 GBit/s\n" +
                                    "max Reichweite:          100m | 50m        | 10m \n" +
                                    "Freq.Band:          2,4+5 GHz | 5 GHz      | 60 GHz\n" +
                                    "max Send/Empfansgber:     4x4 | 8x8        | 1x1\n" +
                                    "Antennentec:             MIMI | HU-MIMO    | Beamforming\n" +
                                    "max Kanalbreite        40 MHz | 160 MHz    | 2 GHz \n" +
                                    "802.11ac Wave1=80MHz, Wave2=160Mhz"),
                    new Term("MIMO", "3x3 MIMO 2600 MBit/s,\n 4x4 MIMO 3500 MBit/s,\n 8x8 MIMO 6900 MBit/s"),
                    new Term("802.11ax", "NEU! jahr: 2019"),
                    new Term("WiFi",
                            "Wireless Fidelity (Treue, Genauigkeit) von WFA Alliance - Herstellerverband \n" +
                            "prüfen WLAN Geräte freiwillig auf Konformität mit IEEE Standarts und Interoperabilität\n" +
                            "WiFi4 (802.11n), WiFi5(802.11ac), WiFi6(802.11ax)"),
                    new Term("Frequenzbereich",
                            "2,4 GHz ~(2,39-2,49), Reichweite: akteptabel(Haus), Kanalbreite: 20 & 40 MHz, sehr häufig genutzt (überfüllt)\n" +
                            "5 GHz, begrenzt (Wohnung/Stadt), 20, 40, 80, 160 MHz, (gering)\n" +
                            "60 GHz,gering (Raum), 2 GHz, (selten)"),
                    new Term("Bandbreite (freq:) Rechnen:", "1500MHz*km / 3 km = 750 MHz auf 3km"),
                    new Term("ISO", "International Organisation for Standartisation"),
                    new Term("OSI", "Open Systems Interconnections"),
                    new Term("OSI 7 Layer Modell",
                            "7 Anwendung - Anwendung unterster Dienste, Netzwerkmanagement\n" +
                            "6 Darstellung - Umsetzung Daten → Startformat, Interpreation dieser gemeinsamen Formate, Einheitliche Darstellung der Daten\n" +
                            "5 Sitzung - Prozess zu Prozess Verbindung, Prozesssynchro, Sitzungsaufbau\n" +
                            "4 Transport - logische Ende zu Ende Verbidnung in Abstraktion der Übertragungssysteme, Adressieren von Anwendungen\n" +
                            "3 Netzwerk - Wegbestimmung im Netz, Routing, Datenflusskontrolle, Adressieren von Netzen und Rechnern\n" +
                            "2 Sicherung - logische Verbindung mit Datenpaketen, elementare Fehlererkennungsmechanismen, Addressieren von Netzwerk Interfaces\n" +
                            "1 Bit-Übertragung - Nachrichtentechnische Hilfsmittel für Übertragung von Bits"),
                    new Term("ARP", "Adress Resolution Protocol:\n liefert MAC (des Netzwerk-Interfaces) zu IP\n(OSI 2-3)\n\n"+
                            "ingesetzt um zu bekommen: MAC-Adresse von Zielrechner\n" +
                            "Interface-Adresse (IP) des Zielrechners muss beim Senden bekannt sein, in Adress-Feld des Ethernet-Frames einzusetzen\n" +
                            "ARP-Cache: hier speichert Rechner gelernte IP-Adressen Aufruf durch arp-a\n" +
                            "C:\\Users\\uri->arp -a\n" +
                            "Schnittstelle: 192.168.83.1 --- 0x3\n" +
                            "   Internetadresse   Physische Adresse  Typ\n" +
                            "   192.168.83.254    00-50-56-e7-48-5e  dynamisch\n" +
                            "   192.168.83.254    ff-ff-ff-ff-ff-ff  statisch"),
                    new Term("DNS", "Domain Name Service:\n Übersetzung URL -> IP Adresse\n(OSI 7)\n\n"+
                            "Name Auflösung . domain Paulinenpflege.de\n" + "(DNS-Abfrage) =^ 139.119.81.86 öffentl IP-Adr"),
                    new Term("DHCP", " Dynamic Host Config Protocoll (OSI 7)\nVerteilt die Ip_Konfiguration an Rechner im Netz\nIP Adressen automatisch konfigurieren"),
                    new Term("TCP", "Transmission Control Protocol\n Übertragungs Steuer Protocol:\n auf welche Weise Netzwerkkomponenten austauschen?\n OSI 4\n"),
                    new Term("RFC", "Request for Comments\n Festlegung Protokolle\n ietf.org/rfc/rfc793.txt\n hier: TCP"),
                    new Term("Header Protokollkopf",
                            "Header (Protokollkopf) - Daten senden in Netzwerk (zB Mail) Browseranfragen an Webserver\n" +
                            "Diese Nutzdaten werden an darunter Schicht übergeben, jede hängt ihren Header vor und gibt Datei weiter runter.\n" +
                            "Auf Schicht 1 nicht, sondern umwandlung in elektrische oder optische Signale und Ausgabe auf dem Netzwerkmedium\n" +
                            "Layer 7 Application-Layer: App-Header, App.-Nutzdaten\n" +
                            "Layer 4 Transport-Layer: TCP-Header, App.-Header, App.-Nutzdaten\n" +
                            "Layer 3 Internet-Layer: IP-Header, TCP-Header, App.-Header, App.-Nutzdaten\n" +
                            "Layer 2 Data-Link-Layer: Ethernet-Header, IP-Header, TCP-Header, App.-Nutzdaten, Eth.-Trailer\n" +
                            "Layer 1 Physical-Layer: 01010101010101010101010\n"),
                    new Term("Kapselung",
                            "Verkapselt (Nutzdaten) - Versenden Daten, bekommen von oben nach unten je Schicht Header angefügt\n" +
                            "entkapselt - Empfangene Daten wrden von unten nach oben bis zum Adressat gereicht, Nutzdaten werden ausgepackt, die Header entfernt"),
                    new Term("MAC, IP, IPv6, Port: OSI, Größe(bit), Beispiel, Adressant",
                            "MAC | OSI 2 | 48 bit | 00-11-22-33-44-55, 00-50-56-C0-00-08 | to: Netzwerk-Interface\n" +
                            "IP | OSI 3 | 32 bit | 10.20.11.12, 10.20.0.0/16 | to: Netz & Host, Netzwerk\n" +
                            "IPv6 | OSI 3 | 128 bit | 2a02:8070:88a3:9d00:13dd | to: Netz & Host\n" +
                            "Port | OSI 4 | 16 bit | 80 | to: Anwendung"),
                    new Term("IP Adresse Aufbau",
                            "        |Subnetzanteil\n" +
                                    "192.168.x.x-Hostanteil(0-255)\n" +
                                    "|      |\n" +
                                    "Netzanteil\n\n"+
                            "Subnetzmaske:\nbeschränkt IP-Variationen z.B: in einem Netz\n"+
                            "Netzwerkadresse:\nerste Adresse in einem IP-Adr Bereich\n"+
                            "Broadcastadresse:\nletzte Adresse in einem IP-Adr Bereich, sind nicht an Host vergebbar"),
                    new Term("IP",
                            "notwendig:\n" +
                                    "IP Adresse: 192.168.1.10 - DHCP Pack von WLAN Router\n" +
                                    "Subnetzmask: 255.255.255.0 - \"\n" +
                                    "Gateway: 192.168.1.1 - Adr Anschluss von Clients zum Router\n" +
                                    "DNS Server: 8.8.8.8\n" +
                                    "\n" +
                                    "Time-Server:\n" +
                                    "Lease-Time: Config nur für Lease-Time gültig"),
                    new Term("Internet Netzwerk Aufbau",
                            "               O Internet\n" +
                                    "öffentliche IP-|\n" +
                                    "               O-Router Por\n" +
                                    "private IP __/ | \n" +
                                    "            /  |  \n" +
                                    "   Rechner O   O   O"),
                    new Term("IPv6",
                            "IPv4 und IPv6 können mithilfe geeigneter Mechanismen (z.B: Tunnelmechanismus) parallel betrieben werden" +
                            "A:B:C:D:E:F:1:2 ist eine gültige IPv6 Adresse\nWindows 10 unterstützt IPv6\nFührende Nullen in einem Block von 4 Hexadezimal-Ziffern können weggelassen werden. Bsp: 002B -> 2B" +
                            "Benachbarte Blöcke von Nullen können durch :: ersetzt werden\n:: kann nur an einer Stelle der IPv6 Adresse angewandt werden, wegen Eindeutigkeit" +
                            "A0000:0000:0000:0000:0000:0000:0000:000B -> A000::B\nAF00:0000:0000:E255:0000:0001:332D:81FA -> AF00::E255:0:1:332D:81FA\nEin Hauptgrund für die Entwicklung von IPv6 ist die Erweiterung des Adressraums" +
                            "IPv6 hat 2^128 Möglichkeiten zur Bildung von Adressen\nBei mehreren Blockfolgen aus Nullen wird längere ersetzt" +
                            "Bei gleich langen Blockfolgen aus Nullen wird die erste ersetzt\nBEAF:0776:00A0:E222:D000:0012:0000:0000 -> BEAF:776:A0:E22:D000:12::" +
                            "A21B:C756:0000:0000:1234:0000:0000:01AB -> A21B:C756:1234:0:0:1AB"),
                    new Term("NAT", "Network Adress Translation (OSI 3)\n" +
                            "in Rechnernetzen der Sammelbegriff bei Änderungen von Adressen im IP-Header von IP-Paketen"+
                            "NAT ermöglicht ua. die gleichzeitige Verwendung einer öffentlichen Adresse (vrgl. private Ip-Adressen)"+
                            "durch mehrere Hosts. Üblicherweise übernimmt der Router im Netzwerk die SNAT*, der die Verbindung zum Internet herstellt"+
                            "(daher ist in der Regel dieser Router das Default-Gateway eines Hosts)\n" +
                            "*SNAT = Secure NAT\n\n"+
                            "Verbidnung 1 - Port 50\nVerbindung 3 - Port 51"),
            },
            {//Selbstständig die Integration von Clients in ein Netzwerk planen und druchführen
                    new Term("DHCP Protokoll", "Dynamic Host Config Protocoll\nVerteilt die Ip_Konfiguration an Rechner im Netz\nIP Adressen automatisch konfigurieren\n\n"+
                            "DHCP-Discover - DHCP Gerät schickt DHCP Aufdeckungs-Nachricht\n" +
                            "DHCP-Offer - DHCP Server antwortet mit Offerte\n" +
                            "DHCP-Request - DHCP Gerät sendet Anfrage\n" +
                            "DHCP-Ack - DHCP Server antwortet mit Bestätigung"),
                    new Term("Add-Hoc Netz",
                            "(Peer to Peer, PC zu PC), wenn der eine im Netz besseres Netz hat als du, verwendet dein Handy dem seine Verbindung. \n" +
                            "Sensoren aller Teilnehmer werden eins, verbinden sich, arbeiten zusammen."),
                    new Term("Bluetooth", "IEEE 802.15.1 WPAN:\n" +
                            "Verwendung: vereinzelt Datenübertragung bei geringer Datenmange, Verbindung von kabellosen Kopfhörern, Lautsprechern, Tastaturen, Maus, Drucker, kurze Entfernung,\n" +
                            "nicht sicher (DoS, Lauschangriff)\n" +
                            "Bluetooth-Datenpakete: 72-Bit Zugriffscode, 54 Bit-Header, 0-2745 Bit Nutzdatenfeld"),
                    new Term("asymetrisch", "Datenrate Upload nicht gleich Download"),
                    new Term("Bluetooth-Protokoll", "entweder asymetrisch Datenkanal 732 kbit/s - 57 kbit/s (ich glaub verteilt je nachdem was stärker genutzt wird)\n" +
                            "oder symetrisch 433 kbit/s in beide Richtungen\n" +
                            "möglich sind TCP oder UDP Protokolle"),
            },
            {//Die Netzwerkfunktion der Clients prüfen und warten
                    new Term("DNS", "Domain Name Service:\n Übersetzung URL -> IP Adresse\n(OSI 7)\n\n"+
                            "Name Auflösung . domain Paulinenpflege.de\n" + "(DNS-Abfrage) =^ 139.119.81.86 öffentl IP-Adr"),
            },
            {//Netzwerkkomponenten auswählen und konfigurieren
                    new Term("AP Accespoint (Beacon):",
                            "muss nicht immer Router sein, kann auch Hub(Verstärker) sein.\n" +
                            "WLAN benutzt Frequenzbänder bei 2,4 5 & 60 GHz.\n" +
                            "IOS ist ein Betriebssystem für Router.\n" +
                            "SoHo-Roter werden meist mit Linux Betriebssystemen betrieben."),
                    new Term("WLAN", "802.11xx - OSI 1 & 2\n" +
                            "Wireless AP übernimmt Routers Aufgabe, der Clients ind Netzwerk einbindet.\n" +
                            "Beacons (kleine Datenpakete) in Intervallen gesendet (übl: 10x je Sec), an allen Stationen in Empfangsbereich.\n" +
                            "Sie enthalten: Netzwerkname (SSID Service Set Identity), Liste unterstützter Übertragungsraten, Art der Verschlüsselung WPA 2 / WPA 3.\n" +
                            "Dies erleichert den Verbindungsaufbau, wird aber mit niedriger Übertragungsrate (1 MBit/s) gesendet.\n" +
                            "Ein erfolgreicher Empfang garantiert also noch keine stabile Verbindung mit Netzwerk.\n" +
                            "Pysikalische Verbindung (Funk) -> Layer 2 Gerät antwortet, -> Anmeldung möglich."),
                    new Term("Aufg aus BspPrüfung\n2.12.1 WLAN Standarts Entscheidungskriterien (nenne 2):",
                            "Bandbreite (Datenrate, Internetgeschwindigkeit): in Mbit/s, Reichweite, Störer, Roaming, Wanddurchdringung, Userzahl je Kanal, Nutzungshäufigkeit des frequenzbandes (bereiches)(2,4GHz/5GHz) durch Endgeräte\n" +
                                    "60 GHz Band (hier: 802.11ad) - geringe Reichweite, kein Roaming, keine Wanddurchdringung\n" +
                                    "802.11ax - NEU, nur wenige Geräte bzw. WLAN-Router / Access Points verfügbar\n" +
                                    "Empfehlung!: 802.11n - möglich, aber nicht unbedingt sinnvoll, da älterer Standart mit geringerer Bandbreite von max 600 Mbit/s\n" +
                                    "Empfehlung!: 802.11ac - da Nutzung des 5GHzFrequenzbandes mit wenig Störern, derzeit noch wenigen Clients, hoher Bandbreite von max 1,3 GHz (brutto), ausreichende Reichweite, Roaming-Möglichkeit und hoher Teilnehmerzahl durch MIMO"),
                    new Term("Aufg aus BspPrüfung\n2.2 Kanalverteilung Kanalbandbreite z.B: 20 MHz",
                            "Kanal 36,48,40,44,40,44,36,48\n" +
                                    "Zahlenspanne = Kanalbreite, geleiche Kanäle dürfen sich nicht überlappen"),
                    new Term("Aufg aus BspPrüfung\n2.3 Bandbreite der Netzwerkleitung (LAN) Switch - AP Acess Point",
                            "1 GBit/s, da z.B: 802.11ac Bandbreite für Datenübertragung max 1,3 GHz(=^ 1,3 GBit/s) (Netto ~ 700 Mbit/s)\n" +
                                    "und 802.11n max 600 MBit/s (Netto ~300)"),
                    new Term("Aufg aus BspPrüfung\n2.3 AP mit Betriebsspannung:",
                            "PoE power over Ethernet\nStromversorgung über Ethernet:\n Verfahren mit dem networkfähige Geräte über achtdrahtiges Ethernetkabel mit Strom versorgt werden"),
                    new Term("Aufg aus BspPrüfung\n2.4 WLAN Schutz, mehr als allgemein übliches Passwort:",
                            "User-Authentifizierung:\nMitarbeiter mittels RADIUS-Server,\n Gäste Authentifizierung mittels CaptuiP.,\n Ticketsystem inclusive Erläuterung"),
            },
            {//Grundlage der Daten- und Netzwerksicherheit beschreiben"
                new Term("RAID","siehe Ordner 2")
            },
    };
    private static Term[] termsLF4 = {
            new Term("Sicherheitsfragen IT-Unternehmen",
                    "Verantwortungszuweisung\nBerechtigungsvergabe\nBeaufssichtigung/Begleitung Fremdpersonen\nSchutz sensibler Daten am Arbeitsplatz\nGeräte/Betriebsmittelverwaltung durch Leiter\n"+
                    "Reaktion auf Verletzung der Sicherheitsvorgaben durch Informationssicherheitsbeauftragten ISB\nPseudonymisierung & Verschlüsselung personen bezogener Daten, Vertraulichkeit Integrität Verfügbarkeit\n"+
                    "Belastbarkeit in zsmh mit ihrer Verarbeitung auf Dauer sicher zu stellen, Rasche wiederherstellung bei Zwischenfall\nRegeln überprüfen Evaluierung Berwertung der Wirksamkeit\n"+
                    "Schnutzniveau nach Wert (Schadenspotential) Berücksichtigen: Technischer Stand, Kosten, Umfang, Umstände, Risiko\nZugang nur auf Verantwortung Verantwortlicher außer Verpflichtung nach Recht EU bzw EU-Staat"),
            new Term("DSGVO",
                    "12 Transparente Information, Kommunikation und Modalitäten zur Ausübung der Rechte\n13 Informationspflicht bei Erhebung von personenbezogenen Daten\n"+
                    "14 Informationspflicht wenn Daten nicht bei der betroffenen Peerson erhoben wurden\n15 Auskunftsrecht der betroffenen Person\n16 Recht auf Berichtigung\n"+
                    "17 Recht auf Löschung, Vergessenwerden\n18 Recht Einschränkung der Verarbeitung\n19 Mitteilungspflicht im Zsmh mit Berichtigung, Löschung, Einschränkung\n"+
                    "20 Recht auf Datenübertragbarkeit\n21 Widerspruchsrecht\n22 Automatisierte Entscheidungen im Einzellfall einschließlich Profiling\n23 Beschränkungen der Rechte verhältnismäßig in besonderen Fällen"),
    };
    private static Term[] termsLF6 = {
            new Term("Software Lebenszyklus",
                    "1 Beratung\n2 Beschaffung\n3 Bereitstellung\n5 Helpdesk, Service Desk\n6 Kontrolle\n7 Anpassung\n8 Ersatz\n9 Entsorgung"),
            new Term("Einflüsse Servicebereitstellung",
                    "Verwendungszweck\nRessourcen\nMitarbeiter Rollen\nPartner\nwohin, woher\nDringlichkeit"),
            new Term("Einflüsse Servicebereitstellung",
                    "Service & Geschäftsmodellwandel, Schulungen, MA motivieren\nServicekette zu Teams unterschiedlicher Dienstleister\nwelche: Prozesse, Objekte, Systeme"+
                    "Kunden\nEltern\nGesetze\nLieblingsspiel\nRichtlinien\nZimmermöbel\nServicearten\nRichtlininen\nVerfügbarkeit"),
            new Term("Servicearten",
                    "IT-Handel\nIT-Service\nCloud\nReperatur\nVor-Ort-Service\nAustausch-Service\nChatbot\nLive-Chat\nManaged-Services"+
                    "Wartung\nSchulung\nHelpdesk"),
            new Term("Serviceanalyse",
                    "Vorgang neu?\nWas zu tun?\nBeteiligte?\nWelche Verpflichtungen gegenüber Kunden?\nReaktionszeit, MA & Ressourcen planen"),
            new Term("Aufgabenzuordnung, Rollenmuster nach R-A-C-I",
                    "Responsible (durchführendverantwortlicher)\nAccountable (Kostenverantwortlicher)\nConsulted (Berater)\nInformed (Personen die es wissen sollten)"),
            new Term("ITIL 3 Standart (Information Technology Infrastructure Library) werden Managementsysteme für Services unterschieden nach:",
                    "Planung\nKoordinierung & Entwicklung\nTransfer / Neuausrichtung (Transition)\nBereitstellung / Erbringung von Services (Operation)"),
            new Term("ITIL 4: 6 Wertschöpfungs-Kernaktivitäten (Grundprinzipien):",
                    "Planen\nVerbessern\nBeteiligen\nDesign & Überleitung\nBeschaffen & Erstellen\nAusliefern und unterstützen"),
            new Term("ITIL 4: Definiert 34 offene, einfache und agile Best-Practices zur Steuerung und Überwachung der Service-Wertschöpfungskette: z.B:",
                    "Allgemeine Managementpraktiken z.B: Architecture Management, Projekt M, Relationship M, Risk M, Service Financial M, Info Security M"+
                    "Service Management Praktiken z.B: Availability M, Business M\nTechnische Management Praktiken z.B: Deployment M, Infrastructure & Platform M, SW Development M"),
            new Term("4D-Model: Wertschöpfung erfolgt unter Verbindung von:",
                    "Organisationen & Personen\nInformationen & Technologien\nPartner & Lieferanten\nWertströme & Prozesse"),
            new Term("4D-Model: Wertschöpfung erfolgt unter Verbindung von bspw: Organisationen & Personen und unter Berücksichtigung äußeren Randbedingungen:",
                    "rechtlichen\ntechnischen\nwirtschaftlichen\npolitischen\nsozialen\numweltfaktoren"+
                    "sowie: KVP (kintinuierliche Verbesserung)\nund: Beachtung von Regelungen & Leitbildern"),
            new Term("Frameworks & Standarts",
                    "Problem: Service Systeme sind komplex müssen untereinander passen & abgestimmt sein für Austausch, Beteiligte müssen zsm. Arbeiten: Begriffe, Verfahren, APIs benötigt"+
                    "Lösung: Rahmenwerke (Frameworks) + Normen & Zertifizierungen* zur Sicherung der einheitlichen Vorgaben."+
                    "je nach Anwendungswunsch mehrere Normen & Organisationen:\nBSI, DGI, compTIA, PMI, IStQB"),
            new Term("Wie kam es dass Rechtliche Vorgaben gebraucht wurden",
                    "Problem: Planung & Durchführung von Services bedeuten Risiken für Untenehmen"+
                    "Lösung: Regelsysteme (Governance) einführen: Menschen müssen sich dran halten (Compliance(Einhaltung)) sonst wertlos."+
                    "ein Service wird über ein SLA (Service-Level-Agreement) vertraglich mit dem Kunden geregelt, auch Eigen- bzw. Fremdleistung von Partnern müssen geregelt werden"+
                    "Unternehmen müssen sich immer an aktuelle Rechtslage anpassen und ihre Kunden (möglicherweise auch Unternehmen) informieren, auch Standartverträge entsprechend anpassen"+
                    "Wichtige Gesetze/verordnungen in IT\nBGB, HGB, UWG (unlauter WB), Datenschutzgesetz, DSGVO, Urheberrecht"),
            new Term("bei Serviceaufnahme",
                    "1 kategorisieren\n2 klassifizieren\n3 priorisieren\n4 eskalieren?\n4 katalogisieren\n5 welcher Kunde? welcher Vertrag? besondere Anforderungen?"),
            new Term("Kundenzufriedenheit:",
                    "Kunde will... einfachen Service, im Mittelpunkt sein, schnell, unkompliziert\n"+
                    "Auswertung von... Tickets, Reklamation, Beschwerden, Feedbacks / Bewerungen, Weiterempfehlungsbreitschaft\n"+
                    "Mitarbeiter reflektieren: Selbstbild, Vorgesetzte, Kollegen & Servicepartner, interne & externe Kunden\n"+
                    "IT Monitoring: dauerhafte Systemüberwachung KPI-Werte, MTTR Meantime to Repair, MTBF Meantime between failures\n"+
                    "Vergleich Ist/Soll: bspw... Anrufe pro Tag, Höchstwerte zu best. Zeit, Anzahl & Status der Tickets, Verfügbarkeit eines Systems"),
            new Term("Mitarbeiteranforderungen zur Analyse, das Service Anfragen vielfältig:",
                    "hohe Einsatzbereitschaft + Analysefähigkeit\nhohe Kunden & Serviceorientierung\nTeam & Kommunikationsfähigkeit\n"+
                    "Eigeninitiative, Zuverlässigkeit, Belastbarkeit\nlösungsorientierte Denkweise\ntechnische Kenntnisse haben / erweitern\n"+
                    "Fachkenntnisse von Startvorgang der verantworteten Systeme\nverständliches Ausdrücken in Wort und Schrift\n"+
                    "häufige Probleme: falsche Schlüsse & Hintergrund des Problems wird nicht erkannt"),
        //6.4
        new Term("Servicegerecht kommunizieren",
            "höflich und nicht zu ausschweifend\n" +
            "Kundenstruktur, Bestimmungsgründe, Präsentationsregeln, Gesprächsführung, Kommunikationsregeln, Einwandbehandlung, Teambesprechung, Konflikte, Onlinekkommunikationsmittel, sichere Kommunikation"),
        new Term("Kommunikationskanäle",
            "Chatgruppen, Forum, Anruf, Videoanruf, SMS, E-Mail, Soziale Medien, Helpdesk"),
        new Term("Netiquette","Verhaltenscodex von Platformbetreiber/Kanal"),
        new Term("non-verbale Kommunikation",
            "Auch wenn Gesprächsteilnehmer nicht sichtbar ist, ist das Maß der Anteilnahme spürbar\n" +
            "Programme können Gemüt von Stimmen analysieren"),
        new Term("Compliance:",
            "Selbstverständnis einer Firma z.B: Ethisch, Green-IT, Gewinn, Coorperate-Identity-Behaivior"),
        new Term("Kollaborativ","gemeinsam an Dokumenten arbeiten"),
        new Term("Hyperkommunikation","Kommunikation auf verschiedenste Weisen (breites Spektrum)"),
        new Term("Metakommunikation","anstatt über ein Thema zu reden darüber zu reden wie zu reden"),
        new Term("Synchrone Kommunikation","Zeitlich abgestimmt z.B: Chat"),
        new Term("Synchrone Kommunikation","Zeitlich abgestimmt z.B: Chat"),
        new Term("Asynchrone Kommunikation","Zeitlich versetzt z.B: Briefe, E-Mails"),
        new Term("Prinzipen der Arbeitsorganisation","Siehe Buch S.64"),
        new Term("Eisenhower Prinzip","1. sofort nachgehen wenn wichtig und dringend,\n 2. in Zeitplan berücksichtigen wenn wichtig und nicht dringend,\n" +
            "3. an Mitarbeiter delegieren wenn unwichtig und dringend,\n 4. In den Papierkorb werfen, wenn unwichtig und nicht dringend"),
        new Term("Pareto Prinzip","80/20 20% der Akteure erbringen 80% der Gesamtleistung"),
        new Term("ABC-Analyse","A Ware = Bringen Großteil des Umsatzes"),
        new Term("Leistungsträger","leisten mehr (maßgeblich)\nTeam gesund mischen"),
        new Term("Kommunikationsmodell nach Schulz und Thun",
            "andere Namen: Nachrichtenquadrat, Vier-Ohren/Seiten-Modell,\n" +
            "--1--\n" +
            "2---3\n" +
            "--4--\n" +
            "1. Sachinhalt: wrüber informiere ich?\n" +
            "2. Sender-> Selbstoffenbarung, was gebe ich von mir Kund? (Absichten, Gefühle, usw.)\n" +
            "3. Apell: Wozu möchte ich Empfänger veranlassen\n" +
            "4. Beziehung: Was halte ich vom Empänger und wie stehen wir zueinander\n" +
            "Ebenen: Sachebene, Beziehungsebene, Geschäftsordnung"),
        new Term("Sieben-Phasen-Modell nach Steich",
            "Veränderungen werden nicht gleich positiv aufgenommen\n" +
            "1. Schock, 2. Verneinung, 3. Einsicht, 4. Akzeptanz, 5. Ausprobieren, 6. Erkenntnis, 7. Integration"),
        new Term("Drei-Phasen-Modell nach Lewin",
            "Auf alle drei Phasen wirken Hämmende und treibende Kräfte ein\n" +
            "Die Produktivität verläuft von Phase 1 nach 3.\n" +
            "Die Leistung verläuft gemächlich in Phase 1,\n" +
            "sinkt mit Eintritt in Phase 2 zu ihrem Minimum in dem ersten Viertel der Phase 2, steigt ab dann aber stark bis zum Eintritt in die Phase 3,\n" +
            "wo sie wiederrum gemächlich verläuft\n" +
            "1. Phase: Auftauen(Unfreezing), 2. Phase: Bewegen(Changing), 3. Phase: Einfrieren (Refreezing)\n"),
        new Term("Problemanalyse nach Kepner-Tregoe (KT-Analyse)",
            "Tabelle 2 Spalten: Ist gestört, Ist nicht gestört, 4 Zeilen: Was? Wo? Wie viel? Wann?"),
        new Term("Gute Kommunikation am Servicedesk S.68",
            "Gesprächsphasen eines erfolgreichen Servicegespräches, Erfolgsfaktoren am Helpdesk (auch bei schwierigen Gesprächspartnern)," +
            "Helpdesk-Fragen, Andere Anrufen, Zauberworte, Anti-Worte, Professionelle Verabschwiedung am Telefon"),
        new Term("Konfliktsituationen Typen","Streitsüchtige,\n Allwissende,\n Träge,\n Schüchterne,\n Schlaue"),
        new Term("geschlossene Fragen","hier: sollen Redefluss verringern z.B: Wie oft trat Problem auf? Antwort hat Zahl zu sein"),
        new Term("Deeskalationsstrategien","espektvolle Grundhaltung, Empathie, Aktiv Hin-Hören, Ruhe bewaren, Wirkung von Stimme und Körperhaltung beachten, \n" +
            "Klären ernst nehmen entschuldigen Position beziehen und freundlich Grenzen setzen"),
        new Term("proaktiv","von selbst vorarbeiten"),
        new Term("reaktiv","nacharbeiten"),
        new Term("Prevention","günstiger als Reperatur. Defekt / Schaden wird sonst noch größer bspw. wenn Keilriemen nicht rechtzeitig gewechselt wird, geht ganzer Motor kaputt\n" +
            "z.B: Lasttests bei Festplatten für Ableitungen für Lebensdauer"),
        new Term("Instandhaltung/Wartung",
            "Reaktiv: Nach Vorfall handeln, zeitbasiert zu spät,-> Reporting\n" +
            "Proaktiv: Früh handeln: 1. periodisch geplant, zeitbasiert zu früh?,-> Wartungsplan, 2. präventiv vorbeugend, bediengungsbasiert noch rechtzetig?,-> Monitoring,\n" +
            "3. prädiktiv vorhersagbar, datenbasiert genau richtig!,->Analytics + AI\n" +
            "Empfohlen Monitoring + Analystics + AI"),
        new Term("Fehlermetrik","Bewertungsschema von etwas, das man messen will z.B: Verhaltensmetrix Paulinenpflege"),
        new Term("Instandhaltungsvarianten S.72 ",
            "Reaktiv - reparierend,\n Periodisch - geplant überwachen,\n Präventiv - vorsorglich,\n Prädiktiv - kontrollierend und optimierend"),
        new Term("Kundenberatung verbessern","Mit Medienkompetenz und Schulungsmaßnahmen"),
        new Term("KMK","Kultusministerkonferenz"),
    };
    private static Term[] termsLF7 = {
        new Term("IoT", "Internet of Things\n"+
            "beschreibt weltweit Vernetzung unterschiedlicher Objekte,\n" +
            "durch eindeutige Adresse erreichbar,\n" +
            "bei ihrer Kommunikation einheitliche Standartprotokolle eingesetzt,\n" +
            "um ihre Interoperabilität sicherzustellen"),
        new Term("Iot Vernetzung Beispiel LoRaWAN",
            "Long Range Wide Area Network (Low Power WAN)\n" +
            "max Reichweite: 702 km\n" +
            "Datenrate 0,3 - 50 kbps\n" +
            "energieeffizientes Senden von Daten über lange Strecken\n" +
            "speziell für IoT & IIoT entwickelt\n" +
            "LoRaWAN Geräte verbunden mit LoRa Gateways senden Datenpakete an LoRaWAN Server mit APIs für IoT Platformen & Apps\n"),
        new Term("IoT Beispiele",
            "Gefriertruhe vorkühlen um Stromspitzen zu entlasten\n" +
            "CO2 Sensor/Detector in Garage öffnet Fenster wenn CO2 Level steigt\n" +
            "Wintersalat aus Südamerika: Handy QR Code Scan zeigt Bauern"),
        new Term("IoT Anwendungsfelder",
            "Smartwatch Ferndiagnose an Arzt\nSmart Home Fernüberwachen und Steuern (Heizung)"),
        new Term("Industrie 1.0 bis Industrie 4.0",
            "1.0 (1784) Mechanisierung, Dampfkraft, Webstuhl\n" +
            "2.0 (1870) Massenproduktion, Montagelinie, elektrische Energie\n" +
            "3.0 (1969) Automatisierung, Computer, Elektronik\n" +
            "4.0 (Heute) Cyberphysikalische Systeme, IoT, Netzwerke"),
        new Term("Industrie 4.0",
            "Vernetzung virtuelle und reale Welt\n" +
            "Fertigungsprozesse verschmelzen mit Informationstechnologie\n" +
            "Disziplienen (z.B: Maschinenbau, Logistik, Dienstleistungen(Personal-, Ressorcenplanung)) kommunizieren miteinander\n" +
            "Produktionszyklen werden kürzer\n" +
            "Kundenbedürfnisse fließen in Echtzeoit in Produktion ein\n" +
            "Wartung & Instandhaltung regeln sich weitgehend eigenständig\n" +
            "Aufträge laufen automatisch in richtiger Reihenfolge ab -> Smart Factory"),
        new Term("Big Data (Massendaten)",
            "zu groß, zu komplex, schnelllebig oder zu schwach strukturiert um sie mit manuellen und herkömmlichen Methoden der Datenverarbeitung auszuwerten\n" +
            "Daher: neue Arten von Datenspeicher & Analysesystemen laufen parallel auf bis zu Hunderten oder Tausenden Prozessen, Servern\n"),
        new Term("Die 4 Big (Data) Dimensionen:",
            "volume, velocity (Datengeneration-&Transfer-Speed), variety (Bandbreite Datentypen & Quellen), veracity (Echtheit)"),
        new Term("Mögliche Datenquellen",
            "Überwachsungssysteme, Kunden- Bank- & Bezahl-Karten, elektrische Kommunikation persönliche Muster (Handys), \n" +
            "eletrische Geräte wie Fitnessbänder Smartwatches GPS, Social Media, Vernetztes Auto, Smart Homes, Behördendaten"),
        new Term("CPS Cyberphysisches System ",
            "Computer der etwas in physischer Welt steuert\n" +
            "Einheit von softwaretechnischen Komponenten mit mechanischen und elektronischen Teilen die über Cloud oder lokal Daten austauschen"),
        new Term("CPS Chancen & Risiken",
            "Chancen: Effizienzsteigerung (Produktivität) Wettbewerbsvorteile, Zeit- Strom- & Geldersparniss\n" +
            "Risiken: Datensicherheit, hohe IT-Kompetenz Mitarbeiter Anforderung"),
        new Term("CPS Datensicherheit",
            "IoT oft weniger gut verschlüsselt wie Rechner. besonderst zu beachten: Verschlüsselung, Authentifizierung"),
        new Term("Digitaler Zwilling",
            "virtuelles Dublikat am Computer z.B: als Crash-Dummie oder in der Medizin"),
        new Term("VR-Datenbrille",
            "Daten zu Objekten (z.B: Motor) in Sichtfeld laden (Reperaturhinweis Konstruktionsdaten)"),
        new Term("predictive Maintenance:",
            "Verschleißerkennung für Reperatur vor Störung"),
        new Term("Sensoren:",
            "z.B: in LKW Transport über z.B: ZigBee an Mobilfunkgerät und dann über Internet zu Spedition"),
        new Term("Supply Chain",
            "Güter Bewegung von Rohstoflieferanten zu Abnehmern des Endprodukts\n" +
            "braucht lange(l), mittelfristige(m) und kurzfristige(k) Entscheidungen\n" +
            "Beschaffungslogistik: Lieferantenauswahl(l), Materialbedarfsplanung(m), Personaleinsatz(k)\n" +
            "Produktionslogistik: Standorte(l), Produktionsprogramm(m), Ablaufplan(k)\n" +
            "Distributionslogistik: Distributionsnetz(l), Distributionsplanung(m), Tourenplanung(k)\n" +
            "Absatzlogistik: Produktprogramm(l), Absatzplanung(l,m,k)\n" +
            "Entsorgnungslogistik"),
    };

    private static Term[] termsLF8 = {
        new Term("SELECT & Co",
            "Syntaktische Reihenfolge der Klauseln in SELECT Anweisungen\n" + "SELECT - gewünschte spalten\n" +
            "FROM - tabelle(n)\n" + "WHERE - logische Bedingung für Datensätze / Tupel / Zeile\n" +
            "GROUP BY - Gruppenbildung für gleiche Werte in einer Spalte\n" + "HAVING - logische Bedingung für Gruppen\n" +
            "ORDER BY - sortieren\n"),
        new Term("Aggregatfunktionen",
            "COUNT (*, spaltenname, DISTINCT spaltenname)\n" + "SUM (spaltenname)\n" +
            "AVG (\")\n" + "MAX (\")\n" + "MIN (\")"),
        new Term("virtuelle Spalten",
            "zB\nbestellmenge - liefermenge AS Fehlmenge\n" + "AVG (listenpreis) AS Durchschnitt\n" +
            "COUNT (artikel-nr) AS Anzahl"),
        new Term("GROUP BY, HAVING(statt where)",
            "zB\nSELECT name\n COUNT (name) AS anzahl\n" +
            "FROM personen\n GROUP BY name\n HAVING COUNT (name, oder: anzahl?) >1"),
        new Term("LOWER","LOWER (wohnort)\ndadurch: MÜNCHEN = münchen\n zB in GROUP BY"),
        new Term("WHERE",
            "= / IS\n\n <> / != / IS NOT / NOT (=),\n\n" +
            "BETWEEN   AND\n\n <= AND >\n\n < OR >\n\n" +
            "LIKE ' %', '% ', '_ ', ' _', \n\n" + "IS NULL"),
        new Term("UNION","Vereinigung von 2 Abfragen"),
        new Term("DISTINCT","keine doppelt"),
        new Term("AND","AND wiegt schwerer als OR (AND höhere priorität)\n" +
            "A OR B AND C = A OR (B AND C)"),
        new Term("ORDER BY","(ganz am Ende)"),
        new Term("JOIN",
            "INNER JOIN\nzb SELECT M.name, M.vorname, A.bezeichnung\n" +
            "FROM mitarbeiter M INNER JOIN \n" + "abteilung A ON M.abtNr = A.abtNr\n" +
            "LEFT JOIN\n" + "(Alle Datensätze erster Tabelle übernommen, durch die der zweiten ergänzt(mit null aufgefüllt))\n" +
            "zB SELECT M.name, M.vorname, M.bezeichnung\n" + "FROM mitarbeiter M LEFT JOIN \n" +
            "abteilungen A ON M.abtNr = A.abtNr "),
        new Term("CREATE",
            "CREATE Table Schulklasse (\n" + "id INTEGER PRIMARY KEY,\n" + "bezeichnung VARCHAR(10) );\n"),
        new Term("INSERT INTO",
            "INSERT INTO Schueler (Nummer, Name, Vorname, Klasse)\n" + "VALUES (1, \"Maier\", \"Udo\", \"FIAN2\");"),
        new Term("UPDATE","SET Name = \"Keck\", Vorname=\"Michael\"\n" + "WHERE Nummer = 1"),
        new Term("DELETE","FROM Schueler\n" + "WHERE Nummer = 1"),
    };
    private static Term[] termsLF9 = {
        new Term("Einflüsse auf Netzwerkbereitstellungen",
            "Standarts,\n Geschwindigkeit(Datenrate),\n Budget,\n Bandbreite,\n Reaktivität(Latenz, Reaktionszeit)"),
        new Term("Prozess der Anforderungsanalyse",
            ">Kundenanfrage >\n> Kundengespräch, Bedarfsanalyse, Lastenheft, Gorbkonzept >\n> Bedarfsanalyse, Pflichtenheft, Terminplan, Feinkonzept, Angebot >\n" +
            "< Auftrag, Vereinbarung, Vertrag >\n< Kunde: intern/extern"),
        new Term("Einsatzgebiete",
            "Rechenzentren,\n Digitale Infrastrukturen,\n Netzwerke,\n virtuelle Netze,\n Sicherheitssysteme,\n Technische IT-Services,\n IT-System-Betreuungen"),
        new Term("Betriebsmodelle",
            "lokale (klassische) Vernetzung (LAN),\n Cloud Computing (virtuelle Vernetzung),\n geschmischte/hybride Vernetzung (LAN-Cloud)"),
    };

    public static String[] getKapitelLFYetUnpost() {return kapitelLFYetUnpost;}

    public static String[] getKapitelLF1() {return kapitelLF1;}
    public static String[] getKapitelLF2() {return kapitelLF2;}

    public static Term[][] getTermsLF1() {return termsLF1;}
    public static Term[][] getTermsLF2() {return termsLF2;}
    public static String[] getKapitelLF3() {return kapitelLF3;}
    public static Term[][] getTermsLF3() {return termsLF3;}
    public static Term[] getTermsLF4() {
        return termsLF4;
    }
    public static Term[] getTermsLF6() {
        return termsLF6;
    }
    public static Term[] getTermsLF7() {
        return termsLF7;
    }
    public static Term[] getTermsLF8() {
        return termsLF8;
    }
    public static Term[] getTermsLF9() {
        return termsLF9;
    }

}
