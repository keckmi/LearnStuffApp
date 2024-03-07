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
                    new Term("Optimale Bestellmenge","Lagerbestand in Stück = \nBestellmenge / 2 \n\nJährliche Bestellkosten = \nKosten je Bestellung * Anzahl der Bestellungen pro Jahr\n\n"+
                            "Jährliche Lagerkosten = \nLagerbestand in Stück * Einstandspreis * Lagerkostensatz \n\nGesamtkosten = \nJährliche Bestellkosten + Jährliche Lagerkosten\n\n"+
                            "Von der Optimalen Bestellmenge kann abgewichen werden bei... \nunregelmäßigem Verbrauch zB bei Saisonartikeln \nbei fehlendem Lagerplatz \nbei fehlendem Kapital "+
                            "zur Realisierung der optimalen Bestellmenge \ndrohendem Preisverfall / technischer Veralterung der Artikel \nbei drohendem Lieferengpass\n\n"+
                            "Bestellpunktverfahren: \nBestellung erfolgt, wenn nur noch eine bestimmte Lagermange (Meldebestand) vorrätig ist, zB 100 Stück. Die Bestelltermine "+
                            "sind meist unregelmäßig. \nProdukte werden bei unregelmäßigen Anlässen wie bei Preistief oder Nachfragehoch bestellt "+
                            "\n\nBestellrythmusverfahren: \nBestellung erfolgt in regelmäßigen Intervallen zB alle 14 Tage \nProdukte werden regelmäßig bestellt um bspw Verfallszeiten "+
                            "zu berücksichtigen oder weil die Nachfrage konstant ist."),
            },
            {// Angebotsvergleiche bei Beschaffungsmaßnahmen durchführen
                new Term("Nutzwertanalyse",
                        "Neben dem quantitativen Angebotsvergleich (Einstandspreis) sind qualitative Bewertungskriterien:\n" +
                        "-Qualität und Funktionen des angebotenen Produkts\n" + "-Verbrauchskosten, Energiekosten, Folgekosten\n" + "-Liefermenge, Mindestabnahmemenge\n" +
                        "-Besonderes Design und Aktualität des Produkts\n" + "-Schnelle und zuverlässige Lieferung\n" + "-Kompetenz des Lieferanten (Mitarbeiter)\n" + "-Verhalten des Lieferanten in besonderen Situationen (Notsituatuionen)\n" +
                        "-Beteiligung des Lieferanten an Merketingmaßnahmen\n" + "-Gutes Image des Lieferanten\n" + "-Gutes Schulungs- und Fortbildungsprogramm\n" +
                        "-Verkaufsförderungsmaßnahmen des Lieferanten\n" + "-Erreichbarkeit des Lieferanten\n" + "-Beachtung umweltgerechter Methoden und Verfahren\n" +
                        "-EInfache Logistik\n" + "-Soziales Engagement in der Gemeinde oder Region\n" + "-Mitgliedschaft in gemeinsamen Kooperationen/Partnerschaften\n" +
                        "-Persönliche Kenntnis der Lieferanten und Vertrauen\n" + "-Einfache Logik\n" + "-Soziales Engagement in der Gemeinde oder Region\n" +
                        "-Mitgliedschaft in gemeinsamen Kooperationen/Partnerschaften\n" + "-Persönliche Kenntnis der Lieferanten und Vertrauen\n" +
                        "-Besondere Konditionen: Ratenzahlen verlängerte Zahlungsfristen, Zuschüsse bei Aktionen und Investitionen, Bereitstellung von Mitarbeitern zur Aushilfe und Unterstützung\n"),
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
                new Term("Verpflichtungs-/Erfüllungsgeschäft", "Siehe Wirtschaftskunde: Kaufvertrag"),
                new Term("Wichtige Vertragsarten nach BGB",
                       "Kaufvertrag: \nVerkauf von Sachen und Rechten gegen Entgeld\n\n" +
                       "Verbrauchsgüterkauf: \nVerkauf von beweglichen Sachen gegen Entgeld von Unternehmen an Verbraucher (Beweislastumkehr in den ersten 6 Monden bei Mängeln)\n\n" +
                       "Fernabsatzvertrag: \nVerträge über die Lieferung von Waren / Dienstleistungen unter außschließlicher Verwendung von Fernkommunikationsmitteln\n\n" +
                       "Dienstvertrag: \nDas bloße Wirken, die Arbeitsleistung (das Bemühen) wird geschuldet, aber kein Erfolg. dabei: selbstständige, nicht selbstständige, abhängige, eigenbestimmte oder fremdbestimmte Dienstleistungen. zB Arbeitsvertrag.\n\n" +
                       "Werkvertrag: \nHerstellung eines versprochenen Werkes (Herstellung oder Veränderung einer Sache bzw. durch Arbeit oder Dienstleistung herbeizuführender Erfolg) gegen Entgeld\n\n" +
                       "sonstige Arten (je nach Vereinbarung im Vertrag): \nNach dem Ort: Platzkauf und Versendungskauf, \nNach Art / Güte: Kauf nach Probe, zur Probe, auf Probe, mit Umtauschrecht, Ramschkauf, Bestimmungskauf," +
                       "\nnach Terminierung: Sofortkauf, Terminkauf, Fixkauf, Kauf auf Abruf, Teillieferungskauf, \nnach Zahlungsweise: Barkauf, mit Vorrauszahlung, Ziel-/Kreditkauf (Kauf auf Rechnung)\n\n" +
                       "Nichtige Verträge (von vornherein ungültig): \nmit Geschäftsunfähigen, beschränkt Geschäftsunfähigen bei Zustimmungsverweigerung deren Vertreter, Scheingeschäfte, Scherzgeschäfte, illegale, "+
                       "Wucher (Sittenverstoß), Formvorschriften Verstoß (Schriftform, notarielle Beurkundung, öffentl. Beglaubigung)\n\n" +
                       "Anfechtbare Verträge: \nErklärungsirrtum, Übermittlungsirrtum, Eigenschaftsirrtum, Arglistige Täuschung, Widerrechtliche Drohung"),
                new Term("Annahmefristen eines Angebots","Allgemein: Solange Anbieter unter regelmäßigen Umständen mit Anworteingang rechnen kann\n" +
                        "Unter Anwesenden bzw. fernmündlich - Sofort d.h. solange das Gespräch dauert\n" + "Bei Briefangebot ohne Fristsetzung: Ca. 5 - 7 Tage, 4 für Briefversand und einen für Bearbeitung\n" +
                        "Bei E-Mail-/Fax-Angebot Ca. ein bis zwei Tage: für Bearbeitung und Antwortfax/-Mail\n" + "Bei Briefangebot mit Fristsetzung: Die Bestellung muss bis zur gesetzen Frist zugangen sein."),
                new Term("AGB", "Vorformulierte Vertragsbedingungen für eine vielzahl von Verträgen eines Unternehmens.\n\n"+
                        "Vorteile: \n" + "-einfache Vertragsgestaltung, Vertragsinhalte müssen nicht jedes mal neu ausgehandelt und aufgeführt werden (Kosten und Zeitersparnis)\n" +
                        "-Vertragspartner erhält schnell Überblick über wichtige Vertragsbestandteile, die für die damit verbundenen Geschäfte von besonderer Bedeutung sind\n" +
                        "-Potenzielle Kunden können sich vorab über die AGB informieren\n" + "-Verwender können Vetragsbestandteile einmalig auf Rechtsicherheit prüfen und dann vielfach verwenden\n" +
                        "-Druch Vereinheitlichung der Vetragsbestandteile ist die Prüfung bei jeder Vetragsgestaltung entbehrlich oder vereinfacht\n\n" +
                        "Nachteile\n" + "-Risiken werden auf den Vertragspartner verlagert, soweit gesetzlich möglich\n" +
                        "-Verbraucher müssen als Vetragspartner in besonderer Weise auf AGB hingewiesen werden und in zumutbarer Weise vom Inhalt Kenntnis erlangen, was zusätzlichen Aufwand kostet\n" +
                        "-Vetragspartner müssen i.d.R. AGB akzeptieren um zum Kaufabschluss zu kommen"),
            },
            {//Lieferung, Installation und Übergabe vornehmen
                new Term("Rollout Produktauslieferung",
                        "1. Planung auf Grundlage der Kundenanforderungen:\n1.1 Rollout-Konzept erstellen mit Überischten Terminen,\n 1.2 Kalkulation der Arbeiten und Ressourcen die es bedarf,\n 1.3 Bereitstellung des Projektleiters und der Techniker\n" +
                        "2. Bestellung und Konfiguaration\n 2.1 Bestellung Geräte und passender Software,\n 2.2 Lageranlieferungsorganisation,\n 2.3 Lieferungskontrolle,\n 2.4 Geräte-vorinstallation & konfigauration,\n Begleitdokumentenerstellung\n" +
                        "3. Anlieferung und Installation\n 3.1 Gerätelieferung, 3.2 Aufbau an vorhergesehenen Standorten,\n 3.3 Installation und Inventarisierung,\n 3.4 Inbetriebnahme und Funktionstests,\n" +
                        "3.5 Unterstützung IT-Abteilung bei Geräteeinbindung in Unternehmensnetzwerk,\n 3.6 Nutzereinweisung 3.7 Altgerätedeinstallation\n" +
                        "4. Elektronische Dokumentation\n" +
                        "4.1 Übergrabeprotokolle,\n 4.2 Konfigurationsseiten,\n 4.3 Rolloutauswertung,\n 4.4 Übergabe aller Dokumente als elektronische Dokumentation\n" +
                        "5. Entsorgung von Altgeräten und Verpackungen\n 5.1 Protokollierung "),
                 new Term("Vorbereitung Produktabnahme",
                        "Kontrolle Lieferung / Vergleich mit Lieferpapieren, \nErfassung des Lagereingangs im Computersystem, \nZeit prüfen, "+
                        "\nBei Mangel (zB Artmangel / Fehllieferung / Qualitätsmangel): Mängelanzeige erstellen im System oder auf Formular," +
                        "\nBei keinem Mangel: ins Vorratslager bringen, ansonsten ins Zwischenlager.\n\n" +
                        "Kommissionierungslager: \nHier werden Bestellungen zusammengestellt, kurz gelagert, wenn sie noch nicht ganz vollständig sind, mit Lieferpapieren bestückt\n\n" +
                        "Warenannahme: \n1. Schritt: äußerliche Sichtkontrolle in Anwesenheit des Überbringers (Frachtführers)\n" +
                        "2. Schritt: genauere Kontrolle später in Abwesenheit des Überbringers. Unverzügliche Überprüfung pflichtig, da spätere Mängelansprüche abgelehnt werden."),
                new Term("Verantwortliche Stellen für Arbeitssicherheit","Bundesministerium für Arbeit und Soziales, Bundesanstalt für Arbeitsschutz und Arbeitsmedizin (BAuA), "+
                        "Länderausschuss für Arbeitsschutz und Sicherheitstechnik (LASI), Ämter für Arbeitsschutz und Sicherheitstechnik (ehem. Gewerbeaufsichtsämter), Berufsgenossenschaften, "+
                        "Unternehmen und Geschäftsleistungen sowie von ihnen beauftragte Personen"),
                new Term("Wichtige Rechtsvorschriften zu Arbeitsschutz und Arbeitssicherheit",
                        "Anweisung: \nMitarbeiter zu sicherheitsgerechtem Verhalten anweisen: bei Neuinstallation, mindestens einmal jährlich, bei einem Wechsel in einen anderen Tätigkeitsbereich\n\n" +
                        "Aushangspflichtige Gesetze: \nArbeitgeber müssen für den Btrieb wichtige Arbeitsgesetze am Schwarzen Brett oder beim Personalbüro aushängen\n\n" +
                        "Unfallverhütungsvorschriften (UVV): \nVerhütung von Arbeitsunfällen, Berufskrankheiten, Gesundheitsgefahren, erlassen von Berufsgenossenschaften\n\n" +
                        "Arbeitsschutzgesetz (ArbSchG): \nGesetz zur Sicherheitsverbesserung und Gesundheitsschutz legt Handlungsrahmen mit Rechten und Pflichten. Details in Arbeitsstättenverordnung.\n\n" +
                        "Arbeitsstättenverordnung (ArbStättV): \nGefährdungsbeurteilung, Anforderungen Vorschriften zum Arbeitsstätteneinrichtung und -betrieb \n\n" +
                        "Arbeitssicherheitsgesetz (AsiG): \nBestellung von Betriebsärtzinnen je nach Unternehmensgröße und Arbeitsschutzausschuss bilden ab 20 Beschäftigten\n\n" +
                        "Produktsicherheitsgesetz (ProdSG): \nAnforderungen, Sicherheitszeichen und -vorschriften für Geräte, Produkte und Anlagen zur Bereitstellung auf dem Markt\n\ns" +
                        "Telearbeitsgesetz: \nArbeitsschutzverpflichtungen zB sichere Mittel, Verpflichtung zu Arbeitsschutzunterweisungen fpr Telearbeiter und im Homeoffice"),
                new Term("Arbeiten an elektrischen Anlagen","Abs 1 DGU Vorschrift 3 \"Elektrische Anlagen und Betriebsmitteln\"\n" +
                        "Der Unternehmer hat dafür zu sorgen, dass elektrische Anlagen und Betriebsmittel nur von einer Elektrofachkraft oder unter Leitung und Aufsicht einer Elektrofachkraft den elektrotechnischen Regeln entsprechend errichtet,"+
                        " geändert und instand gehalten werden\n" + "Fünf Sicherheitsregeln beim Umgang mit elektrischen Anlagen und Betriebsmitteln (VDE 0105, VBG 4)\n" + "1. Freischalten (Trennen der Anlage vom Strom)\n" +
                        "2. Gegen Wiedereinschalten sichern (z.B. Entnahme der Sicherungen, Schild aufstellen)\n" + "3. Spannungsfreiheiten feststellen (mittels Spannungsprüfer)\n" + "4. Erden und Kurzschließen\n" +
                        "5. Benachbarte, unter Spannung stehende Teile abdecken oder abschranken"),
                new Term("Risikoanalyse","Darstellung zwischen Eintritttshäufigkeit und Auswirkungen / Schadenshöhe"),
                new Term("Systemlieferung, -installation und -übergabe Prozess",
                        "-> Systeme zusammenstellen und liefern \n-> Hardware und Betriebssystem installieren, konfigurieren und anpassen\n" +
                        "-> Anwendungsprogramme installieren und konfigurieren \n-> IT-Systeme übergeben \n-> Abnahme erklährung \n<- Kunde \n\n"+
                        "Produktabnahme \n Kunde prüft Produkt auf den ersten Blick und erklärt, dass Produkt seinen Anforderungen entspricht, bezahlt das Produkt und die Gewährleistungsfrist beginnt."),
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
                            "es konnten zwar früher auch über lange Distanz Daten geschickt werden aber nur sehr wenige, langsam\n\n"+
                            "Kategorien, Bandbreite, Verkabelungsklasse (nach ISO/IEC), Ensatzgebiet \nCat.5, bis 100 MHz, Klasse D, für Datenraten bis 100 Mbit/s \n"+
                            "Cat.5e, bis 100 MHz, Klasse D, für Datenraten bis 1Gbit/s \nCat.6, bis 250 MHz, Klasse E, für Datenraten bis 10 Gbit/s \n"+
                            "Cat.6A, bis 500 MHz, Klasse EA, für Datenraten bis zu 10 Gbit/s \nCat.7, bis 600 MHz, Klasse F, für Multimedia Anwendungen \n"+
                            "Cat.7A, bis 1000 MHz, Klasse FA, für Multimedia Anwendungen \nCat.8 bis 2000 MHz, Klasse G, 25 GBase-T und 40 GBase-T \n\n"+
                            "Das Hertz Hz \nist die SI-Einheit der Frequenz. \nSie gibt die Anzahl sich wiederholender Vorgänge pro Sekunde in einem periodischen Signal an. \n"+
                            "Sie wurde 1930 nach dem deutschen Physiker Heinrich Hertz benannt \n\n"+
                            "Welches Kabel bei >10Gbit Übertragungsrate? Cat.7"),
                    new Term("LAN, MAN, WAN, GAN", "LAN Local Area Network,\nMAN Metropolitan,\nWAN Wide,\nGAN Global"),
                    new Term("End to Site <-> Site to Site", "End to Site: User -> Netzwerk z.B: Home Office\n" +
                            "Site to Site: Firmenstandort -> Firmenstandort\n" + "End to End: Rechner -> Rechner z.B: User installiert etwas auf PC in Firma"),
            },
            {//Hauptbestandteile von Computernetzen unterscheiden
                    new Term("Provider","Internetvertragspartner\nzB Telecom, 1&1, Vodafone\nIPS = Internet Service Provider"),
                    new Term("VPN", "Virtual Priate Network\n" + "\nEin privates Netzwerk wird über ein öffentliches Netzwerk (WAN eines Providers) betrieben, "+
                            "indem der Datentransfer durch eine verschlüsselte Verbindung erfolgt. Mögliche Protokolle: L2TP, IPSec, SSTP \n\n"+
                            "Anfrage wird an einen Server zwischengeleitet, der sie zum Ziel schickt, daher weis das Ziel nicht, woher sie ursprünglich kommt \n\n"+
                            "Merkmale einer Sicheren Verbindung:\n" +
                            "Authenzität: \nDer Kommunikationspartner ist der, der er vorgibt, zu sein \nIntegrität: \nDie Daten sind unverändert \nVertraulichkeit: \nDie Daten sind für Dritte nicht einsehbar\n\n" +
                            "Tunnel = verschlüsselte Übertragungsstrecke \nEin komplettes Datenpaket oder ein Frame verschlüsselt und als Daten in ein anderes Datenpaket (oder ein Frame) eingepackt wird und so " +
                            "sicher durch ein unsicheres Netz (zB Internet) transportiert wird. Im Zielnetz werden die Daten wieder ausgepackt und entschlüsselt\n"+
                            "Die Verpackung (der Tunnel) ist die Adresse des Zwischenservers, die jene des letzendlichen Zieles verdeckt \n"+
                            "Die Adresse des Zwischenservers und die des Absenders befinden sich bei HTTP Anfragen im Header. Dieser ist auch außen sichrbar.\n" + "Ziel IP auch verschlüsselbar"+
                            "\n\nVPN Arten \nEnd-to-End VPN \nSito-to-Site VPN \nEnd-to-Site VPN\n\n"+
                            "Die Außendienstmitarbeiter sollen sicheren Zugriff auf interne Server der Firma erhalten \nWelche Hard- & Software wird benötigt? \n"+
                            "Eine VPN Client Software beim Außendienstmitarbeiter und im Firmennetz ein VPN Server. \n\n"+
                            "Für Wartungsarbeiten soll ein Fernzugriff auf das Netzwerk einer Schule eingerichtet werden. Nenne ein Verfahren. \n"+
                            "VPN Host-to-Site: Wartungsmitarbeiter kontaktieren über VPN Client den VPN Gateway der Schule. Beide bauen nach erfolgreicher Authentifizierung einen Tunnel durch das unsichere Internet auf, "+
                            "über den die Verbindungsdaten verschlüsselt übertragen werden. Der Client erhält dabei schulinterne IP, befindet sich virtuell im Schulnetz. Mögl zwei getrennte EIngänge für "+
                            "Schulverwaltung und Schulnetz wegen Datenschutz nötig."),
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
                    new Term("Strukturierte Verkabelung", "3-Stufige Verkabelungshierarchie \n\n"+
                            "Geländeverkabelung (Primärverkabelung):\nSV Standortverteiler\n|x| Router\n---LWL(meist mehrere 100m, max 150m)---\n\n" +
                            "Gebäudeverkabelung (Sekundärverkabelung):\nGV Gebäudeverteiler\n|x| Router/Switch(wenn nicht so viele)\n---LWL,Patch(>100m, max 500m)---\n\n" +
                            "Etagenverkabelung (Tertiärverkabelung): Sterntopologie,\n EV Etagenverteiler\n|x|Switch\n---(LWL),Patch,Kupfer(<100m)---\n\n" +
                            "TA Technischer Anschluss\n---Endgerät \n\n"+
                            "Anforderungen: \nKabellängen dürfen nicht überschritten werden, sollten möglichst kurz sein, bessere Übertragung \nPatchfeld, Switch, Hubs & Router als Bindeglied \n\n"+
                            "Welches Kabel bei <100m? \nCat.7 Patch, bei länger: Switch oder LWL"),
                    new Term("LWL",
                            "Glasfaserkabel, Lichtwellenleiter\n(+) kein Stör durch Funk,\n kein Nebensprechen,\n keine Abhängigkeit von Frequenzen,\n hohe Datenrate,\n unterschiedliche Freq (Farb) gleiche Leitung\n\n"+
                            "Aufbau:\nKern, Mantel, Schutzbeschichtung\n" +
                            "Schichten aus unterschiedlichen Plastik Zusammensetzungen\n" +
                            "Brechungsindex nKern > nMantel (=meist aus reinem Quarzglas)\n" +
                            "dadurch Totalreflexion (Strahlungsführung) an Schichtgrenze\n" +
                            "Wellenleiter die elektromagnetischen Strahl von ultraviolet bis infrarot Spektralbereich (350-2500nm)\n" +
                            "Schwingungsmodenarten abhängig von Geometrie & Beschaffenheit"),
                    new Term("Kupferkabel Verdrill & Schirm","Kupferdatenleitungen Kabel mit verdrillten Adernpaaren / Twisted Pair Kabel \n\n"+
                            "Das Kabel hat 8 Leitungen von denen je zwei zu einem Paar verdrillt sind. \nJedes Paar kann geschirmt sein + zusätzliche Schirmung um alle Leitungen. \n"+
                            "Um all das / ganz außen: Plastikhülle \n\n"+
                            "Das Verdrillen der Adernpaare verhindert Aussenden magnetischer Störstrahlung \nebenso haben sich Störungen bei von außen eingestrahlten Störungen gegenseitig auf \n\n"+
                            "Schirm \n\n"+
                            "Umwickeln mit einer leitfähigen Folie oder Schirmgeflecht (Abschirmung) \nverhindert Aussenden von elektrischer Störstrahlung \nverhindert, dass sich die Leitung durch äußere "+
                            "E-Felder stören lässtSchützt vor Störfrequenzen anderer Leitungen, \nUmhüllung Adernpaare, \nerhöht Verträglichkeit, \nAbhörsicherheit, \nverhindert Übersprechen \n\n"+
                            "Leitungstypen (Kupfer) \nUnterscheidungen nach Aufbau des Kabelschirmes \n\nS/FTP \ngemeinsamer Geflechtschirm (S), einzelne Paare jeweils von einem Folienschirm umgeben (FTP) \n\n"+
                            "F/UTP \ngemeinsamer Folienschirm (F), einzelne Paare ungeschirmt (UTP) \n\nSF/UTP \ngemeinsamer Schirm aus Geflecht und Folie (SF), einzelne Paare ungeschirmt (UTP) \n\n"+
                            "U/UTP \nkein gemeinsamer Schirm (U), einzelne Paare ungeschirmt (UTP) \n\n"),
                    new Term("EMV",
                            "Elektro Magnetische Verträglichkeit: Realisierung bei Datenübertragung durch Schirmung durch Verdrillung,\n" +
                            "es entstehen entgegengesetzte Ausgleichsströme deren Magnetfelder sich aufheben\n"),
                    new Term("Multi & Singlemode", "Lichtwellenleiter / Glasfaserkabel Typen \n\n"+
                            "Multimodefaser mit Stufenindexprofil OM 50/125 \nOM = Optical Multimode \n50/125 = \nDer Faserkern ist ⌀ 50 μm (Mikrometer), \nDas Mantelglas ist ⌀ 125 μm \n" +
                            "unterschiedliche Wellenlängen für Licht von Signal, am Ende Verbreiterung von Signal (vrgl Taschenlampenkreis) \n-> Begrenzung Datenrate & Länge\n"+
                            "billig aber geringe Reichweite \nEinsatzgebiete: Unternehmen, Rechenzentren, LANs \n\n" +
                            "Licht kann in verschiedenen Winkeln durch die Faser wandern, was Laufzeitprobleme verursacht und die Länge der Faserstrecke begrenzt. Dieser Grenzwert wird als "+
                            "\"modale Bandbreite\" oder \"Bandbreiten Längenprodukt\" bezeichnet. \n" +
                            "Multimode-Fasern Leistungsklassen: OM1 - OM5 \n\n" +
                            "Monomodefaser/Singlemodefaser OS 9/125 \nOS = Optical Singlemode \n9/125 = \nDer Faserkern ist ⌀ 9 μm (Mikrometer), \nDas Mantelglas ist ⌀ 125 μm \n" +
                            //"Mode am Ausgang, der Durchschnitt in der Größenordnung  der Wellenlänge \ntheoretisch keine Begrenzung in der Frequenzen: Längen >100 km möglich \n"+
                            "große Reichweite aber teuer \nEinsatzgebiete: Weitverkehrsleitungen, Carrier-Netzwerke, MANs, PONs \n\n" +
                            "Licht nimmt immer den \"geraden\" Weg im Faserkern. Laufzeitprobleme gibt es nicht. Nur die Dämpfung begrenzt die Länge der Faserstrecke. \n" +
                            "Singlemode-Fasern Leistungsklassen: OS1 & OS2 \n\n"+
                            "Legende: \nFasertyp, Kennzeichnungsfarbe, Kern/Faser ⌀, minimale modale Bandbreite B' bei 859 nm Wellenlänge, 1300 nm :\n\n"+
                            "OM1, Organge, 50/125 oder 62,5/125, 200 MHz km, 500 MHz km \nOM2, Orange, 50/125, 500 MHz km, 500 MHz km, \nOM3, Aqua, 50/125, 1500 MHz km, 500 MHz km \n"+
                            "OM4, Violett, 50/125, 3500 MHz km, 500 MHz km \nOM5, Lime, 50/125, 3500 MHz km, 500 MHz km, \nOS1 Gelb, 9/125 \nOS2, Gelb 9/125 \n\n"+
                            "Singlemode-Fasern bieten die höchsten Übertragungsraten \nAufgrund hoher Kosten für die Verlegung über lange Strecken werden meist sehr hochwertige Fasern vergraben \n" +
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
                    new Term("WiFi / IEE 802.11",
                            "WiFi \nWireless Fidelity (Treue, Genauigkeit) von WFA Alliance - Herstellerverband \n" +
                            "prüfen WLAN Geräte freiwillig auf Konformität mit IEEE Standarts und Interoperabilität\n" +
                            "WiFi4 (802.11n), WiFi5(802.11ac), WiFi6(802.11ax)\n\n"+
                            "IEEE \nInstitute of Electrical & Electronics Engineers\n\n"+
                            "IEEE 802.11 \nGrupppe von Standarts für n Funknetzwerk auf Basis von Ethernet WLAN auf Basis von 802.11\n\n"+
                            "IEEE 802.11n \n1999, 600 MBit/s, 100m, 2/4/5GHz, 4x4, MIMI, 40 MHz \n\n" +
                            "IEEE 802.11ac \n2003, 1.3GBit/s, 50m, 5GHz, 8x8, HU-MIMO, 160MHz \nWave1=80Hz, Wave2=160MHz \n\n"+
                            "IEEE 802.11ad \n2006, 6.9GBit/s, 10m, 60GHz, 1x1, Beamforming, 2GHz \n\n"+
                            "Legende \nJahr, maxÜbertragungsrate, maxReichweite, Frequenzband, maxSend/Empfangseinheiten (4x4 =4Sende&4Emfpangseinheiten =4Antennen), \n"+
                            "Antennentechnik, maxKanalbreite \n\n802.11ax \nNeu aus 2019 \n\n"+
                            "MIMO \n3x3 MIMO 2600 MBit/s \n4x4 MIMO 3500 MBit/s \n8x8 MIMO 6900 MBit/s"),
                    new Term("Frequenzbereich",
                            "2,4 GHz ~(2,39-2,49), Reichweite: akteptabel(Haus), Kanalbreite: 20 & 40 MHz, sehr häufig genutzt (überfüllt)\n" +
                            "5 GHz, begrenzt (Wohnung/Stadt), 20, 40, 80, 160 MHz, (gering)\n" +
                            "60 GHz,gering (Raum), 2 GHz, (selten)"),
                    new Term("Bandbreite (freq:) Rechnen:", "1500MHz*km / 3 km = 750 MHz auf 3km"),
                    new Term("ISO", "International Organisation for Standartisation"),
                    new Term("OSI 7 Layer Modell", "OSI Open Systems Interconnections \n\n"+
                            "7 Application Layer Anwendungsschicht \nAnwendung unterster Dienste, Netzwerkmanagement \nNetzwerkgeräte: Firewall, Server \nProtokolle: SIP, DHCP, FTP, HTTP, SMTP, DNS, SNMP \n\n" +
                            "6 Presentation Layer Darstellungschicht \nUmsetzung Daten → Startformat, Interpreation dieser gemeinsamen Formate, Einheitliche Darstellung der Daten \nProtokolle: MIME, SSL \n\n" +
                            "5 Session Layer Sitzungsschicht \nProzess zu Prozess Verbindung, Prozesssynchro, Sitzungsaufbau \n\n" +
                            "4 Transport Layer Transportschicht \nlogische Ende zu Ende Verbidnung in Abstraktion der Übertragungssysteme, Adressieren von Anwendungen \nAdressen: Ports \nNetzwerkgeräte: Firewall \nProtokolle: TCP, UDP, SCTP \n\n" +
                            "3 Network Layer Netzwerkschicht \nWegbestimmung im Netz, Routing, Datenflusskontrolle, Adressieren von Netzen und Rechnern \nAdressen: IP-Adressen \nNetzwerkgeräte: Router \nProtokolle: IPsec, IP, IGMP, ICMP \n\n" +
                            "2 Data Link Layer Sicherungsschicht \nlogische Verbindung mit Datenpaketen, elementare Fehlererkennungsmechanismen, Addressieren von Netzwerk Interfaces \nAdressen: MAC-Adressen \nNetzwerkgeräte: Switch \nProtokolle: SLIP, PPP \n\n" +
                            "1 Physical Layer Bit-Übertragungsschicht \nNachrichtentechnische Hilfsmittel für Übertragung von Bits \nNetzwerkgeräte: Ethernet \n\n"+
                            "Wie man das nennt, das übertragen wird, auf Schicht 4: Segment, 3: Packet, 2: Frame \n\n"+
                            "TCP/IP-Modell / DoD-Modell \n"+
                            "4 Application Layer \n3 Transport Layer mit Ports zum adressieren von Anwendungen\n2 Internetwork Layer, Host to Host Layer mit IP-Adressen zum adressieren von Netzen und Rechnern"+
                            "\n1 Network Access Layer mit MAC-Adressen zum adressieren von Netzwerk-Interfaces"),
                    new Term("HTTP", "Hypertext Transfer Protocol\n\n" +
                            "Bei HTTP wird in Unterschied zu HTTPS alles im Klartext übertragen auch die Anmeldedaten \n\n"+
                            "Bei gesichertem Webzugriff über das https Protokoll zb bei einem Online Anmeldesystem eines Schul WLAN wird die asymetrische Verschlüsselung verwendet, zur  verschlüsselten Übertragung "+
                            "eines gemeinsamen Sitzungsschlüssels. Die Aufgabe des Verschlüsselungsverfahren beim gesicherten Zugriff auf die Anmeldeseite ist die symetrische Verschlüsselung der Nutzdaten mithilfe des zuvor "+
                            "übertragenen Sitzungsschlüssels"),
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
                    new Term("DHCP", "Dynamic Host Config Protocoll \nArbeitet auf der Anwendungsschicht (OSI-Layer:7) \nVerteilt die Ip_Konfiguration an Rechner im Netz\nIP Adressen automatisch konfigurieren\n\n"+
                            "Ablauf DHCP Protokoll: \n\n"+
                            "DHCP DISCOVER: \nDer Client sendet eine Entdeckungsnachricht um nach DHCP Servern im Netz zu suchen \n\n"+
                            "DHCP OFFER: \nEin DHCP Server im Netz, der die DISCOVER erhielt macht eine Offerte (Angebot) \n\n" +
                            "DHCP REQUEST: \nDer Client hat sich für eine Offerte entschieden und sendet eine Rückfrage \n\n"+
                            "DHCP Acknowledge \nDer DHCP Server, der die Rückfrage bekam, sendet eine Bestätigung"),
                    new Term("TCP", "Transmission Control Protocol\n Übertragungs Steuer Protocol:\n auf welche Weise Netzwerkkomponenten austauschen?\n OSI 4\n"),
                    new Term("RFC", "Request for Comments\n Festlegung Protokolle\n ietf.org/rfc/rfc793.txt\n hier: TCP"),
                    new Term("TLS", "Transport Layer Security \n\n"+
                            "Merkmale einer sicheren Verbindung: \nAuthenzität: \nDer Kommunikationspartner ist der, der er vorgibt, zu sein \nIntegrität: \nDie Daten sind unverändert \nVertraulichkeit: \nDie Daten sind für Dritte nicht einsehbar\n\n" +
                            "Zertifikat Bestandteile: \nInhaber der Zertifikates \nAusstellende Certification Authority \nAblaufdatum \nPublic Key des Servers \n\n"+
                            "TLS Verbindung mit Zertifikat: \nDer Server schickt beim Verbindungsaufbau sein Zertifikat an den Client, der die Gültigkeit prüft bei der ausstellenden "+
                            "Certification Authority. Dann erstellt der Client einen symmetrischen Session Key, verschlüsselt ihn mit dem Public Key des Servers und schickt ihn zum Server. "+
                             "Wenn die Verbindung steht, werden die Nutzdaten symmetrisch mit dem Session Key verschlüsselt übertragen."),
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
                            "Ein Hauptgrund für die Entwicklung von IPv6 ist die Erweiterung des Adressraums. IPv6 hat 2^128 Möglichkeiten zur Bildung von Adressen.\n"+
                            "Eine Ipv6 Adresse besteht aus 128 Bit. \n\nGlobal Routing Präfix: \nErste Teil der Adresse (meist 48Bit) zeigt ob sie öffentlich oder privat ist \n\n"+
                            "Subnetting ID: \nMittlere Teil der Adresse (meist 16 Bit) ist bei alles Geräten eines Netzes / Subnetzes gleich \n\n"+
                            "Interface ID: \nLetzte Teil der Adresse (meist 64 Bit) variiert von Gerät zu Gerät.\n\n"+
                            "IPv4 und IPv6 können mithilfe geeigneter Mechanismen (z.B: Tunneling oder DualStack) parallel betrieben werden" +
                            "\n\nA:B:C:D:E:F:1:2 ist eine gültige IPv6 Adresse\n\nWindows 10 unterstützt IPv6\n\n"+
                            "Beginnt eine Adresse mit fe80 ist sie link-lokal, also nicht öffentlich \nBeginnt sie jedoch mit 2001 ist sie öffentlich"+
                            "\n\nVereinfachungsmöglichkeiten der Schreibweise: \n-Führende Nullen in einem Block von 4 Hexadezimal-Ziffern können weggelassen werden. \nBsp: 002B -> 2B" +
                            "\n-Benachbarte Blöcke von Nullen können durch :: ersetzt werden\n-:: kann nur an einer Stelle der IPv6 Adresse angewandt werden, wegen Eindeutigkeit" +
                            "\nA0000:0000:0000:0000:0000:0000:0000:000B -> A000::B\nAF00:0000:0000:E255:0000:0001:332D:81FA -> AF00::E255:0:1:332D:81FA " +
                            "\nBei mehreren Blockfolgen aus Nullen wird längere ersetzt \nBei gleich langen Blockfolgen aus Nullen wird die erste ersetzt"+
                            "\nBEAF:0776:00A0:E222:D000:0012:0000:0000 -> BEAF:776:A0:E22:D000:12:: \nA21B:C756:0000:0000:1234:0000:0000:01AB -> A21B:C756:1234:0:0:1AB\n\n"+
                            "Möglichkeiten wie Interface ID in einem fe80 Adressbereich zustande kommt: \nEUI64: Aufspaltung der MAC-Adresse, Einfügen von FFFE, Bit 7 \"drehen\" \n"+
                            "Privacy Extensions: zufällige Generation vom BS"),
                    new Term("IPv4 IPv6 Parallel","Technische Umsetzung des Wechsels von IPv4 auf IPv6 hapert, weil nicht alle Geräte schon bereit sind. Zum leichten Wchsel "+
                            "und damit alte Geräte nicht weggeschmissen werden müssen, gibt es Übergangsverfahren (Transition Strategy). \n\nTunneling (zB Teredo, 6in4, 6to4, 6over4, DS Lite) \n"+
                            "Parallelbetrieb (zB Dual-Stack) \nProtokollübersetzung (zB NAT64) \n\nWenn man als IPv4 User auf eine IPv6 Webseite will oder als Ipv6 User auf eine IPv4 Webseite "+
                            "ist keine Verbindung möglich \nEine Verbindungsüberleitung von zB dem IPv4 only Router des Users über einen Dual Stack Router zu dem IPv6 only Router der Webseite"),
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
                new Term("IPv4 Subnetting",
                        "Beim IPv4 Subnetting sieht man zunächst dannach wie viele Adresse ein Subnetz braucht (Zahl der geplanten Hosts)\n"+
                        "Dann findet man heraus in welcher Potenz von 2 diese Zahl enthalten ist. \n"+
                        "zB: Zahl der geplanten Hosts: 50: \n2^5 = 32. Das sind nicht genug Adressen. Doch 2^6 = 64. Das sind genug Adressen. \n\n"+
                        "Da eine IPv4 Adresse 32 Bits hat, rechnet man nun 32-6 = 26. \nSo hat man die Subnetzmaske nach CIDR erhalten. Sie ist /26.\n\n"+
                        "Die Netzwerkadresse ist die erste in dem Adressbereich, \nder in dem ersten Subnetz bei 0 beginnt und bei dem Ergebnis der Potenzrechnung minus 1 endet.\n"+
                        "Weil das die Größe dieses Subnetzes ist und minus 1 weil 0 bereits eine Adresse ist. \nzB: Subnetzgröße 64, erste Adresse: 0, letzte Adresse: 63 \n\n"+
                        "Die Broadcastadresse ist die letzte im Adressbereich. \n\nDie IP-Range beschreibt den ganzen Adressbereich des Subnetzes aber ohne die erste und die letzte Adresse.\n\n"+
                        "Der Standart-Gateway, die IP-Adresse des Routers, über den das Subnetz mit anderen Netzen und oder dem Internet verbunden ist, ist entweder die erste oder die letzte "+
                        "Adresse in der IP-Range \n\nBei der zweiten Zeile, dem zweiten Subnetz geht man eben so vor, nur dass man mit der Adresse anfängt, die auf die Boradcast des verherigen Subnetzes folgt.\n\n"+
                        "Eine andere Schreibweise für die Subnetzmaske wäre die DDN (Dotted Decimal Notation) \nDiese lautet bei /26: 255.255.255.192 \n"+
                        "Jede der dreistelligen dezimalen Zahlen entspricht einer achtstelligen binären. \nDa 32 - 26 = 6 ist, ist dies eine mit 6 freien Stellen, also: 1100 0000 \n" +
                        "und das entspricht der Dezimalzahl 192 \nDas rechnet man so: für jede Stelle der Dezimalzahl von hinten nach vorne steht eine Potenz von 2. Die erste ist 2^0. "+
                        "Man rechnet nur diejenigen zusammen, an deren Stelle eine 1 steht. Hier sind das die ersten beiden. Also 2^7 + 2^6 = 128 + 64 = 192\n\n"+
                        "Üben auf: subnetipv4.com"),
                new Term("IPCONFIG","Terminalbefehl\nalle Konfigrationen aller Netzwerke anzeigen"),
                new Term("NSLOOKUP","ap adresse von domain bekommen & anderst herum\nLSLOOKUP für linux?"),
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
                            "Entsprechung im Handy ermöglicht)\nNetzwerkgeräte ausschalten, wenn sie nicht genutzt werden \n\n"+
                            "Autonom: \nJeder AP ist für sich administriert. Alle Einstellungen incl. Authentifizierung müssen seperat erfolgen\n"+
                            "Controller Gebunden: \nAlle APs werden zentral verwaltet. Die komplette Benutzerverwaltung und Sicherheitsadministration werden zentral angelegt"),
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
                new Term ("USV", "Unterbrechungsfreie Stromversorgung\n\n"+
                        "Englisch: UPS Uninterruptible Power Supply\n\n"+
                        "Aufbau: \nVFD: \nZwei Leitungen vom Netz (Steckdose): Eine direkt durch die USV zum Verbrauchter, die andere zu: \n" +
                        "Gleichrichter: Generiert Gleichspannung aus Wechselspannung, die vom Netz (Steckdose) kommt.\nAkkumulator: Akku. Hier kommt dann die Gleichspannung rein \n"+
                        "Wechselrichter: Generitert Wechselspannung aus der Gleichspannung, die aus den Akkus kommt, um den Verbraucher bei Netzstörung versorgen zu können.\n"+
                        "VI : \nMit zusätzlichem AVR Spannungsregler auf der ersten Leitung \n"+
                        "VFI: \nBetrieb läuft normal über die zweite Leitung, den Gleich- und dann über den Wechselrichter. Auch der Akku wird geladen und bei Netzstörung eingesetzt. \n"+
                        "Die erste Leitung hat einen Bypass, der bei Störung auf der zweiten Leitung geschlossen wird. \n\n"+
                        "Funktionen: \nFiltern von Störungen auf der Netzspannung wie Spannungspitzen, Überspannung, Unterspannung und Stabilisieren der Netzfrequenz\n" +
                        "Überbrücken von kurzzeitigen Netzausfällen \ngeregelten Herunterfahren der Server be länger anhaltenden Stromausfällen\n"+
                        "Schütz vor: Netzstörungen: Netzausfall, Spannungsschwankungen, Spannungsspitzen, Überspannung, Unterspannung, Frequenzabweichungen, Blitzeinwirkungen, Oberschwingungen\n\n"+
                        "Verwendungen: \nComputeranlagen, Telekommunikationsanlagen. Alarmanlagen, Überwachungsanlagen, Notbeleuchtung, Notstromversorgung"+
                        "\n\nTypen:\n\n" +
                        "VFI - Voltage and Frequency Independent from Mains Supply: \nandere Bezeichnung sind online, Double-Conversion, Dauerbetrieb oder Doppelwandler. spannungs und frequenzunabhängig.\n" +
                        "Vorteile: \nKonstante Ausgangsspannung und -frequenz, keine Umschaltzeit, keine Versorgungslücken, Reine Sinuskurve, Lange Autonomiezeit, Optimaler Schutz vor Netzstörungen\n" +
                        "Nachteile: \nKostenintensiv\n" + "Anwendungsbereiche: \nAutomatisierte Anlagen, Rechenzentren\n\n" +
                        "VI - Voltage Independent from Mains Supply: \nandere Bezeichnungen sind netzinteraktiv (line-interaktiv), Single-Conversion, Delta-Conversion oder aktiver Mitlaufbetrieb. spannungsunabhängig.\n" +
                        "Vorteile: \nHoher Wirkungsgrad, Gutes Preis-Leistungsverhältnis, Gute Filterleistung durch Kontrolleinheit, Niedrige Betriebskosten\n" +
                        "Nachteile: \nUmschaltlücke von wenigen Milisekunden beim Umschalten auf Batteriebetrieb\n" +
                        "Anwendungsbereiche: \nNetzwerke in Unternehmen, IT-Anwendungen\n\n" +
                        "VFD - Voltage and Frequency Dependent from Mains Supply: \nandere Bezeichnungen sind offline, standby oder passiv. spannungs und frequenzabhängig.\n" +
                        "Vorteile: \nHoher Wirkungsgrad, Lange Batterielebensdauer, Geringe Abmessungen, Einfacher Aufbau, Geringe Kosten\n" +
                        "Nachteile: \nUmschaltlücke von wenigen Millisekunden (kann von Kondensatoren in guten PC-Netzteilen gehalten werden), Verbraucher wird durch ungefilterte Spannung versorgt, Nicht für empfindliche Verbraucher geeignet.\n" +
                        "Anwendungsbereiche: \nBüros, Computer und PCs, Einzelne Workstations, Kleine Telekommunikationsanlagen\n"),
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
            new Term("Urheberrecht","Urheber-, Marken- und Lizenzbestimmungen \n"+
                    "Für den Schutz selbst erstellter Computerprogramme, Bilder und Darstellungen gilt: \nSie sind nur dann nach UrhG geschützt, wenn sie persönliche geistige Schöpfungen sind \n"+
                    "Webcasts sind nach UrhG nicht geschützt \nSelbst erstellte Computerprogramme und Datenbanken mit geistiger Schöpfung sind nach UrhG geschützt \nWenn ein Bild selbst erstellt wurde "+
                    "und keine anderen Rechte verletzt wurden, kann man es gegen Entgelt anderen anbieten \nMan darf ein Bild mit einem Prominenten im beruflichen Wirkungskreis veröffentlichen \n\n"+
                    "Wer Urheber eines Bildes, einer Software oder einer Datenbank ist, für den gilt: \nAls Urheber darf man die Urheberbezeichnung bestimmen "+
                    "\nDer Betrieb kann vertraglich verlangen, dass er die exklusiven Rechte an einer im dienstlichen Auftrag erstellten Software hat \n\n"+
                    "Zur Prüfung der Verstöße gegen das UrhG gilt: \nEs ist auch mit Freiheitsstrafen, für Privatleute bis drei Jahre, gewerblich bis fünf Jahre, zu rechnen \n"+
                    "Abmahnkosten sind gesetzlich nur gegenüber Privatleuten gedeckelt \nNeben Abmahn-, Gerichts- und Anwaltskosten ist mit Schadensersatz zu rechnen. \n"+
                    "Unternehmen haften nicht für die Mitarbeiter, Mitarbeiter haften bei grober Fahrlässigkeit \nBei fremden Bildern muss genau geprüft werden, ob und wie die Quellenangabe zu erfolgen hat \n\n"+
                    "Zur Prüfung von Vorfällen im Markenrecht gilt: \nDer Markeninhaber hat weitgehende Rechte, sodass geschäftliches und nicht geschäftsschädigendes Handeln besonders zu beachten ist. \n"+
                    "Fremde Marken können im Geschäftsverkehr ine ngen Grenzen verwaendet werden, wenn es um die Bezeichnung der Waren und insbesondere eines passenden Zubehörs geht \n"+
                    "Wenn fremde Marken für eigenes werbliches Handeln ohne Zustimmung des Rechteinhabers genutzt werden, kann es zu Markenrechtsverletzungen kommen \n\n"+
                    "\nmehr hier: ABB S.226f (In Ordner1)"),
            new Term("Schutzziele","Beschreiben Sie in Kurzform Gefährdungen, die die Schutzziele \"Verfügbarkeit\", \"Vertraulichkeit\" und \"Integrität\" betreffen und geben Sie passende Auswirkungen und passende Maßnahmen an\n\n"+
                    "Schutzziele nach BSI und Art. 32 DSGVO\nA) Gefährdungen, die Schutzziele betreffen\nB) Auswirkungen bei Verlust von Schutzzielen\nC) Maßnahmen gegen Verlust der Schutzziele\n\n"+
                    "1) Verlust Verfügbarkeit von Informationen personenbezogener Daten und Zielobjekten\nA) Stromausfall, Passwort vergessen, Serverausfall, Kabel unterbrochen, Brand/Wasser, Datenträgerausfall, Cyberangriff\n"+
                    "B) Kunden können ihre KOnten nicht aufrufen, Mitarbeiter können Kundendaten nicht verarbeiten, C) Stromausfall durch USV beheben, Passwort aufschreiben, hochwertige Geräte + OS kaufen, warten, redudante Hardware einrichten\n"+
                    "Serverüberwachung, Backup / RAID\n\n2) Verlust der Vertraulichkeit von Informationen personenbezogener Daten auf IT-Systemen\nA) Datenraub, Hacker, Phishing (Fakeseite), Identitätsraub (socialengineering), böser Admin kopiert Daten\n"+
                    "B) Kunden haben Angst ihre Dateien diesem Anbieter nicht weiter anvertrauen zu können\n C) Firewall, Türschloss, VPN, Antivirus Software, Zugangsprotokoll, Daten verschlüsseln\n\n"+
                    "3) Verlust der Integrität (Korrektheit von Informationen)\nA) Softwarefehler, Speicherfehler, Datenerhebungsfehler, kriminelle Eingriffe, Fehler bei Synchronisierung redudant gspeicherter Daten\n"+
                    "B) Kunden arbeiten mit falschen Daten weiter und bekommen so Probleme\nC) Updates überprüfungen, ausgebildete Programmierer, Plausibilitätsprüfung, Prüfroutinen bei Erfassung"),
            new Term("Firewall","Funktionen: \n\nPaketfilter: \nIP Adresse / Protokol Kontrolle, Port Überwachung \nFilterung mit Layer-3 Informationen (IP-Adressen), bestimmte Adressen können zugelassen oder gesperrt werden\n\n"+
                    "Stateful Packet Inspection: \nIP Adresse / Protokol Kontrolle, Port Überwachung, Verbindungszuständigkeitsüberprüfung je nach offen oder zu vertrauenswürdig oder nicht, leistungsfähiger, ressourcenintensiver \n"+
                    "Überprüfung, ob Pakete einer speziellen Sitzung gehören. Abfangen von dDoS-Attacken. Merken von Paketen die gesendet und oder empfangen werden und Suche nach verdächtigen Mustern. \n\nDeep Packet Inspection: \nAuf Anwendungsschicht wird geprüft, was in den Paketen ist \n"+
                    "Prüfung der Pakete bis in die Anwendungsschicht hinauf. Datenbereiche prüfen. Somit können Pakete auf Viren, Spam und andere unerwünschte Inhalte untersucht werden"),
            new Term("Verschlüsselungen","asymetrische Verschlüsselung\npublic key, private key\n\nsymetrische Verschlüsselung\nzB AES, DES, Triple-DES\neinfacher, weniger rechenzeit\nwie bekomme ich key zum partner\n"+
                    "hybride Verschlüsselung\nKombination aus beiden\nzB https-Protokoll (=Kommunikation Server<->Browser)\nsymetrischer Schlüssel wird asymetrisch übertragen\n(kann nur mit private key geöffnet werden)\n\n"+
                    "Zertifikatstelle(https):\nAnfragen und Schlüssel zertifizeiren lassen\n\nRing of Trust:\nNetzwerk aus Leuten die key bestätigen"),
            new Term("dDoS","Distributed Denial of Service"+ "\n\nBei einem dDoS Angriff werden Server überlastet indem mehr Zugriffe gleichzeitig darauf erfolgen, als verträglich " +
                    "\n\nEin Dienst, wie z.B. Anfrage an einen Webserver, wird in so großer Häufigkeit beansprucht, dass andere Anfragen nicht ode rnur ungenügend "+
                    "angenommen und bearbeitet werden können. \nDistributed bedeutet, dass diese Angriffe von einem Angreifer angeregt, jedoch von mehreren / vielen Clients ausgeführt werden. Bsp.: Mit einem manipulierten Ping "+
                    "kann der Angreifer ein Broadcast- oder Multicast Paket mit der Quell-IP-Adresse des Webservers verschicken. Alle Adressaten antworten dann dem Webserver und belegen so dessen Ressourcen")
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
        new Term("Bilanz","Vermögen = \nAnlagevermögen + Umlaufvermögen \n\nKapital = Vermögen \n\nEigenkapital = \nKapital - Fremdkapital\n\n"+
                "Anlagevermögen: \nGrundstücke, Fahrzeuge, Maschinen \n\nUmlaufvermögen: \nWaren, Vorräte, Forderungen aLuL, Wertpapiere, Kasse, Bank \n\n"+
                "Fremdkapital / Schulden: \nHypotheken, Darlehen, Verbindlichkeiten aVLL"),
        new Term("Einfacher Buchungssatz", "Einfache Buchungssätze sind solche, bei denen von einem Konto auf ein anderes gebucht wird. Dann gibt es noch den zusammengesetzten "+
                "Buchungssatz, der mehr als zwei Konten betrifft. \n\n"+
                "1. Welches Konto? Aus dem Text entnehmen \nUnbequeme Beispiele: \nich bezahle mittels eines Bankkredits = Konto: Verbindlichkeit ggü Kreditinstitut \n"+
                "ich Bezahle eine Verbindlichkeit an Lieferung und Leistung (einer offenen Schuld / Rechnung) = Konto: Verbindlichkeit a. LuL \nich kaufe auf Ziel (gegen Rechnung) = Konto: Verbindlichkeit a. LuL\n"+
                "ich bezahle eine Rechnung = Konto: Verbindlichkeit a. LuL \n\n"+
                "2. Aktiv oder Passiv? Siehe Bilanz \nOb das Konto links auf der Aktiv Seite steht (zB Waren, Bank) \noder rechts auf der Passiv Seite (zB Schulden, Rechnungen, Verbindlichkeiten a. LuL) \n\n"+
                "3. Zunahme oder Abnahme? denke \nZunahme: Wenn etwas mehr wird (zB die Waren beim Wareneinkauf, Die Verbindlichkeiten ggü einem Kreditinstitut beim Bezahlen mit einem Bankkredit) \n"+
                "Abnahme: Wenn etwas weniger wird (zB die Bank (das Geld auf meinem Bankkonto) bei der Bazahlung per Banküberweisung, Die Verbindlichkeiten a. LuL zB bei der Bezahlung der Verbindlichkeiten a. LuL, )+" +
                "oder aber auch bei der Bazahlung einer Rechnung \n\n"+
                "4. Soll oder Haben? siehe Bild oben \nJe nach Aktiv oder Passiv und je nach Zunahme oder Abnahme \nzB Aktiv und Zunahme: Siehe Aktivkonto ob Zunahme unter Soll oder Haben steht. \n"+
                "zB Passiv und Zunahme: Siehe Passivkonto ob Zunahme unter Soll oder Haben steht. \n\n"+
                "Ergebnissatz: \nDie Antwort auf eine einfache Buchungssatz Aufgabe ist ein geschriebener Satz. \nDabei bucht Soll an Haben \nzB Waren an Bank 2000 EUR, \n"+
                "Verb. a. LuL an Verb. ggü Kreditinstitut 10 000 EUR, \nWaren an Verb. a. LuL 5000 EUR, \nVerb. a. LuL an Bank 7000 EUR"),
    };
    private static Term[] termsLF10a = {
            //1.1
            new Term("Anforderungen an eine Benutzerschnittstelle ermitteln",
                    "Dem Kunden ist möglicherweise nicht klar, wie Anforderungen am besten zu formulieren sind\n" +
                            "\n" +"Vollständigkeit der erarbeiteten Kundenbedürfnisse wichtig "),
            new Term("Anforderungsspezifikation",
                    "Analyse: Use Case Diagramme, Aktivitätsdiagramme, Lastenheft, Pflichtenheft, Product Backlog\n\n" +
                            "Design: Klassendiagramme, Aktivitätsdiagramme, ER-Modell, Wireframe, Mockup\n\n" +
                            "Implementierung: Java, Python, MySQL, MmongoDB, SQL\n\n" +
                            "Testen: Unittest, Integrationstest, Review\n\n" +
                            "Begrifferklärungen: \n" +
                            "Product Backlog: grobe Arbeitsschritte, Scrum \n" +
                            "Wireframe: Gedanken zur grafischen Oberfläche, Skizze in Schwarz/Weiß \n" +
                            "Mock Up: fertige Oberfläche aber ohne Funktion\n\n" +
                            "[Bild Seite 9]"),
            new Term("Prozess der Anforderungsspezifikaion",
                    "Ermitteln, Analysieren, Spezifizieren und Validieren (Überprüfen) aller Anforderungen an das zu entwickelnde System\n" +
                            "Prozessschritte: Ist-Analyse, Anforderungen sammeln, Anforderungen definieren, Anforderungen überprüfen\n" +
                            "[Bild Seite 10]\n\n"+
                            "Ist-Analyse\n" +
                            "Aufgabe des Prozesses: Art und Umfang aller anfallenden Aufgaben und deren Besonderheiten\n" +
                            "Struktur des Prozesses: Die Organisation des Prozessablaufes\n" +
                            "Kommunikation innerhalb des Prozesses: Ablauf und Vorrichtungen, welche zur Kommunikation genutzt werden\n" +
                            "Prozessdaten: Art und Umfang der Dokumentation des Prozesses\n" +
                            "Schwachstellen des Prozesses: bekannte Mängel, Behinderungen oder Redundanzen des Prozesses\n" +
                            "\n" +
                            "Anforderungen sammeln\n" +
                            "Grundlage: Ist-Analyse. Weiter zu berücksichtigen: Anforderungen von Management oder zusätzlichen Nutzern.\n" +
                            "Ziel: Vollständige Bedarfsübersicht.\n" +
                            "Inhalt kann in folgende Kategorien unterteilt werden:\n" +
                            "funktionale Anforderungen, technische Anforderungen, organisatorische Anforderungen, allgemeine Kriterien\n" +
                            "\n" +
                            "Anforderungen definieren\n" +
                            "Konkrete Definierung und Ausformulierung der gesammelten Anforderungen.\n" +
                            "folgende Überlegungen sind einzubeziehen:\n" +
                            "Können die Anforderungen überhaupt erfüllt werden?\n" +
                            "Welche technische Einschränkungen gibt es?\n" +
                            "Welche Kosten fallen an und welche Ressourcen sind nötig?\n" +
                            "Welche Risiken existieren?\n" +
                            "Nun Zuordnung zu Softwarekriterien und einteilung in funktionale und nicht funktionale Anforderungen.\n" +
                            "\n" +
                            "Anforderungen überprüfen\n" +
                            "Nicht alle Anforderungen können berücksichtigt werden, aus technsichen oder zeitlichen Gründen.\n" +
                            "Manche sind für die Kernfunktion nicht notwendig. Prüfen ob Anforderungen im Anforderungskatalog bleiben und dort dann priorisiert werden.\n" +
                            "Mögliche Priorisierungen: nicht erforderlich, nice-to-have, unbedingt erforderlich\n" +
                            "\n" +
                            "Anforderungskatalog fertigstellen und genehmigen\n" +
                            "Bezeichnungen unterschiedlich: Lastenheft, Product Backlog. Inhalt feststehend oder wird in sich wiederholenden Durchläufen angepasst.\n" +
                            "Alle Beteiligte geben ihre Zustimmung zu dem Katalog, bevor Projekt auf dessen Grundlage fortgesetzt wird.\n"),
            new Term("Informationserfassung für die Anforderungsanalyse",
                    "Interview \nVorteile: \npersönlicher Kontakt fördert Auskunftbereitschaft \ngestellte Fragen werden mit großer Wahrscheinlichkeit auch beantwortet \n" +
                            "Unklarheiten können direkt geklärt werden\n" +
                            "Nachteile: \nhoher zeitlicher Aufwand, \nsubjektive Prägung der Antworten, \nerschwerte Erfassung von Faktendaten\n\n" +
                            "Fragebogen \nVorteile: \ngleichzeitige Informationsgewinnung innerhalb eines großen Personenkreises, \nweniger zeitaufwendig als ein Interview oder eine Beobachtung\n" +
                            "keine zusätzliche Dokumentation der Antworten erforderlich, \nMöglichkeit der automatischen Auswertung der Antworten\n" +
                            "Nachteile: \nhöherer Verarbeitungsaufwand als beim Interview, \nder Rücklauf der Fragebögen ist manchmal unzureichend, \nUnklarheiten lassen sich schwer klären\n\n" +
                            "Beobachtung: \nvor Ort werden Prozesse begleitet und analysiert\n" +
                            "Vorteile: \nProzesse sind objektiv zu beobachten, \nsehr effektive Erfassung möglich, \nbesonders für die Erfassung zeitlicher und quantitativer Informationen über den Prozess geeignet\n" +
                            "Nachteile: \nzeitlicher Aufwand sehr hoch, \nes können teilweise nur kleine Ausschnitte eines Prozesses beobachtet werden,\n" +
                            "Beobachtungen werden i.d.R. als unangenehm empfunden "),
            //1.1.2 Arbeitsabläufe und Gesschäftsprozesse im Rahmen einer Ist-Analyse beschreiben
            new Term("Arbeitsabläufe und Gesschäftsprozesse im Rahmen einer Ist-Analyse beschreiben",
                    "Der Zweck von SW Dev ist ua die Automatisierung von Arbeitsabläufen / Geschäftsprozessen in Unternehmen.\n" +
                            "Dazu müssen diese Vorraussetzungen erfüllen: Sie müssen klar beschreibbar sein und sich in gleicher Form wiederholen.\n" +
                            "Laufen sie nur einmal oder selten ab, lohnt sich die Automatisierung nicht. Im normalen wirtschaftlichen Umfeld ist dann die Steuerung durch den Menschen günstiger.\n" +
                            "Um festzustellen welche Prozesse mithilfe von SW Apps ganz oder teilautomatisiert werden können, müssen diese und ihre Schnitstellen im Rahmen von SW Projekten zunächst analysiert werden.\n" +
                            "Daraus werden dann die Anforderungen an die zu entwickelnde Software abgeleitet. Dieses erfolgt im Rahmen einer Ist-Analyse: die einzelnen Prozessaspekte werden analysiert und erfasst."),
            new Term("Grundlegende Begriffe",
                            "Prozessanalyse: \nsystematische Untersuchung von Prozessen zur Schwachstellenerkennung und Verbesserungspotentialaufdeckung\n\n" +
                            "Prozess: \nGesamtheit aller aufeinander einwirkenden Vorgänge innerhalb eines Systems\n\n" +
                            "Geschäftsprozess: \nsich wiederholende Tätigkeitsabfolge, durch Input gestartet.\n" +
                            "auch solche, die nicht zu einem wirtschaftlich verwertbaren Ergebnis führen (anders als im Buch steht)\n" +
                            "zB Mitarbeitereinstellung und deren softwaretechnische Umsetzung, Urlaubsplanung, Abrechnung\n\n" +
                            "Prozessschnittstelle: \nProzess tritt hier mit anderen Prozessen in Verbidnung\n" +
                            "zB: Eingang von Informationen oder Materialien am Anfang oder im Verlaufe des Prozesses\n" +
                            "Austausch von Informationen oder Materialien während des Prozesses\n" +
                            "Ausgang des Prozessergebnisses in Form von Informationen oder Material am Ende des Prozesses\n\n" +
                            "Informationsfluss (Datenfluss): \nWeg den mündliche, schriftlichee, visuelle oder auditive Daten nehmen von Quelle zu Empfängern. Nicht unbedingt die Leitung, sondern die Stationen."),
            new Term("Prozessanalyse Schritte",
                    "Prozess identifizieren: \nWelche Art von Prozess? zB technische, politische, soziologische, betriebswirtschaftliche, in weitere unterteilbar. [siehe Bild S.14]\n\n" +
                            "Prozess aufnehmen und darstellen: \nProzesszerlegung in Teilschritte, grafische Darstellung, vorallem der Schnittstellen und des Informatinsflusses.\n" +
                            "Darstellungsmöglichkeiten: Business Process Model (BPM), E3-Value-Model, ereignisgesteuerte Prozesskette (EPK), Wertschöpfungskette, UML-Aktivitätsdiagram, Programmablaufplan (PAP).\n" +
                            "So werden die Prozesse für alle Projektbeteiligten nachvollziehbar. [siehe Bild S.15]\n\n" +
                            "Prozess bewerten: \nSchwachstellen erkennen, Verbesserungspotential aufdecken, Bestimmung von automatisierbaren Teilen.\n" +
                            "zB: Datenerfassung/verwaltung in Excel sowie Druck für Ordnerablage. Gefahr der Dateninkonsistenz durch diese redundante Verwaltung.\n" +
                            "Aber durch das SW Projekt soll dieser Prozess optimiert und teilweise automatisiert werden, zB die Überprüfung der eingegebenen Daten.\n" +
                            "Dieses und alle anderen Ergebnisse der Analyse des jewailigen Prozesses münden in der Formulierung der Anforderungen and as zukünftige SW Produkt.\n"),
            //1.1.3 Anforderungskatalog erstellen
            new Term("Anforderungskatalog erstellen",
                    "Funktionale Anforderungen:\n\n" +
                            "fachlich, bezogen auf den Arbeitsablauf oder Geschäftsprozess: \n" +
                            "Eingabe und Löschfunktion für notwendige Daten des Prozesses, Anzeigen von Grafiken und Bildern mit Inhaltten des jeweiligen Prozesses\n\n" +
                            "bezogen auf die Interaktion mit der Benutzerschnittstelle:\n" +
                            "Bedienbarkeit zB mit Maus, Tastatur, Sprache, \\nScroll und Zoomfunktionen, Anpassbarkeit des Aussehens der Oberfläche\n\n" +
                            "bezogen auf geplante Endgeräte und Softwareumgebungen:\n" +
                            "Tablets, Smartphone, Desktopanwendung, stationäre Touch Panel für Automaten, \\nBetriebssysteme, Browser\n\n\n" +
                            "Nicht funktionale Anforderungen \n\n" +
                            "Qualitätsanforderung: \nBenutzbarkeit: Anforderungen an die Selbstbeschreibbarkeit und Erwartungskonformität\n\n" +
                            "Zuverlässigkeit: \nAnforderungen an die Fehlertoleranz der Benutzerschnittstellen\n\n" +
                            "Effizienz: \nAnforderungen an die Darstellung zB von 3D Animationen, Anforderungen an den Ressourcenverbrauch, zB bei speziellen Endgeräten\n\n" +
                            "technische, organisatorische und norative Rahmenbedingungen: \nvorgegebene Betriebssysteme und Browser, " +
                            "Rechtvergabe für bestimmte Funktionalitäten, Grad der Barrierefreiheit oder Mehrsprachigkeit\n\n" +
                            "[Bild Seite 19]"),
            //1.2 Ein Softwareprodukt designen
            new Term("Softwareprodukt designen",
                    "Beim Designen (Entwerfen) einer SW werden Architektur, Komponenten, Schnitstellen, Datenstrukturen, Algorithmen u.a. geplant.\n"+
                    "Es ist eine wichtige Phase da die gesamte Anwendung darauf aufbaut. \nBegonnen wird, nachdem Anforderungen feststehen. \n"+
                    "Bei Vorgehensmodell Wasserfallmodell ist der Entwurf eine abgeschlossene Phase. Bei Scrum wird er wiederholt durchlaufen.\n"+
                    "Dabei gibt es mehrere Entwurfsebenen die fließend ineinander übergehen, deren Ergebnisse während der Entwicklungszeit angepasst, verfeindert und optimiert werden."),
            //1.2.1 Benutzerschnitstellen in den Kontext der Softwarearchitektur einordnen
            new Term("Benutzerschnitstellen in den Kontext der Softwarearchitektur einordnen","Softwarearchitektur: \nstellt den Bauplan eines SW Systems dar. Beschreibung der einzelnen Komponenten und deren Verbindungen.\n\n"+
                    "Wesentliche Merkmale einer guten Softwarearchitektur:\n" +"Modularität, Entkopplung, Abstraktion, Einfachheit, Vollständigkeit, Parallelität \n\n [Bild S.23] \n\n"+
                    "Unterscheidung von Schnittstellen einer Software\n" + "Benutzerschnittstelle, Softwareschnittstelle, Hardwareschnittstelle, Hardwareschnittstelle, Datenschnittstelle"),
            //1.2.2 Architekturmuster unterscheiden
            new Term("Architekturmuster unterscheiden",
                    "Grobentwurf: \nArchitekturmuster: \nMuster für Gestaltung von Softwaresystemen, \nEinfluss auf die Architektur der Subsysteme \nProgrammiersprachen unabhängig\n\n" +
                            "Detailentwurf: \nEntwurfsmuster: \nMuster für die Entwicklung von Subsystemen und Komponenten, \nWeniger Enfluss auf das Gesamtsystem als die Architekturmuster, \nProgrammiersprachen unabhängig\n\n" +
                            "Überlegungen für die direkte Umsetzung: \nImplementierungsmuster (Idiome): \nMuster für die Lösung von speziellen Problemen in den jewailigen Programmiersprachen, \nAbhängig von der Programmiersprache\n\n" +
                            "Kategorien:\n\n" +
                            "Mud-to-Structure: \nArchitekturmuster, die dabei helfen ein System aus zahlreichen Komponenten zu organisieren, zB Schichtenarchitektur, Blackboard\n\n" +
                            "Verteilte Systeme: \nArchitekturmuster, gedacht für die Verwendung von Diensten und Ressourcen in Netzwerken zB Client-Server-Architektur, Peer-to-Peer\n\n" +
                            "Interaktive Systeme: \nArchitekturmuster, spezialisiert auf die Interkation eines SW Systems mit Menschen zB Model View Controller (MVC), Model View Presenter (MVP)\n\n" +
                            "Adaptive Systeme: \nArchitekturmuster, beschäftigt mit der Erweiterbarkeit und Anpassungsfähigkeit von SW Systemen zB Reflection, Dependency Injection"),
            new Term("Drei-Schichten-Architektur",
                    "Schichtenarichtektur Spezialform. SW wird in verschiedene Schichten(layer, tier) aufgeteilt.\n\n" +
                            "Präsentationsschicht (Client Tier, Front End): \nDatenrepräsentation Benutzeringaben und Benutzerschnitstellen\n\n" +
                            "Logikschicht (Aplication-Server Tier, Middle Tier, Enterprise Tier): \nDatenverarbeitung und Anwendungslogikvereinigung\n\n" +
                            "Datenhaltungsschicht (Data-Server Tier, Back End): \nDaten speichern und laden und Datenbank.\n\n"+
                            "[Bild S.25]\n\n"+
                            "Vorteile: \nReduzierung von Abhängigkeiten zwischen den einzelnen Komponenten, Definierte Schnitstellen zwischen den Schichten, " +
                            "Änderungen wirken sich nur selten auf andere Schichten aus, Austausch einer Schichte ist ohne Probleme möglich\n\n" +
                            "Nachteile: \nReduzierung der Ausführungsgeschwindigkeit der Software durch die Weiterleitung und Transformation der Daten über verschiedene Schichten"),
            new Term("Client-Server-Architektur",
                            "Architekturmuster für verteilte Systeme. Subsysteme (Server) bieten Dienste an, die von Subsystemen (Clients) genutzt werden.\n\n" +
                            "Vor und Nachteile der Drei-Schichten Architektur: \nbessere Skalierbarkeit durch Anwendungsverteilung auf verschiedene Systeme, \naber Anwendungsunterbrechungsmöglichkeit durch Webserverausfall. hardwareseitige maßnahmen notwendig"),
            new Term("Model View Controller",
                    "[Bild S.27] \nMuster für Benutzeroberflächen Problementwicklung. \nSW wird in drei unabhängige, in sich geschlossene Komponenten unterteilt: das Model, die View und den Controller. " +
                            "Sie interagieren miteinander um die Gesamtfunktionalität der Software umzusetzen. \nIdee hinter MVC-Muster: klare Abgrenzung zwischen den Daten, deren Darstellung und den Interaktionen des Benutzers mit GUI.\n" +
                            "Mittlerweile ist es eines der am weitesten verbreiteten Muster für die Präsenationsschicht der Drei-Schichten-Architektur von SW.\n\n" +
                            "Vorteile: \nmehrere Ansichten (Views) des Models möglich, leichtes Hinzufügen von neuen Views, synchronisierte Views, unterstützt sehr gut die agile SW Dev\n" +
                            "Nachteile: \nerhöht Komplexität der Anwendung"),
            //1.3 Benutzerschnitstellen funktionsgerecht und ergonomisch konzipieren
            //1.3.1 Benutzerschnitstellen unterscheiden und Zukunftstrends präsentieren
            new Term("Arten von Benutzerschnitstellen",
                    "CLI Command Line Interface (Befehlszeilenschnitstelle / Kommandozeile)\n\n" +
                            "Text User Interface TUI (Zeichenorientierte Benutzerschnittstellen)\n\n" +
                            "GUI Graphical User Inerface (Grafische Benutzeroberfläche)\n\n" +
                            "NUI Natural User Interface (Natürliche Benutzerschnittstelle)\n\n" +
                            "VUI Voice User Interfaces (Sprachbasierte Benutzerschnittstellen)\n\n" +
                            "OUI Organic User Interface (Organische Benutzerschnittstelle)\n\n" +
                            "BCI Brain Computer Interface (Gehirn-Computer-Schnittstelle)"),
            new Term("ISO-Norm 9241-110",
                    "Interaktionsprinzipien\n\n" +
                            "Aufgabenangemessenheit: \nIdentifizierbarkeit der unterrstüützen Aufgaben, Aufwandsoptimierung bei der Aufgabenerledigung, Standartauswahlmöglichkeiten (Defaults)\n\n" +
                            "Selbstbeschreibung: \nVorhandensein und Offensichtlichkeit von Informationen, Eindeutige Anzeige des Systemstatus\n\n" +
                            "Steuerbarkeit: \nUnterbrechbarkeit, Flexibilität, Induvidualiserbarkeit\n\n" +
                            "Erwartungskonformität: \nSystemverhalten/-reaktionen wie erwartet, Konsistenz (intern und extern), Änderungen im Nutzungskontext werden erkannt\n\n" +
                            "Robustheit gegen Benutzungsfehler: \nBenutzungsfehlervermeidung, Benutzungsfehlertoleranz, Fehlermanagement\n\n" +
                            "Benutzerbindung: \nMotivation, Vertrauenswürdigkeit, Integration der Benutzer\n\n" +
                            "Elernbarkeit: \nUnterstützung beim Entdecken von Bedienfunktionen, Unterstützung beim Erinnern und Wiedererkennen von Bedienfunktionen"),
            new Term("User Experience UX Design",
                    "Nutzererfahrungen / Wahrnehmungen und Reaktionen einer Person aus der tatsächlichen und erwarteten Benutzung eines Produkts / Systems / Dienstleistung \n\n" +
                            "UX Design [Bild S.35]\n\n" +
                            "Ziel: Kunde bleibt bei meinem Produkt\n\n" +
                            "Bestandteile: \nVisuelles Design, Inforationsarchitektur, Interaktionsdesign, Usability (Gebrauchstauglichkeit), Zugänglichkeit\n\n" +
                            "Grundprinzipien: \nVermeidung von Informationsflut, Konsistenz, Universelle Bedienbarkeit, Informative Rüückmeldungen, Abgeschlossene Dialoge, Einfache Fehlerbehebung, Widerrufbarkeit von Aktionen, Kontrollvermittlung"),
            //1.3.3 Den Designprozess und Designwerkzeuge präsentieren
            new Term("Den Designprozess und Designwerkzeuge präsentieren",
                    "S.37ff\n" + "[Bild S.38]\n\n" +
                            "Verstehen: \nVorstellungen und Eigenschaften der Zielgruppe herausfinden, \n\nForschen: \nSichtweise der Zielgruppen herausfinden, Datenanalyse, Konkurrenzbetrachtung,\n\n" +
                            "Analysieren: \nLösungsideen und Prototypen aus Forschungsergebnissen skizzieren, \n\nDesign: \nUmsetzung it einfachen anpassbaren Elementen, \n\n" +
                            "Testen: \nFunktionstüchtigkeit und zielorientierte Nutzung mit \"echten\" Nutzern testen, \n\nEntwickeln: \nDesign an Ergebnisse und Erfahrungen anpassen\n\n" +
                            "Entwürfe, die im Designprozess angefertigt werden:\n" +
                            "Sketch->Wireeframe->Mockup->Prototype"),
            //1.3.4 Grafische Benutzerelemente einer GUI unterscheiden und allgemeine Gestaltungskriterien präsentieren
            new Term("Allgemeine Gestaltungsregeln UI Design GUI Oberflächen",
                    "häufig wird die GUI-Element Gestaltung von dem Framework vorgegeben (Erwartungskonformität). Manchmal Abweichung für eigene SW Identität zB Computerspiele. \n" +
                            "Aber auch bei Webseiten werden oft professionelle Designer engagiert, die u.a. den \"goldenen Schnitt\" und andere Proportionslehren anwenden.\n\n" +
                            "Text - Maximal zwei bis drei verschiedene Schriftarten für Überschriften, Text und interaktive Elemente verwenden \n\n" +
                            "Farben - Licht kommt von oben. Dieses entspricht der Erfahrungswelt des Menschen. Dementsprechend sind GUI ELemente oben hell und unten dunkler. Auch eventuelle Schatten sind so zu gestalten. DIe Anzahl der verwendeten Farben einzuschränken.\n\n" +
                            "Texteingabe - Markierungen verwenden, um den Benutzer zur Eingabe der erforderlichen Daten zu führen. Benutzer können Daten in verschiedenen Formaten eingeben\n\n" +
                            "Steuerelemente - Schaltflächen hervorheben, sodass Benutzer erkennen können, dass das Steuerlement anzuklicken ist. Gerade aktives Steuerelement von anderen Steuerelementen farblich oder formlich abheben. " +
                            "Deaktivierte Steuerelemente durchsichtig gestalten, nicht grau. Nicht relevante Steuerelmente ausblenden oder zuklappen und erst bei Bedarf den Benutzer zur Verfügung stellen\n\n" +
                            "Abstände - Eine gute Bedienoberfläche benötigt viel Raum, Oberfläche nicht mit GUI Elementen überladen\n\n" +
                            "Icons - sollten einfach gehalten werden, in Form und Farbe, Icons sollten eine klare Bdeutung für den Benutzer haben, sollten alle den gleichen Stiel besitzen\n\n" +
                            "Navigation - Durch die Anwendung sollte auch per Tastatur navigiert werden können. Die Anwendung sollte durch Shortcuts bedienbar sein. \n\n"+
                            "Weitere Gestaltungsaspekte:\n"+
                            "Emotionale Gestaltung - Bilder die Menschen mit einer passenden Emotion zeiten \nKlangliche Gestaltung zB Windows-Sound USB Sound Warngeräusch bei Backofentastenfeld-Bäcker \n" +
                            "Soziale Gestaltung - zB ShareMöglichkeiten Kopierbarkeit \nCorporate Design (Corporate Identity) \nBarrierefreiheit \nMehrsprachigkeit \n\n"+
                            "Bedienung von grafischen Oberflächen mit anderen Interkationsformen: \nTouchsteuerung, Gestensteuerung, Sprachsteuerung"),
            //1.4 Benutzerschnitstellen in einer Programmiersprache implementieren
            new Term("Bibliotheken und Frameworks auswählen",
                    "Grundlegende Begriffe: \nBibliothek, Framework, Application Programming Interface (API)\n\n" +
                            "Kriterien zur Auswahl eines GUI Frameworks\n" +
                            "Abdeckung der Anforderungen, Popularität, Unterstützung und Dokumentation, Lizenz und Kosten, Entwurfsmuster, Installation, Elernbarkeit\n\n" +
                            "Beispiele für GUI-Frameworks: \nPhython - Thinker, PyQt \nJava - Swing, JavaFX \nC# - .Net(Windows Forms), .Net(WPF) \nC++ - .Net(Windows Forms), Qt\n\n" +
                            "Beispiele für Web-Frameworks: \nASP.NET (C#), \nExpress (JavaScript), \nDjango (Phyton), \n(Spring) Java, \nRuby on Rails (Ruby), \nLaravel (PHP), \nAngular (TypeScript)"),
            //1.4.4 Webbasierte Benutzerschnitstellen realisieren
            new Term("Webbasierte Benutzerschnitstellen realisieren",
                    "Webseitenaufruf HTTP Protokoll\n" +
                            "kennung des ports definiert welches Programm gestartet wird (zB Port 80 Anfrage an Webserver)\n" +
                            "Commandos GET (Formulardaten werden nach ? an Webadresse angehängt und mit URL übertragen), POST, 3 wege handshake, verbindungsorientierung, feedback,\n" +
                            "webserver kann sattische bereits gespeicherte html seite laden oder dynamisch durch bspw php skripte erstellen (zB eine amazonseite ja nach suchanfrage) \n" + "\n" +
                            "HTML ist eine darstellungssprache / markup language, keine programmiersprache\n" + "\n" +
                            "WYSIWYG - What you see is what you get"),
            //1.5 Benutzerschnittstelle testen
            new Term("Testverfahren","nach fertigstellung von software oder softwaremodul, \ndurchläuft software testverfahren und teststufen\n" +
                    "Bsp: Funktionalität der Logik und Datenerhaltungsschicht einer Drei-Schichten-Architektur durch Unit-Test " +
                    "mit Testdaten aus Grenzwertanalyse im Rahmen eines Blackbox-Tests oder einer Pfadüberdeckung im Rahmen eines Whitebox-Tests"),
            new Term("Herausforderungen UI Testen ",
                    "Herausforderungen beim Testen von Benutzerschnitstellen (UI) \n1. Sich ständig ändernde Benutzeroberfläche \nApps werden aktualisiert\n" +
                    "2. Zunehmende Testkomplexität \nmoderne apps haben sehr heterogene Funktionalitäten wie eingebettete Frames, komplexe Diagramme und Karten\n" +
                    "3. Hoher und schwer zu kalkulierender Zeitaufwand \nwegen ständiger Änderung der Apps, schwer kalkulierbar\n" +
                    "4. Umgang mit Mängeln und Fehlern \nnicht alle sind leicht zu beheben, manche können komplexe Änderung der Benutzerschnitstelle erforderlich machen"),
            //1.5.1 Grafische Benutzerschnitstelle testen
            new Term("GUI Darstellung testen",
                    "Vollständigkeit aller unterstützender Hinweise für den Benutzer z.B. max. 50 Zeichen\n" +
                    "größe, Position, Höhe und Breite, Ausrichtung der visuellen Elemente\n" +
                    "Einhaltung von gesetzlichen Vorgaben, Normen und Regeln\n" +
                    "Korrekte Farben und Hyperlinks\n" +
                    "Schriftarten, Schriftgröße, Beschriftung\n" +
                    "Korrektes Anzeigen von Fehlermeldungen, Warnungen und Informationen\n" +
                    "Einheitlichkeit der Farben und des Designs\n" +
                    "Auflösung Qualität und Aussagekraft der Bilder\n" +
                    "Rechtschreibung\n" +
                    "Positionierung der GUI Elemente bei unterschiedlichen Auflösungen\n" +
                    "Umsetzung von Mehrsprachigkeit\n" +
                    "Korrekter Inhalt von Texten\n" +
                    "Erwartungskonforme und einheitliche Anordnung der GUI Elemente\n" +
                    "Lesbarkeit und Gestaltung von Grafiken"),
            new Term("GUI Funktionalität testen",
                    "Sicherstellung, dass nur gültige Daten für bestimmte Datentypen wie Währung und Datumsangaben eingegeben werden können.\n" +
                    "Bedienbarkeit per Maus, Tastatur oder Touch-Funktionalität\n" +
                    "Korrektes Gruppenverhalten von Rediobuttons\n" +
                    "Flüssiger und reibungsloser Ablauf von Animationen\n" +
                    "Scrollfunktion\n" +
                    "Sicherstellunng, dass alle erforderlichen Events bei GUI-Elementen ausgelöst werden, zB Click-Events\n" +
                    "Skalierbarkeit von Grafiken\n" +
                    "Zoomfunktion\n" +
                    "Korrekte Navigation\n" +
                    "Erwartungskonforme Funktionalität zB Hilfeunterstützunge beim Drücken der F1-Taste\n" +
                    "Korrektes Auf und Einklappen von GUI Elementen\n" +
                    "Korrektes Sperren und Entsperren bzw. Ein- und Ausblenden von GUI Elementen"),
            new Term("Testverfahren GUI","Testverfhren zum Testen von grafischen Benutzeroberflächen\n\n" +
                    "Manuelles Testen \nMensch testet funktionen und darstellung \nzeitaufwendig, niedrige testabdeckung, qualität abhängig von tester\n\n" +
                    "Aufnahme und Wiedergabe Testen (Record-and-Replay-Testing) \nmit Automatisierungstools, zeichnet alle aktionen mit app auf, dann werden diese reproduziert und mit erwartung verglichen\n\n" +
                    "Modellbasiertes Testen (Model-Based testing) \nauf Grundlage grafischer Modelle, die Systemverhalten beschreiben, ermöglicht tester hocheffiziente testfälle zu generieren, " +
                    "da es tieferes verständnis vom system bietet, hohe Testabdeckung\n" + "Modelle: Ereignisbasiert, Zustandssbasiert, Domänen"),
            //1.5.3 Das Testen der User Experience beschreiben
            new Term("UX Testen","User Experience Testen\n\n"+
                    "Sind alle Angaben aktuell? \nIst das System nützlich und schafft einen Mehrwert für die Zielgruppe?\n" +
                    "Werden die Grundsätze der Dialoggestelatung nach DIN EN ISO 9241-110 eingehalten?\n" +
                    "Sind Inhalte, Farbe, Icons, Bilder ästhetisch ansprechend? \nIst das System leicht erlernbar?\n" +
                    "Ist ein klarer Orientierungsrahmen innerhalb der Anwendung vorhanden? \nIst die Barrierefreiheit für Sehbehinderte gewährleistet?\n" +
                    "Werden erwartungskonforme Begrifflichkeiten und Positionierungen verwendet? \nIst ein einheitliches Design umgesetzt?\n" +
                    "Werden ausreichend Hilfen zur Verfügung gestellt? \nToleriert die Anwendung ausreichend Bedienungsfehler?\n" +
                    "Ist die Anwendung effizient bedienbar zum Beispiel sollte wenig Navigation erforderlich sein, um das gewünschte Fenster oder die gewünschte Webseite zu erreichen.\n"),
            new Term("UX-Testverfahren",
                    "Kontextanalyse \nNutzer vor Ort, Arbeitsplatz weden befragt, beobachtet, beschrieben, \n\nTest mit Fokusgruppen, \nausgewähte homogene Zielgruppe wird befragt, auch nach verbesserungsvorschlägen\n\n"+
                    "Online-Befragung \nnach Usability, vor allem beim Test von Webseiten, \n\nExpertenbasierte Überprüfung, \nUsability Überprüfung durch Experten nach Kriterien mit Auswertung\n\n" +
                    "Labortest, \nauf Grundlage speziellen Szenarios, zielgruppenspezifische Testerauswahl, Experten beobachten Testpersonen bei Arbeit und Stellen Fragen\n\n"+
                    "Blickverlaufsmessung, \nEye-Tracking, über Infrarottechnnik, im Labor"),
            new Term("UX Tests Vor- & Nachteile",
                    "Vorteile: \n\n-effizientes Softwareprodukt, \n-Entwicklung eines Verständnisses für die Bedürfnisse der Benutzer,\n" +
                    "welche in die weitere Entwicklung einfließen können, \n-hohe Benutzerakzeptanz der Software, \n" +
                    "-Zeit- und Geldeinsparung, weil später aufwendiges Nacharbeiten vermieden wird\n\n" +
                    "Nachteile: \n\n-hohe Testkosten, \n-ressourcen- und zeitintensiv,\n" +
                    "-aufwendige Auswahl der Testpersonen \n-teilweise umfangreiche Vorbereitungen notwendig\n" +
                    "-teilweise aufwendiges Auswerten der Ergebnisse erforderlich"),
            //Benutzerschnitstellen dokumentieren
            new Term("Benutzerhandbuch",
                    "Inhalt: \n\nDeckblatt, Inhaltsverzeichnis, Einleitung, Kurzbeschreibung des Produkts (Überblick) (...), " +
                    "Installationsanleitung (...), Bedienungsanleitung (...), Fehlerbehandlung (...), " +
                    "Wartungs und Supportinformationen, Häufig gestellte Fragen FAQ, Begriffserläuterungen (Glossar)\n\n" +
                    "Hersteller, Produktname, Kontaktdaten, mathematische Grundlagen, Lizenzen, Zubehör, technische Daten,\n" +
                    "Grafiken und Screenshots, Normen, Feature, Haftungsausschuss, Copyright Erklärung\n\n" +
                    "Kriterien für ein gutes Benutzerhandbuch\n" +
                    "Verständlichkeit, Einfacheit, Konzentration auf das Problem, Fokus auf die visuelle Darstellung," +
                    "Inhaltsverzeichnis mit klarer Struktur und logische Gliederung, Mehrsprachigkeit \n\n" +
                    "Vor und Nachteile von Benutzerhandbüchern in Papierform\n\n" +
                    "Vorteile: \nkann ohne elektronisches Gerät verwendet werden,\n" +
                    "kann auf einen Blick geelesen werden, \ndie Erfahrung Papier in der Hand zu halten ist einzigartig,\n" +
                    "diese Art der Leseerfharung ist für viele angenehmer als die digitale Leseerfahrung,\n" +
                    "es kann immer und überall ohne weitere Voraussetzungen gelesen werden\n\n" +
                    "Nachteile: \nKosten für Druck, Bindung und Verpackung, \nbegrenzter Platz und begrenzte Informationen, \nkann leicht verlegt werden,\n" +
                    "nicht sofort aktualisierbar, keine Videos, \nhoher Aufwand es für große Nutzergruppen zur Verfügung stellen"),
            new Term("Onlinedokumentation","Vorteile von Onlinedokumentationen \n\n+" +
                    "Hohe Aktualität, Hohe Multimedialität, Hohe Verfügbarkeit, Bessere Interaktivität, keine beschränkungen im Umfang")
    };
    private static Term[] termsLF11 = {
            //Ordner 1
            new Term("<...>", "<...> "),
    };
    private static Term[] termsLF12 = {
            new Term("Projekt Beispiele",""),
            new Term("Projekt Phasen",
                    "Initialisierung: \nProjektziele skizzieren, Projektauftrag \n\n"+
                    "Definition: \nKernteam bilden, Stakeholderanalyse, Ziele und Lieferobjekte, Phasen und Meilensteine\n\n"+
                    "Planung: \nProjektstruktur, Arbeitspakete, Aufbauorganisation, Ablauf- und Terminplanung, Einsatzmittelplanung, Kostenplanung, Risikoanalyse\n\n"+
                    "Steurung: \nKontrolle und Steuerung, Änderungsmanagement \n\nAbschluss: \nErfahrungssicherung"),
            //4.1.2 Die Projektorganisation innerhalb von Unternehmen präsentieren
            new Term("Auftraggeber","kann ein Führungskraft des Unternehmens sein (Geschäftsführer, Abteilungsleiter), ein Kunde oder der Eigentümer des Unternehmens.\n" +
                    "Er initiiert den Projektauftrag, skizziert erste grobe Anforderungen, entscheidet über Abbruch oder Fortführung und bestimmt Lenkungsgruppenmitglieder und Projektleitung bei internen Projekten."),
            new Term("Lenkungsausschuss","stellt das sogenannte Entscheidungsgremium dar, meistens aus Führungkräften des Unternehmens und eventuell aus Vertretern des Kunden zusammengesetzt. Mitglieder treffen sich idealerweise regelmäßig. " +
                    "Er trifft in allen Phasen des Projektes Grundatzentscheidungen."),
            new Term("Projektleitung","Projektplanung, -steuerung und Fortschrittüberwachung. Festlegung der  Regeln und der Rolllen und Teambildungsbestimmung, Projektdokumentationszuständigkeit, Informationspflichtig gegenüber Auftraggeber und Lenkungsausschuss. In größeren Projekten gibt es mehrere."),
            new Term("Projektteam","Projektleitung + Projektteam. Mitarbeiter bearbeiten unter Leitung / Moderation den Projektauftrag. Mitarbeiter sind in der Regel temporär dem Projekt zugeordnet. Bei Teilprojekten mehrere Projektteams möglich."),
            new Term("Stakeholder ","Personen mit Interesse am Projekt oder die davon in irgendeiner Weise betroffen sind. zB Sponsoren, Betriebsratsmitglieder, Helpdeskmitarbeiter, Lieferanten oder Behörden."),
            new Term("Projektorganisationsformen",""),
            new Term("Reine Projektorganisation",
                    "(aka autonome Projektorganisation) Mitarbeiter kommen aus unterschiedlichen Fachabbteilungen, werden für Projektdauer daraus gelöst. \n" +
                            "Projektleitung übernimmt fachliche und disziplinarische Weisungsrecht. Diese Form erfordert große Ressourcen an Fachkräften.\n\n" +
                            "[Bild]\n\n" +
                            "Einsatzgebiete: Groß und Auslandsprojekte, zeitkritische Projekte\n\n" +
                            "Vorteile: \nvolle Entscheidungs und Weisungsbefugnis der Projektleitung ermöglicht eine konzentrierte Realisierung der Projektziele,\n" +
                            "umfangreiche Projekte können mit eigenen Ressourcen durchgeführt werden, \nAufgaben und Verantwortlichkeiten sind eindeutig verteilbar,\n" +
                            "hohe Identifikation der Projektmitarbeiter mit dem Projekt direkte Kommunikation\n\n" +
                            "Nachteile: hoher Aufwand für die Projektorganisation, \nProjekt bindet Ressourcen, \nwelche für den Projektzeitraum nicht zur Verfügung stehen, \nmögliche Probleme bei der Rückführung der Projektmitarbeiter in die vorherige Betriebsorganisation"),
            new Term("Stabsprojektorganisation",
                    "(aka Einflussorganisation)\n" +
                            "Projektleitung ist direkt der Unternehmensleitung unterstellt und verfügt über keine fachliche und disziplinarische Weisungsbefugnis. \n" +
                            "Sie koordiniert lediglich den Projektablauf (Stabsfunktion). \n" +
                            "Mitarbeiter verbleiben in ihren Linienstrukturen und bearbeiten dort neben anderen Aufgaben auch die Projektaufgaben.\n\n" +
                            "Vorteile: \nbestehende Betriebsorganisationsstruktur wird nicht verändert, wodurch die Projektorganisation schnell eingerichtet und aufgelöst werden kann,\n" +
                            "sehr flexibel und das Fachwissen der einzelnen Abteilungen kann genutzt werden\n\n" +
                            "Nachteile: \n und Koordination innerhalb des Projektes sehr aufwendig, \nnotwendige Maßnahmen teilweie schwierig durchzusetzen, da Projektleitung über keinerlei Weisungsberechtigung verfügt\n"),
            new Term("Matrixprojektorganisation",
                    "Mitglieder gehen normaler Tätigkeit nach und sind dabei für eine gewisse Zeit für das Projekt freigestellt. \n" +
                            "Die Abteilungsleitung übt das disziplinarische Weisungsrecht und auch das fachliche für Linienaufgaben aus. \n" +
                            "Die Projektleitung verfügt über das fachliche Weisungsrecht in Fragen des Projektes. \n" +
                            "Wird in der Praxis sehr häufig angewendet. Sie stellt eine Mischform zwischen Stabs und reiner Projektorganisation dar.\n" +
                            "[Bild]\n" +
                            "Einsatzgebiete: mittlere und große Projekte\n\n" +
                            "Vorteile: \nMitarbeiter verbleiben in ihren Abteilungen, sodass eventuelle Probleme bei Wiederingliederung am Ende des Projektes entfallen,\n" +
                            "Mitarbeiter können vom Wissen und dem Austausch in ihren Fachabteilungen profitieren, Flexibler Zugriff auf Ressorucen\n\n" +
                            "Nachteile: \nKonflikte zwischen Projekt und Abteilungsleiter, \nProbleme der Priorisierung zwischen Linien- und Projektarbeit\n"),
            //4.2 Kundenprojekte im Rahmen von Projekten planen und bearbeiten
            new Term("Qualitätsmerkmale von SW","Benutzbarkeit \nÜbertragbarkeit \nÄnderbarkeit \nEffizienz \nZuverlässigkeit \nFunktionalität"),
            //4.2.2 Das Projekt planen und die Wirtschaftlichkeit beurteilen
            new Term("Kosten SW Dev und Reduzierungswege",
                    "Gesamtkosten SW(Software) Projekt Zeitaufwand * Stundensatz\n" + "\n" +
                    "Zeitschätzung: in 3 Gruppen nach Komplexität\n" + "\n" +
                    "SW Komplexität: Einfach: \n~2 Monate, 500-700 Stunden, SW mit einfachen Funktionen und Design ohne Interkation\n" +
                    "Mittelkomplex: \n~3,5 Monate, 700-1,200: SW mit komplexeren Funktionen und einer animierten Oberfläche, die in der agilen Umgebung entwickelt wird\n" +
                    "Komplex: \n>4 Monate, >1200 Stunden: SW mit komplexer Architektur, hohen Sicherheitsnaorderungen, vielen Integrationen und/oder SW, beideren Entwicklung fortschrittliche Technologieen verwendet werden\n\n" +
                    "Kostenschätzung: Anzahl der Stunden mit dem durchschnittlichen Stundensatz aller Projektbeiteiligten multiplizieren\n" + "\n" +
                    "Kostenreduzierungswege: Outsourcing-Dienstleister\n" + "Andere (Gemein)Kosten die mit Inhouse-SW Dev (Software Development) verbunden sind:\n" +
                    "Kosten für Personalgewinnung, -einstellung und -management, \nKosten für Nebenleistungen und Lohnsteuer,\n" +
                    "Kosten für Arbeitsplätze, IT-Infrastruktur, Software und Hardware-Support und mehr, \nKosten für Schulungen\n" +"\n" +
                    "bei Outsourcing zu beachten: durchschnittliche Stundensätze der SW Entwicklern variieren von Land zu Land\n" +
                    "Deutschland: 100$, Vietnam: 20-40$, Belarus: 25-50$, Poland: $30-60\n" +
                    "außerdem ist, trotz wesentlicher Kostensenkung, eine Verursachung versteckter Kosten möglich, die, falls nicht effizient organisiert und verwaltet, den Projektpreis in die Höhe treiben können.  \n" + "\n" +
                    "Die Entwicklung einer SW verschlingt meist deutlich mehr Geld als geplant, oft weil Unternehmen Projektkostenkalkulationsmethoden fehlen.\n" + "\n" +
                    "Früher wurden SW Projekte häufig geschätzt und ein üppiger Risikozuschlag hinzugerechnet. Entwickler blieben so inerhalb der vereinbarten Budgets. " +
                    "Diese sind aber inzwischen knapper geworden."),
            new Term("Gesamtkosten","Gesamtkosten = Zeitaufwand - Stundensatz\n" + "Personalkosten: \nLöhne, Gehälterr, Sozialleistungen, Arbeitsplatzkosten, Schulungen\n" +
                    "Hardwarekosten: \nKosten für Computer, Datenbankserver, Vernetzung. anteilsmäßige Berücksichtigung weil die Hardware auch für andere Projekte genutzt werden kann.\n" +
                    "Ausnahme: spezielle Hardware für genau dieses SW Projekt.\n" +
                    "Softwarekosten: \nKosten für Software, welche für die Entwicklung benötigt wird (zB Lizenzkosten für Entwicklungsumgebungen). Sie verteilen sich, bis auf Aufnahmen, auf mehrere Projekte.\n" +
                    "Energiekosten: \nnicht zu unterschätzen: Stromverbrauch der Hardware und KLimatisierung.\n" +
                    "Fremdkoste: \nIn manchen Fällen kommen noch Kosten für das Outsourcing von Projektaufgaben, Beratungskosten usw. hinzu"),
            new Term("Wirtschaftslichtkeit", "Wirtschaftslichtkeit zu Projektbeginn nicht mehr als eine Prognose, dann deutlicher zu zum Ende erfolgt eine genaue Analyse. Sie beinhaltet im einfachsten Fall eine angabe ob sie ein wirtschaftlicher Erfolg war,\n" +
                    "also mit Gewinn oder zumindestens nicht mit Verlust abgeschlossen hat. Die Berechnung stellt die Differenz zwischen erwirtschafteten Erträgen, zB Verkaufspreis bei einem externen oder Kostenersparnis bei einem internen Projekt und den Projektkosten dar.\n" +
                    "\n" + "Ergebnis = Ertrag - Kosten\n" + "\n" + "Beispiel: Die SW, erstellt in einem Projekt, bewirkt hausintern eine Kostenersparnis von 3000$. Hauptsächliche Kosten: Personalkosten: 2300$ \n"+
                    "Ergebnis: 3000$ - 2300$ = 700$\n" +
                    "Also hat das Projekt positives Ergebnis von 700$. Damit wurde ein Gewinn gemacht und das Projekt war erfolgreich.\n" +
                    "Mit diesem Ergebnis können jetzt weitere wirtschaftliche Brechnungen angestelllt werden.\n" +
                    "Dazu werdenexemplarisch die statischen Berechnungsmethoden Rentabilitätsrechnung und Amortisationsrechnung näher betrachtet.\n" +
                    "Siehe Rentabilität und Amortisationsdauer."),
            new Term("Rentabilität",
                    "Projektergebnis (Gewinn oder Verlust) wird in Bezug zu anderen Größen gestellt. In den meisten Fällen zu dem eingesetzten Kapital, welches notwendig war, um diesen Gewinn zu erzielen.\n" +
                    "Rentabilität = ( Gewinn / Kapitaleinsatz ) * 100%\n" +
                    "Beispiel: Ein SW Projekt erwirtschaftet durch den Verkaufserlös einen Gewinn von 20.000$ Das dafür eingetzte Kapital hatte einen Umfang von 100.000$.\n" +
                    "Berechnung: (20.000$ / 100.000$) * 100% = 20%\n" +
                    "Damit ergibt sich eine Projektrentabilität von 20%."),
            new Term("Amortisationsdauer",
                    "Zeitraum, in dem die Projektkosten durch regelmäßige zukünftige Gewinne wieder zurückgewonnen werden.\n" +
                    "Beispiel: Kosten für SW Projekt: 50.000$. Sie wird inder Cloud angeboten und kann gemietet werden.\n" +
                    "Die Einnahmen aus dem Cloud Geschäft betragen etwa 2000$ pro Monat.\n" +
                    "Rechnung: (50.000$ / 2.000$ pro Monat) = 25 Monate\n" +
                    "Damit dauert es 25 Monate oder etwas über zwei Jahre, ehe sich das Projekt amortisiert hat.\n"),
            new Term("Studensatzkalkulation",
                    "Anzahl Mitarbeiter: 8\n" + "Jahrekosten eines: 60.000\n" + "Gemeinkosten insgs: 230.000\n" + "Selbstkosten insgs: 8*60.000+230.000 = 710.000\n" +
                    "verrechenbare Arbeitszeit/Jahr eines: 1512\n" + "aller: 8*1512=12096\n" + "Selbstkostenstundensatz: 710.000/12096 = 58,70$\n" +
                    "Gewinnaufschlag: +15% = 8,80$\n" + "Netto-Stundensatz: 58,70$*1,15 = 67,50$ (115%)\n" + "Stundensatz inkl MwSt.: 100% + 19% = 80,33(119%)"),
            new Term("Projektrisiken bewerten",
                    "Arten von Risiken: \n\nPersonelle \nNicht genügend Mitarbeiter \nMitarbeiter werden krank \n\nZeitliche und finanzielle Risiken: \nkeine oder unrealistische Terminpläne und/oder Kostenplanung \n"+
                    "auftreten von zeit oder kostenintensiven Aufgaben, die bei Projektplanung noch nicht bekannt waren \n\nTechnologische Risiken: \nTechnologie veraltet während Projektverlauf \n"+
                    "Einsatz neuer Technologie, die noch nicht ausreichend bekannt ist \n\nOrganisatorische Risiken: \nEs wird das falsche Vorgehensmodell gewählt \nunzureichende Kommunikation im Projektteam \n\n"+
                    "Bewertung von Risiken: \nSiehe Bild \nRisikokennziffer = Wahrscheinlichkeit * Schadenspotenzial \nkann bei bedarf farblich sein: \n1-8 - grün, 9-17 - gelb, 18-15 - rot"),
            //wo im Buch?
            new Term("ereignisorientierte Prozesskette EPK",
                    "für geregelte Betriebliche Abläufe, Geschäftsprozesse \naus der Betriebswirtschaft \n"+
                    "\nGrundelemente: \nEreignis: (rot) quadratisches Sechseck \nFunktion: (grün) abgerundetes Viereck \n"+
                    "Verknüpfung: \nim Kreis: \nΛ - beide (und) \nV - beide oder eines (oder) \nxor - nur eines von beiden \n"+
                    "Kontrollfluss: Pfeil"),
            //4.2.1 Zielsetzung des Kundenauftrags erfassen
            new Term("SW Qualitätsmerkmale ","Software Qualitätsmerkmale mit Kriteriengruppen \n\n"+
                    "Funktionalität\n" + "Richtigkeit, Angemessenheit, Interoperabilität, Ordnungsmäßigkeit, Sicherheit, Konformität\n\n" +
                    "Zuverlässigkeit\n" + "Reife, Fehlertoleranz, Wiederherstellbarkeit, Konformität\n\n" +
                    "Effizienz\n" + "Zeitverhalten, Verbrauchsverhalten, Konformität\n\n" +
                    "Benutzbarkeit \n" + "Verständlichkeit, Elernbarkeit, Bedienbarkeit, Attraktivität, Konformität\n\n" +
                    "Änderbarkeit/Wartbarkeit\n" + "Analysierbarkeit, Modifizierbarkeit, Stabilität, Prüfbarkeit, Konformität\n\n" +
                    "Übertragbarkeit\n" + "Anpassbarkeit, Installierbarkeit, Austauschbarkeit, Konformität"),
            new Term("Break Even Point", "Umsatz = Stückzahl * Stückpreis\n\n"+ "Deckungsbeitrag = Umsatz - variable Kosten \n"+
                    "Der Unterschied zwischen Erlösen (Umsatz) und variablen Kosten. Er steht zur Deckung der Fixkosten zur Verfügung. "+
                    "Er kann auf die Gesamtmenge als auch auf ein Stück bezogen werden.\n\n"+
                    "Break Even Point =\n Fixkosten / (Stückpreis - Variable Stückkosten) \nDer Punkt, ab dem Gewinn erwirtschaftet wird.")
    };
    private static Term[] termsLFWK = {
            //Ordner 1
            new Term("Berufe","Es gibt 324 Berufe, \ndie im Verzeichnis der anerkannten Berufe, \ndes Bundesinstitut für Berufsbildung BiB stehen \nund 54 Berufsfelder."),
            new Term("BBiG","Berufsbildungsgesetz BBiG \n\nregelt Handwerksordnung HWO (Handwerksberufe) \nAusbildungsordnung für jeden Ausbildungsberufe "+
                    "(Ort, Dauer, Name, Was wann lehren, Prüfung)"),
            new Term("Duale Ausbildung","Betrieb \n(Wirtschaftsminister) \nFachpraxis Fp \nAbschluss: Kammerprüfung / Gehilfen: Gesellenbrief \n\n"+
                    "Berufsschule \n(Wirtschaftsminister) \nFachtheorie + Fp (bisschen \nAllgemeinbildung + tp (technisches Praktikum)) \nSchulabschlussprüfung: Abschlusszeugnis Berufsschule"+
                    "\n\nVorteile: \nAusbildung abwechslungsreicher \nGünstiger für Steuerzahler als ganzschulische \nfrüher Erfahrung in Arbeitswelt "+
                    "\nauch Allgemeinbildung (Berufsschule) \ntheoretische Ausbildung kann nicht durch Betrieb unterbrochen werden \n\n"+
                    "Nachteile: \nOrganisation manchmal schwierig, welche Ausbildungsinhalte wo vermitteln \nQualität je nach Betrieb anderst \n"+
                    "Berufsschulen oft ohne moderne Maschinen \nzu wenige Ausbildungsplätze in Betrieben"),
            new Term("Berufsausbildungsvertrag","Vertragspartner: Ausbilder + Auszubildender unterschreiben schicken zur Genehmigung an IHK Industriehandelskammer "+
                    "und HWK Handwerkskammer. Diese machen Eintrag ins Verzeichnis der Berufsausbildungsverhältnisse VBAV. Grundlagen: Berufssbildungsgesetz BBiG, Handwerksordnung HWO, außerdem zB "+
                    "Jugendarbeitsschutzgesetz \n\nInhalt: \nZiel der Ausbildung \nZeitliche Reihenfolge \ntägliche Arbeitszeit \nDauer (normalerweise 3 Jahre) \nDauer der Probezeit "+
                    "\nAusbildungsmaßnahmen außerhalb der Firma \nHöhe Ausbildungsvergütung \nDauer Urlaub \nKündigungsvoraussetzungen \n"+
                    "\nPflichten Auszubildender: \nLernpflicht \nAusbildungsnachweis \nSorgfaltspflicht \nWettbewerbsverbot \nSchweigepflicht \nWeisungsgebundenheit \n"+
                    "Teilnahmepflicht Berufsschule \nBenachrichtigungspflicht \n\nPflichten Ausbilder: \nAusbildungspflicht \nBereitstellung von Arbeitsmitteln \nAusbildungsbezogene Tätigkeiten \n"+
                    "Freistellungspflicht für Berufsschule \nFürsorgepflicht \nPflicht Zeugnisausstellung \nZahlungspflicht"),
            new Term("Ende Berufsausbildung","In Probezeit \n1) Kündigung fristlos (ohne Grundangabe) \na) durch Azubi b) durch Ausbilder \n\n"+
                    "Nach Probezeit \n1) Kündigung fristlos (wichtiger Grund) \na) durch Azubi zB Bedrohung Gewalt \nb) durch Ausbilder zB Diebstahl, Gewalt \n"+
                    "2) Kündigung + Frist 4 Wochen \ndurch Azubi zB Berufswechsel \n\nGesellenprüfung, Abschlussprüfung"),
            new Term ("Arbeitsschutz","Arbeitszeitgesetz, Bundesurlaubsgesetz, Mutterschutzgesetz, Schwerbehindertenschutz (Sozialgesetzbuch), Jugendabreitsschutzgesetz"),
            new Term("Arbeitsstättenverordnung","Temperatur, Sauberkeit, Beleuchtung"),
            new Term("Produktsicherheitsgesetz","Geräte und Maschinen, Notschalter, Sicherheitshinweise, Fingerschutz, Sichtschutz, Schutzkappen"),
            new Term("Unfallverhütungsvorschriften","Schutzbekleidung: Sicherheitsschuhe, Handschuhe, Schutzbrille, Mundschutz, Helm \n\n"+
                    "Regeln in Wektstätten: Fluchtweg, Nicht Essen, Rauchen, an Sicherheitshinweise halten"),
            new Term("überwachung","Unfallverhütungsvorschriften \ndurch Berufsgenossenschaften (Sicherheitsbeauftragter) ohne Anmeldung, sofort beseitigen, Geldstrafe \n\n"+
                    "sozialen Arbeitsschutz \ndurch Gewerbeaufsichtsämter prüfen Anzeigen Geldstrafen \n\nTÜV (Technischer Überwachungsverein) \nüberprüft Maschinen im Betrieb \n\n"+
                    "Betriebsärzte & Sicherheitsingenieure \n\nBetriebsrat"),
            new Term("Arbeits - Ausbildungsvertrag","Arbeitsvertrag \nArbeitnehmer & geber \nNamen der Vertragspartner \nBeginn und Ende (bei Befristung) des Arbeitsverhältnisses \n"+
                    "Beschreibung Arbeit \nArbeitszeit \nUrlaubstage \nGehalt \nKündigungsfristen \n\nAusbildungsvertrag \nAusbildender & Ausbilder \nNamen der Vertragspartner \n"+
                    "Beginn & Ende \nAusbildungsinhalte \nAusbildungsmaßnahmen außerhalb von Firma \nUrlaubstage \nGehalt \nDauer Probezeit \nKündigungsfristen"),
            //Ordner 2
            new Term("Sozialversicherungen",
                    "Krankenversicherung \nseit1883 \nTräger: Krankenkasse \nBeiträge zahlt Arbeitgeber & Arbeitnehmer 50/50 \nBeitragshöhe: 14,6 % von Bruttolohn \n"+
                    "\nUnfallversicherung \nseit1884 \nTräger: Berufsgenossenschaften \nBeiträge zahlt Arbeitgeber 100% \nBeitragshöhe hängt von Unfallrisiko ab\n\n"+
                    "Rentenversicherung \nseit 1889 \nTräger: Deutsche Rentenversicherung \nBeiträge zahlt Arbeitgeber 100% \nBeitragshöhe 18,6 % vom Bruttolohn\n\n"+
                    "Arbeitslosenversicherung \nseit 1927 \nTräger: Bundesagentur für Arbeit \nBeiträge zahlt Arbeit 100% \nBeitragshöhe 2,4 % von Bruttolohn\n\n"+
                    "Pflegeversicherung \nseit 1995 \nTräger: Pflegekasse \n Beiträge zahlt Arbeit 100% \nBeitragshöhe 3,05 % (kinderlos, über 23: + 0,35 %)\n\n"+
                    "Beitrag berechnen \nLohn * 0,5 (Arbeitgeber und Arbeitnehmer zahlen je die Hälfte) * 0,024 (Höhe Arbeitslosenversicheurng) = 28,80\n\n"+
                    "Solidaritätsprinzip: Frau A & B zahlen ein, wenn eine krank wird, bekommt sie von den Beiträgen beider, so wie die andere auch, falls diese auch mal krank ist"),
            new Term("Tarifvertrag",
                    "Tarifverhandlungen durch \"Sozialpartner\" Arbeitgeberverband und Gewerkschaft führen zu \n\nLohntarifvertrag \nLohnhöhe \nLaufzeit: 1 Jahr \n\nManteltarifvertrag \nArbeitsbedingungen"+
                    " wie Pausen, Mehrarbeit, Arbeitszeit, Laufzeit: 3 - 5 Jahre \n\nSo muss nicht jedes Jahr alles neu verhandelt werden \n\nTarifvertrag: einheitliche Arbeitsbedingungen für ganzen Wirtschaftszweig"+
                    "\n\nTarifverhandlungen: \nTarifautonomie: Tarifpartner verhandeln selbst (Staat darf nicht einmischen) \nSchlichtung: Wenn Tarifverhandlung scheitert, +neutrale Person versucht Lösung zu finden \n"+
                    "Urabstimmung: Wenn Schlichtung scheitert. Gewerkschaftsmitglieder stimmen über Streik ab (75% der Stimmen benötigt) \nStreikgeld: von Gewerkschaft (da kein Lohn während Streik) \n"+
                    "Aussperrung: Firma wird geschlossen, da wegen Sreik unrentabel. Problem für Arbeiter außerhalb der Gewerkschaft. Diese bekommen jetzt weder Lohn noch Streikgeld\n"+
                    "Neue Tarifverhandlungen: 2. Urabstimmung: Streik Ende? (mindestens 25% der Stimmen benötigt) \nNeuer Tarifvertrag \nallgemeinverbindlich für alle gültig!"+
                    "\n  Jede Firma, jeder Chef, jeder Arbeiter muss ihn beachten. \nFriedenspflicht: Da neuer Tarifvertrag keinen Streik und keine Aussperrung mehr!"),
            new Term("Interessenvertretung im Betrieb",
                    "1) Schwerbehindertenvertretung \n2) Jugend & Auszubildendenvertretung \n3) Betriebsrat"+
                    "\n\nwo? \nprivate Betriebe \n1) mit mindestens 5 Schwerbehinderten \n2) mit mindestens 5 Jugendlichen &/oder Auszubildenden \n3) mit mindestens 5 Arbeitnehmern"+
                    "\n\nWahl für \n1) 4 Jahre von Schwerbehinderten (mindestens 60 GdB) \n2) 2 Jahre von < 18 jährigen & allen Azubis \n3) 4 Jahre von Arbeitnehmer > 18 jährig"+
                    "\n\nWen wählen \n1) Arbeiter, mindestens 6 Monate im Betrieb, volljährig \n2) bis 25 jährige, bei Azubis alle \n3) Arbeiter >18 jährige und mindestens 6 Monate im Betrieb"+
                    "\n\nMitgliederzahl \n1) 1 + 1 Stelllvertreter \n2) verschieden (maximal 25) \n3) abhängig von Betriebsgröße"+
                    "\n\nAufgabe \n1) hilft Schwerbehinderten bei Problemen im Betrieb, Betriebsratssitzungsteilnahme, achtet auf Einhaltung von Gesetz und Vorschrift\n"+
                    "2) Betriebsratssitzungsteilnahme, achtet auf Einhaltung von Gesetz und Vorschrift, Zusammenarbeit mit Betriebsrat, spricht nicht direkt mit Chef, sondern erst mit Betriebsrat\n"+
                    "3) Verwaltung der Sozialeinrichtungen und Arbeitsschutz"),
            new Term("Betriebsrat","Mitbestimmung im Betrieb \n\n   Personalsachen \n   Tarifverträge \n   Betriebsvereinbarungen \n   Betriebswirtschaft"),
            new Term("Betriebsversammlung","alle 3 Monate \n\nVorbereitung und Leitung: Betriebsrat \ndieser berichtet hier von Arbeit der letzten 3 Monate \nArbeiter kommen zusammen und stellen Fragen\n"+
                    "Chefs sind dabei und können sich zu Wort melden"),
            new Term("Besonderer Kündigungsschutz","Für Arbeiter in Betriebsrat und Schwerbehindertenvertretung"),
            new Term("Arbeitszeugnis","einfaches Arbeitszeugnis: \nBeschäftigung Art & Dauer, erworbene Fähigkeiten & Kenntnisse"+
                    "\nQualifiziertes Zeugnis: \n(auf Verlangen) \nVerhalten + Leistung zusätzlich beurteilt \n\nJeder Arbeiter hat darrauf Anspruch \nmuss immer positiv formuliert sein "+
                    "[siehe Bild]"),
            new Term("Kündigung","fristlose Kündigung \nzB wegen Diebstahl, Körperliche Gewalt, Arbeitsvergewaltigung, zu häufiges Fehlen ohne Entschuldigung\n\n"+
                    "fristgemäße Kündigung \n\nKündigungsschutz allgemein \nKündigung muss begründet und sozial gerechtigt sein (jüngere vor ältere, ledig vor Eltern, Neu vor lang in Betrieb)\n\n"+
                    "besonderer Kündigungsschutz \nfür Betriebsräte, Jugend und Auszubildendenvetretung, Schwangere, Stillende, Schwerbehinderte mit mind 50 GdB\n\n"+
                    "gesetzliche Kündigungsfrist \nProbezeit 2 Wochen: Kündigung kann jeden Tag ausgesprochen werden \nBeschäftigung < 2 Jahre: 3 Monate\n\n"+
                    "nach selbst kündigen ohne Arbeit: Sperrzeit Arbeitslosengeld bis 12 Wochen"),
            //Ordner 3
            new Term("Rechtsfähigkeit",
                    "bedeutet Träger von Rechten & Pflichten zu sein \nzB Recht auf Urlaub -> Pflicht zu arbeiten \nBeginn: Geburt, Ende: Tod"),
            new Term("Natürl, jurist Personen",
                    "Natürliche Personen: alle lebenden Menschen, rechtsfähig (außer <18 -> gesetzlicher Vertreter)" +
                    "\n\nJuristische Personen: rechtsfähig (können aber nur durch natürliche Personen handeln)"+
                    " zB Herr M bestellt iPads im Namen der Paullinenpflege, bezahlt mit ihrem Geld"+
                    "\ndes privaten Rechts -> Vereine, Firmen \nrechtsfähig wenn zB in öffentlichen Verzeichnis"+
                    "\ndes öffentlichen Rechts -> Ämter, IHK, Polizei \nrechtrechtsfähig wenn Staat das genehmigt"),
            new Term("Geschäftsfähigkeit",
                    "geschäftsunfähig = 0-7 Jahre, geistig behindert = Rechtsgeschäfte nichtig\n"+
                    "beschränkte geschäftsfähigkeit = 7 - 18 Jahre, = schwebend unwirksam, nur gültig bei zuständiger gesetzlicher Vertretung*\n"+
                    "volle geschäftsfähigkeit 18+ Jahre = alle Rechtsgeschäfte sind voll gültig\n\n"+
                    "*Ausnahmen: \nGeschäfte mit nur Vorteilen zB Geldgeschenk, \nGeschäfte die nur mit Taschengeld bezahlt werden können"+
                    "\nRatenverträge <18 Jahre sind verboten \nGeschäfte die Arbeitsverhältnis betreffen wenn von Elter erlaubt"),
            new Term("Rechtsgeschäfte",
                    "-geschäftsfähige Personen + Willenserklärungen, rechtliche Folgen wenn sich nicht an Willenserklärung gehen wird\n\n"+
                    "Willenserklärung \n1) ausdrückliche Erklärung = schriftlich, mündlich, telefon, handschlag \n"+
                    "2) schlüssiges Handeln - Taxieinstieg, Waren auf Kassenband \n3) Schweigen im privaten Bereich = Ablehnung zB unbestelltes Buch\n\n"+
                    "Besondere Formvorschriften: \nGrundsatz der Formfreiheit: \n"+
                    "Rechtsgeschäfte können in beliebiger Form abgeschlossen werden, mündlich / schriftlich\n"+
                    "Formzwang: \nschriftliche zB bei Berufsausbildungsvertrag, Ratenvertrag, Kündigung\n"+
                    "öffentliche Beglaubigung zB bei Zeugnis, Geburtsurkunde (kopiert) (überprüfung ob Unterschrift auf Vertrag echt ist)\n"+
                    "notarielle Beurkundung zB bei Ehevertrag, Grundstücksverkauf (Notar bestätigt Echtheit Unterschrift & Inhalt)\n\n"+
                    "Einseitige Rechtsgeschäfte: Testament, Kündigung, Anfechtung\n"+"Zwei / Mehrseitige Rechtsgeschäfte: Verträge, Tausch, Schenkung, Verleih\n\n"+
                    "Nichtige / anfechtbare Rechtsgeschäfte: \nPerson geschäftsunfähig, Person vorrübergehend gestört im Bewusststein,\n"+
                    "Schwarzarbeit, schwebend unwirksam, Scherzgeschenk, Formzwang nicht eingehalten, illegal, Wucher, Drohung, Irrtum, Betrug"),
            new Term("Kaufvertrag",
                    "2 übereinstimmende Willenserklärungen WE (Inhalt gleich) \n\nVerpflichtungsgeschäft\nzB Verkäufer 1. WE Angebot, Käufer 2. WE Bestellung"+
                    "\nzB Käufer 1.WE Bestellung, Verkäufer 2.WE Lieferung\n\n Erfüllungsgeschäft: \nPflichten Verkäufer: Annahme Kaufpreis, Ware bereitstellen (zum vereinbarten Zeitpunkt und vereinbarter Qualität) \n"+
                    "Pflichten Käufer: Zahlung des Kaufpreises, Warenannahme \n\nInhalt: Art & Gut der Ware (Stück), Lieferzeit, Verpackung und Transportkosten, zB frei Haus, Käufer und Verkäufer,"+
                    " Preisnachlass, SKonto*, Rabatt, Preis\n\n*Preisnachlass für Zahlung innerhalb einer bestimmten Zeit"),
            new Term("Pflichtverletzung bei der Erfüllung von Kaufverträgen",
                    "Mangelhafte Lieferung: \nSachmangel in Beschaffenheit, Menge, Art, Montage \nvorrangige Rechte: Nacherfüllung (Nachbesserung, Ersatz liefern)\n"+
                    "nachrangige Rechte: Rücktritt, Minderung, Schadenersatz, Ersatz (wenn 2x erfolglose Nachbesserung oder Austauschware nicht geliefer, bzw. ebenfalls mangelhaft)\n\n"+
                    "Bindung an das Angebot\n Verkäufer an Verkaufs- und Käufer an Kaufangebot gebunden außer Freizeichnungsklausel zB \"unverbindlich\", \"nur solange Vorrat reicht\"\n\n"+
                    "Eigentum & Besitz \nEigentum = gehört mir, darf alles damit machen \nBesitz = gehört mir gerade, aufpassen, zurückgeben"+
                    "\nEigentumsvorbehalt: Verkäufer bleibt Eigentümer bis Rate ganz beglichen \nman kann Eigentümer von Sache werden, die noch unter Eingentumsvorbehalt"+
                    "stand wenn man sie gutgläubig (unwissend) vom Ratenzahler kaute\n\n"+
                    "Mangelhafte Lieferung II \nAGB: Hier kann so manches über die Käuferrechte stehen \nRechte Verkäufer: Mängelrüge (Mahnung) nach Frist "+
                    "nach 30 Tagen ist Käufer im Verzug. Zahlung nun einklagbar, Zahlung & Schadensersatz forderbar, Vertragsrücktritt möglich (nach Nachfrist), "+
                    "+Schadensersatz. \nDavor muss Nachfrist in Mahnung gesendet werden. Die fällt weg, wenn Käufer Zahlung verweigert oder diese datiert wurde.\n\n"+
                    "Vertragsstörungen: \nmangelhafte Lieferung: Ware defekt / falsche Ware \nLieferverzögerung: Ware zu spät / falsche Anzahl \ndurch Verkäufer: "+
                    "Zahlungsverzug, Annahmeverzug"),
            new Term("Zwangsvollstreckung","nach nicht Bezahlung nach gerichtlichem Mahnverfahren \nGerichtsvollzieher kommt zum Schuldner pfänden\n"+
                    "klebt Pfandsiegel auf Möbel. Lebensnotwendige Dinge darf er nicht pfänden. Dann gibt es Versteigerung \n\nLohn auch pfändbar aber mit Grenzen\n"+
                    "Arbeitsgeber rechnet Lebensunterhaltskosten aus, überflüssiges bekommt Gläubiger \n\nZPO - Zivilprozessordnung (was, wie viel darf man pfänden?)\n"+
                    "pfändbar = Zuschläge Nacht-/Schichtarbeit, Freitags/Sonntagsarbeit, teilweise pfändbar = Gefahrenzulage, Beiträge für Altersvorsorge\n\n"),
            new Term("Verjährung von Forderung", "30 J = Erbe, Gerichtsurteile\n10 J = Grundstückskauf\n5 J = Bauwerksmangel (zB Mauerrisse)\n"+
                    "3 J = normale normale gesetzliche Verjährungsfrist (beginnt Jahresende zB 31.12.23)\n2 J = Gewährleistungsfrist mangelhafte Lieferung auch wenn Handy heil ankam, "+
                    "aber nach 4 Wochen nicht mehr tut \n\nHemmung (Unterbrechung mind 3 Monate) durch gerichtliche Mahnung, Klagewind erhoben, höhere Gewalt\n\n"+
                    "Nebeginn durch Zahlung durch Käufer (Teilzahlung), Mangelbeseitigung durch Käufer Vollstreckungsbescheid beantragt oder durchgeführt"),
            new Term("Mangelhafte Lieferung III","Firma verkauft Neuware \n\ngesetzliche Gewährleistungsfrist 2 Jahre \nFirma muss Fehler & Schäden kostenlos "+
                    "in Ordnung bringen \nnach 1 Jahr: Käufer muss jetzt Unschuld beweisen (zuvor Verkäufer) \n\nGarantie bedeutet Hersteller verspricht Fehler Verarbeitung / Material "+
                    "seiner Waren kostenlos in Ordnung zu bringen. Achtung! ist freiwillig, Dauer ist verschieden. \n\nFirma verkauft gebrauchte Ware \ngesetzliche Gewährleistungspflicht 1 Jahr \nselbe wie oben \n\n"+
                    "private Person verkauft gebrauchte Ware \nwenn Verkäufer Gewährleistung nicht ausdrücklich ausschließt: 1 Jahr \nwenn Verkäufer Gewährleistung ausdrücklich außschließt: 0"),
            //Ordner 4
            new Term("Stiftung Warentest", "Unabhängige Testinstitution, \nseit 1964, \ngegründet von Bundesrepublik Deutschland, \n\n"+
                    "Finanzierung: 86% Verkauf Publikationen und Informationen, 14 % Bundesmittel, \n\n"+
                    "Produkteinkauf: anonym, Auswahl durch Marktanalytiker, \n\nPrüfung von: Produkten & Dienstleistungen, \n\n"+
                    "Testort: in Laboren zusammenarbeitenden Testinstitutionen weltweit"),
            new Term("Verbraucherberatungsstellen","Auffgaben: \nBeratung (zB Recht, Geräte) \nInfobereitstellung (zb über Energieverbrauch, Preisvergleich)"),
            new Term("Gesetz gegen unlauteren Wettbewerb","verbietet: \nKonkurenz bedrohen / schlecht machen \nLockvogelangebote / Versprechen nicht einhalten \n"+
                    "falsche Angaben über Waren (Preis, Herkunft) machen, \nsittenwidrige Werbung (zB Belästigung auf Straße / Telefon) \n"+
                    "fremde Warenzeichen / Firmenzeichen benutzen, \nunbestellte Waren zuschicken, \nirreführende Angaben"),
            new Term("Haustürgeschäfte","Außerhalb von Geschäftsräumen geschlossenen Verträge \n\nWiderruf: \ninnerhalb von 14 Tagen (bei Erhalt deutlicher"+
                    "Widerrufsbelehrung und deren gesonderten Unterschrift, \nsonst 1 Jahr und 14 Tage, \ngar nicht bei: Bagatellgeschäft (<40 Euro), notarieller Vertragsbeurkundung, "+
                    "wenn Vertreter von Kunde selbst bestellt wurde \n\nWo? \nHaustür durch Klingeln, Fußgängerzone durch Ansprache"),
            new Term("Fernabsatzgeschäft","Vertrag zwischen Unternehmen und Verbraucher über Warenlieferungen oder Dienstleistungen unter ausschließlicher Verwendung "+
                    "von Fernkommunikationsmitteln \n(Vertragsverhandlungsabschluss per Internet, E-Mail, Brief, FAX, Katalog / Telefon) \n\n"+
                    "Widerrufsdauer: 14 Tage, oder 1 Monat (bei unerlaubten Werbeanrufen), oder 1 Jahr und 14 Tage (ohne Widerrufsmöglichkeitsbelehrung) "+
                    "Warum Wiederrufsrecht: Weil Ware nicht persönlich betrachtet werden kann \nWann nicht: Speisen & Getränken zB Pizzaservice, entsiegelte Video Audio und Software Träger, "+
                    "Hygieneartikel wie Kosmetik etc, Maßanfertigungen wie Maßanzüge etc, Lebensmittel \n\nkommt zustande durch Lieferung nach Bestellung, \nAngebot im Internet ist keines, sondern Anpreisung"),
            new Term("AGBs",
                    "Regeln und Pflichten von Käufer und Verkäufer. \n\nWie sie zu sein haben steht hier: Bürgerliches Gestzbuch (BGB). \n\nSie werden von Verkäufer selbst oder von einem Anwalt in seinem Auftrag geschrieben. \n\n"+
                    "Bsp: Verkäufer muss Käufer auf AGB hinweisen,\nAGB muss gut lesbar und verständlich sein, \nPreiserhöhung innerhalb von 4 Monaten verboten \nNachbesserungen müssen kostenlos sein, \n"+
                    "überraschende Klauseln (=Abmachungen) sind verboten, \ndie gesetzliche Fristen dürfen nicht verkürzt werden (zB 2 Jahre Gewährleistung ist Pflicht)"),
            new Term("Haftung","Verpflichtung einer Person den Schaden zu ersetzen, den sie durch eigenes Verschulden verursacht hat. \n\nHaftungsgründe: \n1) Haftung aus Verträgen \n"+
                    "zB Kaufvertrag - Wenn Käufer nicht zahlt oder Verkäufer Scheiße liefert \nzB private Haftungsversicherung - Lisa fällt vom Rad weil Steffen Sie übersieht \n"+
                    "2) Produkthaftung \nzB ein neuer TV explodiert nach 2h \n3)Unerlaubte Handlung \nist gegen das Gesetz. Wenn man eine andere Person mit Absicht schädigt: Eigentum, Gesundheit, Körper, Freiheit \n"+
                    "Kinder bis 7: nicht deliktfähig \n7-18: bedingt deliktfähig \nab 18: deliktfähig"),
            new Term("Sparen - Ratenkauf","Sparen \n\nVorteile: \nZinsen, \nBilliger: Keine Gebühren, keine Zinsen \n\nNachteile: \nWarten"+
                    "\n\nRatenkauf \n\nVorteile: \nKeine Wartezeit \n\nNachteile: \nregelmäßige Ratenzahlung, \nTeuer: Zinsen, Gebühren,\n Wenn Sache vor Ende der Ratenzahlung kaputt geht, muss man weiter zahlen. \n"+
                    "Auch bei unvorhergesehenen Kosten."),
            new Term("Ratenkauf","Muss man immer schriftlich machen. \n\nKann man 2 Wochen land wiederrufen \n(schreiben, dass man ihn doch nicht haben will:) " +
                    "auf Postkarte, brief (spätestens am 14t Tag bei Post(Poststempel))). Beweis für rechtzeitiges Verschicken auch durch Einschreiben (Empfasngsbestätigung) möglich \n\n"+
                    "Ratenkaufvertrag hat \n1. Barzahlungspreis \n2. Anzahl monatlicher Rate \n3. Wann und wie sind diese zu bezahlen \n4.Ratenpreis (Teilzahlungspreis): Diesen Preis muss man bei Ratenkauf insgesamt zahlen" +
                    "\n5. effektiver Jahreszins: Mehrkosten Ratenkauf als Barzahlung (Sofortzahlung) in % \n6. Höhe monatlicher Raten"+
                    "\n\nBeispiel Rechnung: \nFlug \n1200 Barzahlungspreis \n12 monatliche Raten\n 0,5% monatlicher Zins \n 2% Bearbeitungsgebühr \n\nRatenpreis: \n+ (1200 * 0,05 * 12) \n1200 \n+ (1200 * 0,02) \n= 1296 \n\n"+
                    "monatliche Rate: \n1296 / 12 \n= 108 \n\nPreis Differenz: \n1296 - 1200 \n= 96 \n\nEfffektiv(er) (Jahres) Zins: \n(100 : 1200) \n*96 \n= 8%"),
            new Term("Warenkennzeichnung","Lebensmittelkennzeichnungsverordnung \nInhaltsstoffe haben auf Verpackung zu stehen \n\nVerbraucherinformationsgesetz \n"+
                    "Wenn Firma Verbraucher getäuscht / verdorbene Lebensmittel verkauft, müssen Behörden informieren \nSelbstnacvhfrage bei Behörden möglich"+
                    " (zB Pestizidbelastung Gemüse / Allergika in Shampoo) \n\nEichgesetz \nAlte Waggen / Messbecher müssen regelmäßig geprüft werden, ob sie richtig wiegen oder ob das Maß noch stimmt (Eichung)"+
                    " \n\nTextilkennzeichnungsgesetz \nAus was ist der Stoff? (bei Textilien) zB 80% Baumolle, 20% Polyamid \n\nEU-Güteklasse \nViele landwirtschaftliche Produkte in Eu sind eingeteilt"+
                    "nach größe, Gewicht und Qualität in Güte / Handelsklassen. \n\nPreisangabeverordnung \nPreis hat auf Waren angegeben zu sein (Preisschild). Gilt für alle Waren im Geschäft und in den Schaufenstern"+
                    "\n\nGütezeichen \ndürfen Hersteller nur nutzen wenn Waren einen vorgeschriebenen Qualitätsstandart haben zB reine Schurwolle, in Dutschland geprüfte Markenware, "+
                    "Bio nach EG-Öko Verordnung \n\nPrüfzeichen \nsollen festgelegten Sicherheitsstandart garantieren (=Waren mit diesem Zeichen sind geprüft und sicher)"+
                    "zB gprüfte Sicherheit GS, CE Europäisch Gemeinsch für Produkte in EU, Verband deutscher Elektriker \n\nUmweltzeichen \nfür Produkte die besonderst umweltfreundlich sind zB Blauer Engel"),
            new Term("Verbaucherschutzgesetze","Wettbewerbsrechtliche Regelungen:\nGesetz gegen den unlauteren Wettbewerb\nKartellgesetz - Verbietet Kartelle + martkbeherschende "+
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
                    "Direktlink zur Login Seite\nfalsche Sprache\n\nVerhaltensregeln:\nMisstrauen bei Aufforderungen zum sofortigen Handeln\nNicht auf Links in verdächtigen Mails klicken\n"+
                    "Auf Anbieterseite über Sicherheitsmerkmale informieren\nVerdächtige Mails an Anbieter weiterleiten"),
            new Term("Kredite","Dispositionskredit:\nKonto überziehen\nschnnell Rechnung bezahlen\nKredithöhe mit Bank klären\nÜberziehungszinsen\n\nRatenkredit: "+
                    "bei höheren Beträgen\nKreditvertrag: Inhalt:\nKreditnehmer, -geber, Zinsen, Bearbeitungsgebühren, Laufzeit, Höhe der Raten\nSicherheiten zu geben:\n"+
                    "Nachweis über regelmäßiges Einkommen, Hypothek, Bürgerschaft Lohnabtretung\nMonatliche Zahlung\n\n"),
            new Term("Sparen","Regeln (zuerst überlegen für beste Sparform):\nWie viel Geld habe ich?\nWie viel kann ich sparen?\nfür was möchte ich sparen?\n\n"+
                    "3 Entscheidungsmerkmale:\nErtrag: Wie viel Zinsen oder Gewinn gibt es?\nSicherheit: bekomme ich mein Geld wieder zurück?\nVerfügbarkeit: Wie lange muss ich anlgegen, wie schnell bekomm ichs zurück?"+
                    "\n\nAb bestimmter Summe sollten Sparformen gemischt werden\n\nSparmotive:\nZwecksparen, für bestimmte Sache, Wunsch\nVorsorgesparen, für bestimmte Zeit, zB Notzeit, Rente, Kinder\n"+
                    "Vermögensbildung, für Eigentum, Reichtum (bringt Zinsen), zB Haus"),
            new Term("Kreditkarte","Kunde legt sie vor. Sie wird mit spezifischem Gerät gelesen & eine Rechnung wird gedruckt. Kunde unterschreibt Rechnung & bekommt Quittung. Damit kann er Zahlung kontrollieren"+
                    "\n\nDer Händler bekommt den Rechnungsbetrag von der Kreditgesellschaft nach einem vereinbartem Abrechnungszeitraum (zB monatlich). \nEr schickt der Kreditkartengesellschaft die Abrechnung über alle "+
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
            //Ordner 5
            new Term("Markt","Ein Markt ist ein Ort, an dem Anbieter (=Verkäufer) und Nachfrager (=Käufer) nach einem Gut zusammentreffen\n\n"+
                    "Der Marktpreis \nAnbieter und Nachfrager haben auf einem Markt immer verschiedene Interessen. \nDer Anbieter will möglichst viele Güter zu einem möglichst hohen Preis.\n"+
                    "Der Nachfrager will möglichst viele Güter zu einem möglichst niedrigen Preis. \nDer Marktpreis ist ein Kompromiss dazwischen.\n\n"+
                    "Unser Wort \"Markt\" kommt vom althochdeutschen Wort \"Markat\". \"Markat\" kommt wiederrum aus dem Lateinischen. Dort heißt \"mercari\" -handeln und \"mercatus\" -Kauf, Handel. "+
                    "Zu fast allen Zeiten hatten die Menschen Märkte \n\nAnbieter kommen mit der Absicht auf den Markt, um ihre Ware anzubieten. Käufer kommen mit der Absicht auf den Markt, Waren zu kaufen."+
                    " Sie sind bereit, für die Waren eine bestimmte Summe, einen Preis zu bezahlen. Dies nennt man Nachfrage. Auf einem Markt treffen Angebot und Nachfrage zusammen. (zB Wochenmärkte, Supermärkte,"+
                    " Gaststättten, Tankstellen, Handwerksbetriebe)"),
            new Term("Marktarten","Einteilung nach Art der gehandelten Güter = \n\nArbeitsmarkt: \nHandel mit menschlicher Arbeitskraft \n\nImmobilienmarkt \nHandel mit Grundstücken und Gebäuden \n\nInvestitionsgütermarkt \n"+
                    "Handel mit Gütern, die zur Herstellung von anderen Gütern verwendet werden zB Maschinen \n\nKonssumgütermarkt \nHandel mit Nahrungsmitteln, CDs, Fernsehgeräten \n\n"+
                    "Geldmarkt \nHandel mit kurzfristigen Krediten durch Banken, Sparkassen, Privatpersonen \n\nKapitalmarkt \nHandel mit langfristigen Krediten durch Banken, Sparkassen, Privatpersonen \n\n"+
                    "Devisenmarkt \nHandel mit ausländischen Währungen \n\n\nEinteilung nach räumlichen Kriterien = \n\nWeltmarkt \nDie deutsche Firme \"Meinhold & Co\" verkauft Schrauben nach Kanada \n\n"+
                    "EU-Markt: \nDer spanische Landwirt José Miguelverkauft Tomaten an deutsche Supermärkte \n\nMarkt der Gemeinde: \nDer britische Bäcker David Smith backt die Brötchen für die Bäckerei Yorkshire \n\n"+
                    "Markt der Bundesrepublik: \nDie schwäbische Firme \"Meisle\" produziert Infobroschüren für den deutschen Bundestag in Berlin \n\n\nMärkte sind auch in Funktionen einteilbar: \n"+
                    "Beschaffungsmarkt - Absatzmarkt (Filiale) \n\nAußerdem kann man Märkte auch nach der Organisationsform einteilen: \norganisierte Märkte (Wochenmarkt, Messe, Börse) - nicht organisierte Märkte (zufälliges Treffen von Verkäufer und Käufer)"),
            new Term("Marktformen","Polypol \nMarkt, auf dem viele Nachfrager auf viele Anbieter treffen. \nZustand: \"vollständige Konkurenz\". \nDer Markt bestimmt den Preis.\n \nKein Marktteilnehmer groß genug, um den Marktpreis zu beeinflussen. \n"+
                    "Wenn ein Anbieter einen höheren Preis verlangt, welchseln sofort alle Nachfrager zur Konkurrenz über. Fordert er dagegen einen niederigeren Preis, dann könnte er die gesamte Nachfrage, die bei ihm entstehen würde, in keinem "+
                    "Falle befriedigen. Hierzu wäre sein Marktanteil zu klein. \nPolypole findet man vorallem an den Wertpapierbörsen"+
                    "\n\nOligopol \nZustand: \"Wenig Konkurrenz\". \nAngebotsoligopol: \nHier stehen sich wenige Anbieter und viele Nachfrager gegenüber. \nAnbieter können Preis zum Teil bestimmen. \nBsp: Automarkt, Zigarettenmarkt, Benzinmarkt. \nKommt in den Industriegesellschaften besonderst häufig vor. \n"+
                    "Nachfrageoligopol: \nWenn vielen Anbietern nur wenige Nachfrager gegenübertreten. \nBsp: Viele Landwirte - wenige Molkereien. Bürger, die Polizisten werden wollen, können nur zwischen dem Bund und den Ländern wählen. \n"+
                    "Oft herrscht eine starke gegenseitige Abhängigkeit unter Oligopolisten zB Benzinmarkt. Wenn ein Anbier den Preis verändert, reagieren die anderen. \nIm Extremfall kann ein sehr scharfer Wettbewerb entstehen, mit dem Ziel den Mitbewerber auszuschalten \n"+
                    "oder die Marktführerschaft zu erreichen. \nAnderseits besteht allerdings auch die Gefahr, dass die Anbieter sich absprechen und den Wettbewerb ausschalten. Derartige Abmachungen sind alllerdings nach dem "+
                    "Gesetz gegen Wettbewerbsbeschränkungen verboten."+
                    "\n\nMonopol \nFür eine Waren gibt es nur einen Anbieter oder einen Nachfrager auf dem Markt (Angebots-, Nachfragemonopol). \nZustand: \"Keine Konkurrenz\". \nzB: Nachfragemonopolisten: Deutsche Bahn mit Lokomotiven-, Eisenbahnwagennachfrage (Vergangenheit), "+
                    "Bundeswehr mit der Panzernachfrage. \nzB: Angebotsmonopolisten: \nAnbieter bestimmen den Preis\n Wasserwerke, deutsche Post AG im überregionalen Briefverkehr (bis 2007), private Unternehmer, die eine patentierte Erfindung vermarkten. \n"+
                    "Angebotsmonopolisten fürchten keine Konkurenz und können die Preishöhe weitgehend selbst festlegen. Allerdings geht auch die bei höheren Preisen die Nachfrage zurück, Nachfrager könnten sich einschränken oder "+
                    "auf Ersatzgüter umsteigen. Ein privater Monopolbetrieb wird ein Preis wählen, bei dem der Unterschied zwischen Einnahmen und Kosten am größten ist."),
            new Term("Preisbildung Polypol","Der Preis wird bestimmt durch Angebot und Nachfrage. \n\nWenn die angebotene Ware größer ist als die Nachfrage, dann sinkt der Preis. \n"+
                    "Wenn das Angbot kleiner ist ald die nachgefragte Menge, dann steigt der Preis. \n\nDa wo Angebot und Nachfrage gleich sind, ist der Gleichgewichtspreis \n\n"+
                    "zB: Angebot an Erdbeeren sinkt im Winter aber die Nachfrage bleibt gleich, also steigt der Preis. \n\n"+
                    "->Angebot steigt, Nachfrage sinkt-> \nzB Die Firmen produzieren und verkaufen viele Kühlschränke, irgendwann haben viele Menschen Kühlschränke, also kaufen nur noch wenige Menschen Kühlschränke. \n"+
                    "->Preis sinkt-> \nzB Die Läden machen Sonderaktionen und verkaufen die Kühlschränke billiger \n->Angebot sinkt, Nachfrage steigt-> \nzB Viele Menschen, die vorher keinen Kühlschrank wollten, kaufen jetzt doch Kühlschränke. In den Läden stehen weniger Kühlschränke. \n"+
                    "->Preis steigt-> \nzB Die Läden machen die wenigen Kühlschränke wieder teuer."),
            new Term("Marktpreis grafisch", "\n Marktpreis lässt sich grafisch darstellen \n[Bild]"),
            new Term("Preisbildung Rechnen","[Bild]"),
            new Term("Preisbildung Angebotsoligopol","Angebotsoligopole entstehen aufgrund der zunehmenden Unternehmenskonzentration immer häufiger. \n" +
                    "Hier werden die Absatzmöglichkeiten nicht nur vom Verhalten der Nachfrager, sondern auch von den Aktionen und Reaktionen der anderen Oligopolisten bestimmt. \n" +
                    "Bei der Preisbildung können die Anbieter folgende Strategien anwenden: \n\n"+
                    "ruinöse Konkurenz: \nEin Anbieter versuch andere vom Markt zu drängen durch Preisunterbietung. \nMitanbieter ziehen mit, oft sogar bis unter die Selbstkosten. Nachfrager bekommen billige Preise. Gefahr von Monopolbildung durch "+
                    "Ausscheiden von Anbietern, und wieder Preisanstieg. \nEin Computerhersteller beitet seine Geräte um 20% billiger an als sein Konkurenten. \n\nPreisabsprachen: \nNicht beliebig, da Verbraucher sich einschränken oder umsteigen können. "+
                    "\nSind in der BRD nach dem Gesetz gegen Wettbewerbsbeschränkungen (Kartellgesetz) verboten. \nzB Drei große Mineralölfirmen vereinbaren, einheitliche Preise zu verlangen. \n\nPreisführung: \nDurch einen Betrieb, der ausreichend viel Marktanteil hat, "+
                    "die anderen ruinieren zu können, falls diese ihn daran hindern. \nEin Tabakkonzern erhöht seine Zigarettenpreise, die anderen ziehen nach. \n\nQualität: \nVielfach verlagern die Konkurenten den Wettbewerb auf die Qualität, den Service, \n"+
                    "die Werbung und die Aufmachung ihrer Erzeugnisse und vermeiden so eine gegenseitige Herausforderung durc die Preise. \nzB Ein Automobilhersteller erhöht die Garantiefrist seiner Fahrzeuge von 2 auf 3 Jahre."),
            new Term("Optimale Marktbedingungen","Börse = einziger optimaler Markt \n\nOptimale (perfekte) Marktbedingungen für vollständige Konkurrenz (=Polypol):\nviele Anbieter und viele Nachfrager \n"+
                    "alle Nachfrager haben guten Überblick über gesamten Markt \nNachfrager haben kein Vorlieben \nDie Ware ist gleichwertig"),
            new Term("Unternehmenszusammenschluss / -arbeit","Gründe für die Unternehmenszusammenarbeit: \nman hat weniger Konkurenz ->mehr Marktmacht \nRisiko kann auf mehreren Schultern verteilt werden \n"+
                    "Mengenrabatt durch den Einkauf von größeren Mengen \ngemeinsame Werbung erreicht mehr Kunden und die Unternehmen können gleichzeitig mehr Geld sparen \ngemeinsame Forschung, Know-How (Fachwissen), Interessen von Kunden "+
                    "können besser berücksichtigt werden. \n\nNachteile: \nFirmen verschwinden \nes können marktbeherrschende Unternehmen entstehen, der Kunde hat weniger Auswahl, Gefahr der Monopolbildung \nAbsprachen können den Wettbewerb verhindern "+
                    "\nEntscheidungen müssen mehr Abgesprochen werden \nDie Gewinne müssen aufgeteilt werden \nEs besteht Gefahr, dass Firmen nicht mehr innovativ sind "+
                    "\n\n\nVerschiedene Arten von Zusammenarbeit: \n\nKartell: \nKunternehmen machen einen Vertrag. \ndarin steht, dass die Unternehmen in bestimmten Bereichen mit anderen Unternehmen zusammenarbeiten wollen." +
                    "\nDie Unternehmen bleiben rechtlich völlig selbstständig. \n\nKonzern: \nZusammenschlüsse von Unternehmen. \nUnternehmen bleiben rechtlich selbstständig, haben aber wirtschaftlich gemeinsame Leitung. Es entstehen Mutter und Tochtergesellschaften bzw. Schwesterngesellschaften. \n"+
                    "Konzerne mit vielen Tochtergesellschaften nennt man Multis (= multinationale Unternehmen). Sie haben große wirtschaftliche Macht. \n\nTrust: \nMehrere Unternehmen geben ihre Selbstständigkeit auf und verschmelzen zu einem Unternehmen. \n"+
                    "Wenn Unternehmen verschmelzen, nennt man das auch Fusion. \nMan unterscheidet zwischen einer Neugründung und einer Aufnahme."),
            new Term("verbotene Kartelle","Preiskartell \nDie Mitglieder treffen Preisabsprachen \n\nQuotenkartell \njedem Unternehmen wird eine bestimmte Produktionsmenge zugeteilt, um über die Angebotsmenge den Preis zu beinflussen "+
                    "\n\nKalkulationskartell \ndie beteiligten Firmen vereinbaren den gleichen Aufbau ihrer Kalkulation, um zu gleichen Preisen zu gelangen \n\nGebietskartell \njedem Unternehmen wird ein bestimmtes Wirtschaftsgebiet "+
                    "zugeteilt, um diesen Gebieten den Wettbewerb auszuschließen \n\nRabattkartell \nDie Mitglieder legen eine einheitliche Rabattgewährung fest \n\nKonditionenkartell \nEinheitliche Lieferungs-, Zahlungs-, und Geschäftbedingungen "+
                    "wie Öffnungszeiten werden vereinbart. \n\n\nErlaubte Kartelle \n\nRationalisierungskartell \nzB Die Hersteller von Kaaffee-Filtern vereinbaren: In Zukunft werden wir alle umweltfreundliches Recycling-Papier verwenden \n\n"+
                    "Normen & Typenkartell \nzB Die Hersteller von Satelitenantennen vereinbaren:: Wir werwenden ab jetzt einheitliche Anschlüsse für unsere Antennen"),
            new Term("Kontrolle des Wettbewerbs","Gesetz gegen Wettbewerbsbeschränkungen (=Karrtellgesetz)\nKontrolle der Einhaltung: Bundeskartellamt (Bonn) \n\n"+
                    "Bundeskartellamt Aufgaben: \n\nMissbrauchsaufsicht \nMarktbeherrschende Unternehmen werden kontrolliert. \nWenn Unternehmen ihre Stellung missbrauchen (zB zu hohe Preise, schlechte Geschäftsbedingungen, Dumpinglöhne), kann es Bußgelder verlangen."+
                    "\n\nKartellaufsicht \nEs entscheidet ob Unternehmen Kartell gründen dürfen oder nicht. \nEs passt auf, dass keine verbotenen Kartelle entstehen. \n\n"+
                    "Fusionsaufsicht \nWenn große Unternehmen eine Fusion planen, dann müssen sie das beim Bundeskartellamt anmelden. \nes kann die Fusion verbieten, falls ein marktbeherrschendes Unternehmen entsteht. "+
                    "Der Bundesminister für Wirtschaft kann die Fusion aber tortzdem erlauben."),
            new Term("Staatliche Eingriffe","Allgemeine Beeinflussung des Wettbewerbs = \n\nDer Staat beeinflusst den Wettbewerb in vielen Wirtschaftszweigen durch folgende Maßnahmen: \n\nEinfuhrzölle \nAusländische Unternehmen müssen Zoll bezahlen, wenn sie in Deutschland (und in der EU) Waren verkaufen wollen. \n"+
                    "Ziel: Die deutschen/europäischen Unternehmen von der ausländischen Konkurrenz schützen \n\nSubventionen: Unternehmen in bestimmten Marktbereichen bekommen Geld vom Staat. Dadurch können diese Unternehmen gute Preise für die Verbraucher machen. "+
                    "Ziel: Wettbewerbsfähigkeit der Unternehmen sichern. \n\nHöchst und Mindestpreis: \nDer Staat legt Höchstpreise fest, vor allem für lebensnotwendige Waren. \nMindestpreise gibt es zb Landwirtschaft der EU. "+
                    "Die Bauern bekommen einen festgelegten Mindestpreis für ihre Waren. \n\nStaatliche Monopole: \nManche Unternehmen (zB Wasserwerke) sind im Besitz des Staates bzw. von Bundesländern, Landkreisen oder Gemeinden. \n"+
                    "Ziel: alle Menschen sollen lebensnotwendige Güter kaufen und auch bekommen."+
                    "\n\n\nBeeinflussung des EU-Agrarmarkts = \n\nNach dem 2.Weltkrieg in Europa: Zu wenig Lebensmittel, Hunger. \nDeßhalb machten die Staaten gemeinsame Agrarpolitik mit folgenden Zielen: \nVerbrauchern zu vernünftigen Preisen Lebensmittel verkaufen \n"+
                    "Die Landwirtschaftliche Produktion sichern \nDen Landwirtschaften einen angemessenen Lohn geben \nAnbaubedingungen in EU und der Welt aber unterschiedlich. In manchen nicht-EU-Ländern können Bauern sehr billig "+
                    "produzieren und verkaufen \nDie EU vereinbarte folgende Maßnahmen: \n\nAbnahmegarantie: \nalle lebensnotwendige Güter (Getreide, Milch, Fleisch) werden den Landwirten abgekauft. Die Bauern haben eine Garrantie, "+
                    "dass ihre Produkte gekauft werden. \nProblem: Überproduktion \n\nFeste Preise: \nDie EU hat garantierte Richtpreise für die Agrarproduktion festgelegt. Diese Preise werden den Bauern von der EU bezahlt. \n"+
                    "Problem: Die EU muss viel Geld bezahlen \n\nSchutz durch Einfuhrzölle \nsiehe oben \n\nFolgen: Produktabnahme zu festen Preisen -> Produktionsmengensteigerung -> EU muss viel Geld zahlen, lagern und Überschüsse vernichten \n\n"+
                    "EU Agrarpolitik in der Zukunft: \nImmer noch wichtig: \nNahrungsmittelversorgung sichern \nLandwirtschaftliche Produktion sichern \nangemessener Lohn für Landwirte \nÄnderungen: \nEs gibt Quoten: "+
                    "Wenn Landwirte mehr produzieren, dann bekommen sie weniger Unterstützung \nEs gibt Direktzahlung an Bauern \nWenn der Landwirt auf Umweltschutz / Tierschutz achtet, bekommt er mehr Unterstützung"),
            new Term("Freie Marktwirtschaft - Zentralverwaltungswirtschaft","1) Freie Marktwirtschft \n2) Zentralverwaltungswirtschaft \n\nErfinder: \n1) Adam Smith \nKarl Marx \n\nRolle des Staates \n1)Staat greift nicht in die Wirtschaft ein, \n"+
                    "außer bei Sicherheit, Recht & Bildung (Nachtwächterstaat) \n2) Staat lenkt Wirtschaft, was produziert werden soll, Menge, Warenverteilung, Export, Import, Lohnhöhe \n\nPreisbestimmung: \n1) Der freie Markt (Agebot & Nachfrage) \n2) Der Staat "+
                    "\n\nWirtschaftsplanung: \n1) jede Firma eigener Wirtschaftsplan (dezentral) \n2) Der Staat (zentral) "+
                    "\n\nEigentum an Produktionsmittel, zB Maschinen: \n1) Firma \n2) Staat \n\nWichtigstes Ziel der Betriebe: \n1) Möglichst viel Gewinn \n2) den Plan umsetzen \n\nWahl von Beruf und Arbeitsplatz: \n1) freie Wahl "+
                    "2) Staat bestimmt Beruf und Arbeitsplatz \n\nVorteile: \n1) Mehr Produktion, daher billiger zB Lebensmittel \n2) Keine Arbeitslosigkeit, Konjunkturschwankungn, Kauf ~= Verkauf \n\n"+
                    "Nachteile: \n1) Löhne für einfachen Arbeiter sinken stetig, große Firmen kaufen kleine, Kinderarbeit \n2) Bei schlechtem Plan = zu wenig Rohstoffe & Waren, zu wenig Firmenmotivation, Unterproduktion"),
            new Term("Soziale Marktwirtschaft",
                    "Nach dem 2. WK entschieden die Sieger über die Wirtschaftsordnung. \nDie Westlichen sagten: \"Im Nationalsozialismus hatte Hitler und der Staat zu viel Macht. Daher wird die freie Marktwirtschaft eingeführt.\" \n"+
                    "Die Östlichen sagten: \"Zwischen 1929-1933 hat die Weltwirtschaftskrise gezeigt, dass der Staat die Wirtschaft mehr lenken muss. Daher wird die Zentralverwaltungswirtschaft eingeführt. \n\n"+
                    "Gründer: Ludwig Erhard: \"Wir brauchen eine neue Wirtschaftsordnung: Jeder Mensch soll frei sein und eigene Entscheidungen treffen können, aber der Staat soll die wirtschaftlich schwachen Menschen"+
                    " unterstützen können. Wir brauchen eine soziale Marktwirtschaft\". \n\n Rolle des Staates: \nUnterstützung wirtschaftlich Schwacher \n\nWer/Was bestimmt den Preis?: \nAngebot & Nachfrage \n\n"+
                    "Wirtschaftsplanung: \nGewerbefreiheit, jedes Unternehmen plant für sich selbst \n\nEigentum an Produktionsmitteln, zB Maschinen: \nDen Firmen \n\nWichtigstes Ziel der Betriebe: \nmaximalen Gewinn erwirtschaften \n\n"+
                    "Wahl von Beruf und Arbeitsplatz: \nFreie Berufswahl, Gewerbefreiheit \n\nVorteile: Mittelweg, sowohl unternehmerische Selbstbestimmung als auch Armenhilfe, Berufswahl, soziale Absicherung, Gewerbefreiheit \n\n"+
                    "Nachteile: \nAbwanderung der Reichsten, Gefahr der Monopolstellung"),
            new Term("Soziale Marktwirtschaft Merkmale",
                    "Marktwirtschaft: \n\nGewerbefreiheit: \nFreie Berufswahl, Firmen entscheiden selbst, was sie produzieren \n\nVertragsfreiheit: \nJeder darf Verträge machen, jeder darf selbst entscheiden, mit wem er "+
                    "einen Vertrag macht. \n\nFreie Preisbildung: \nAngebot & Nachfrage regeln den Preis, der Staat greift nicht ein. \n\nPrivateigentum: \nProduktionsmittel gehören Firme, nicht Staat, Bauern gehören Arbeitsgeräte \n\n"+
                    "Sozial: \n\nSozialpolitik: \nSozialversicherungen (Renten, Kranken, Pflege, Unfall, Arbeitslosen), Arbeitsschutzbestimmmungen (Kündigungs-, Jugendarbeits-, Mutter-schutz) \n\n"+
                    "Einkommens und Vermögenspolitik: \nSteuerprogression (wer mehr verdient, muss mehr Steuern zahlen), Spar und Bausparförderung \n\nWettbewerbspolitik: \nVerbot von Preisabsprachen, Schutz der Verbraucher durch "+
                    "Produkthaftungsgesetz, Preisabgabegesetz, Mess & Eichgesetz \n\nStruktur und Konjunkturpolitik: \ngünstige Kredite für Firmengründung in wirtschaftlich schwachen Gebieten, Subventionen für Landwirtschaft, Bergbau, "+
                    "Eisen & Stahlindustrie \n\nUmweltpolitik: \n Gesetze zum Umweltschutz (zB Recycling-Auflagen, Richtlinen für Mineralölverbrauch & Schadstoffausstoß), staatliche Förderer erneuerbarer Energien \n\n"+
                    "Öffentliche Unternehmen: \nAlle Bürger sollen mit allen lebenswichtigen Gütern und Dienstleistungen versorgt werden zB Wasserkraftwerke, Schulen, Krankenhäuser und Nachverkehr"),
            new Term("Verbraucherpreis-Index",
                    "Warenkorb: Summe der Kosten aller Waren (Menge mal Preis) \nWird regelmäßig aktualisiert, je nach Häufigkeit im aktuellen Konsumverhalten \n\n"+
                    "Wert des Warenkorbs: \nJahr 1: 80 \nJahr 2: 88 \n\nPreisindex: \nJahr 1: 100 \nJahr 2: (88/80)*100=110 \nJahr 3: (92,4/80)*100=115,5 \noder: (92,4/88)*110=115,5 \n\nPreissteigerung gegenüber Vorjahr "+
                    "(Inflationsrate): \nJahr 2: +10% \nJahr 3: ((115,5-110)/110)*100=5,5%"+
                    "\n\nGründe für Messung Preisindex: \nMit Warenkorb stellt man fest, um wie viel Euro und Protzent Preise gestiegen sind, wie viel Geld ein durchschnittlicher Mensch zum Leben braucht, wichtig für bspw. Verhandlungen "+
                    "über Lohnerhöhungen \n\nNominale Lohnsteigerung: \nzB Ein Arbeiter bekommt 1,5% mehr Nettolohn \n\nReale Lohnsteigerung: \nzB Die Preise sind um 1,7% gestiegen. \nObwohl der Arbeiter 1,5% nominale Lohnsteigerung hat, \n"+
                    "hat er eine reale (wirkliche) Lohnsteigerung von -0,2% \nreale Lohnsteigerung = nominale Lohnsteigerung - Preissteigerung"),
            new Term("Kaufkraft", "Kaufkraft des Geldes = Wert des Geldes, wie viel kann ich von dem Geld kaufen? \nDie Kaufkraft ist abhängig von der Preisentwicklung.\n\n"+
                    "zB Preis für eine Kugel Eis \nJahr 1 (Basisjahr): 1 Euro \nJahr 2: 1,50 Euro \nPreisniveau: +50% \nVerfügbarer Geldbetrag: 3 Euro \nKaufkraft Jahr 1: 100 \nKaufkraft Jahr 2: 66,7 ((100/150)*100)"+
                    "\nZusammenhang: Wenn das Preisniveau um 50% steigt, sinkt die Kaufkraft um 33,3% \n\nVerringert sich Kaufkraft einer Währung: Inflation \nErhöht sich Kaufkraft einer Währung: Deflation"),
            new Term("Inflation","Staat darf nicht mehr Geld drucken, als er Güter und Dienstleistungen hat, sonst sinkt die Kaufkraft und das Geld ist wertloser. \n\n"+
                    "Ursachen: \n\nNachfrage-Inflation: \nHöhere Löhne / weniger Steuern / zu viel Geld gedruckt \nAber nicht mehr Güter auf dem Markt \n\n"+
                    "Kosten: \nFirmen müssen mehr Lohn zahlen / Rohstoffpreise steigen \nalso erhöhen sie die Preise \n\nGeldmenge im Land steigt: \nwenn viele Güter ins Ausland verkauft werden, "+
                    "sind weniger Güter im Land, aber es werden weniger produziert, daher teurer \n\nExport > Import \n\nFolgen/Auswirkungen: \n\nSchleichende Inflation: \nPreise steigen <5% / Jahr \nso langsam, dass man es fast nicht merkt \n"+
                    "Geldkaufkraft sinkt langsam \nkein Problem für Wirtschaft / Menschen \n\nGaloppierende Inflation: \nPreise steigen > 10%, > 50% \nWirtschaft gehr kaputt & viele werden arm \n"+
                    "Geld verliert ganz schnell seinen Wert. Die Kaufkraft sinkt sehr schnell \nGut bei Schulden / Krediten, aber nicht für Sparen \n"+
                    "Leute kaufen sich Wertgegenstände, werden trotzdem ärmer, Kapitalflucht"),
            new Term("Deflation",
                    "Ursachen: \n\nSparen: \nFirmen / Leute wollen Geld nicht ausgeben, weniger Geld im Umlauf \n\nUnternehmen müssen Preise senken: \nWenn sie zu viel produziert haben / wenn der Markt gesättigt ist "+
                    "(alle haben das Produkt schon) \n\nImport > Export \n\nFolgen / Auswirkungen: \n\nGut für Arbeiter mit festem Gehalt / Arbeitsstelle \nProdukte werden billiger \n"+
                    "Arbeiter können mehr Güter von Geld kaufen \nUnternehmen müssen preise senken und amchen weniger Gewinn, müssen entlassen oder weniger Lohn bezahlen, "+
                    "manchmal sogar Insolvenz anmelden, sehr viele verlieren Arbeitsplatz"),
            new Term("Löhne","Lohnkosten EU \n2022: Arbeitskosten / Stunde: 30,5 Euro im Durschschnitt \nIn Luxemburg: 50,7 \nIn Bulgarien: nur 8,2 \nIn Deutschland "+
                    "werden durchschnittlich 25% vom Lohn abgegeben \n\nLöhne aufgrund Lohnzusatzkosten hoch \n\nLohnzusatzkosten: \nbezahlter Urlaub \nWeihnachtsgeld \nUrlaubsgeld \nEntgeltfortzahlung bei Krankheit \nbezahlte Feiertage \nvermögendswirksame Leistung"+
                    "\nArbeitgeberanteil Sozialversicherungsbeiträge \nbetriebliche Altersversorgung \nsonstige Personalzusatzkosten \n\nWettbewerbsfähigkeit kann so gefährdet werden, "+
                    "aber durch Arbeitnehmerqualifikation und Produktqualität gehalten werden. \nLohnzusatzkostensenkung kann helfen um Unternehmen im Land zu halten."),
            //Ordner 6
            new Term("Gerechte Entlohnung","Arbeitsbewertung AB durch Analytische und Summarische AB, \nZiel: Leistungsgerechter Lohn durch Einteilung in Lohngruppen \n"+
                    "+ Sozialen Aspekte \n\nSummarische Arbeitsbewertung: \nDie Arbeitsaufgabe wird als ganzes (=Summe) gesehen \n"+
                    "Wichtig dabei: \nWelche Ausbildung, wie viel Berufserfahrung, welches Können, wie viel Verantwortung braucht man? \n\n"+
                    "Analytische Arbeitsbewegung: \nDie Arbeitsaufgabe wird nach einzelnen Arbeitsanforderungen bewertet \nwichtig dabei: \n"+
                    "Wie viel Können, Belastung, Verantwortung und welche Umwelteinflüsse?"),
            new Term("Analytische AB","Bei der analytischen Arbeitsbewertung wird versucht die Arbeitsanforderungen zu beschreiben. Man untersucht dafür den Arbeitsplatz und bewertet die Anforderungen.\n\n" +
                    "Der Ecklohn ist der Lohn eines 21 Jährigen \nIn Tarifverhandlungen wird normalerweise nur über die Höhe des Ecklohns verhandelt \n"+
                    "Diese Lohngruppe wird gleich 100% gesetzt. \nDie anderen Lohngruppen werden durch Zuschläge oder Abzüge berechnet."),
            new Term("Summarische AB","Hierbei werden die enzelnen Anforderungsarten einer Arbeit insgesamt als Ganzes (summarisch) bewertet.\n\n"+
                    "Lohngruppe 1 - Einfache Arbeiten, die keine Arbeitskenntnisse und keine Ausbildung voraussetzen, sondern nur eine einmalige Anweisung. \n\n"+
                    "Lohngruppe 8 - Besonders schwierige Arbeiten, die hervorragende Fachkenntnisse und Fähigkeiten und eine entsprechende Berufserfahrung voraussetzen"),
            new Term("Soziale Aspekte","Benachteiligung Mancher bei bloser Leistungsbetrachtung, daher Berücksichtigung sozialer Aspekte. \n\n"+
                    "Dauer der Betriebszugehörigkeit \nlangjährige Mitarbeiter haben Erfahrung und kennen sich im Betrieb aus. Treue Mitarbeiter sollen Belohnt werden \n\n"+
                    "Alter \nAbsicherung durch die Firma. Es wird schwerer eine Arbeit zu finden. \n\nFamilienstand \nWer Familie hat, muss für weitere Personen sorgen. "+
                    "Höhere Ausgaben für die Familie. \n\nDer Staat unterstützt besonderst die familiengerechte Entlohnung: \nFamilienstand bei Lohnsteuerklasse \n"+
                    "Kindergeld \nWohngeld \nstaatliche gefördertes Vermögenswirksames Sparen \nArbeitnehmersparzulagen"),
            new Term("Sozialprodukt","Zur Berechnung ob ein Staat wirtschaftlich stärker oder schwächer wurde als letztes Jahr\n\n"+
                    "2 Möglichkeiten: \n\nBerechnung des Bruttoinlandprodukts BIP \nWert aller Dientleistungen und Sachgüter, die innerhalb eines Landes produziert werden \n\n"+
                    "Berechnung des Bruttonationaleinkommens \nWert aller Dienstleistungen & Sachgütern, die von einem Land erwirtschaftet werden. \n\n"+
                    "Unterscheidung gering. In letzter Zeit wird meistens BIP berechnet. \n\nNominales BIP \nzeigt nur, ob der Wert aller Dienstleistungen sinkt oder steigt, egal warum\n\n"+
                    "Reales BIP \nwenn man die Inflationsrate (Preissteigerung) wegnimmt, bekommt man das wirkliche Wachstum \n\nKritik an Bruttoinlandsprodukt BIP: \n"+
                    "Soziale Ehrenamtliche Arbeit und Hausarbeit fehlt. Arbeit, die repariert, zB nach Umweltkatastrophen wird auch gezählt, obwohl sie keine Wohlstandsmeerung schafft, "+
                    "sondern wiederherstellt. Keine Aussage über Wohlstandsverteilung"),
            new Term("Probleme Soz Marktw","Probleme der Sozialen Marktwirtschaft: \nFinanzierung sozialer Sicherungssysteme \nSubventionen \nÖffentliche Unternehmen -> Privatisierung \nKonjunkturschwankungen"),
            new Term("Finanz soz Sichsys","Finanzierung sozialer Sicherungssysteme \nJe mehr Arbeitslose und Rentner, umso geringer Beitragseinnahmen \n"+
                    "Arbeitslosenunterstützung und Renten Ausgaben steigen gleichzeitig \nDie Beiträge müssen erhöht und die Leistungen gekürzt werden, um dies zu bezahlen \n"+
                    "dazu: Pflegeversicherungs und Krankenversicherungsausgaben steigen wegen Überalterung \nDie Folge: Wohlstand sinkt durch Beitragserhöhungen und Leistungskürzungen, "+
                    "mehr private Vorsorge notwendig"),
            new Term("Subventionen","Finanzielle gegenleistungslose Staatshilfe \nDamit Betriebe konkurenzfähig bleiben. Manche Betribe sind nur mit Hilfe von Zuschüssen überlebensfähig. \n\n"+
                    "Die Staatsquote gibt an welchen Anteil die Staatsausgaben an der Wirtschaftsleistung (am BIP) haben. Eine hohe Staatsquote verfälscht das BIP. \n"+
                    "Um sie zu senken will der Staat weniger subventionieren \n2020 lag sie bei 50,8% wegen Corona, Krankenversorgung, Kurzarbeitergeld, Unternehmensunterstützung \n"+
                    "1990 - 1995: Anstieg wegen Kosten der Wiedervereinigung"),
            new Term("Privatisierung","Privatisierung öffentlicher Unternehmen \nVerkauf von Unternehmen des Staates an private Leute \nStaat spart Steuergeld und bekommt "+
                    "dazu den Verkaufspreis als Staatseinnahme. Die Preise beim Unternehmen fallen (zB Telekom) oder steigen. \n\n"+
                    "Probleme öffentlicher Unternehmen \nUnrentabilität, Ihre Güter sind teurer, brauchen häufig "+
                    "Zuschüsse \nliegt an der Monopolstellung (fehlender Wettbewerb). Sie reagieren gleichgültiger auf Neuerungen. \nSteuerzahlen tragen Verluste, daher vielfach überhöhter "+
                    "Kapital und Personeneinsatz. \n-> Immer größere Zuschüsse benötigt \n\n"+
                    "Telekom wurde ganz verkauft, Post und Bahn zum Teil. Lufthansa und Energieunternehmen in Planung \n"+
                    "Zunehmend mehr Gemeinden lassen Müllabfuhr, Straßenreinigung und Abwasserbeseitigung von Privat machen"),
            new Term("Konjunkturschwankungen","Konjunktur \nGrundmuster wirtschaftlicher Aktivität in der Volkswirtschaft von Auf und Ab, "+
                    "über mehrere Jahre hinweg. Diese Welle heißt Konjunkturzyklus. \n\n"+
                    "Staat will dass Konjunkturschwankungen gering sind, deshalb sind die Konjunkturpolitischen Maßnahmen antizyklisch. \n\n"+
                    "Maßnahmen bei Tiefstand (Depression): \n\nMaßnahmen der Europäischen Zentralbank EZB / Geldpolitik: \n1. Senkung der Mindestreserve \n"+
                    "Banken müssen weniger Geld bei der Bundesbank hinterlegen (zur Sicherheit, wenn sie pleite gehen) \nFolge: Die umlaufende Geldmenge steigt \n"+
                    "2. Verkauf von Wertpapieren \nDie EZB kauft Staats-Aktien \nFolge: Die umlaufende Geldmenge wird größer \n3. Leitzinssenkung \n"+
                    "Kredite von Banken kosten jetzt weniger Zinsen, man bekommt aber auch weniger Zinsen für gespartes Geld \nFolge: Privatleute sparen weniger, "+
                    "nehmen mehr Kredite auf und haben mehr Geld zum Kaufen (=Nachfrage steigt) \n\nMaßnahmen vom Staat / Konjunkturpolitik: \n"+
                    "1. Steuersenkung für Unternehmen \nFirmen müssen weniger Steuern zahlen \nFolge: Die Firmen investieren mehr (zB neue Machinen kaufen) "+
                    "und schaffen neue Arbeitsplätze \n2. Erhöhung der Staatsaufträge \nFirmen bekommen mehr Staats-Aufträge \nFolge: Firmen machen mehr Gewinne und schaffen "+
                    "neue Arbeitsplätze \n3. Subventionen für Unternehmen und private Haushalte \nFirmen und private Haushalte bekommen mehr Geld vom Staat \n"+
                    "Folge: Firmen können mehr investieren und Privatleute können mehr kaufen \n4. Steuersenkungen für Verbraucher \nDie Nettolöhne steigen \n" +
                    "Folge: Privatleute kaufen mehr \n\nMaßnahmen bei Hochkonjunktur (Boom): \n\nMaßnahmen der EZB / Geldpolitik: \n"+
                    "1. Erhöhung der Mindestreserve \ndie Banken müssen mehr Geld bei der Bundesbank hinterlegen (zur Sicherheit, wenn sie pleite gehen) \n"+
                    "Folge: Die umlaufende Geldmenge wird kleiner \n2. Kauf von Wertpapieren \nDie EZB verkaufen Staats-Aktien \nFolge: Die umlaufende Geldmenge wird kleiner \n"+
                    "3. Die Leitzinserhöhung \nKredite von Banken kosten jetzt mehr Zinsen, man bekommt aber auch mehr Zinsen für gespartes Geld \nFolge: "+
                    "Privatleute sparen mehr, nehmen weniger Kredite auf und ahben weniger Geld zum Kaufen (Nachfrage sinkt) \n\n"+
                    "Maßnahmen vom Staat / Konjunkturpolitik: \n1. Steuererhöhungen für Unternehmen \nFirmen müssen mehr Steuern zahlen \nFolge: Die Firmen investieren weniger "+
                    "zB neue Maschinen kaufen und schaffen keine neuen Arbeitsplätze \n2. Weniger Staatsaufträge \nFirmen bekommen weniger Staats-Aufträge \n"+
                    "Folge: Firmen machen weniger Gewinne und schaffen keine neuen Arbeitsplätze \n3. Weniger Subventionen \nFirmen und private Haushalte bekommen weniger Geld vom Staat \n"+
                    "Folge: Firmen investieren weniger und Privatleute können weniger kaufen \n4. Steuererhöhung \nDie Nettolöhne sinken \nFolge: Privatleute kaufen weniger"),
            new Term("Wirtschaftspolitische Ziele","Stabilitätsgesetz \nErfordernisse des gesamtwirtschaftlichen Gleichgewichts beachten \n"+
                    "Maßnahmen treffen, sodass gleichzeitig zu Preisstabilität, Beschäftigung, außenwirtschaftliches Gleichgewicht und Wirtschaftswachstum beigetragen wird, " +
                    "im Rahmen der marktwirtschaftlichen Ordnung. \n\nDas magische Viereck \nPreisstabilität - Inflationsrate unter / am 2% \nVollbeschäftigung - Arbeitslosenquote kleiner als 3%"+
                    "\nangemessenes Wirtschaftswachstum - um ca 3%\naußenwirtschaftliches Gleichgewicht - Import = Export \nIn der Wirtschaft ist es unmöglich alle 4 Ziele gleichzeitig zu erreichen. \n\n"+
                    "Das magische Sechseck \nDas magische Viereck + \nNachhaltigkeit \nDie Wirtschaftsteilnehmer (AN & AG) sollen nachhaltig wirtschaften. Die Umwelt soll für die nachfolgenden Generationen "+
                    "geschützt werden zB steuerliche Förderung von E-Autos \ngerechte Vermögensverteilung \nDie Einkommensverteilung erfolgt in D nach dem Leistungsprinzip. "+
                    "Der Staat greift deshalb ein. Er handelt nach dem Bedarfsprinzip. Es findet ein spezieller Ausgleich statt zB Wohngeld, Kindergeld"),
            new Term("Gründung Unternehmen","Hilfen \nIHK, HWK, Fachverbände, Institute der Wirtschaft, Bundesministerium für Wirtschaft, \nkostenpflichtig: "+
                    "Steuerberater, Kreditinstitute, freie Unternehmensberater, Rechtsanwälte / Notar \n\nPersönliche Vorraussetzungen \nSelbstbewusstsein, Risikobereitschaft, "+
                    "Fleiß, Fachkenntnisse, Kreativität, soziale Fähigkeiten, Ordnung \n\nBerufliche Vorraussetzungen \nAlle voll geschäftsfähigen Deutschen dürfen in D ein Gewerbe gründen \n"+
                    "Normalerweise ist für ein Gewerbe im Einzelhandel keine Erlaubnis notwendig \nArzneimittelherstellung, Wohnungsuntervermietung und Taxi-Unternehmesgründung nur mit offizieller Erlaubnis \n"+
                    " Anmeldung erlaubnispflichtiger Gewerbe bei der Kreisverwaltungsbehörde \nErlaubnisbeantragung vor Beginn der Tätigkeit \n"+
                    "Behörde überprüft persönliche Zuverlässigkeit durch deine Beantragung eines Führungszeugnisses beim Einwohneramt / Gewerbeamt und dadurch dass du eine Auskunft für Behörden aus dem Gewerbezentralregister erstellen lässt \n"+
                    "Handwerkliches Gewerbe gründbar durch Eintrag Handwerksrolle, durch Handwerksmeister / technische Hochschule / Fachschule \n\n"+
                    "Möglichkeiten bei der Firmengründung \n\nVertriebsfranchising \nFranchise-Nehmer hat Geschäft mit dem Franchise-Namen und verkauft Waren des Franchise-Gebers \nBsp: McDonalds in Winnenden, McDonalds in New York \n"+
                    "Subway in London, Subway in Stuttgart \n\nDienstleistungsfranchising \nFranchise-Nehmer bieten Dienstleistungen unter dem Namen des Franchise-Gebers an \n"+
                    "Bsp: Montana-Hotel ind Kassel, Montana-Hotel in Bremen \nVolkshochschule Stuttgart, Volkshochschule Heidelberg \n\nProduktfranchising \nFranchise-Nehmer stellt Waren "+
                    "in seinem eigenen Geschäft selber her und verkauft diese Waren unter dem Namen (Warenzeichen) des Franchise-Gebers \nBsp: Verkauf von Cartige World-Produkten (Verbrauchsmaterialien für Drucker) "+
                    "in den USA, Verkauf von Catridge World-Produkten in Deutschland \n\nProduktfranchising (Herstellungsfr.) \nFranchise-Nehmer stellt Waren in seinem eigenen Geschäft selbst her und verkauft diese "+
                    "Waren unter dem Namen (=Warenzeichen) des Franchise-Gebers \n\nRechtsform \nAuskunft über: \nWer bringt Kapital? Wer haftet für Schulden, in welchem Umfang? Wer leitet? Wer vertritt nach außen? "+
                    "Wer bekommt den Gewinn? \nEinzelunternehmen <-> Gesellschaftsunternehmen (Personengesellschaft <-> Kapitalgesllschft) \n\n"+
                    "Wahl des Standortes: \nKosten, Kundennähe, Behördliche Auflagen, Verkehrsanbindung, Arbeitskräfte, Konkurenz \n\n"),
            new Term("Rechtsformen Unternehmen","Legende: \nName, Abkürzung, Haftung, Geschäftsführung, Gewinnverteilung \n\n"+
                    "Einzelunternehmen: \nDurch den Einzelunternehmer, haftet allein und unbeschränkt auch mit Privatvermögen, Einzelunternehmer hat die Geschäftsführung, Einzelunternehmer bekommt Gewinn allein \n\n"+
                    "Personengesellschaften: \n\nOffene Handelsgesellschaft: OHG, \nDurch mind 2 Personen, Jeder Gesellschafter haftet unbeschränkt auch mit Privatvermögen, Jeder Gesellschafter hat die eigene Geschäftsführung, Jeder bekommt 4% "+
                    "auf die Kapitaleinlage, der Rest wird je nach Anteilen verteilt \n\nGesellschaft des bürgerlichen Rechts: GbR, \ndurch mindestens 2 natürliche oder juristische Personen mit gemeinsamem Ziel, "+
                    "Jeder Gesellschafter haftet unbeschränkt auch mit Privat, Alle Gesellschafter oder Vetrag wird gemacht, Jeder bekommt gleichen Anteil \n\nKapitalgesellschaften: \n\n"+
                    "Gesellschaft mit beschränkter Haftung: GmbH, \nDurch min 1 Person mit min 25000 Grundkapital, Jeder Gesellschafter haftet nur mit Stammeinlage, Der Geschäftsführer, Aufteilung je nach Stammeinlage \n\n"+
                    "Aktiengesellschaft: AG, \nDurch min 1 Person mit min 50K Grundkapital, Jeder Aktionär haftet mit dem Wert seiner Aktien, Der Vorstand hat die Geschäftsführung, Die Dividende (Gewinn) wird nach Aktie verteilt \n\n"+
                    "Unternehmensgesellschaft: UG, \nDurch min 1 Person mit min 1Euro Grundkapital, Jeder Gesellschafter haftet nur mit Stammeinlage, der Geschäftsführer, Aufteilung je nach Stammeinlage \n\n"+
                    "Vorteile & Nachteile: \n\nEinzelu.: \n(+) man ist selbst der Chef, kann alles bestimmen, gute Kreditwürdigkeit, ganzer Gewinn, schnell gründbar, einfach auflösbar \n(-) Entscheidungen alle allein, Verantwortung voll, "+
                    "Firma pleite - eigenes Geld weg \nOHG: \n(+) sehr gute Kreditwürdigkeit, \n(-) Firma pleite - eigene Gelder weg \n"+
                    "GbR: \n(+) sehr gute Kreditwürdigkeit \n(-) Firma pleite - eigene Gelder weg \nGmbH: \n(+) Haftung nicht mit privat \n(-) schlechte Kreidtwürdigkeit, Stammkapital 25K, Körperschaftssteuer \n"+
                    "AG: \n(+) zusätzliche Gewinne durch Aktien, schnell große Geldmenge beschaffbar durch Aktienverkauf \n(-) Stammkapital 50K, Körperschaftssteuer, Aktienwert kann sinken, viel Kontrolle macht schwerfällig \n"+
                    "UG: \n(+) Gründung: 1Euro, Gesellschafter haften nicht Privat, Gründung schnell unkompliziert \n(-) schlechte Kreditwürdigkeit, Ansparpflicht (min 25% Überschüsse müssen in Stammeinlage bis 25K)"),
            new Term("Marketing", "Marketing ist: wie kann ich möglichst viele Produkte verkaufen? \n\n"+
                    "Marketing als Modell: \n\nMarktforschung: \nWie verhalten sich die Verbraucher? \nWie verhält sich die Konkurenz? \n\nZielformulierung: \nWas möchte die Firma in diesem Jahr erreichen? \n\n"+
                    "Strategiefestlegung: \nWie erreicht die Firma die Ziele? \n\nMarketing-Mix: \nWelche Art von Werbung kann die Firma erreichen? \n\nMarketing-Controlling: \nÜberprüfung, ob die Ziele erreicht wurden \n\n\n"+
                    "Marketing-Mix = Marketing Instrumente: \nzum erreichen von Ziel zB Verkaufszahl verdoppeln \n\nGute Produktpolitik und Sortimentpolitik: \nOrientierung an aktuellen Trends und Wünschen \nBei gutem Verkauf eines Produktes, werden Variationen produziert \n"+
                    "Wenn sich eins schlecht verkauft, stoppt sie die Produktion \n\nGute Preisgestaltung: \nbesondere Kredite oder Rabatt oder verlängerte Garantie für bestimmte Kunden \ngute Lieferbedingungen für manche Lieferanten \n\n"+
                    "Gute Kundenbetreuung: \nguter Kundendienst für telefonische oder persönliche Kundenberatung \nKundenberatung in Finanzierungsfragen (aktuelle Rabatte, geeignete Raten) \n\n"+
                    "Gute Werbung: \nInvestitionen in Öffentlichkeitsarbeit um ein Produkt bekannt zu machen und in Absatzwerbung um möglichst vile von einem Produkt zu verkaufen \nKunden informieren über neue Waren, neu Kunden gewinnen und alte behalten \n\n"+
                    "Ökomarketing: \nUmwelt-Gütesiegel bekommen (zB grüner Punkt, Bio) für Image-Besserung, neue Kunden und langfristige Wettbewerbsfähigkeit \n\n"+
                    "Qualitätssicherung: \ndarauf achten keine mangelhafte Ware zu verkaufen \ngute Qualität spricht sich herum, also gutes Image und so Werbeeinsparungen möglich"),
            new Term("Finanzierung Unternehmen","Kapitalbedarf: Geld für... \nGrundstück / Gebäude \nMaschinen \nMitarbeiteranstellung \nWerbung \n\n"+
                    "Woher kann ich das Geld bekommen? \nEigenkapital: \neigenes Geld und Geld von Geschäftspartnern / Sponsoren \nFremdkapital: \nGeld, das ich ausleiehe und später zurückzahlen muss: Kredit / Darlehen von der Bank, \n"+
                    "Investoren, \nFörderungsmittel (vom Staat), \nMikrokredite. \nJe mehr Eigenkapital, desto besser! (mindestens 20%, wenn ich eine Firma gründen will). Grund: nicht so viel Risiko und ich bekomme einfacher einen Kredit \n\n"+
                    "Dispositionskredit \nmehr Gelf abheben als auf dem Konto ist \nKein neuer (Kredit)vertrag, als bei Kontoeröffnung \nZweck: Wenn man kurzfristig Geld braucht. \nKeine festgelegte Laufzeit. \nTilgung durch Einzahlung auf das Girokonto \n"+
                    "Hohe Zinsen, abhängig vom Markt (=je nach Marktlage) \nkeine Gebühren \n\nRatenkredit / Darlehen \neinen Vertrag machen und Geld ausleihen \nneuer Vertrag in Schriftform \nZweck: Wenn man Güter anschaffen will \n"+
                    "Festgelegte Laufzeit \nFestgelegte Raten, In der Regel immer gleiche Raten \nNiedrige Zinsen im Vertrag genau festgelegt \nIn der Regel 2% gebühren \n\n"+
                    "Kredit Sicherung \nBei Ratenkredit / Darlehen ist Vertrag zu machen \nDie Bank will Sicherheit, dass ich das Geld zurück zahle \n1. Möglichkeit Bürgschaft \n"+
                    "Eine dritte Person verpflichtet sich zu zahlen, wenn ich Schulden mache und das Geld nicht zurückzahlen kann \n2. Möglichkeit Verpfändung \nIch gebe dem Gläubiger zB der Bank "+
                    "einen Gegenstand / eine Besitz-Urkunde. Der Gläubiger ist der Eigentümer bis ich das Geld zurück gezahlt habe \n3. Möglichkeit Sicherheitsübereignung \nzB Kredit für Auto. Der Gläubiger bekommt "+
                    "Fahrzeugbrief, ist Eigentümer bis zur Rückzahlung \n4. Möglichkeit Hypothek / Grundschuld \nGläubiger bekommt Besitz-Urkunde für ein Gebäude. \n\n"+
                    "Leasing \n\nLeasinggeber gibt Sache zum Gebrauch \nLeasingnehmer muss Leasingrate (~Miete) zahlen. \nAm Ende: Rückgabe der selben Sache oder Kauf \n"+
                    "(+) Ich brauche keinen Kredit aufnehmen \n(+) Ich kann Sache haben auch wenn ich wenig Geld habe \n(+) Bei manchen Verträgen gibt es Betreuung und Beratung \n(+) Ich habe immer die neusten Sachen \n"+
                    "(-) Ich bin während der Leasing-Zeit an den Hersteller gebungen \n(-) Es kann Streit geben, wie viel die Sache kosten darf, wenn ich die Sache später kaufen will \n"+
                    "(-) Dauernde Belastung durch monatliche Raten \n(-) Die Leasing-Sachen gehören mir nicht"),
            new Term("Betriebliche Kosten","Kosten im Betrieb \n\nFixe Kosten (fix = fest): \nMiete für Gebäude, Steuern, Sozialversicherungsbeiträge, "+
                    "Kreditkosten, Energiekosten, Kosten für Arbeiter, Kosten für Sekretärin (= immer gleich) \n\nVariable Kosten (variable = verschieden): \nRohstoffkosten, Verpackungskosten, Material, Werkzeuge, Energiekosten \n\n"+
                    "Einzelkosten (direkte Kosten): \nRohstoffkosten, Verpackungskosten, Material, Kosten für Arbeiter, Werkzeug \n\nGemeinkosten (indirekte Kosten): \nMiete für Gebäude, "+
                    "Steuern, Sozialversicherungsbeiträge, Kreditkosten, Energiekosten, Kosten für die Sekretärin \n\nGesamtkosten = Fixe + Variable Kosten \noder: \n"+
                    "Gesamtkosten = Einzelkosten + Gemeinkosten"),
            new Term("Unternehmensziele","Ziele erwerbswirtschaftlicher Unternhemen (private): \nzB Bosch, Daimler AG \nhoher Gewinn und Gewinn steigern \nsichere Arbeit schaffen \n"+
                    "moderne Maschinen kaufen \numweltfreundliche Waren verkaufen \n\nZiele öffentlicher Unternehmen (besitzt Staat, Land oder Gemeinde): \nzB Theater, Wasserwerk, Müllabfuhr \nBevölkerung "+
                    "mit wichtigen Dienstleistungen und Gütern versorgen \nKostendeckung (= genügend verkaufen, damit die Firme nicht pleite geht) \n\n"+
                    "Ziele genossenschaftlicher Unternhemen (Personenvereinigung (mehrere Personen schließen sich zusammen)): \nzB Volksbank \n"+
                    "bessere Wettbewerbsfähigkeit (=wirtschaftliche Vorteile bekommen, konkurenzfähig sein)")

    };
    private static Term[] termsLFGK = {
            //Ordner 1
            new Term("Aufgaben der Familie","Lebensgemeinschaft \nSchutz \nSicherheit \nGeborgenheit \nLiebe \nFreizeitgestaltung \nUnternehmungen \nKümmern \nSorgen"+
                    "\n\nWirtschaftsgemeinschaft \nTaschengeld \nWohnung/Haus \nNahrung \nKleidung \nUrlaub \nSorge für Alte/Kranke"+
                    "\n\nErziehungsinstanz \nKraft \nSprache \nAbschätzung (Werte) \nRechte & Pflichten \nmoralische Werte"),
            new Term("Familienarten","Patchwork Familie \n Familie mit Kindern aus früher Ehe \nVor/Nachteile: \nmehr Artenreichtum / Verwandte \nBesuchszeiten zu beachten \nmögliche finanzielle Komplikationen"+
                    "\n\nAlleinerziehend \nVor/Nachteile: \nkeine Diskussion mit anderem Erwachsenen \nweniger Zeit / möglicherweise weniger Geld"+
                    "\nKinder werden früher erwachsen \nKinder müssen mehr mithelfen"+
                    "\n\nRegenbogen Familie \nVor/Nachteile: \nInsgesamt mehr Verbindungs Variationen in der Gesellschaft \nToleranz gegenüber Homosexuellen \nGesellschaft verbietet weniger"+
                    "\nmehr Adoptionen \nDiskriminierung"),
            new Term("Nachteile Kinder","Zeit und Geld Kosten \nAdoption könnte bevorzugt werden (Moral) \nZeugungsunfähigkeit"),
            new Term("Familien Politik","Ziele: \n\n1) finanzielle Stabilität von Familie \nKindergeld: bis 18 - 25 Jahre (solange in Ausbildung) 194 Euro / Monat"+
                    " 2. Kind: 200, 4. Kind: 225 \nElterngeld: 12 Monate 65-67 % Einkommen max 1800 \n\n2) Vereinbarkeit Familie und Beruf "+
                    "\nKindertagsbetreuung: Anspruch Betreuungsplatz \nwer sich Kindergrippe, garten ab 1 J nicht leisten kann, bekommt Geld vom Jugendamt "+
                    "\n\n3) Wohlergehen & Förderung der Bildung von Kindern \nFörderung einkommensschwacher Familien \nArbeitslosengeld 2 + Kinderzuschlag (160 Euro je Kind) \n"+
                    "Kinderwohngeld, Geld für Heizung \nBildungsgutscheine \nSchulausflüge \n10 Euro / Monat für Sportverein / Musikschule"+
                    "\n\n1900 - 44 % leben in 5 Personen Haushalt, 7 % in 1 Person Haushalt \n 2007 - 41% leben in 1 Person Haushalt, 3 % in 3 Personen Haushalt"),
            new Term("Ausbildung","Konflikte lösen durch... \nMitarbeiter, Vorgesetzte, Sozialdienst, Betriebsrat / Personalrat/abteilung, Gewerkschaften, Agentur für Arbeit"+
                    "\n\nVerstöße gegen Pflichten des Azubi / Arbeitgebers \nAbmahnung, IHK, Kündigung, Arbeitsvertrag, Ausbildungsvertrag regeln"+
                    "\n\nWarum bilden Betriebe aus \nLehren bildet, eigene Fachkräfte formen, kein einlernen nötig, mögliche Zuschüsse, Nachwuchs an Fachkräften"+
                    "\n\nAbbruchgründe Ausbildung \nkörperliche / geistige Überforderung \nUnterforderung \nDifferenz zwischen Erwartung und Wirklichkeit \nLohn zu gering"+
                    "\nzu viel/ hohe Arbeitszeit \nArbeitsweg zu lang \nMobbing \nschlechte Arbeitsbedingungen \nGesundheitsgefährdung \nLeistungsdruck  "),
            //Ordner 2
            new Term("Generationenvertrag","Abkommen Jung <-> Alt \nKein echter Vertrag, sondern sprichwörtlich \n<bürger Beiträge -> gesetzliche Rentenversicherung \n"+
                    "damit wird Rentte heutiger Rentner finanziert "),
            new Term("Renteneintritt","67"),
            new Term("Fluchtursachen","Push Faktoren: \n(Bürger)Krieg \nNaturkatastrophen \nUnfreiheit \nStaatliche Verfolgung \nArmut \nDiskriminierung"),
            new Term("Einwanderung", "Formen: \ngesteuert -> zB für Arbeiter (Fachkräfte) \nungesteuert -> EU-Bürger, Aufnahme von Flüchtenden aus menschlichen Gründen (legale Einwanderung)"+
                    "\n\nProbleme: \nArbeitsknappheit, \nWohnungsknappheit, \nkurzfristige Überforderung durch Überraschungseffekt der Organisation, \nMöglicherweise Notwendigkeit der Ursachenforschung, Hilfe / Lösung"+
                    "\n\nVeränderungen: \nArchitektur, Menschenfarben, Schrift / Sprache / Vielfalt \n\nPull Faktoren: \nKarriere, bessere Überlebensmöglichkeiten / Bedingungen, "+
                    "medizinische & soziale Versorgung, besserer Verdienst, Beschäftigungsmöglichkeiten, Zukunftsperspektiven, Freiheit von sozialen Zwängen"),
            new Term("Zuwanderungsgesetz","1.1.2005 \nhierin bekannte sich Deutschland Einwanderungsland zu sein"),
            new Term("Migration","Mensch wechselt Wohnort in Staat oder von Staat zu Staat dauerhaft"),
            new Term("Binnenwanderung","Mensch wechselt Wohnort innerhalb eines Staates \n\nUrsache: \nArbeit, Infrastruktur, Leerstand, Miete "+
                    "\n\nVorteile: \nschrumpfende Region: \nmehr Raum (für Natur), Selbstständigkeit, günstiges Land (Wohnraum) \nwachsende Region: \nmehr Gesellschaft, "+
                    "Selbstwertgefühl, Infrastruktur \n\nNachteile: \nschrumpfende Region: \nweniger Gesellschaft, lange Weile, Einsamkeit, fehlende Infrastruktur "+
                    "\nwachsende Region: \nweniger Raum, teueres Land (Wohnraum), weniger Natur"),
            new Term("2. Weltkrieg","1944/45 Flucht vor Roter Armee \n  45/46 Vertreibung aufgrund neuer Grenzziehung \n  49-61 bis 89/90 politische Unterdrückung und Verfolgung in DDR"+
                    "  55-74 und seit 2004 Anwerbung von \"Gast\"Arbeitern \nab 1990 Konflikte in Herkunftsländern, Armut, Menschenrechtsverletzungen, Umweltprobleme \n"+
                    "2005 frie Wahl von Wohnsitz & Arbeitsplatz für EU-Bürger"),
            //Ordner 3
            new Term("Monarchie - Republik","Monarchie \nAlleinherrschaft, Weitergabe meist in Familie \n\nRepublik \nPerson aus dem Volk regiert. Ursache unterschiedlich"),
            new Term("Demokratie - Diktatur","Demokratie: \nHerrschaft von allen \nWahl durch Volk zwischen Parteien \nBefristete Regierungszeit \n"+
                    "Gewaltenteilung: ausführende, Recht sprechende und Gesetz gebende. gegenseitige Kontrolle der Herrschenden \nGarantie von Menschen und Bürgerrechten "+
                    "\nKontrolle durch Gerichte \nPresse und Meinungsfreiheit \n\nDiktatur \nvon einer Person / Gruppe \nWahl nur zum Schein \neine Partei \nMacht und Entscheidungshoheit "+
                    "in einer Hand und wird nicht abgegeben \nUnterdrückung Presse und Meinungsfreiheit, Vorgabe \nKein/e ... Volkssouverränität, Pluralismus, Rechtstaat, "+
                    "Gewaltenteilung, Mehrheitsmacht, Grundrechte / Menschenrechte"),
            new Term ("Representative Demokratie","4-5 Jahre = eine Wahl der bis zur nächsten Wahl politische Entscheidungen treffenden Represanten \n\n"+
                    "Verhältniswahlrecht: \nParteien in Parlament je nach Stimmanteil. \nDirektkandidaten direkt in Parlament (meisten Stimmen in einem Wahlkreis) \n\n"+
                    "Herrschaftsformen: \n   parlamentarisch: \n      Parlament regiert mit (Gesetzvorlagen brauchen Zustimmung vom Parlament). Dadurch Regierungskontrolle \n"+
                    "      Parlament wählt Regierung, kann sie wieder absetzen \n      Volk wählt Parteien, die meistgewählte bestimmt Mehrheit \n   präsidentiell: \n      "+
                    "Präsident (regierungschef) hat Starke Stellung gegenüber Parlament \n      Volk wählt Präsident in direkter Wahl \n      Präsident kann viel entscheiden ohne Parlament zu fragen \n"+
                    "      Volk wählt Parlament unabhängig von Präsidentenwahl \n       zB Frankreich, Amerika2"),
            new Term("Demokratie Prinzipien","regeläßige, freie allgemeine, gleiche und geheime Wahlen \n\nEntscheidungen nach Mehrheitsprinzip (bei Anerkennung & Schutz der Minderheiten) "+
                    "\n\nStaatsgewalt ist an Verfassung gebunden und gewährleistet, \n\nGewaltenteilung (verschiedene Abstufungen)"),
            new Term("Bundesverfassungsgericht","Überwachung, Einhaltung Grundgesetz \nRichter gewählt von Tag / Rat 50/50% und von Präsident ernannt \n"+
                    "oberstes Gericht in Deutschland \nVerfassungsklagen, Aufhebung von verfassungsfeindlichen Gesetzen"),
            new Term("Bundesrat","Vertreter der Länder, kann Gesetze ablehnen, Wiederspruch einlegen \nMitwirkung Gesetzgebung (beraten, vorschlagen) \n"+
                    "Alle Bundesgesetze müssen von Rat abgestimmt werden. Einige treten erst dann in Kraft."),
            new Term("Bundespräsident","Prässentation Bundesrepublik Deutschland \ndiplomatische Vertretung im Ausland (Verträge unterschreiben) \n"+
                    "Vorschlag des Bundeskanzlers zur Wahl \nAuflösung Bundestag"),
            new Term("Bundestag","vom Volk gewählt \nGesetzgebung (Beratung, vorschlagen, abstimmen) \nKontrolle Regierungssarbeit (Einsatz von Untersuchungsausschüssen) \n"+
                    "Bundeshaushalt \nBundeswehreinsätze \nWahl Bundeskanzler/in"),
            new Term("Bundesregierung","schlägt Gesetze vor, Kanzler, Minister (Fachberreiche), Umsetzung Gesetze (in Ministerien), \n"+
                    "Kanzler auf Vorschlag des Bundespräsidenten vom Bundestag gewählt. kanzler/in wählt Minister/innen. Die werden vom Präsidenten ernannt.\n"+
                    "Leitung des Staates durch dieses Organ \nBundeskanzler bestimmt Richtlinie der Politik , Minister halten sich dran"),
            new Term("Grundgesetz","Schutz Menschenwürde \nBerufsfreiheit \nPersönliche Freiheit / Recht auf körperliche Unversehrtheit \nGleicheit vor Gesetz \n"+
                    "Glauben und Gewissensfreiheit \nfreie Meinungsäußerung \nSchutz von Ehe und Familie \nstaatliche Schulaufsicht \nVersammlungs und Vereinigungsfrieheit \n"+
                    "Brief und Postgeheimnis \nWohnungsunverletzlichkeit \nFreizügigkeit \nRecht auf freie Wohnortwahl \nEigentumsgewährleistung \nStaatsangehörigkeit / Verbot von Ausbürgerung \n"+
                    "Rechtliches Gehör vor Gerichten"),
            new Term("Parteien - Verbände","Parteien: \nvertreten Interessen Ihrer Wähler \nmittl zwischen Bürger - Staat \nLösungsvorschläge zu Problemen "+
                    "der Gegenwart & Zukunft \nnehmen politischen Einfluss in der Gesellschaft \ngreifen die Interessen der Bürger auf und bringen sie in die politischen Entscheidungen ein" +
                    "\n->Handeln unmittelbar in allen politischen Bereichen \n\nVerbände: \nVertreten Interessen ihrer Mitglieder \nNehmen Einfluss auf Politik "+
                    "\nHaben kein Mandat, nehmen nicht aktiv an Politik teil \n=>sie handeln mittelbar (nicht direkt, über dritte) in einem politischen Bereich"),
            new Term("Lobbyismus","Lobbyisten sind Fachleute \nentlasten Staat \nThemenfeldaufbereitung \nMittler zwischen Staat und Gesellschaftsteil \n"+
                    "Einflussnahme durch Beratung und direkten Kontakt zur Politik, Macht, Einfluss, Druck \n\n"+
                    "PRO: \nLobbyisten sind Fachleute und bereiten ihren Standpunkte durch Argumente auf \nOrganisationen die sich für das Allgemeinwohl einsetzen, betrifft auch Lobbyismus \n"+
                    "Gewerkschaften (zB Ver.di, IG Metall) vertreten die Berufsgruppen und setzen sich für höhere Löhne und Arbeitsbedingungen ein \n\n"+
                    "CONTRA: \nInteressen einseitig und entsprechen nicht Meinung von allen \nLobbyismus bedeutet hohen Aufwand -> Größere und Reichere Firmen haben mehr Einfluss "+
                    "weil sie mehr Kapital haben \nLobbyismus oft intransparent, Korruptionsgefahr (Bestechlichkeit) \nWechsel von Politik -> Lobbyverein -> Ausnutzung Positionen / Kontakte möglich"),
            new Term("Förderalismus","Vertikale Gewaltenteilung \n\nBundesebene: \npolitische Entscheidungen für alle in BRD \n\n"+
                    "Landesebene: \npolitische Entscheidungen für alle in Bundesland \n\nKommunale Ebene: \npolitische Entscheidung der Städte und Gemeinden"),
            new Term("Gewaltenteilung","Legislative: \nBundestag, Bundesrat, Landtag, Kreistag, Gemeinderat "+
                    "\n\nExecutive: \nBundespräsident, -kanzler, -regierung, Landesregierung, Landrat, Bürgermeister \n\nJudikative: \nBundesverfassungsgericht, Landesverfassungsgericht, Gerichte des Landes"),
            new Term("Direkte Demokratie","5. & 4. Jahrhundert vor Christus Athen frühe Form \n1919 Weimarer Republik Volksentscheid & begehren, Eingriff in Gesetzgebung \n\nBürgerbeteiligung: \nBürgerforum: "+
                    "Bürger sind zu aktiven Diskussionen von politischen Institutionen, Partien und Verbänden geladen \nDemonstrationen \nVolksentscheid: Abstimmung über Gestzentwurf nur auf kommunaler und Landesebene"+
                    "\nBürgerinitiativen \nWahlen \n\n"+
                    "Kein Problemlöser für moderne Demokratien: \nhohe komplexität politischer Prozesse \nGroßteil der Bevölkerung nicht bereit und keine Zeit \n"+
                    "politische Gestalten wäre schwerer, Zustände unregierbar \ndirekte Demokratie eignet sich vor allem zur Legitimierung von Ja/Nein Entscheidungen \n\n"+
                    "Hat repräsentative Demokratie ausgedient? \nNein, bleibt weiterhin wichtig, um in vielen einzelnen Sachfragen täglich zu einer Entscheidung zu kommen, für möglichst leistungsfähige politische Gestaltung "+
                    "sowie ausgewogenes Verhältnis zwischen Beteiligung und Gestaltung \nMuss jedoch transparenter und für jeden Interessierten nachvollziehbar gegen Politikverdrossenheit "+
                    "und für politische Teilebene zB Petitionsrecht"),
            //Ordner 4
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
            new Term("EU Länder","seit 1958: \nBelgien, Deutschland, Frankreich, Italien, Luxemburg, Niederlande \n\nseit 1973 \nDänemark, Irland \n\nseit 1981: "+
                    "\nGriechenland \n\nseit 1986: \nPortugal, Spanien \n\nseit 1995: \nFinnland, Österreich, Schweden \n\nseit 2004: \nEstland, Lettland, Litauen, Malta, Polen, Slowakei, Slowenien, "+
                    "Tschechien, Ungarn, Zypern \n\nseit 2007: \nBulgarien, Rumänien, \n\nseit 2013: \nKroatien"),
            new Term("Euro Länder","Euro Länder \n\nseit 1999: \nDeutschland, Fankreich, Finnland, Italien, Irland, Belgien, Luxemburg, Österreich, Niederlande, Portugal, Spanien"+
                    "\n\nseit 2001: \nGriechenland, \n\nseit 2007: \nSlowenien \n\nseit 2008: \nZypern, Malta \n\nseit 2009: \nSlowakei \n\nseit 2011: \nEstland \n\nseit 2014: \nLettland, Litauen \n\nseit 2022: \nKroatien"),
            new Term("EU Features","Euro \nFrüher: jedes EU Land hatte eigenes Geld \nHeute: 20 EU Länder haben das gleiche Geld: \"Euro\". \n\nkeine Grenz-Kontrolle \n"+
                    "Früher: Reise-Pass, Perso zeigen, Stau an Grenzen \nHeute: keine Kontrollen, keine Staus mehr \n\nEU-Kranken-Versicherungs-Karte \nUnfall oder Krankheit in einem anderen EU-Land? "+
                    "Krankenhaus oder Artzt hilft Ihnen, mit EU-Kranken-Versicherungskarte bezahlen \n\nsauberes Wasser \nAlle EU-Länder müssen sauberes Trink-Wasser, Meere, Seen, Flüsse haben. Das wird kontrolliert"+
                    "\n\nE-Autos \nAbgase sind schlecht für die Luft. Menschen werden krank. EU-Plan für die Zukunft: E-Autos haben keine Abgase, sind gut für die Luft. Menschen bleiben gesund."+
                    "\n\nUmweltfreundliche Haushaltsgeräte \nEU-weit gleiche Aufkleber auf Haushaltsgeräten: Grüne Farbe: gut für die Umwelt, wenig Stromverbrauch, Rote Farbe: schlecht für die Umwelt, "+
                    "viel Stromverbrauch \n\nHandy-Gebühren \nDie Handy-Gebühren sind seit 2017 im EU-Ausland die selben wie im Inland. Die waren zuvor viel höher. \n\nVerbot Einweg-Plastik-Artikel \n"+
                    "Weil viele Menschen oft Plastik in die Landschaft werfen, dürfen in der EU keine Einweg Plastik Artikel in den Geschäften verkauft werden. \n\nWohnen und Arrbeiten \n"+
                    "Menschen in der EU dürfen selbst entscheiden, in welchem EU-Land sie wohnen, studieren oder arbeiten möchten. =\"Freizügigkeit\" \n\nFrieden \n"+
                    "Früher: Viele Kriege in Europa \nHeute: seit 70 Jahren kein Krieg in Europa. EU Länder unterstützen sich gegenseitig und arbeiten zusammen \n\nEuropass \n"+
                    "Bewerbungs-Mappe für das Bewerben auf Arbeitsplätze in allen EU-Ländern \n\nLebensmittel \nLebensmittel mit gleichem Zeichen für \"Bio\" oder \"Öko\", gleiche Bedeutung für saubere Lebensmittel"+
                    "\n\nReiserechte \nin allen EU-Ländern Geldrückgabe bei Flug oder Bahn ausfall oder Verspätung \n\nGewährleistungsfrist bei Waren \nKauf von Waren in einem EU-Land: Warengarantie: 2 Jahre, Reperatur oder Ersatz"+
                    "\n\nWarenumtausch im Internet \n Bei einem Kauf von EU-Waren im Internet in einem EU-Land gibt es eine 14 Tage Warenumtauschmöglichkeit gegen neue Ware oder Geldrückgabe"),
            new Term("EU 4 Freiheiten","Freier Personenverkehr \nAlle EU-Bürger können sich frei innerhalb der EU bewegen, sich niederlassen und eine Arbeit annehmen (bis zu 3 Monate) \n\n"+
                    "Freier Warenverkehr \nKein Warengrenzkontrolle und keine Zölle. Das vereinfachte den Handel zwischen den Mitgliedstaaten und krubelte ihn an. \n\nFreier Dienstleistungsverkehr und Unternehmensgründungen "+
                    "\nJede Privatperson kann zwischen eropäischen Handyanbietern, Stromversorgern oder Versicherungsgesellschaften wählen. Unternehmen dürfen sich auch in allen EU-Ländern niederlassen und Geschäfte betreiben \n\n"+
                    "Freier Kapitalverkehr \nEU-Bürger haben freie Wahl in welchem Land und bei welchem Kreidtinstitut sie ihr Geld anlegen"),
            new Term("EU Organe","Eropäischer Rat in Brüssel\nStaats und Regierungschefs der Mitgliedstaaten & Präsident der europäischen Kommission \nTreffen sich 2x jährlich, bestimmen Ziele und Richtung,"+
                    " legen politische Richtung der EU und ihre wirtschaftlichen Ziele fest \n\nEuropäische Kommision in Brüssel\nEin Politiker je Land. Einer von ihnen wird Präsident, die anderen Kommissare \n"+
                    "Aufgaben je nach Kommissar, zB Agrarkommisar. Sie schlagen neue Gesetze vor und kontrollieren die Gesetzeinhaltung der EU Länder. \n\nMinisterrat (Rat der EU) in Brüssel \n"+
                    "Minister der Mitgliedsländer zB Umweltminister beim Umweltpolitiktreffen \nEntscheidungen über Gesetze & über Verteilung von Geld (Plan dazu) \n\nEuropäisches Parlament in Straßburg \n"+
                    "Abgeordnete (gewählt von EU-Bürgern), oft in einer Partei \nEntscheidung über Gesetze, kontrolliert Geld - Ausgaben der Staaten, entscheidet welche Länder neu aufgenommen werden"),
            new Term("Asyl Positionen","Zuwanderung nach Europa - der Streit um die Asylpolitik \n\n"+
                    "Moria\n" + "Flüchtlingslager auf griechischer Insel Lesbos\n" + "wurde für 3000 gebaut, aber jahrelang lebten dort mehr 12000\n" +
                    "2020 Zerstörung durch Brand\n" + "Dannach nahmen einige (auch Deutschland) welche auf\n\n" +
                    "Rolle der EU\n" + "Keine Einigung über Flüchtlingsverteilung\n" + "Die betroffenen Länder wollten verpflichtenden Mechanismus zur Verteilung\n" +
                    "Viele östlichen Länder lehnen sie weiterhin ab\n\n"+
                    "Rechtliche Grundlage\n" + "Laut Dublin-Verfahren:\n" + "Asyssuchende müssen sich in dem Staat, in dem sie den EU-Raum erstmals betreten,\n" +
                    "registrieren lassen und Asyl beantragen\n" + "Dann wird, nach rechtlicher Überprüfung, entschieden, wer tatsächlich Asyl und Schutz erhält.\n" +
                    "Das Recht auf Asyl ist in Deutschland im Grundgesetz und in der EU in der Charta der Grundrechte verankert.\n" +
                    "Asyl kann z.B. bekommen, wer aus politischen oder religiösen Gründen oder wegen seiner ethnischen Herkunft verfolgt wird.\n\n\n"+
                    "Frontex - ProAsyl\n\n" +
                    "Frontex: \nEuropäische Agentur für die Grenz & Küstenwache (seit 2015/16) davor Koordinierung der Grenze.\n" +
                    "Meinung: Die EU stockt den EU-Grenz- und Küstenschutz bis 2027 auf 10 000 Einsatzkräfte auf. \n" +
                    "\"Mit der heutigen Entscheidung machen wir Europa sicherer [...]\", sagte die EU-Abgeordnete Monika Hohlmeier (CSU) (zeit.de, 28.03.2019)\n\n" +
                    "ProAsyl:  \nVerein der sich für den Schutz und die Rechte von asylsuchenden Menschen in Europa einsetzt. Sitz: Frankfurt am Main\n" +
                    "Meinung: Die EU versucht, ihre Grenzen abzuriegeln. An einigen Grenzabschnitten haben die Staaten meterhohe Stacheldrahtzäune errichtet.\n" +
                    "Die EU versucht, Flüchtlinge schon abzuwehren, bevor sie die Grenze der EU erreichen. (proasyl.de, 05.10.2020)"),
            //Ordner 6
            new Term("Ukraine Krieg","Die EU verurteilt den Russischen Angriffskrieg auf die Ukraine und liefert militärische Güter und finanzielle Mittel an die Ukraine. \n\n"+
                    "Die EU hat \"massive und beispiellose\" Sanktionen gegen Russland verhängt \nIndividuelle (zB gegen Putin und Lawrow, Banken, Unternehmen, Wagner-Gruppe) "+
                    "wie Vermögen Einfrieren, Einreiseverbot \nWirtschaftliche / Handel \nEinfuhr / Ausfuhrbeschränkungen abgesehen von Essen betrifft etw 50% Aus und 60% Einfuhren \n\n"+
                    "hier noch Teil über Ukraine EU-Beitritts Status einfügen, frage nochmal nach"),
            new Term("Kopenhager Kriterien","Welches Land darf in die EU? \n\nPolitisches Kriterium \nWahrung der Menschenrechte \nInstitutionelle Stabilität \nDamokratische und "+
                    "rechtsstaatliche Grundordnung \nAchtung und Schutz von Minderheiten \n\nWirtschaftliches Kriterium \nDie Fähigkeit dem Wettbewerbsdruck innerhalb des EU-Binnenmarktes "+
                    "standzuhalten \nFunktionsfähige und wettberwerbsfähige Marktwirtschaft \nOffenheit der Märkte gegenüber dem Ausland \n\nAcquis Kriterium \nDie Fähigkeit, sich aus einer EU-"+
                    "Mitgliederschaft erwachsenen Verpflichtungen und Ziele zu eigen zu machen. Dies bedeutet praktisch die Übernahme des \"gemeinschaftlichen Besitzstandes\" (Acquis communautaire)"),
            new Term("Globalisierung","Wie bin ich betroffen? \nWirtschaft: weltweite/r (arbeits-teilige) Produktion, Handel, Finanz-Krisen, Forschung \nUmwelt: Klima-Wandel, Krankheiten "+
                    "(Ebola, Vogelgrippe usw.) \nKultur u. Soziales: weltweiter Tourismus, internationale Sport-Ereignisse, weltweite verbreitung von Musik/Filmen, weltweite Kommunikation, "+
                    "Angleichung von Konsum-Gewohnheiten und Lebens-Stilen \nPolitik: Nichtregierungsorganisationen (Amnesty International, usw.), internationale Organistationen, (Militär)bündnisse (NATO, usw.), "+
                    "Sanktionen (=Strafen), Kriege \n\n"+
                    "Ursachen \nWunsch nach ausländischen Produkten zB Wunsch nach Bananen verbindet Handelswege nach Chile \nUnternehmen sparen Geld wenn sie im Ausland "+
                    "ganz oder teilweise produzieren lassen \nUnternehmen schließen sich mit ausländischen Unternehmen zusammen \nUnternehmen wandern ganz aus \nSo werden Kunden "+
                    "weltweit gewonnen \nTransport ist einfacher und billiger geworden (Flugzeuge, Frachtcontainer, Eisenbahn) \nMärkte werden immer freier zugänglich \ninternationale "+
                    "Handelsbeziehung weiten sich aus \nWelthandel kann sich mehr und mehr entfalten \nEs ist schnell bekannt wo günstige Güter und Dienstleistungen zu kaufen sind und welche "+
                    "Neuheiten es gibt \nGlobale Arbeitsprozesse können verteilt und koordiniert werden \nGeldstöme können auch frei von allen Beschränkungen dorthin fließen wo der größte Profit "+
                    "zu erwaten ist \n\nAuswirkungen \nmenschen-unwürdige Arbeitsbedingungen zB an der Nähmaschine im Akkord (Bezahlung nach Stück) in Billig-Lohn Ländern (China, Hongkong, Taiwan, Bangladesch) \n"+
                    "7 Tage in der Woche für sehr wenig Lohn ohne soziale Absicherung \nAuch in Industrieländern gibt es zunehmend prekäre Arbeits-Verhältnisse, Lohn aus einer Vollzeit-Beschäftigung reicht "+
                    "nicht aus, um eine Familie zu ernähren \nKäufer von Billig-Kleidung belastet durch Chemikalien / Farbstoffe, Allergien, Organablagerungen, Krebs, Unfruchtbarkeit \n"+
                    "Multinationale Unternehmen profitieren und nutzen Macht und nehmen Einfluss auf Arbeitsaltag ihrer Beschäftigten. Sie spielen die Arbeitenden in unterschiedlichen Regionen gegen "+
                    "einander aus. \n\nWer gewinnt? Wer verliert? \n(multi-nationale) Unternehmen \n(+) preiswerte Produkte, geringe Lohnkosten, mehr Gewinn durch billige Produktion \n"+
                    "Arbeitnehmer \n(+) mehr Arbeitsplätze \n(-) keine sozialen Versicherungen, geringer Stundenlohn, 7 Tage Woche, In den Industriestaaten nur noch qualifizierte Arbeit möglich \n"+
                    "Konusmenten \n(+) Billige Produkte, Internationale Kultur \n(-) schlechte, teilweise giftige Produkte wegen mangelnder Kontrolle"),
            new Term("Nachhaltigkeit","Ökologische Dimension \nfür kommende Generationen soll ein intakte Natur und Umwelt erhalten bleiben \nErhalt der Artenvielfalt \nKlimaschutz "+
                    "\nPflege & Erhalt der Naturräume \nRessourcenschutz \n\nWirtschaftliche Dimension \nMenschen und Unternehmen soll so wirtschaften, dass eine dauerhafte Grundlage für Arbeit und Wohlstand"+
                    " geschaffen wird \nArmutsbekämpfung \nstabile Arbeitsverhältnisse \nRessourcenschutz \nausgewogene Mitarbeiterstruktur, Ansiedlung neuer Unternehmen in strukturschwachen Regionen, geringe "+
                    "soziale Ungleichheit \n\nSoziale Dimension \nEs soll auf Dauer eine zukünftsfähige, gerechte und lebenswerte Gesellschaft erreicht werden \nPersönliche Sicherheit "+
                    "Politische Mitwirkung, Gleichbehandlung der Geschlechter \n\nWie kann ich Globalisierung gerechter und nachhaltiger gestalten? \n"+
                    "Ich spende Kleider, die ich nicht mehr tragen möchte in die Altkleidersammlung weil ich so inärmeren Regionen dafür sorgen kann, dass die Menschen dort etwas zum Anziehen haben. \n"+
                    "Ich boykottiere billige Kleidung von großen Ketten und Discountern weil es sich dann für die Ausbeuter Unternehmen nicht mehr lohnt auszubeuten \n"+
                    "Ich übernehme eine Kinderpartnerschaft weil ich damit einem Kind in einem Entwicklungsland eine Perspektive auf Ausbildung und damit ein Chance auf ein gutes Leben ermögliche. \n"+
                    "Ich verzichte auf Plastik(-beutel) beim Einkauf weil Plastik nicht verrottet und der Umwelt schadet  \nIch kaufe mir nicht alle 2 Jahre ein neues Smartphone weil ich so nicht den Abbau "+
                    "von seltenen Rohstoffen fördere und die Umwelt schone \nDie lease ein Schwein weil ich so sicher sein kann, dass das Tier auf meinem Teller artgerecht gehalten und getötet wurde \n"+
                    "Ich frage im Baumarkt nach der Herkunft der Steine weil ich so Druck auf den Händler ausüben kann, keine Kinderarbeit zu unterstützen und nachhaltig zu produzieren \n"+
                    "Ich spende regelmäßig Geld an eine Hilfsorganisation weil ich dadurch langfristig angelegte Produkte fördere und so Lebensbedingungen in den unterstützten Regionen zu verbessern helfe.\n\n"+
                    "Nachhaltigkeit kommt in den Entwicklungsländern nicht an \nAgenda 2030: UNO setzt sich für nachhaltige Entwicklung ein \nbildet noch nicht ab: "+
                    "Wechsel-Wirkungen zwischen dem Tun und Lassen der Industrieländer und den Lebensbedingungen in den Entwicklungsländern, \"Spiellover\"-Effekte: selten in Statistik, nicht leicht nachweisbar. "+
                    "zB Klimawandel: Industriestaaten verpulvern fossile Rohstoffe und heizen damit Erdatmosphäre auf. Folgen in Entwicklungsländern: Höhere Meeresspiegel in Küstenstädten, vermehrte Dürren, Überflutungen \n"+
                    "Bertelsmann Stiftung und Forschernetzwerk SDSN machten Studie welche länder Artenvielfaltsverlust und Naturraubbau importieren: Platz 1: Luxemburg, dann: Singapur, Kuwait, Schweiz "+
                    "und welche Länder Wasservorratsausbeutung importieren: Katar, Bahrain, Oman \nDas Konsumverhalten und die Geschäftspraktiken vieler reicher Länder können die nachhaltige Entwicklung in Entwicklungs und "+
                    "Schwellenländern ernsthaft gefährden\", sagt der Ökonom Jeffrey Sachs, SDSN-Leiter. Gleichzeitig warnt Studie aber auch vor neuem Protektionismus, weil der auch eine nachhaltige Entwicklung bedroht. "+
                    "Mitautor Kroll sagt, die Welt müsse enger zusammenwachsen aber die ungewollte Wechselwirkungen minimieren.\n"+
                    "Deutschland steht in Ranking gut da bei Bildung und Infrastruktur aber nicht bei Einkommenslücke zwischen Männern und Frauen. \n"+
                    "Je Einwohner in den Industrieländern werden 18Kg Elektroschrott jährlich hinterlassen. In Burundi, Kongo oder Malawi sind es nur 200g, allerdings wird dorthin aus reichen Ländern welcher exportiert, "+
                    " um ihn von Kinderhänden nach Verwertbarem durchsuchen zu lassen."),
            new Term("Schaubildanalyse","Informationen für den ersten Abschnitt: \nTitel, Thema, Quelle, Herausgeber, Jahr, \n"+
                    "Maßeinheiten (Millionen, %, Gramm, Stunden, usw.), Art der Darstellung (Diagrammart, usw.) \n\nWesentliche Informationen: \n"+
                    "Spitzenwerte, Auffälligkeiten, Durchschnittswerte, Tendenzen / Entwicklungen \n\nErkenntnis / wichtigste Aussagen: \n"+
                    "Welche Informationen / Welches Wissen bekomme ich durch das Schaubild?"),
            new Term("Umwelt Probleme","CO₂ Klimaerwärmung \nAnstieg von Meeresspiegel, Artensterben, Hungersnöte \n\nPlastik-Müll, Mikro-Plastik \n"+
                    "Artensterben, Unabsehbare Folgen durch Mikro-Plastik, Krankheiten \n\nÖl-Pest \nArtensterben, Krankheit, Gifte für die Tiere \n\nLuftverschmutzung, "+
                    "Feinstaub \nArtensterben, Atemwegserkrankungen, Krebs \n\nÜberdüngung, giftiges Grundwasser \nArtensterben, giftiges Grundwasser, Krankheiten, Krebs")
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
    public static Term[] getTermsLF10a() {return termsLF10a; }
    public static Term[] getTermsLF11() {return termsLF11; }
    public static Term[] getTermsLF12() {return termsLF12; }
    public static Term[] getTermsLFWK() {
        return termsLFWK;
    }
    public static Term[] getTermsLFGK() { return termsLFGK; }

}
