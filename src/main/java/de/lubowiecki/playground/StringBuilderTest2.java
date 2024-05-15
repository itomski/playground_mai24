package de.lubowiecki.playground;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); // Standard: 16

        StringBuilder sb2 = new StringBuilder("Hallo");
        System.out.println(sb2.capacity()); // Länge des Parameters des Konstruktors + 16

        StringBuilder sb3 = new StringBuilder(100); // Capacity = int Wert
        System.out.println(sb3.capacity());

        System.out.println();
        System.out.println(sb1.capacity());
        sb1.append("aaaaaaaaaaaaaaaaa"); // 17 x a
        // Änderung: alte capacity * 2 + 2
        System.out.println(sb1.capacity());
        sb1.append("aaaaaaaaaaaaaaaaaa"); // 18 x a
        // Änderung: alte capacity * 2 + 2
        System.out.println(sb1.capacity());

        // Stellt sicher, dass mindestens die gewünschte capacity vorhanden ist
        sb1.ensureCapacity(1000);
        System.out.println(sb1.capacity());

        String erg = sb1.toString(); // Inhalt des Stringbuilders wird als String zurückgegeben

        //sb1.append("..."); // An das Ende hinzufügen
        //sb1.delete(1, 10); // Löscht die Zeichen zwischen zwei Positionen
        //sb1.insert(10, "Hi"); // Fügt Ihnalt an gewüschter Position ein
        //sb1.replace(1, 5, "Neuer Inhalt"); // Ersetzt Inhalt
    }
}
