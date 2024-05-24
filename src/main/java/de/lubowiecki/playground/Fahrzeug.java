package de.lubowiecki.playground;

import java.util.Objects;

public class Fahrzeug implements Comparable<Fahrzeug> {  // Comparable regelt die natürliche Reihenfolge

    // Eigenschaften
    private String kennzeichen;
    private String marke;
    private String typ;
    private int baujahr;

    // Java stellt automatisch einen parameterlosen Konstruktor bereit,
    // wenn kein eigener erzeugt wurde

    /*
    // default Konstruktor
    public Fahrzeug() {
        super();
    }
    */

    // Konstruktoren haben keinen Rückgabetyp, da sie immer ein Objekt der eigenen Klasse zurückgeben
    public Fahrzeug() {
        kennzeichen = "Unbekannt";
        baujahr = 2000;
    }

    /**
     * Erzeugt ein Fahrzeug Objekt
     * @param k Kennzeichen
     * @param marke
     * @param typ
     * @param baujahr
     */
    public Fahrzeug(String k, String marke, String typ, int baujahr) {
        kennzeichen = k;
        // marke: Lokale Variable / Parameter
        // this.marke: Instanzvariable
        this.marke = marke;
        this.typ = typ;
        this.baujahr = baujahr;
    }

    public Fahrzeug(String marke, String typ) {
        this.marke = marke;
        this.typ = typ;
    }

    // Wird automatisch bei einer Ausgabe verwendet
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append('}');
        return sb.toString();
    }

    // hashCode und equals MÜSSEN auf gleichen Eigenschaften basieren

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return baujahr == fahrzeug.baujahr && Objects.equals(kennzeichen, fahrzeug.kennzeichen) && Objects.equals(marke, fahrzeug.marke) && Objects.equals(typ, fahrzeug.typ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kennzeichen, marke, typ, baujahr);
    }

    @Override
    public int compareTo(Fahrzeug other) {
        // 0 : Objekte gelten als gleich
        // -n : Objekt ist kleiner als das Vergleichobjekt
        // +n : Objekt ist größer als das Vergleichobjekt
        //return kennzeichen.compareTo(other.kennzeichen); // Basis ist das Kennzeichen
        //return baujahr - other.baujahr; // Basis ist das Baujahr
        return kennzeichen.length() - other.kennzeichen.length(); // Basis ist die Länge des Kennzeichens
    }
}
