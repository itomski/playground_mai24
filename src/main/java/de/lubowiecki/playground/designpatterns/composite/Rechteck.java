package de.lubowiecki.playground.designpatterns.composite;

public class Rechteck extends AbstractGeoForm {

    // finale Variablen (d.h. Konstanten) müssen spätestens im Konstruktor einen Wert zugeweisen bekommen
    private final int laenge;
    private final int breite;

    public Rechteck(int x, int y, int laenge, int breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(int laenge, int breite) {
        this(0, 0, laenge, breite);
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rechteck{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(laenge);
        sb.append(", breite=").append(breite);
        sb.append('}');
        return sb.toString();
    }
}
