package de.lubowiecki.playground.uebungen.wuerfelbecher;

import java.util.Arrays;

public class WuerfelbecherTest {

    public static void main(String[] args) {

        Wuerfelbecher becher = new Wuerfelbecher(100); // Konstruktor wird aufgerufen

        System.out.println(becher.wurf());
        System.out.println(becher.wurf());
        System.out.println(becher.wurf());
        System.out.println(becher.wurf());
        System.out.println(becher.wurf());

        System.out.println();

        //System.out.println(Arrays.toString(becher.wurf(20)));

        for(int wert : becher.wurf(5)) {
            System.out.println(wert);
        }

        System.out.println();

        System.out.println(NextWuerfelbecher.wurf(10));
        System.out.println(NextWuerfelbecher.wurf(6));
        System.out.println(NextWuerfelbecher.wurf(100));
        System.out.println(NextWuerfelbecher.wurf(500));

        System.out.println();

        for(int wert : NextWuerfelbecher.wurf(10, 6)) {
            System.out.println(wert);
        }
    }
}
