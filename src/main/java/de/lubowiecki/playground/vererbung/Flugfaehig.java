package de.lubowiecki.playground.vererbung;

import java.io.IOException;

public interface Flugfaehig {

    int zahl = 100; // automatisch: public static final

    boolean landen(); // public abstrakte Methode (d.h. noch nicht fertig)
    boolean starten();

    // default Methoden sind Instanzmethoden
    default void kursAendern() {
        System.out.println("Kurs wird geändert");
    }

    // Seit Java 1.8 können auch Default-Methoden eingabeut werden

    // Seit Java 1.7 können auch statische Methoden eingabeut werden

}

interface TowerKommunikation {

    void positionMitteilen();
    void anweisungenAbfragen();
}

// Überladen von Methoden: Einbau einer Methode mit gleichen Namen aber anderer Parameterliste

// Überschrieben von Methoden: Geerbte Methode wird in der Kindklasse ersetzt (gleichen Name, gleiche Parameter)


// Fasst mehrere Interfaces zusammen
// Eine Klasse, die FlughafenKompatibel implementiert muss alle Methoden der Sub-Interfaces bereitstellen
interface FlughafenKompatibel extends Flugfaehig, TowerKommunikation {
}

class A370 implements FlughafenKompatibel {

    // Geerbte abstrakte Methoden MÜSSEN hier eingebaut werden!

    // Beim Überschrieben git es nur bei komplexen Rückgabetypen Variationen (Kovariante Typen)
    // Bei primitiven muss der Typ gleich bleiben

    @Override
    public boolean landen() {
        return false;
    }

    @Override
    public boolean starten() {
        return false;
    }

    @Override
    public void positionMitteilen() {

    }

    @Override
    public void anweisungenAbfragen() {

    }

}