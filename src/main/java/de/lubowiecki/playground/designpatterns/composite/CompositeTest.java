package de.lubowiecki.playground.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        AbstractGeoForm obj1 = new Rechteck(100, 75);
        System.out.println(obj1);
        obj1.bewegeAn(25, 27);
        System.out.println(obj1);

        System.out.println();

        AbstractGeoForm obj2 = new Quadrat(45); // Quadrat ist von Rechteck abgeleitet
        System.out.println(obj2);
        obj2.bewegeAn(25, 27);
        System.out.println(obj2);

        System.out.println();

        AbstractGeoForm obj3 = new Kreis(100);
        System.out.println(obj3);
        obj3.bewegeAn(200,220);
        System.out.println(obj3);


        System.out.println();

        if(obj3 instanceof Kreis) { // ist obj3 auf dem Heap ein Kreis?
            Kreis k1 = (Kreis) obj3;
            System.out.println(k1.getRadius());
        }

        System.out.println();

        Gruppe gr1 = new Gruppe();
        gr1.add(obj1);
        gr1.add(obj2, obj3);

        gr1.bewegeAn(10, 10);

        System.out.println(gr1);
    }
}
