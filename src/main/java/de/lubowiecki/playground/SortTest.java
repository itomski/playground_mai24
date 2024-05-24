package de.lubowiecki.playground;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        // List.of seit Java 9
        List<String> namen = new ArrayList<>(List.of("Peter", "Carol", "Bruce", "Natasha", "Scott"));

        // Arrays.asList vor Java 9
        //List<String> namen = new ArrayList<>(Arrays.asList("Peter", "Carol", "Bruce", "Natasha", "Scott"));

        System.out.println(namen);

        // Sortierung nach der natürlichen Reihenfolge der Objekte
        Collections.sort(namen); // Collections: Hilfsklasse für Sammlungen
        System.out.println(namen);

        System.out.println();

        List<Integer> zahlen = new ArrayList<>(List.of(20,100,70,-15,22,8,2,0));
        System.out.println(zahlen);

        // Sortierung nach der natürlichen Reihenfolge der Objekte
        Collections.sort(zahlen);
        System.out.println(zahlen);

        System.out.println();

        List<LocalDate> meetings = new ArrayList<>();
        meetings.add(LocalDate.of(2000, 10, 15));
        meetings.add(LocalDate.of(2020, 1, 1));
        meetings.add(LocalDate.of(1999, 7, 3));
        meetings.add(LocalDate.of(1999, 7, 1));
        meetings.add(LocalDate.of(2020, 1, 1));
        meetings.add(LocalDate.of(1832, 5, 30));

        LocalDate ld1 = meetings.get(1);
        LocalDate ld2 = meetings.get(5);
        LocalDate ld3 = meetings.get(4);
        System.out.println(ld1.compareTo(ld2));
        System.out.println(ld2.compareTo(ld1));
        System.out.println(ld1.compareTo(ld3));


        System.out.println(meetings);

        // Sortierung nach der natürlichen Reihenfolge der Objekte
        Collections.sort(meetings);
        System.out.println(meetings);

        System.out.println();

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Fahrzeug("AB:CD123", "VW", "Polo", 2000));
        fahrzeuge.add(new Fahrzeug("HH:XY220", "Renault", "Zoe", 2020));
        fahrzeuge.add(new Fahrzeug("HB:CD667", "Ford", "Mondeo", 1998));
        fahrzeuge.add(new Fahrzeug("B:CZ887", "Jaguar", "X-Type", 2010));
        fahrzeuge.add(new Fahrzeug("M:BX228", "BMW", "5er", 2017));

        System.out.println(fahrzeuge);
        Collections.sort(fahrzeuge); // Klasse MUSS das Comaparable-Interface implementieren

        System.out.println(fahrzeuge);
    }
}
