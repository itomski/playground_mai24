package de.lubowiecki.playground.designpatterns.composite;

public class Quadrat extends Rechteck {

    public Quadrat(int laenge) {
        super(laenge, laenge);
    }

    public Quadrat(int x, int y, int laenge) {
        super(x, y, laenge, laenge);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrat{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(getLaenge());
        sb.append(", breite=").append(getBreite());
        sb.append('}');
        return sb.toString();
    }
}
