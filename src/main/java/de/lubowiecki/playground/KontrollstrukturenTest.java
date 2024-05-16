package de.lubowiecki.playground;

public class KontrollstrukturenTest {

    public static void main(String[] args) {

        int zahl = 100;

        // Seit Java 1.9
        var zahl2 = 200; // Kompiler ermittelt automatisch den Datentyp
        // zahl2 = 10.0; // Nicht erlaubt, da zahl2 int ist

        if(zahl == 100) {
            System.out.println("Zahl ist 200");
        }
        if(zahl == 200) {
            System.out.println("Zahl ist 200");
        }

        // Bedingungen schließen sich gegenseitig aus
        if(zahl == 100) {
            System.out.println("Zahl ist 100");
        }
        else if(zahl == 200) {
            System.out.println("Zahl ist 200");
        }
        else {
            System.out.println("Andere Zahl");
        }

        System.out.println((zahl == 100) ? "OK" : "NICHT OK");
        System.out.println("Das ist " + ((zahl == 100) ? "OK" : "NICHT OK"));
        String erg = (zahl == 100) ? "OK" : "NICHT OK";

        /*
        while(true) { // Kompiler erkennt eine Entlosschleife
            System.out.println("...");
        }
        */

        /*
        boolean run = true;

        while(run) { // Kompiler erkennt die Entlosschleife nicht! Er sieht nur den datentyp der Variable
            System.out.println("...");
        }
        */

        final boolean run = true; // Kompiletime-Konstante

        final boolean run2;
        run2 = true; // Runtime-Konstante = Wert ist erst zur Laufzeit bekannt

        System.out.println(run);
        System.out.println(run2);

        while(run) { // Kompiler erkennt die Entlosschleife! Kompieler sieht den Wert hiter der Konstante
            System.out.println("...");
        }

        //System.out.println("Ende");


    }
}
