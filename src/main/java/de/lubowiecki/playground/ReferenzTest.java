package de.lubowiecki.playground;

public class ReferenzTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // Bei primitiven Datentypen
        System.out.println(a == b); // Wertevergleich
        // System.out.println(a.equals(b)); // primitive Datentypen haben keine Methoden


        String s1 = "Hallo"; // Landet im Pool
        String s2 = "Hallo"; // Objekt im Pool wird referenziert
        String s3 = new String("Hallo"); // Landet nicht im Stringpool

        // Bei Objekten (komplexen Datentypen)
        System.out.println(s1 == s2); // Referenzvergleich
        System.out.println(s1.equals(s2)); // Wertvergleich
        System.out.println();

        // Bei Objekten
        System.out.println(s1 == s3); // Referenzvergleich
        System.out.println(s1.equals(s3)); // Wertvergleich
        System.out.println();

        s2 = "Hallo Welt";

        // Wenn ein String manipuliert wird, wird ein neues Objekt erzeugt
        // Will man es später verwenden, muss es auf eine Variable zugewiesen werden
        s2 = s2.toUpperCase();
        System.out.println(s2);
    }
}
