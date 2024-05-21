package de.lubowiecki.playground.uebungen.wuerfelbecher;

import java.util.Random;

public class NextWuerfelbecher {

    private static final Random randGen = new Random();

    public static int wurf(int augen) {
        return randGen.nextInt(augen) + 1;
    }

    public static int[] wurf(int anzahl, int augen) {

        int[] wuerfe = new int[anzahl]; // Array in passender Größe wird gebaut

        // Array wird mit Zufallszahlen befüllt
        for (int i = 0; i < wuerfe.length; i++) {
            wuerfe[i] = wurf(augen);
        }

        // Array wird an den Aufrufer zurückgegeben
        return wuerfe;
    }
}
