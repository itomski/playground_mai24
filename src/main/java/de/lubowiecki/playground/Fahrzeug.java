package de.lubowiecki.playground;

public class Fahrzeug {

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
}
