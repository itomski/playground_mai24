package de.lubowiecki.playground.designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Gruppe implements Movable {

    private ArrayList<Movable> elemente = new ArrayList<>();

    public void add(Movable obj) {
        elemente.add(obj);
    }

    public void add(Movable... obj) {
        elemente.addAll(Arrays.asList(obj));
    }

    @Override
    public void bewegeAn(int x, int y) {

        for(Movable obj : elemente) {
            obj.bewegeAn(x, y);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gruppe{");
        sb.append("elemente=").append(elemente);
        sb.append('}');
        return sb.toString();
    }
}
