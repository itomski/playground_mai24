package de.lubowiecki.playground;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "   Hallo Super String    ";
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println("#" + s1 + "#");

        // Entfernt Steuer- und Leerzeichen an beiden Enden
        System.out.println("#" + s1.trim() + "#");

        // Zeichen an Position x
        System.out.println(s1.trim().charAt(0));
        System.out.println(s1.charAt(5));

        // Liefert den Index eines Zeichen (erstes Vorkommen)
        System.out.println(s1.indexOf("S"));
        System.out.println(s1.lastIndexOf("S"));
        System.out.println(s1.indexOf("S", 10));

        System.out.println(s1.substring(10)); // Zeichenkette ab Index 10 bis Ende
        System.out.println(s1.substring(10, 12)); // Zeichenkette ab Index 10 bis Index 12

        System.out.println();

        String s2 = "Hallo";
        final String S3 = " Welt"; // Konstante (final) - Wert kann nicht geändert werden

        String s4 = "Hallo Welt";

        String s5 = "Hallo" + S3; // wird ggfl. zur Kompile-Zeit zusammengesetzt
        System.out.println(s4.equals(s5)); // Gleicher Inhalt?
        System.out.println(s4 == s5); // Gleiches Objekt?

        System.out.println();

        String s6 = "Hallo".concat(S3); // Wird zur Laufzeit verknüpft
        System.out.println(s4.equals(s6)); // Gleicher Inhalt?
        System.out.println(s4 == s6); // Gleiches Objekt?

        System.out.println();

        String namen = "Peter,Bruce,Carol,Tony,Natasha,Scott";
        String[] namenArr = namen.split(","); // Zerlegt den String in Eizelteile
        System.out.println(namenArr); // toString wird automatisch benutzt

        // toString von der Hilfsklasse Arrays wird verwendet
        System.out.println(Arrays.toString(namenArr));
        System.out.println(namenArr[2]);

        System.out.println();

        namen = namen.replace(",", "|"); // Ersetzt n Zeichen
        System.out.println(namen);

        System.out.println();

        final String ROW = "| %12s | %-12s | %6d | %6.2f kg | \n"; // Template

        // Es findet sofort eine Ausgabe statt
        System.out.printf(ROW, "Peter", "Parker", 25, 75.1234);
        System.out.printf(ROW, "Bruce", "Banner", 35, 180.05);
        System.out.printf(ROW, "Carol", "Danvers", 31, 69.5);

        System.out.println();

        // Liefert einen formatierten String zurück
        String fmtStr = String.format(ROW, "Peter", "Parker", 25, 75.1234); // statische Methode
        System.out.println(fmtStr);

    }
}
