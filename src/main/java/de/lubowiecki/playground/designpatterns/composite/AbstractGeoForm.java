package de.lubowiecki.playground.designpatterns.composite;

public abstract class AbstractGeoForm implements Movable {

    private int x;
    private int y;

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void bewegeAn(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
