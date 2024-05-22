package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {

        //Movable m1 = new Movable(); // Error: Interfaces können nicht instanziert werden
        Tier t1 = new Tier("Peter");
        System.out.println(t1);
        t1.moveTo(100, 200);
        System.out.println(t1);

        Flugzeug f1 = new Flugzeug("EX2217");
        System.out.println(f1);
        f1.moveTo(100, 200);
        f1.setZ(10_000);
        System.out.println(f1);

        // m1 = f1; // Flugzeug ist kein Tier

        Movable m1 = new Tier("Bruce");
        m1 = new Flugzeug("EX2217");
        m1.moveTo(300, 300);

        // List Beispiel


        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(5);
        zahlen.add(22);

        //zahlen = new LinkedList<>(); // Error: LinkedList ist keine ArrayList

        // Alternative
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(1);
        zahlen2.add(5);
        zahlen2.add(22);

        zahlen2 = new LinkedList<>(); // LinkedList ist auch eine List

        System.out.println();

        // List<Movable>: Referenztyp
        // ArrayList<>: Objekttyp
        List<Movable> sammlung = new ArrayList<>();
        sammlung.add(new Tier("Joshi"));
        sammlung.add(new Tier("Ödi"));
        sammlung.add(new Tier("Otto"));
        sammlung.add(new Flugzeug("EX2299"));
        sammlung.add(new Flugzeug("IYZZ9916"));
        sammlung.add(new Flugzeug("ABLM2237"));

        System.out.println(sammlung);

        for(Movable m : sammlung) {
            m.moveTo(50, 100);
        }

        System.out.println(sammlung);
    }
}

interface Movable {

    void moveTo(int x, int y); // abstrakte Methode

}

class Tier implements Movable {

    private String name;

    private int x;

    private int y;

    public Tier(String name) {
        this.name = name;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}

class Flugzeug implements Movable {

    private String nr;

    private int x;

    private int y;

    private int z;

    public Flugzeug(String nr) {
        this.nr = nr;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flugzeug{");
        sb.append("nr='").append(nr).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z=").append(z);
        sb.append('}');
        return sb.toString();
    }
}