package de.lubowiecki.playground.uebungen.wuerfelbecher;

import java.util.Random;

public class Wuerfelbecher {

    // byte
    // short
    // int
    // long

    private final int AUGEN; // Instanzvariable
    private final Random randGen; // Instanzvariable

    // Aufgabe des Konstruktors ist das Objekt mit passenden Startwerten zu befüllen
    public Wuerfelbecher(int augen) {
        AUGEN = augen;
        randGen = new Random();
    }

    public Wuerfelbecher() {
        this(6); // ruft einen anderen Konstruktor mit Parametern auf
        //AUGEN = 6;
        //randGen = new Random();
    }

    // Methode:
    // public: außerhalb dieser Klasse verwendbar
    // int: gibt eine Ganzzahl zurück
    // wurf: Name der Methode
    // (): Nimmt keine Parameter entgegen
    public int wurf() {
        return randGen.nextInt(AUGEN) + 1;
        //return randGen.nextInt(-15, AUGEN) + 1;
    }

    public int[] wurf(int anzahl) {

        int[] wuerfe = new int[anzahl]; // Array in passender Größe wird gebaut

        // Array wird mit Zufallszahlen befüllt
        for(int i = 0; i < wuerfe.length; i++) {
            wuerfe[i] = wurf();
        }

        // Array wird an den Aufrufer zurückgegeben
        return wuerfe;
    }
}
