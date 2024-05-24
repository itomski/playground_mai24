package de.lubowiecki.playground;

import java.time.LocalDate;

public class HashCodeTest {

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(o);

        System.out.println();

        String s1 = new String("Hallo");
        String s2 = new String("Hallo");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        System.out.println();

        LocalDate ld1 = LocalDate.of(2000, 10, 15);
        System.out.println(ld1.hashCode());
        LocalDate ld2 = LocalDate.of(2000, 10, 15);
        System.out.println(ld2.hashCode());
        System.out.println(ld1.equals(ld2));

        System.out.println();

        Fahrzeug f1 = new Fahrzeug("AB:CD123", "VW", "Polo", 2000);
        System.out.println(f1.hashCode());
        Fahrzeug f2 = new Fahrzeug("AB:CD123", "Renault", "Zoe", 2000);
        System.out.println(f2.hashCode());
        System.out.println(f1.equals(f2));
    }
}
