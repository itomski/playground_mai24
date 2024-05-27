package de.lubowiecki.playground.designpatterns.composite;

public class Kreis extends AbstractGeoForm {

    private final int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Kreis(int radius) {
        this(0, 0, radius);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
