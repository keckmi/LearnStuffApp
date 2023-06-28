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

    private static String [] kapitelLF5 = {"▼ Das Umfeld der Softwareentwicklung analysieren", "▼ Grundlagen zur Verwaltung von Daten in IT-Systemen eläutern",
            "▼ Den Prozess der Softwareentwicklung analysieren", "▼ Den Prozess der Anforderungsspezifikation und des Softwareentwurfs beschreiben",
            "▼ Einfache Anwendungen in Python implementieren", "▼ Auf Dateien in Anwendungen zugreifen",
            "▼ Die Verwaltung von Daten mithilfe von Datenbanken planen und umsetzen", "▼ Software testen und dokumentieren"};


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
                  new Term("Organigramm",
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
                new Term("IC Integrierter Schaltkreis","Ein integrierter Schaltkreis, auch integrierte Schaltung (englisch integrated circuit, kurz IC;"+
                    "die Buchstaben werden einzeln gesprochen: [ʔiː] [t͡seː] bzw. veraltet IS) ist eine auf einem dünnen, meist einige Millimeter großen Plättchen" +
                    "aus Halbleiter-Material aufgebrachte elektronische Schaltung. Sie wird manchmal auch als Festkörperschaltkreis oder monolithischer Schaltkreis" +
                    "(englisch solid-state circuit bzw. monolithic integrated circuit) bezeichnet. Dieser Chip (englisch Die) ist meist zum Schutz und zur einfacheren" +
                    "Kontaktierung in einem mehrfach größeren Chipgehäuse eingekapselt. Ein IC enthält typischerweise eine Kombination von zahlreichen miteinander"+
                    "elektrisch verbundenen elektronischen Halbleiterbauelementen wie Transistoren, Dioden und/oder weiteren aktiven und passiven Bauelementen.\n" +
                    "\n" + "Integrierte Schaltkreise können heutzutage Schaltungen mit vielen Milliarden elektronischen Bauelementen (insbesondere Transistoren) umfassen," +
                    "so dass auch hochkomplexe Schaltungen wie Mikroprozessoren und Speicherchips auf wenige Quadratmillimeter kleinen Halbleiterplättchen untergebracht" +
                    "werden können. Seit Anfang der 1990er Jahre werden die Mikrostrukturen dieser Elemente schon im Nanometer-Bereich gefertigt.[1] Die rechteckigen" +
                    "Halbleiterplättchen werden Chip genannt (auch schon im Rohzustand), insbesondere zusammen mit dem aufgebrachten elektronischen Schaltkreis auch Mikrochip." +
                    "Die Herstellung von ICs erfolgt in eigenen Halbleiter-Fabriken in absolut staubfreien Reinräumen und umfasst eine Vielzahl von Prozessschritten physikalischer" +
                    "und chemischer Art. Da generell die Leistungsfähigkeit von Mikroprozessoren und Speicherchips mit kleiner werdenden Strukturen auf dem Chip zunimmt," +
                    "bewegt sich deren Miniaturisierung oft an der Grenze des technisch und physikalisch Machbaren. Es existieren jedoch auch zahlreiche," +
                    "insbesondere standardisierte ICs wie Logikbausteine und Operationsverstärker, wo dies nur eine geringe Rolle spielt – so enthalten die Logik-Chips der weit verbreiteten," +
                    "bereits seit den 1970ern hergestellten 74xx-Serie nur eine Anzahl Transistoren im ein- oder zweistelligen Bereich. "),
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
                new Term("Druckkostenvergleich",
                        "Verbrauchskosten =\n Seiten insgesamt * Verbrauchskosten je Seite (in Cent?) / 100\n" +
                        "Personalkosten = \n" +
                        "Druckkosteneinsparungen ABB S121"), /*"\n\n"+
                        "Anzahl Papierfüllungen = Papierfach Blatt / Seitenzahl insgesamt\nVerbrauchskosten = Seitenzahl insgs * Verbrk je Seite (Cent) / 100\n"+
                        "Geräte und Verbrauchskosten = Verbrauchskosten + Gerätekosten\nPersonalkosten Papierwechsel(PW) = ((AnzahlPW * ZeitPW) / 60) * Stundensatz\n"+
                        "Personalkosten Papierfüllungen ((AnzahlPF * ZeitPF) / 60) * Stundensatz\nPersonalkosten = Personalkosten PW + Personalkosten PF\n"+
                        "Gesamtkosten = Geräte und Verbrauchskosten + Personalkosten"),*/
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
                new Term("Darlehen",""),
                        /*"Rechenwege:\n\nFälligkeitsdarlehen:\nZinsen(Euro) = Schuld A.d.J * (Zinsen in % = 8 / 100)\n"+
                        "Kreditrate = Zinsen (Euro) + Tilgung E.d.J.\nRestschuld E.d.J. = Schuld A.d.J. + Zinsen (Euro) - Tilgung E.d.J\n\n"+
                        "Ratendarlehen:\nTilgung E.d.J. = Schuld A.d.J. / 3\n\n"+
                        "Annunitätendarlehen:\nTilgung E.d.J. = 1+2.Jahr: Kreditrate - Zinsen(E), 3.Jahr: Schuld A.d.J.\n"+
                        "Kreditrate = 1+2.Jahr: = Annunität, 3.Jahr: Zinsen(E) + Tilgung E.d.J."),*/
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
                    new Term("Handelskalkulation", ""),
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
                        "Bild einfügen \n\n"+
                        "Liefererskonto = Lieferant gewährt Nachlass bei Zahlung vor vereinbartem Zahlungsziel\nBezugskosten = Verpackung, Frachtgebühren, Transportversicherung, Zoll\n"+
                        "Handlungskosten = Angebotszusammenstellung, Raum, Lager, Personal, Werbung, Verpackung, Abschreibungen, Verwaltung, Steuern & sonstige Gebühren\n"+
                        "Kundenskonto = Verkäufr gewährt Nachlass bei Zahlung vor bestimmten kurzfristigen Zahlungsziel\nVertreterprovision = bekommt Verkäufer für Verkauf\n\n"+
                        "Listeneinkaufspreis\n-Lieferrabatt = Listeneinkaufspreis * Lieferrabatt(%)\n=Zieleinkaufspreis = Listeineinkaufspreis - Lieferrabatt($)\n-Liefererskonto($) = Zieleinkaufspreis * Liefererskonto(%)\n"+
                        "=Bareinkaufspreis = Zieleinkaufspreis - Liefererskonto($)\n+Bezugskosten\n=Bezugspreis = Bareinkaufspreis + Bezugskosten\n+Handlungskosten($) = Bezugspreis * Handlungskosten(%)\n"+
                        "=Selbstkosten = Bezugspreis + Handlungskosten($)\n+Gewinnzuschlag($) = Selbstkosten * Gewinnzuschlage(%)\n=Barverkaufspreis = Selbstkosten + Gewinnzuschlag($)\n"+
                        "+Kundenskonto($) = Barverkaufspreis * Kundenskonto(%) / (1 - Kundenskonto($) - Vertreterprovision(%))\n=Vertreterprovision($) = Berverkaufspreis * Vertreterprovision(%) / (1 - Kundenskonto(%) - Vertreterprovision(%))\n"+
                        "=Zielverkaufspreis = Barverkaufspreis + Kundenskonto($) + Vertreterprovision($)\n+Kundenrabatt($) = Zielverkaufspreis * Kundenrabatt(%) / (1 - Kundenrabatt(%))\n"+
                        "=Listenverkaufspreis = Zielverkaufspreis + Kundenrabatt($)\n+Umsatzsteuer($) = Listenverkaufspreis * Umsatzsteuer(%)\n=Listen-VK incl. MWSt = Listenverkaufspreis + Umsatzsteuer"),
                    new Term("Rückwärtskalkulation", "bei Kundenpreisvorgabe\n\nBild einfügen\n\n"+
                        "Listenverkaufspreis = Zieleinkaufspreis + Lieferrabatt($)\n-Lieferrabatt($) = Zieleinkaufspreis / (1 - Lieferrabatt(%)) * Lieferrrabatt(%)\n"+
                        "=Zieleinkaufspreis = Bareinkaufspreis * Liefererskonto\n-Liefererskonto($) = Bareinkaufspreis / (1 - Liefererskonto(%)) * Liefererskonto(%)\n"+
                        "=Bareinkaufspreis = handlungskosten($) - Bezugskosten\n+Bezugskosten\n=Bezugspreis = Selbstkosten - Handlungskosten($)\n"+
                        "+Handlungskosten($) = Selbstkosten / (1 + Handlungskosten(%)) * Handlungskosten(%)\n=Selbstkosten = Barverkaufspreis - Gewinnzuschlag($)\n"+
                        "+Gewinnzuschlag($) = Barverkaufspreis / (1 + Gewinnzuschlag(%)) * gewinnzuschlag(%))\n=Barverkaufspreis = Zielverkaufspreis - Vertreterprovision($) - Kundenskonto($)\n"+
                        "+Kundenskonto($) = Zielverkaufspreis * Kundenskonto(%)\n+Vertreterprovision($) = Zielverkaufspreis * Vertreterprovision(%)\n"+
                        "=Zielverkaufspreis = Listenverkaufspreis * Kundenrabatt($)\n+Kundenrabatt($) = Listenverkaufspreis * Kundenrabatt(%)\n=Listenverkaufspreis = Listen-VK incl. MWSt - Umsatzsteuer($)\n"+
                        "+Umsatzsteuer = Listen-VK incl. MWSt / 1,19 * Umsatzsteuer(%)\n=Listen-VK incl. MWSt = Listen-VK incl. MWSt"),
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
                new Term("Nutzwertanalyse",""),
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
                    new Term("Provider","Internetvertragspartner\nzB Telecom, 1&1, Vodafone\nIPS = Internet Service Provider"),
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
                    new Term("On <-> Off Premise","On Premise:\n Firmendaten im eigenen Haus:\n (+) max Kontrolle, Datenzugriff ohne Internet, Keine Weitergabe an Dritte. \n" +
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
                            "Geländeverkabelung (Primärverkabelung):\nSV Standortverteiler\n|x| Router\n---LWL(meist mehrere 100m, max 150m)---\n\n" +
                            "Gebäudeverkabelung (Sekundärverkabelung):\nGV Gebäudeverteiler\n|x| Router/Switch(wenn nicht so viele)\n---LWL,Patch(>100m, max 500m)---\n\n" +
                            "Etagenverkabelung (Tertiärverkabelung): Sterntopologie,\n EV Etagenverteiler\n|x|Switch\n---(LWL),Patch,Kupfer(<100m)---\n\n" +
                            "TA Technischer Anschluss\n---Endgerät"),
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
                    new Term("Internet Netzwerk Aufbau", ""),
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
                new Term("IPv4 Config","IP-Adresse: 192.168.0.44\nSubnetzmaske: 255.255.255.0\nStandartgateway: 192.168.0.2\n"+
                            "DNS-Serveradresse: automatisch beziehen"),
                new Term("IPv4 Subnetting",""),
                new Term("IPCONFIG","Terminalbefehl\nalle Konfigrationen aller Netzwerke anzeigen"),
                new Term("NSLOOKUP","ap adresse von domain bekommen & anderst herum\nLSLOOKUP für linux?"),
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
                new Term("PING","zB PING 192.178.01\noder: PING www.google.de\nsendet Pakete\num erreicbarkeit prüfen\nund dauer"),
                new Term("DNS", "Domain Name Service:\n Übersetzung URL -> IP Adresse\n(OSI 7)\n\n"+
                            "Name Auflösung . domain Paulinenpflege.de\n" + "(DNS-Abfrage) =^ 139.119.81.86 öffentl IP-Adr"),
            },
            {//Netzwerkkomponenten auswählen und konfigurieren
                    new Term("AP Accesspoint (Beacon)",
                            "muss nicht immer Router sein, kann auch Hub(Verstärker) sein.\n" +
                            "WLAN benutzt Frequenzbänder bei 2,4 5 & 60 GHz.\n" +
                            "IOS ist ein Betriebssystem für Router.\n" +
                            "SoHo-Roter werden meist mit Linux Betriebssystemen betrieben.\n\n"+
                            "Sicherheitsaspekte Konfiguration\n"+
                            "Eigene Anmeldedaten für Admin-Account\nWPA2 als Verschlüsselungsverfahren wählen (WPA & WEP sind veraltet)\n"+
                            "WLAN Passwort (Pre-Shared-Key PSK) aus möglichst vielen verschiedenen zufälligen Zeichen wählen (für WPA2 bisher nur"+
                            "brute force und wörterbuchangriffe bekannt)\nNicht identifizierbaren (auf sich zurückführbaren) Netzwerknamen"+
                            "(Service Set Identifier SSID) oder diesen abschalten\nAutomatische Firmware aktualisierung einschalten\n"+
                            "WPS deaktivieren (Funktion die Verbindung ohne Passwort direkt per Knopfdruck eines Knopfes am AccessPoint und einer"+
                            "Entsprechung im Handy ermöglicht)\nNetzwerkgeräte ausschalten, wenn sie nicht genutzt werden"),
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
            new Term("DSGVO","S. 398 unten\n\n"+
                    "12 Transparente Information, Kommunikation und Modalitäten zur Ausübung der Rechte\n13 Informationspflicht bei Erhebung von personenbezogenen Daten\n"+
                    "14 Informationspflicht wenn Daten nicht bei der betroffenen Peerson erhoben wurden\n15 Auskunftsrecht der betroffenen Person\n16 Recht auf Berichtigung\n"+
                    "17 Recht auf Löschung, Vergessenwerden\n18 Recht Einschränkung der Verarbeitung\n19 Mitteilungspflicht im Zsmh mit Berichtigung, Löschung, Einschränkung\n"+
                    "20 Recht auf Datenübertragbarkeit\n21 Widerspruchsrecht\n22 Automatisierte Entscheidungen im Einzellfall einschließlich Profiling\n23 Beschränkungen der Rechte verhältnismäßig in besonderen Fällen\n\n"+
                    "Prinzipien der Verarbeitung personenbezogener Daten gemäß Art. 5 Abs. 1 DSGVO (Verstoßbeispiele)\nRechtmäßigkeit, Verarbeitung nach Treu und Glauben,\n Transparenz (Identitätsdiebstahl)\nZweckbindung\n"+
                    "Datenminimierung (es wurde nicht ganz gekürzt)\nRichtigkeit (es wurde verfälscht)\nSpeicherbegrenzung (es wurde zu lange gespeichert)\nIntegrität, Vertraulichkeit (soziale Medien: eingeschränkte Daten werden weitergegeben oder intern weiter ausgewertet)"),
            new Term("Urheberrecht","yet to be upgraded\nABB S.226f (In Ordner1) scan?"),
            new Term("Schutzziele","Beschreiben Sie in Kurzform Gefährdungen, die die Schutzziele \"Verfügbarkeit\", \"Vertraulichkeit\" und \"Integrität\" betreffen und geben Sie passende Auswirkungen und passende Maßnahmen an\n\n"+
                    "Schutzziele nach BSI und Art. 32 DSGVO\nA) Gefährdungen, die Schutzziele betreffen\nB) Auswirkungen bei Verlust von Schutzzielen\nC) Maßnahmen gegen Verlust der Schutzziele\n\n"+
                    "1) Verlust Verfügbarkeit von Informationen personenbezogener Daten und Zielobjekten\nA) Stromausfall, Passwort vergessen, Serverausfall, Kabel unterbrochen, Brand/Wasser, Datenträgerausfall, Cyberangriff\n"+
                    "B) Kunden können ihre KOnten nicht aufrufen, Mitarbeiter können Kundendaten nicht verarbeiten, C) Stromausfall durch USV beheben, Passwort aufschreiben, hochwertige Geräte + OS kaufen, warten, redudante Hardware einrichten\n"+
                    "Serverüberwachung, Backup / RAID\n\n2) Verlust der Vertraulichkeit von Informationen personenbezogener Daten auf IT-Systemen\nA) Datenraub, Hacker, Phishing (Fakeseite), Identitätsraub (socialengineering), böser Admin kopiert Daten\n"+
                    "B) Kunden haben Angst ihre Dateien diesem Anbieter nicht weiter anvertrauen zu können\n C) Firewall, Türschloss, VPN, Antivirus Software, Zugangsprotokoll, Daten verschlüsseln\n\n"+
                    "3) Verlust der Integrität (Korrektheit von Informationen)\nA) Softwarefehler, Speicherfehler, Datenerhebungsfehler, kriminelle Eingriffe, Fehler bei Synchronisierung redudant gspeicherter Daten\n"+
                    "B) Kunden arbeiten mit falschen Daten weiter und bekommen so Probleme\nC) Updates überprüfungen, ausgebildete Programmierer, Plausibilitätsprüfung, Prüfroutinen bei Erfassung"),
            new Term("Verschlüsselungen","asymetrische Verschlüsselung\npublic key, private key\n\nsymetrische Verschlüsselung\nzB AES, DES, Triple-DES\neinfacher, weniger rechenzeit\nwie bekomme ich key zum partner\n"+
                    "hybride Verschlüsselung\nKombination aus beiden\nzB https-Protokoll (=Kommunikation Server<->Browser)\nsymetrischer Schlüssel wird asymetrisch übertragen\n(kann nur mit private key geöffnet werden)\n\n"+
                    "Zertifikatstelle(https):\nAnfragen und Schlüssel zertifizeiren lassen\n\nRing of Trust:\nNetzwerk aus Leuten die key bestätigen"),
    };
    private static Term[] termsLF5 = {
            new Term("PrSp Ranglisten","RedMonk = Stackoverflow-Hashtags & GitHub-Projekte\n\nToibe-Index = Suchanfragen Google & Wiki & YouTube"+
                    "\"Sprache + Programming\"\n\nPYPL = Suchanfragen Google & Wiki & YouTube \"+tutorial\""),
            new Term("PrSp Generationen","S.502\n\n1.Gen: Maschinensprache 0001 1010 0011\n<-> Compiler, Interpreter <->\n2. Gen: Assemblersprache mov ds, ax\n\n"+
                    "3.Gen: Problemorientierte/höhere prozedurale PrSp\nz1=1,5\nsumme=float(z1)+...\nprint(summe)\n\n4.Gen: Deklarative, objektorientierte\n\nDatenbank PrSp\nSQl, Natural\nSELCT * FROM artikel\n\n"+
                    "5.Gen: Sprachen der künstlichen Intelligenz"),
            new Term("PrSp Typen","Prozedurale zB C\nLogische zB Prolog\nFunktionale zB LISP\nObjektorientierte zB C++, Java"),
            new Term("Warum Java?","Kostenlos\nKlare, relativ leicht zu lernende Syntax\nPlattformunabhängig\nOpen-Source-Code\nIm Unternehmensbereich sehr beliebt\nUniversell anwendbar"),
            new Term("Pr Werkzeuge","Texteditor\nGUI Editor\nCompiler\nInterpreter\nAssembler\nDebugger\nVersionsverwaltung\n"+
                    "IDE Integrated Development Environment zB IntelliJ (Pr zum Pr schreiben) integrierte Entwicklungsumgebung"),
            new Term("IntelliJ bedienen","1.Ordner anlegen\n\n2.IntelliJ starten\n\nNeues Projekt anlegen\n\nQuelltext eingeben\n\nProgramm starten"),
            new Term("Datentypen","Datentyp, Beschreibung, Größe, Wertebereich, Beispiel\n\n"+"Standartdatentypen:\n\n"+
                    "byte, ganze zahlen, 1 Byte, -128...127, 3\n\nshort, ganze zahlen, 2 Byte, -32768...32767,-3456\n\nint, ganze zahlen, 4 Byte, +/- 2^31, 34673\n\n"+
                    "long, ganze zahlen, 8 Byte, +/- 2^63\n\nboolean, wahrheitswert, -, true/false\n\nchar, alphanumerische zeichen, 2 Byte, unicode zeichen, 'A' '/u004I'\n\n"+
                    "float, fließkomma zahlen, 4 Byte, mx ca 3*10^38, 2.45\n\ndouble, fließkomma zahlen, 8 Byte\n\nAus Klassen Bibliotheken:\n\nString, \"Hello\"\n\nScanner\n\n"+
                    "Selbstgeschriebene Datentypen (Klassen)\n\nInteger-Datentypen (byte, short, int, long)\nganze Zahlen (mit Vorzeichen)\nimmer genaue Darstellung (innerhalb Wertebereich)\n"+
                    "keine Rundungsfehler (innerhalb Wertebereich)\nkeine Überlaufkontrolle\nDivision durch 0: ArithmetikException\n\nGleitkomma/Fließkomma-Datentyp (float, double)\n"+
                    "nicht jede Zahl kann genau dargestellt werden\nRundungsfehler können auftreten\nPunkt statt Komma verwenden\nExponentialschreibweise möglich: 4,56*10^3 wird als 4*56e3 geschrieben\n"+
                    "keineÜberlaufkontrolle\nDivision durch 0: keine Exception, Ergebnis lautet Infinity, bzw. -Infinity"),
            new Term("Operatoren",
                    "Arithmetisch\n+, -, *, /, %\n\nVergleichs\n==, !=, >, >=, <, <=\n\nLogisch\n!, &&, ||\n\nZuweisung\n=, +=, -=, *=, /=, %=\n\nIkrement/Dekrement\n++, --,\n\nBitweise\n&, |"),
            new Term("Kontrollstrukturen",
                    "Sequenzen, Verzweigungen"),
            new Term("Struktogramm","Bilder einfügen"),
            new Term("if-Anweisungen","empty yet..."),
            new Term("Zahlensysteme","Binär->Deizmal\n(1010 1101)_2 = 173\n2^7*1 + 2^6*0 + 2^5*1 + 2^4*0 + 2^3*1 + 2^2*1 + 2^1*0 + 2^0*1\n128 + 32 + 8 + 4 + 1\n\n"+
                    "Binär->Hexadezimal\n(1010 1101)_2 = AD\n4er päckle machen\n1010 = 2^3 + 2^1 = 8 + 2 = 10 = A\n1101 = 2^3 + 2^2 + 2^0 = 8 + 4+ 1 = 13 = D\n\n"+
                    "Binär->Oktal\n(1010 1101)_2 = 255\n3er päckle machen\n010 = 2^1 = 2\n101 = 2^2 + 2^0 = 4 + 1 = 5\n101 = 2^2 + 2^0 = 4 + 1 = 5\n\n\n"+
                    "Dezimal->Binär\n(123)_10\n123 / 2 = 61 R 1\n 61 / 2 = 30 R 1\n 30 / 2 = 15 R 0\n 15 / 2 = 7 R 1\n  7 / 2 = 3 R 1\n  3 / 2 = 1 R 1\n  1 / 2 = 0 R 1\numgekehrt aufschreiben\n"+
                    "(123)_10 = (1111011)_2\n\n"+
                    "Dezimal->Hexadezimal\n(674)_10\n674 / 16 = 42 R 2\n 42 / 16 = 2 R 10\n   2 / 16 = 0 R 2\ndez 2 = hex 2, 10 = A, 2 = 2\numgekehrt aufschreiben\n(674)_10 = (2A2)_16\n\n\n"+
                    "Potenzen von 2\n1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072\n\n"+
                    "Potenzen von 16\n16^0=1, 16^1=16, 256, 4096, 65535\n\n\n"+
                    "Okt Dez Hex  Bin\n  0   0   0  0000\n  1   1   1  0001\n  2   2   2  0010\n  3   3   3  0011\n  4   4   4  0100\n  5   5   5  0101\n  6   6   6  0110\n  7   7   7  0111\n"+
                    " 10   8   8  1000\n 11   9   9  1001\n 12  10   A  1010\n 13  11   B  1011\n 14  12   C  1100\n 15  13   D  1101\n 15  13   D  1101\n 16  14   E  1110\n 20  16  10 10000\n\n\n"+
                    "Hexadezimal->Dezimal\n(FADE)_16\nE*1 + D*16 + A*256 + F*4096\n14*1 + 13*16 + 10*256 + 15*4096\n"),
            new Term("Dateien In/Out/Update","Dateien Eingabe\n\nPrintwriter pw = new PrintWriter(\"neueDatei.txt\");\npw.println(eingabe);\npw.close()\n\n"+
                    "Dateien Ausgabe\n\nScanner sc = new Scanner(new FileReader(\"neueDatei.txt\"));\nString s1 = sc.next();\n//sc.nextLine();\n//while(sc.hasNext(){\n)//while(sc.hasNextLine()){\nSystem.out.println(s1)\n\n"+
                    "Dateien bearbeiten\n\ntry {PrintWriter pw = new PrintWriter(new FileWriter(\"neueDatei.txt\",[append:]true));\npw.append(\"hallo!\");\npw.close();\n"+
                    "} catch(IOException){ e.printStackTrace();}"),
            new Term("RegEx","String RegEx = \"[0-9]+\"\n//das + bedeutet eine oder mehrere (hier: von den zahlen 1-9)\n//replace all [^A-ZÖÜÄ_]\n"+
                    "Pattern p = Pattern.compile(RegEx);\nMatcher matcher = p.matcher(s)\n//while(!p.matcher(eingabe).matches()){\n//sout(\"Bitte um Zahl\");\n//eingabe = sc.nextLine()}\n"+
                    "while(matcher.find()){counter++}"),
            new Term("Parse","String zu int\nint a = Integer.parseInt(String)\n\nInt zu String\nint a = 5;\nString s = \"\";\ns = s + a"),
            new Term("Iteration", "Wiederholung"),
            new Term("Sortierverfahren",""),
            new Term("Recursion","Selbstaufruf\nÜbungen Beispiele beifügbar (ABB Ordner2)"),
            new Term("ERM","Entity-Relationship-Modell\n\nGrafisches Hilfsmittel für den Datenbankentwurf\nUnabhängig vom Datenbankmodell\nGrundbausteine:\n-Entities (=Objekt, Datensatz, Zeile in einer Tabelle)\n"+
                    "Relationships (=Beziehungen)\nBeide haben Attribute (=Eigenschaften) bestehend aus Attributname und Wert\nDer Wertebereich eines Attributes wird als Domäne (domain)\n"+
                    "Beispiele:\nEntitäten: Mitarbeiter-Schmid, 2, 5\nEntitätsmenge: {Mitarbeiter-Schmidth, Mitarbeiter-Müller}, {2, 5}\nEntity-Typ: Mitarbeiter, Integer\n\nRelationenschreibweise:\n"+
                    "Personen(PersNr, Name, ..., Geburtsort, Einstelldatum)\nVor der Klammer = Tabellenname\nIn der Klammer: alle Spalten\n\nGrafische Darstellung: Bild einfügen"),
            new Term("ERM Notations","von  diesem bild alle fälle ableitbar?"),

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
        new Term("ArrayList","import java.util.ArrayList; \n\npublic class MyClass { \n\n  private ArrayList<Integer> nameArrayList = new ArrayList<>();"+
            "\n\n  public void addInt(int int1) { \n    nameArrayList.add(int1); } \n\n  public void removeInt(int int1) {\n"+
            "    nameArrayList.remove(int1); }\n}"+
            "\n\n\nimport java.util.ArrayList; \nimport java.util.Collections; \n\npublic class Main { \n  public static void main(String args[]) {" +
            "\n\n    ArrayList<Integer> zahlenArrayList = new ArrayList<>(); \n\n    Collections.addAll(zahlenArrayList, 1, 2, 3, 4);" +
            "\n\n    for (int i= 0; i < zahlenArrayList.size(); i++) { \n      System.out.println(zahlenArrayList.get(i)); }\n  }\n}"),
        new Term("Klassendiagramm","Zugriffsmodifizierer: \n# protected (abstrakte und basisklassen, auch basisklassen die erben)\n~ package private \n+ public \n- private"+
            "\n\nVererbung: \nBeispiel: Ein Roman ist ein Buch. \nVon einem Viereck, in dem Roman steht geht ein Pfeil mit leerem Dreieck als Spitze aus und zeigt auf"+
            " ein Viereck, in dem Buch steht. Neben dem Pfeil steht: extends."+
            "\n\nAssoziation: \nBeispiel: Ein Kunde kann eine Anzahl von Videos ausleihen. \nVon einem Viereck, in dem Kunde steht geht eine Linie zu "+
            "einem Viereck, in dem Videos steht. Neben dieser steht, wo sie aus dem ersten Viereck geht: 0..1 und: hat ausgeliehen und wo sie in das zweite "+
            "Viereck geht: 0..* und: leiht aus."+
            "\n\nKardinalitäten: \n1..1 oder 1 = genau einer \n0..* oder * = mehrere, viele (einschl 0) \n0..1 = keiner oder einer (optional) "+
            "\n11 = genau 11 \n2..4 = 2,3, oder 4 (Bereichsangabe) \n2, 4 = 2 oder 4 (Aufzählung)" +
            "\n\nAssoziationen Arten: \n\nAggregation: \nGanzes-Teil-Beziehung \nBeteiligte Objekte können unabhängig voneinander existieren"+
            "Beispiel: Restaurant - Stuhl: Vierecke verbunden mit Linie. Wo diese auf das Viereck Restaurant trifft, befindet sich eine leere Raute."+
            "Auf der Seite des Viereckes Stuhl steht neben der Linie: 0..* \n\n"+
            "Bei der Aggregation werden Referenzen auf Objekte gespeichert"+
            "\n\nKomposition: \nGanzes-Teil-Beziehung \nBeteiligte Objekte existieren nur gemeinsam"+
            "Beispiel: Bestellung - Warenkorb: Vierecke verbunden mit Linie. Wo diese auf das Viereck Bestellung trifft, befindet sich eine gefüllte Raute. "+
            "Auf der Seite des Viereckes Warenkorb steht neben der Linie: 1 \n\n"+
            "Bei der Komposition werden die Objekte selbst erschaffen zB wird ein new Warenkorb in in Bestellung erschaffen."),
        new Term("toString()","@Override\npublic String toString() {\n  String sterneInSternbild = \"\"; \n  for (Sterne s : sterne) { \n    sterneInSternbild += s + \" \"; }"+
            "\n  return sterneInSternbild; \n}"),
        new Term("Constructor","public NameClass (int attributBasisklasse1, String attributBasisKlasse2, double attributDieserKlasse) { \n  super(attributBasisklasse1,"+
            " attributBasisklasse2); \n  this.attributDieserKlasse = atttributDieserKlasse; \n}"),
        new Term("abstract","public abstract class Flaeche { \n  protected String farbe; \n\n  public Flaeche(String farbe) { \n"+
            "    this.farbe = farbe; } \n\n  public abstract double berechneFlaech(); \n\n  public String getFarbe() { \n    return farbe; }\n\n\n"+
            "public class Kreis extends Flaeche { \n  protected double radius; \n\n  public Kreis(String farbe, double radius) { \n    super(farbe); \n"+
            "    this.radius = radius; } \n\n  @Override \n  public double berechneFlaeche() { \n    return 3.1415 * radius * radius } \n"+
            "\n  public String getFarbe() { \n    return super.getFarbe(); }\n}")
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
        new Term("Repeater",
            "Signalverstärker empfangen schwaches Signal, breiten es auf und senden es.\n Sowohl mit Kupfer als auch mit Glasfaser und WLAN\n"+
                "WLAN-Repeater bsp: über großes Firmengelände oder mehrere km"),
        new Term("Router",
                "Datenpaket Weiterleitung zwischen Netzwerken zum nächsten Router.\n Verbinden Netzwerke und Lenken Datenverkehr mittels Routing Tabelle\n\n"+
                "Bsp: Internetseitenaufruf erzeugt Datenpaket mit Anfrage, versendet es von PC von Router zu Router durch Internet bis Zielserver, dessen Adresse im Header ist." +
                "Zielserver nutzt Absenderadresse als Zieladresse \n\nRouter identifizieren ihre Ports, ihre Netze & Broadcastdomänen.\n Sie speichern Geräte die bei einem Broadcast"+
                "auf einem Port erreicht werden können.\nWenn die Zieladresse nicht in eigenen Netzen ist, wird die Anfrage an den nächsten Router geschickt.\n\n"+
                "Heimrouter - Heimnetze - häufig mit... \nInternet, Firewall, AcessPoint, Telefonanalage, Media-Server, Switch, Jugendschutzfilter (siehe auch SoHo (Small Office/Home Office) Router)\n\n"+
                "Edge-Router - Firmennetze<->Internet/Partnernetze - \nHöhere Performance \n\nvirtuelle Router - \nVerwendung in Software Defined WANs"),
        new Term("Gateway",
                "Oberbegriff; \nNetzwerkkomponenten, die Verbindung zwischen 2 Netzen herstellen \n\nHub - OSI 1, \nVerteiler von Netzwerkdaten, empfangen Daten, senden an alle Ports\n\n"+
                "Bridge - OSI 2, \nverbindet Netzwerksegmente, teilen Netze in mehrere Kollisionsdomäne auf. Da alle Netzwerkkarten mit CSMA/CD arbeiten, sollte die Kommunikationslast aller Geräte"+
                "micht zu hoch sein. Anderfalls müssen einzelne Komponenten mit dem Senden zu lange warten. \n\n"+
                "PowerLAN bzw. Powerline Adapter, OSI 1, \nverwenden 230V Stromleitungen von Gebäuden zur Datenübertragung. 2 Stück notwendig für Start und Endpunkt. Geeignet für Räume ohne Netzwerkdosen."+
                "Es gibt eine zunehmende Dämpfung je mehr Verteiler zwischen dem Start und dem Endpunkt sind und je länger die Stromleitung ist. Man sollte Geräte von dem gleichen Hersteller verwenden."+
                "Dabei kommt es zu Übertragungsraten von bis zu 1200 MBit/s \n\n"+
                "Layer3 Gateways - \nwerden auc als Router bezeichnet. Stellen Verbindung zwischen Subnetzen her. LTE-Router stellen ein lokales Netz (WLAN) bereit und verbinden dieses auf dem"+
                "4G-LTE-Netz. LTE-Router gibt es u.a. für den mobilen Einsatz \n\n"+
                "NAT-Gateways - \nAufgabe der Network Adress Translation bei IPv4 Netzwerken \n\n"+
                "Proxy - OSI 5-7 \nempfangen Nachrichten als Stellvertreter, analysieren diese und leiten sie ggf weiter an den eigentlichen Server. Bekannte Proxy-Server sind: SIP-, FTP-, E-Mail- und http-Proxy."+
                "Sie werden als Sicherheitskomponente für Anfragen aus dem Internet in die Demilitarized Zone (DMZ) zwischen geschaltet \n\n"+
                "VPN Gateways - OSI 2,3 \nerlauben sicheren ZUgriff auf Firmennetz. VPN Server wird dazu in Firmennetz bereitgestellt, z.B. als Teil einer Firewall oder eines Routers oder Open Source Server z.B. WireGuard"),
        new Term("Server Software",
                "Sie sollen Server Software und die Möglichkeit zur Virtualisierung von Servern kennen. \n\n"+
                "Server Virtualisierung Vorteile: \nHardwareabhängigkeit entfällt, \nbeliebige Skalierbarkeit zB CPU-Kerne, Speicher, \nMehrere virtualisierte Server/Maschinen (VM) können auf einer Hardware laufen \n\n"+
                "Überprovisionierung \nmehr virtuelle CPU-Kerne an VMs verteilt, als physikalisch vorhanden -> einer VM wird CPU-Zeit \"gestohlen\", weil andere VM unter Volllast läuft \n\n"+
                "Container \nleichtgewichtige VM, kein eigenes Betriebssystem, nutzen Betriebssysteme des Wirts, enthält Binärdaten: App incl Bibliotheken,\n"+
                "Bsp: Docker, CRI-O, Kata Containers. Mit ihnen lässt sich über Orchestrierungsplatform zB Kubernetes hochskalierbare Server Software betreiben \n\n"+
                "VM - \nBetriebssystem + App auf emulierter Hardware \nBetriebsysystem + App laufen in einer isolierten Umgebung, können nur auf zugeteilte Ressourcen zugreifen \n"+
                "Mehrere können parallel laufen, Grenzen sind Ressourcen der PC Hardware, \nEin Hypervisor betreibt die VMs \n\n"+
                "Container - \nein Prozess wird isoliert zB eine Datenbank, ein Webserver, \nnutzen Betriebssystem des Wirts, \nMehrere können parallel laufen, Grenzen sind Ressorucen der Hardware/VM, \n"+
                "Eine Containerumgebung betreibt sie, \nDa Wirtressourcenverschwendung -> weniger CPU-, Speicher & Festplatte \n\n"+
                "Hypervisor - \nSoftware die Computerhardware emuliert. Sie ermöglicht parallele Installation mehrerer Betriebssysteme. Sie kommt bei VMs zum Einsatz.\n"+
                "Typ 1 - Bare Metal - läuft direkt auf HW \n Typ 2 - Hosted - läuft auf einem Betriebssystem, Gastsystem läuft als Prozess auf dem Wirt \n\n"+
                "Verwaltungssoftware - Administration von VMs & Containers (siehe Bild) \n\n"+
                "VM Administration Funktionen\n Snapshots, Rollbacks - aktuellen Zustand sichern, falls updates fehlschlagen, auf Rollbacks klicken für Wiederherstellung. by Copy-on-Wirte Verfahren dauer das genau einen Mausklick lange.\n"+
                "Start, Stop, Neustart(Boot) - von virtuellen Servern/Containern. Ist die Management Software online, ist dies von überall möglich."+
                "Virtualisierung Vorteile:\nUnabhängig von Server Hardware, wenn sich die Hardware des Servers, auf dem die VM läuft, ändert, bleibt die virtuelle Hardware dieselbe" +
                "Serverkonsolidierung: Mehrere physikalische Server können als VMs auf einer Server HW installiert werden. -> Energie und Platz Ersparnis\n"+
                "Höhere Verfügbarkeit: weniger Hardware = weniger Ausfall.\nSchnelle Bereitstellung. Virtuelle Ressourcen sind deutlich schneller Verfügbar als HW-Ressourcen.\n"+
                "Ressourcenengpässe sind per Konfiguration im laufenden Betrieb behebbar.\n\n"+
                "Virtualisierung Nachteile:\nKnow-how erforderlich Inbetriebnahme physikalischer Geräte zwar anschaulich, doch Cloud-Admis müssen sich in Konfiguration virtueller Rechenzentren einarbeiten. "+
                "Jeder VM/Container Typ hat eigene Werkzeuge. \nSingle Point of Failure: Wird einziges Bare Metal genutzt, dann fallen beim Ausfall dieser HW alle VMs aus." +
                "Cluster sollen daher über mehrere Bare Metal verteilt laufen.\n\n"+
                "Viertualisierung kommt heute überall zum Einsatz. Sie ermöglicht optimale Hardwareauslastung, geringe Betriebskosten, einheitliche Handhabung von Ausfällen (Failover) "+
                "und bessere Sicherheitskonzepte.\n\n"+
                "Bsp Einheitliches Failover: \nMindestens 2 Bare Metals und ein RAID6 - oder ein RAID10 - Verbund stellen sicher, dass beim Ausfall einer Hardware alle VMs weiterlaufen "+
                "bzw. ausgefallene VMs nachgestartet werden. Zur Kompensation eines ganzen Rechenzentrums kann entsprechende Cloud-SW über mehrere Rechenzentren eingesetzt werden. "+
                "Welche App in welcher VM läuft ist beim Ausfall einer Festplatte, CPU, eines Speichers oder Netzwerkkarte unerheblich."),
        new Term("Server Hardware",
                "Dedicated Server / Bare Metal\n"+ "gemieteter physikalischer Server wird nur von diesem Kunden genutzt\n\n"+
                "Technische Anforderungen: \nCPU / Anzahl Kerne, Speicher, Anzahl IPv4/IPv6 Adressen / Failover IP, Reserve-DNS, DDoS-Schutz, Firewall, vSwitch"+
                "Datenübertragungsrate, RAID-Level, Dedizierte GPU, Images / Software, Import eigener Images, uneingeschränkter Traffic, Back-Up, KVM\n\n\n"+
                "Virtual Dedicated Server (VDS)\nKunde mietet bestimmte Ressourcen (eines Servers), die Anzahl der wählbaren Parameter ist kleiner\n"+
                "Technische Anforderungen: \nAnzahl Kerne, Speicher, NVMe-SSD/SSD, Datenübertragungsrate, uneingeschränkter Traffic, Images / Software, Import eigener Images, Back-Up\n\n"+
                "Keine Überprovisionierung (Im Gegensatz zu VPS)\n\nHohe Sicherheit erreicht der Kunde durch 2-Faktor Authentifizierung.\n\n\n"+
                "Virtual Private Server (VPS)\n"+"Kunde mietet VM, mit WebControlPanel. Mehrere Kunden teilen sich vorhandene physikalische CPU-Kerne\n\n"+
                "Technische Anforderungen: \nAnzahl virtueller Kerne (vCPU), Speicher, SSD, Datenübertragungsrate, uneingeschränkter Traffic, Images / Software, Import eigener Images, Back-Up Speicher\n\n\n"+
                "Network Attached Storage (NAS) \nDateiserver, betrieben im eigenen Netzwerk"+
                "\n\nEs gibt welche für Rechenzentren (optimiert auf höchste Schreib/Lese/Übertragungsraten) und welche für kleinere und mittlere Netzwerke, nicht im 19\" Format,"+
                "sondern im (Mini-)Towergehäuse incl Webserver für Betrieb ServerApps & VMs (auf dem NAS)\n\n"+
                "Technische Anforderungen:\nBauform, Kapazität, RAID-Level, Filesystem, Netzwerkanbindung, Verschlüsselungsmodul, Schreib und Lesegeschwindigkeit,"+
                "Redundantes Netzteil, VM Unterstützung"),
    };
    private static Term[] termsLF10 = {
            new Term("Stiftung Warentest", "Unabhängige Testinstitution, \nseit 1964, \ngegründet von Bundesrepublik Deutschland, \n\n"+
                    "Finanzierung: 86% Verkauf Publikationen und Informationen, 14 % Bundesmittel, \n\n"+
                    "Produkteinkauf: anonym, Auswahl durch Marktanalytiker, \n\nPrüfung von: Produkten & Dienstleistungen, \n\n"+
                    "Testort: in Laboren zusammenarbeitenden Testinstitutionen weltweit"),
            new Term("Verbraucherberatungsstellen","Auffgaben: \nBeratung (zB Recht, Geräte) \nInfobereitstellung (zb über Energieverbrauch, Preisvergleich)"),
            new Term("Gesetz gegen unlauteren Wettbewerb","verbietet: \nKonkurenz bedrohen / schlecht machen \nLockvogelangebote / Versprechen nicht einhalten \n"+
                    "falsche Angaben über Waren (Preis, Herkunft) machen, \nsittenwidrige Werbung (zB Belästigung auf Straße / Telefon) \n"+
                    "fremde Warenzeichen / Firmenzeichen benutzen, \nunbestellte Waren zuschicken, \nirreführende Angaben"),
            new Term("Haustürgeschäfte","Außerhalb von Geschäftsräumen geschlossenen Verträge \n\nWiderruf: \ninnerhalb von 14 Tagen (bei Erhalt deutlicher"+
                    "Widerrufsbelehrung und deren gesonderten Unterschrift, \nsonst 1 Jahr und 14 Tage, \ngar nicht bei: Bagatellgeschäft (>40 Euro), notarieller Vertragsbeurkundung, "+
                    "wenn Vertreter von Kunde selbst bestellt wurde \n\nWo? \nHaustür durch Klingeln, Fußgängerzone durch Ansprache"),
            new Term("Fernabsatzgeschäft","Vertrag zwischen Unternehmen und Verbraucher über Warenlieferungen oder Dienstleistungen unter ausschließlicher Verwendung "+
                    "von Fernkommunikationsmitteln \n(Vertragsverhandlungsabschluss per Internet, E-Mail, Brief, FAX, Katalog / Telefon) \n\n"+
                    "Widerrufsdauer: 14 Tage, oder 1 Monat (bei unerlaubten Werbeanrufen), oder 1 Jahr und 14 Tage (ohne Widerrufsmöglichkeitsbelehrung) "+
                    "Warum Wiederrufsrecht: Weil Ware nicht persönlich betrachtet werden kann \nWann nicht: Speisen & Getränken zB Pizzaservice, entsiegelte Video Video Audio und Software Träger, "+
                    "Hygieneartikel wie Kosmetik etc, Maßanfertigungen wie Maßanzüge etc, Lebensmittel \n\nkommt zustande durch Lieferung nach Bestellung, \nAngeboot im Internet ist keines, sondern Anpreisung"),
            new Term("AGBs",
                    "Regeln und Pflichten von Käufer und Verkäufer. \n\nWie sie zu sein haben steht hier: Bürgerliches Gestzbuch (BGB). \n\nSie werden von Verkäufer selbst oder von einem Anwalt in seinem Auftrag geschrieben. \n\n"+
                    "Bsp: Verkäufer muss Käufer auf AGB hinweisen,\nAGB muss gut lesbar und verständlich sein, \nPreiserhöhung innerhalb von 4 Monaten verboten \nNachbesserungen müssen kostenlos sein, \n"+
                    "überraschende Klauseln (=Abmachungen) sind verboten, \ndie gesetzliche Fristen dürfen nicht verkürzt werden (zB 2 Jahre Gewährleistung ist Pflicht)"),
            new Term("Haftung","Verpflichtung einer Person den Schaden zu ersetzen, den sie durch eigenes Verschulden verursacht hat. \n\nHaftungsgründe: \n1) Haftung aus Verträgen \n"+
                    "zB Kaufvertrag - Wenn Käufer nicht zahlt oder Verkäufer Scheiße liefert \nzB private Haftungsversicherung - Lisa fällt vom Rad weil Steffen Sie übersieht \n"+
                    "2) Produkthaftung \nzB ein neuer TV explodiert nach 2h \n3)Unerlaubte Handlung \nist gegen das Gesetz. Wenn man eine andere Person mit Absicht schädigt: Eigentum, Gesundheit, Körper, Freiheit \n"+
                    "Kinder bis 7: nicht deliktfähig \n7-18: bedingt deliktfähig \nab 18: deliktfähig"),
            new Term("Sparen - Ratenkauf","Sparen Vorteile: \nZinsen, \nBilliger: Keine Gebühren, keine Zinsen \nNachteile: \nWarten"+
                    "Ratenkauf Vorteile: \nKeine Wartezeit \nNachteile: \nregelmäßige Ratenzahlung, \nTeuer: Zinsen, Gebühren,\n Wenn Sache vor Ende der Ratenzahlung kaputt geht, muss man weiter zahlen. \n"+
                    "Auch bei unvorhergesehenen Kosten."),
            new Term("Ratenkauf","Muss man immer schriftlich machen. \n\nKann man 2 Wochen land wiederrufen \n(schreiben, dass man ihn doch nicht haben will:)" +
                    "auf Postkarte, brief (spätestens am 14t Tag bei Post(Poststempel))) Beweis für rechtzeitiges Verschicken auch durch Einschreiben (Empfasngsbestätigung) möglich \n\n"+
                    "Ratenkaufvertrag hat \n1. Barzahlungspreis \n2. Anzahl monatlicher Rate \n3. Wann und wie sind diese zu bezahlen \n4.Ratenpreis (Teilzahlungspreis): Diesen Preis muss man bei Ratenkauf insgesamt zahlen" +
                    "\n5. effektiver Jahreszins: Mehrkosten Ratenkauf als Barzahlung (Sofortzahlung) in % \n6. Höhe monatlicher Raten"),
            new Term("Warenkennzeichnung","Lebensmittelkennzeichnungsverordnung \nInhaltsstoffe haben auf Verpackung zu stehen \n\nVerbraucherinformationsgesetz \n"+
                    "Wenn Firma Verbraucher getäuscht / verdorbene Lebensmittel verkauft, müssen Behörden informieren \nSelbstnacvhfrage bei Behörden möglich"+
                    " (zB Pestizidbelastung Gemüse / Allergika in Shampoo) \n\nEichgesetz \nAlte Waggen / Messbecher müssen regelmäßig geprüft werden, ob sie richtig wiegen oder ob das Maß noch stimmt (Eichung)"+
                    " \n\nTextilkennzeichnungsgesetz \nAus was ist der Stoff? (bei Textilien) zB 80% Baumolle, 20% Polyamid \n\nEU-Güteklasse \nViele landwirtschaftliche Produkte in Eu sind eingeteilt"+
                    "nach größe, Gewicht und Qualität in Güte / Handelsklassen. \n\nPreisangabeverordnung \nPreis hat auf Waren angegeben zu sein (Preisschild). Gilt für alle Waren im Geschäft und in den Schaufenstern"+
                    "\n\nGütezeichen \ndürfen Hersteller nur nutzen wenn Waren einen vorgeschriebenen Qualitätsstandart haben zB reine Schurwolle, in Dutschland geprüfte Markenware, "+
                    "Bio nach EG-Öko Verordnung \n\nPrüfzeichen \nsollen festgelegten Sicherheitsstandart garantieren (=Waren mit diesem Zeichen sind geprüft und sicher)"+
                    "zB gprüfte Sicherheit GS, CE Europäisch Gemeinsch für Produkte in EU, Verband deutscher Elektriker \n\nUmweltzeichen \nfür Produkte die besonderst umweltfreundlich sind zB Blauer Engel"),
            new Term("Verbaucherschutzgesetze","Wettbewerbsrechtliche Regelungen:\nGesetz gegen den unlauteren Wettbewerb\nKartellgesetz - Verbietet Kartelle + martkbeherschende"+
                    "Unternehmenszusammenschlüsse (zB mehrere Firmen sprechen Preise ab)\n->Verbraucher sollen bei Kaufentscheidung nciht wettbewerbswidrig beeinflusst werden\n\n"+
                    "Gesetze zum Schutz der Verbraucher:\nProdukthaftungsgesetz - Hersteller haften für Fehlerhafte Produkte\nBürgerliches Gesetzbuch - Es regelt: \nVerbraucherkredite"+
                    "(schützt vor Fallen bei Kreditverträgen)\nFernabsatzgeschäfte (schützt bei Bestellung im Versandhandel)\nHaustürgeschäfte(schützt bei Verträgen an der Haustür)\n"+
                    "Allgemeine Geschäftsbedingungen (schützt vor Kleingedrucktem)"),
            new Term("Zahlungsarten","Barzahlung \nHalbbare Zahlung - Einer benutzt Konto zB Nachname, Scheck \nBargeldlose Zahlung - Beide nutzen Konto zB Überweisung \n"),
            new Term("Girokonto",
                    "Vorraussetzungen:\n 18 und voll geschäftsfähig,\n sonst (für jugendl):\n beide Eltern unterschreiben,\n darf nicht überzogen werden,\n EC-Karte nur wenn Eltern zustimmen\n\n"+
                    "Unterscheidungsmerkmale:\n hohe/niedrige Guthabenzinsen,\nhohe/niedrige Überziehungszinsen\nhohe/niedrige Kontoführungsgebühren/Kosten für Service (Gebühren für Kontoauszüge, Daueraufträge, Homebanking, ...\n\n)"+
                    "IBAN - International Bank Account Number\nBIC - Bank Identifier Code\nBuchungsdatum - wann kam das Geld auf das Konto? / wann wurde es abgebucht?\n"+
                    "Buchungstext - Grund / Erklärung für Überweisung\nSoll - Schuldbetrag (=Minus Betrag)\nHaben - Das Guthaben (=Plus Betrag)\nAlter Saldo - Geldbetrag, der beim letzten"+
                    "Kontoauszug auf Konto war\nNeuer Saldo - Geldbetrag der jetzt auf Konto ist\nKontoführungsgebühren - für Verwaltung & Buchungsbearbeitung"),
            new Term("Dauerauftrag","Überweisungsart 1\n\nAbsender gibt Bank Auftrag aztomatisch jede Woche/Monat immer selben Geldbetrag zu senden an selben Empfänger zur selben Zeit bis auf Wiederruf\n\n"+
                    "zB Miete, Zeitungsbbonnement, Vereinsbetrag"),
            new Term("Lastschriftverfahren","Überweisungsart 2\n\nAbsender erlaubt Zahlungsempfänger schriftlich von seinem Konto abzubuchen, einmalig oder öfters, selbe oder"+
                    "unterschiedliche Summen, zu Selben oder unterschiedlichen Zeiten\n\nzB Heizungsrechnung, Stromrechnung, Telefonrechnung"),
            new Term("Onlinebanking","mit Computer & Internetzugang, enstprechende Software von Bank\nPIN, TAN\n50% der Erwachsenen haben Onlinekonto, aber 50% aller sind misstrauisch, haben Zweifel an der Sicherheit\n\n"+
                    "Vorteile:\njederzeit\nOnlinekonto günstiger\nBanken benötigen weniger Mitarbeiter\n\nNachteile:\nunsicher (phishing),\nkeine direkte / persönliche Beratung"),
            new Term("Phishing","(Password Fishing)\n\nFakemails mit Links zu Fakeseiten wie bspw Amazon, Ebay, mit dem Ziel, dass du dich dort \"einloggst\" um Anmeldedaten abnzugreifen"+
                    "\n\nErkennbar an:\n unpersönlicher Anrede (echter Name nicht bekannt)\nAndorderungen einzuloggen dringend (womöglich mit Drohung verbunden)\n"+
                    "Direktlink zur Login Seite\nflasche Spreche\n\nVerhaltensregeln:\nMisstrauen bei Aufforderungen zum sofortigen Haneln\nNicht auf Links in verdächtigen Mails klicken\n"+
                    "Auf Anbieterseite über Sicherheitsmerkmale informieren\nVerdächtige Mails an Anbieter weiterleiten"),
            new Term("Kredite","Dispositionskredit:\nKonto überziehen\nschnnell Rechnung bezahlen\nKredithöhe mit Bank klären\nÜberziehungszinsen\n\nRatenkredit:"+
                    "bei höheren Beträgen\nKreditvertrag: Inhalt:\nKreditnehmer, -geber, Zinsen, Bearbeitungsgebühren, Laufzeit, Höhe der Raten\nSicherheiten zu geben:\n"+
                    "Nachweis über regelmäßiges Einkommen, Hypothek, Bürgerschaft Lohnabtretung\nMonatliche Zahlung"),
            new Term("Sparen","Regeln (zuerst überlegen für beste Sparform):\nWie viel Geld habe ich?\nWie viel kann ich sparen?\nfür was möchte ich sparen?\n\n"+
                    "3 Entscheidungsmerkmale:\nErtrag: Wie viel Zinsen oder Gewinn gibt es?\nSicherheit: bekomme ich mein Geld wieder zurück?\nVerfügbarkeit: Wie lange muss ich anlgegen, wie schnell bekomm ichs zurück?"+
                    "\n\nAb bestimmter Summe sollten Sparformen gemsicht werden\n\nSparmotive:\nZwecksparen, für bestimmte Sache, Wunsch\nVorsorgesparen, für bestimmte Zeit, zB Notzeit, Rente, Kinder\n"+
                    "Vermögensbildung, für Eigentum, Reichtum (bringt Zinsen), zB Haus"),
            new Term("Kreditkarte","Kunde legt sie vor. Sie wird mit spezifischem Gerät gelesen & eine Rechnung wird gedruckt. Kunde unterschreibt Rechnung & bekommt Quittung. Damit kann er Zahlung kontrollieren"+
                    "\n\nDer Händler bekommt Rechnungsbetrag von der Kreditgesellschaft nach einem vereinbartem Abrechnungszeitraum (zB monatlich).\n Er schickt der Kreditkartengesellschaft die Abrechnung über alle"+
                    "Rechnungen.\nDie Kreditkartengesellschaft hat eine Einzugsermächtigung. Sie lässt den Gesamtbetrag von dem Girokonto des Karteninhabers abbuchen"),
            new Term("Sparformen","\n" + "1) Erklärung\n" + "2) Verfügbarkeit des Geldes\n" + "3) Sicherheit\n" + "4) Ertrag (~Gewinn)"+
                    "\n\nSparbuch\n" + "1) Wenn ich Geld habe, dann bringe ich dieses Geld zur Bank und zahle es ein. Für das gesparte Geld bekomme ich Zinsen\n" +
                    "2) Kleine Bträge: immer, Mehr als 1500/2000 Euro: 3 Monate (Kündigungsfrist), \n" + "3) Hoch\n" + "4) niedrig bis 1%"+
                    "\n\nSparbrief\n" + "1) Ich kaufe ihn bei einer Bank und zahle es ein. Für das gesparte Geld bekomme ich Zinsen.\n" +
                    "2) 4 - 8 Jahre fest angelegt (=ich bekomme mein Geld erst wieder nach 4 - 8 Jahren)\n" + "3) Hoch\n" + "4) etwas höher als beim Sparbuch"+
                    "\n\nVersicherungssparen\n" + "1) Ich bezahle regelmäßig Geld. Wenn ich alt bin, bekomme ich dieses Geld + Zinsen ausbezhalt. Wenn ich vorher sterbe dann bekommt die Familie das gesamte Geld schon vorher\n" +
                    "2) feste Laufzeit (Ich bekomme mein Geld zB nach 30 jahren wieder)\n" + "3) Hoch\n" + "4) hoch / niederig je nach Vertrag & Sparförderung"+
                    "\n\nBausparen \n" + "1) Ich bezahle regelmäßig Geld. Nach einer bestimmten Zeit kann ein Darlehen (=einen Kredit) mit niedrigen Zinsen bekommen.\n" +
                    "2) abhängig von Mindestsparsumme und Mindestsparzeit\n" + "3) Hoch\n" + "4) hoch / niedrig je nach Vertrag und Sparförderung"+
                    "\n\nWertpapiere\n" + "\n" + "Festverzinsliche Wertpapiere\n" + "1) Ich kaufe zB einen pfandbrief und bekomme am Ende der Laufzeit das Gled + Zinsen. Ich kann den Pfandbrief weiterverkaufen.\n" +
                    "2) immer\n" + "3) Hoch\n" + "4) hoch (ich bekomme feste Zinsen & Sparförderung)"+
                    "\n\nAktien\n" + "1) Ich kaufe eine Urkunde und werde Teil einer Firma. Ich bekomme Dividenden oder kann die Aktie gewinnbringend verkaufen.\n" +
                    "2) immer\n" + "3) niedrig\n" + "4) hoch / niedrig je nach Kurs und Sparförderung"+
                    "\n\nInvestmentfonds \n" + "1) Ich zahle gemeinsam mit anderen in einen großen Topf. Die Investmentgesellschaft investiert mein Geld.\n" +
                    "2) immer\n" + "3) je nach Fonds-Anteilen hoch / niedrig4\n" + "4) hoch / niedrig ja nach Fonds-Anteilen bzw. Aktienkurs & Sparförderung"),
    };
    private static Term[] termsLF11 = {
            new Term("Kaiserreich","1848\n Revolutionsversuche, hinterlassen Spuren in der Gesellschaft\n\n"+
                    "1871\n Reichsgründung mit dem preußischen König als Kaiser\n\n"+
                    "1870 - 1871\n Deutsch-Französicher Krieg\n Wachsendes Nationalgefühl der deutschen Bevölkerung\n\n"+
                    "Im Vorwort der Verfassung wird mit keinem Wort das deutsche Volk erwähnt.\n"+
                    "Das Deutsche Reich wird von den herrschenden Königen und Herzögen gegründet. Das Volk tritt hierbei nicht in Erscheinung.\n\n"+
                    "Wahlberechtigt: alle Männer > 25 Jahre.\nDer Bundesrat wird durch Bundesstaaten (Herzögen) bstimmt.\n"+
                    "Ihm steht vor: Reichskanzler, vom Kaiser bestimmt, Mitglied des Reichstages.\n"+
                    "Der Reichstag ist vom Kaiser, der ihn einberuft, eröffnet und schließen kann und vom Bundesrat abhängig.\n"+
                    "Um ein Gesetz zustande zu bringen, muss sowohl im Reichstag, als auch im Bundesrat eine Mehrheit dafür zuStande kommen"+
                    " und der Kaiser muss zustimmen. \nDamit kann nicht allein der Wille des Bevölkerung zu einer Gesetzänderung führen, "+
                    "sondern nur Zusammenarbeit von Gewählten (Reichstag) und bestimmten (Bundesrat) Delegierten"),
            new Term ("Kaisers Parlament","Der Kaiser äußerte sich abschätzig gegenüber dem Parlament\n"+
                    "So zeigt sich auch ein abschätziges Verhältnis zum Volk, dessen Vertreter im Parlament sitzen.\n"+
                    "Symbolisch ist, dass er siche gegen die Inschrift \"Dem Deutschen Volke\" auf dem Parlamentsgebäude"+
                    "sträubte"),
            new Term("Nachkriegslage","deutsche Verbündete kapitulierten. \nEnde September 1918 war der Krieg verloren."+
                    "Es waren keine feindlichen Truppen im Lande.\nEs wurde über einen Frieden verhandelt. \n"+
                    "Später entwickelte sich eine Inflation. \nStraßenschlachten um politische Richtung des Landes durch Freikorps, "+
                    "die sich aus Kriegsheimkehrern bildeten.\n\"1918: Matrosen und Soldaten Aufstand: Befehlsverweigerung.\n"+
                    "1920: Kapp Putsch. \nWeimarer Republik hatte 20 Regierungen in 14 Jahren, weil keine Person die absolute Mehrheit hatte. \n"+
                    "Versailler Vertrag wurde als Demütigung empfunden. \nKaiser hat abgedankt und politische Lehre hinterlassen."+
                    "Er wurde von Regierung auf Bevölkerungsdruck wegen Kriegsverlust dazu gezwungen. \nSchwierige politische Situation\nMilitärpropaganda"+
                    "sorgt dafür, dass die Deutschen sich nicht wie Verlierer fühlen\n\n"+
                    "Ziele Siegermächte: \nSicherheit durch Dauerhafte Schwächung Deutschlands \nDeutschland musste Land abtreten \n"+
                    "Reperaturkosten bezahlen \nSchuld für den Krieg eingestehen \ndauerhaften Frieden \nSie wollten Deutschland zur Zustimmung zwingen \n\n"+
                    "Kriegsschuld: Auch wenn Deutschland eine entscheidende Rolle spielte, war der Krieg letztendlich eher eine Folge der Eskalation einer "+
                    "Politik des kalkulierten Kriegsrisikos"),
            new Term("Weimar","Die Stadt galt, anders als Berlin, als sicher (keine Straßenschlachten).\n"+
                    "Sie liegt in der Mitte des Reiches.\nSie hatte einen Versammlungsort: das Theater.\nSie war militärisch einfach zu sichern"),
            new Term("Neu in WR","In der Weimarer Republik stammten die Politiker nicht nur aus dem Adel"+
                    "oder Militär, sondern auch aus dem Volk selbst.\n Außerdem bekamen Frauen nun mehr Rechte zB das Wahlrecht\n"+
                    "und können auch selbst Teil des Parlamentes werden"),
            new Term("Inflation",
                    "Preise steigen -> Geld weniger wert\n\nWeimarer Republik musste Kosten Weltkrieg 1, der durch Schulden finanziert wurde, zurück zahlen, durch Gelddruck.\n"+
                    "Französiche und Belgische Truppen marschierten ins Ruhrgebiet ein\nDer passive Widerstand wurde durch Gelddruck bezahlt.\n\n1 Ei = 800 RM, 1/2 Jahr später: 320 Milliarden RM\n"+
                    "1 Milch = 1440 RM, 1/2 Jahre später: 360 Milliarden RM\n1 Kg Kartoffeln = 5000 RM, 1/2 Jahre später: 90 Milliarden RM\n\nReichsmark ersetzt durch Mark\nStabilisiert durch US-Kredite"+
                    "\n-> Konkjunkturelle Blüte Goldene Zwanziger\n\nFolgen des Crash: Großbanken wurden zahlungsunfähig,\nUnternehmen gingen bankrott\nviele Menschen wurden arbeitslos (1932: 6Mio)\n\n"+
                    "Reaktion der Bevölkerung:\nNotverordnungen, Sparsamkeit"),
            new Term("Probleme Weimarer Republik","Weltwirtschaftskrise und Inflation: \nExistenzängste, hohe Arbeitslosigkeit\n\ninstabile politische Lage:\nPutschversuche,\n"+
                    "Demokratie noch nicht etabliert\nbürgerkriegsähnliche Zustände\n\nDer verlorene Weltkrieg:\ntraumatisierte Menschen (Soldaten)\nVersailler Vertrag: Reperationszahlungen,"+
                    "Gebietsabtretung, Abrüstung, wirtschaftliche Einschränkungen"),
            new Term("Weimarer Republik","Grundprinzipien:\nArt(1)\n->Deutsches Reich ist eine Republik\nDie Staatsgewalt geht vom Volke aus\n(Prinzipien der Volkssouveränität in Verfassung festgelegt)\n\n"+
                    "Bürger wählen:\nLandesparlamente, Reichstag, Reichspräsident (Ersatzkaiser)\n\nBürger können nicht wählen:\nReichsrat, Reichskanzler*, Reichgericht*\n*werden vom Reichspräsident ernannt\n\n"+
                    "Reichstag kann Reichsminister und Reichskanzler Vertrauen entziehen\n\nVergleich mit BRD:\nBundeskanzler von Volk gewählt (Volk hat direkten Einfluss auf Regierungsbildung)\n"+
                    "Bundespräsident hat wenig Macht bzw. nur repräsdentative FUnktion und wird von der Bundesversammlung und nicht direkt vom Volk gewählt"),
            new Term("Erziehung Nationalsozialismus","Jugend wichtig, da:\nMachterhalt, gibt Ideologie weiter an nächste Generation, Zukunft der Gesellschaft, leicht beeinflussbar\n\n"+
                    "Jugend möglichst wenig Zeit zu Hause:\nEinfluss der Eltern verringern, viel Zeit in nationalsozialistischen Gruppen, zur ideologischen Schulung & bediengungslosen Folgschaft von Führer und Staat\n\n"+
                    "Jungen: Kriegsvorbereitung, Rassenlehre, Ideologische Schulung (Ziel -> treuer, gehorsamer Nationalsozialist)\nMädchen: Mutterrolle, Selbstdisziplin, Pflichterfüllung, Unterordnung vor Mann"),
            new Term("Gründung BRD","Westliche Allierte gründeten Bundes Republik Deutschland (BRD)\n\nUneinigkeit des Siegermächte -> 2 Staaten\n\n"+
                    "Vorgaben, die die Deutschen zu erfüllen hatten:\nDie Militärgouverneure frt westlichen Allierten beauftragten die 11 Ministerpräsidenten: Sie sollen eine gesetzgebende Versammlung einberufen"+
                    "und demokratischen und föderativen Staat gründen"),
            new Term("Wehrhafte Demokratie","soll vor Feinden schützen und vor Diktaturwiederentstehung\n\nArtikel 1: Die Würde ist unantastbar\nsteht ganz vorne im Grundgesetz, damit sich der Nationalsozialismus\n"+
                    "nicht wiederholt.\nDie Würde eines Menschen kann auch durch Anspucken, Beleidigung, Schläge oder Zwang gegen den Willen verletzt werden\n\n"+
                    "Demoktatieschutz vor Feinden durch:\n\nArtikel1: \n(1) Würde, \n(2) Menschnrechte, \n(3) Grundrechte\n\nArtikel20: \n(1) BRD: demoktatisch, sozial, \n(2) Staatsgewalt vom Volk, \n(3) Gesetz und Recht bindend"+
                    "\n(4) Recht auf Widerstand \n\nArtikel79: (3) [...] das was in den Arikeln 1 und 20 steht, darf nicht geändert werden\n\nweiterer Schutz:\n\nArtikel5: (2) Kunst, Wissenschaft, Forschung und Lehren frei "+
                    "aber an Grundgesetz(GG) halten\n\nArtikel9: (2) Vereinigungs und Koalitionsfreiheit, eingeschränkt bei Gründung zum alleinigen Zweck der Straftat, Verstoß gegen das GG oder einer Richtung gegen die Völkerverständigung\n\n"+
                    "Artikel18: Wenn man das GG zB die Pressefreiheit nutzt, um die freiheitliche demokratische Grundordnung zu bekämpfen, dann verwirkt man seine Grundrechte. Das kann aber nur das Verfassungsgericht beschließen, zB Fake News\n\n"+
                    "Artikel21: (2) Eine politische Partei kann verboten werden, wenn sie die demokratisch freiheitliche Grundordnung bekämpft und abschaffen will zB AFD\n\n"+
                    "Das Grundgesetz ist so ausgerichtet, dass keine Diktatur auf legalem Weg eingerichtet werden kann, kein verbrechen gegen die Menschlichkeit soll vom Staat ausgehen\n"+
                    "Erinnerung, dass Frieden wichtig, deswegen bis heute immer erinnern."),
            new Term("DDR","Deutschland wurde in 2 Staaten geteilt, weil sich die Allierten nicht einigen konnten.\n\nDie Westallierten wollten schnell politischen und witschaftlichen"+
                    "Wiederaufbau, während die Sovietunion Reperationen für die erlittenen Kriegsschäden forderte\n\nDefinition Sozialismus: alle Menschen werden gleich behandelt. Sie haben gute Arbeitsbedingungen. "+
                    "Wirtschaft (Privateigentum an Produktionsmittel + Prozess) ist verstaatlicht \n\nAlle Bürger über 18 Jahren konnten zwar die Volkskammer (Parlament der DDR) wählen"+
                    ", allerdings war die Volkskammer schon von der (SED) vorbestimmt. Die Bürger konnten nur zustimmen oder ablehnen. Das Politbüro hatte in fast allen Angelegenheit das Sagen gehabt und bestimmte"+
                    "alle wichtige Ämter bzw. Positionen in der DDR. So gesehen ist DDR nur Scheindemokratie. Zwar mit Wahlen aber vorher festgelegten Ergebnissen."),
            new Term("Einwohnerzahl DDR","->Diagramm\n\njährliche kontinuierliche Abnahme von 1949 -> 1961\n"),
            new Term("Flüchtlinge DDR","->Diagramm\n\nvon 1949 -> 1961\nca/avg 300 000 (2,5 Mio gesamt)\n\nViele Jugendliche sahen keine Zukunft in der DDR\n"+
                    "oft aus politischen Gründen (eigene Meinung haben) oder wirtschaftlichen Gründen (guten Job selbst auswählen) oder beides, viele hatten Verwandte im Westen.\n+" +
                    "Für den Staar bedeutete dies enorme verluste an menschlichem Potential\n\nmögliche Gegenmaßnamen:\nbessere Arbeitsbedingungen, höhere Löhne, mehr individuelle Freiheit,"+
                    "Problem: dieses System praktisch kaum demokratisch\n\nEs wurde eine streng bewachte Grenze errichtet, kaum überwindbar. Besonderst sichtbar: In Berlin (durch Mauer getrennt)\n"+
                    "Grenzer sollten Flcuhtversuche verhindern: Schißerlaubnis, viele Todesopfer auf Grenzstreifen\nGrenzanlagen erinnerten Menschen eher an Freiheitsbeschränkungen als an Schutz vor westlichen Einflüssen"),
            new Term("Kalter Krieg","Konfrontation zwischen West & Otmächten 49-89, ohne dass ein Schuss abgefeuert wurde, sonst wäre es ein heißer Krieg geworden bis hin zur Atombombe. "+
                    "Biede standen sich militärisch hoch gerüstet gegenüber."),
            new Term("Eisener Vorhang","Ablehnung östlicher kommunistischer Länder gegen westliche, Grenze durch Europa, besodnerst durch Deutschland (BRD $ DDR)"),
            new Term("Stasi","Ministeriumfür Staatssicherheit: Geheimdienst der DDR: für Machtsicherung der SED-Partei, Überwachung, Bestrafung jener, die lautzweifeln"),
            new Term("IM","inoffizieller Mitarbeiter der Stasi, freiwillig oder gezwungen, der Stasi Infos zu liefern und Menschen beeinflussen, 189 000 IMs vor Mauerfall"),
            new Term("Extremismus","lat.: extremus = das äußerste\n\nAbgrenzung von einem bestehenden Thema, einer Gruppe, einem Standart, Gesellschaftsordnung.\nVerbidnung oft mit Gewalt"+
                    "gegen Menschen oder Einrichtungen bis hin zur Völkerunterdrückung\nRechts-,Links- & islamischer Extremismus\n\nWichtig für Leben in einer Gesellschaft:\n"+
                    "Bedürfniss elitären Gruppe anzugehören, starkes Gemeinschaftsgefühl in Gruppe ohne Diskriminierung. Orientierung an konkreten Dingen, Werten & Mustern, Anerkennung und"+
                    "gemeinser Ziele, Sinnhaftigkeit des eigenen Handelns"),
            new Term("Motive Linksradikalisierung","Unzufriedenheit über politsche Lage,\n Glaube an Elite die Poleteriat zum besseren Leben verhilft,\n fehlende berufliche und schulische Erfolge,\n "+
                    "internationale Konflikte und Verstöße gegen die Menschen und Bürgerrechte,\n Drang und Abenteuer"),
            new Term("radikal - extrem","erstes missachtet nicht demokratische Verfassung oder Grundrechte. jeder Bürger hat Recht auf radikale konstruktive Gedanken"),
            new Term("Linksextremismus","eigene Interpretation von Freiheit & Gleichheit, vorallem im Hinblick auf wirtschaftliche & soziale Gleichheit & die Ablehnung "+
                    "des Kapitalismus"),
            new Term("Rechtsextremismus","eigenes Volk steht über allen anderen Völkern. Einzelner hat dem Volk zu dienen, Rassismus Führerkult, Einzelner gehört ethnisch &"+
                    " kulturell dem Volk an"),
            new Term("Islamischer Extremismus","Nur die Religion des Islam ist die wahre Religion, \nAusrichtung + Befolgung der islamischern Regeln (Koran)\n"+
                    "Einheit von Religion & Staat, \nAblehnung westlicher Gesellschaftsordnungen"),
            new Term("Populismus","moralisch reines, homogenes Volk <-> unmoralische korrupte Elite (EU, Politiker anderer Parteien, Medien)\nletztere gehören nicht zum Volk\n" +
                    "Populisten bezeichnen sich als Representanten des Volkes. Nur sie wüssten, was das Volk wirklich will. Sie schüren Angst und greifen emotionale Themen auf.\n" +
                    "Fakten spielen untergeordnete Rolle. So werden Feindbilder geschaffen \n\n5 Goldene Regeln des Populismus: \nböse Elite oben, Volk unten \nMinderheiten spielen keine Rolle \nwir sind die Einzigen, die das Volk vertreten \n" +
                    "Leuten Angst machen und einfache Lösungen versprechen\nSündenbock gebraucht, am besten Minderheiten\n\nWoher Stimmen: \ngute Parolen, Frust, rassistischer Stadtteil, -weil es mir nicht gut geht, soll es anderen auch nicht \n\n"+
                    "und die Medien:\nstecken mit Elite unter einer Decke\nDaten und Fakten spielen keine Rolle\nMenschenverachtende Zitate und Posts sind Taktik zur Provokation, Tabubruch"+
                    "für größeren Wahlerfolg\n\n"+  "Umgang: \nkonkrete politische Lösungen verlangen \nzu inhaltlichen Diskussionen auffordern \nEigene, weitere politische Themen vorschlagen\n\n"+
                    "Umgang für Pateien:\nDaten und Fakten liefern,\n Transparenz\nLösungen anbieten, Unfähigkeit / Schwäche der Populisten aufzeigen\n\n"+
                    "Umgang für Bürger:\nsich nicht von Gefühlen der Populisten leiten lassen\nRuhig, sachlich bleiben, nicht empört sein\n"+
                    "Gründllich informieren und Daten & Fakten überprüfen\nKritisch nachfragen zB nach konkreten Lösungen\nhier informieren: forum-streitkultur.de/sieben-gegenstrategien.de\n\n"+
                    "Umgang für Medien: sachlich und differenziert informieren\n\nUmgang (Maßnahhmen) für Regierung:\nSozialstaat ausbauen,\n"+
                    "Parteien unter Umständen verbieten,\nAuf Einhaltung des Grundgesetzes & der Grundrechte achten\neinfache Sprache,\n Bildung ausbauen\n"+
                    "Straftaten in sozialen Netzwerken ausbauen,\nStraftaten in sozialen Netzwerken verfolgen / verurteilen lassen"),
            new Term("Populismus - Extremismus","Extremismus lehnt Demokratie ab (abschaffen)\nRechtsextremisten wollen Diktatur\nLiinksextremisten wollen Anarchie, Sozialismus oder Kommunismus"+
                    "Extremisten versuchen Staat mit Gewalt zu stürzen\n\nPopulisten aktzeptieren Demokratie, versuchen darin an Macht zu kommen"),
            new Term("Linksdemokraten","kritisch gegen Kapitalismus, Marktwirtschat, Globalismus, Neoliberalismus\n\n"+
                    "achten freiheitlich demokratische Grundordnung (Verfassung)\nkeine Gewalt zum Zieldurchsatz\n"),
            new Term("Rechtsdemokraten","zwischen konservativ und rechtspopulistisch\n\nAnsicht:\n Menschen sind verschieden,\n"+
                    "Aktzeptanz gesellschaftlicher Ungleicheiten, wenn sie aus fairem Wettbewerb entstehen,\n\nAufrechterhaltung traditioneller gesellschaftlicher Ordnung\n"+
                    "Ablehnung politisch geführter aktiver Gesellschaftsveränderung (zB Genderspreche)"),
    };

    public static String[] getKapitelLFYetUnpost() {return kapitelLFYetUnpost;}
    public static String[] getKapitelLF1() {return kapitelLF1;}
    public static String[] getKapitelLF2() {return kapitelLF2;}
    public static String[] getKapitelLF3() {return kapitelLF3;}
    public static String[] getKapitelLF5() {return kapitelLF5;}

    public static Term[][] getTermsLF1() {return termsLF1;}
    public static Term[][] getTermsLF2() {return termsLF2;}
    public static Term[][] getTermsLF3() {return termsLF3;}
    public static Term[] getTermsLF4() {
        return termsLF4;
    }
    public static Term[] getTermsLF5() {
        return termsLF5;
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
    public static Term[] getTermsLF10() {
        return termsLF10;
    }
    public static Term[] getTermsLF11() { return termsLF11; }

}
