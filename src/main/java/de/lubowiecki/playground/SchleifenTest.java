package de.lubowiecki.playground;

import java.util.Arrays;
import java.util.List;

public class SchleifenTest {

    public static void main(String[] args) {

        // int i = 0 : Wird 1x beim Start der Schleife ausgeführt
        // i < 10 : Wird bei jedem Durchlauf ausgeführt
        // bei true wird der Body ausgeführt { ... }
        // Danach i++

        for (int i = 0; i < 10; i++) {
            System.out.println("Wert: " + i);
        }

        System.out.println();

        /*
        int j = 0;
        for (; j < 10;) {
            System.out.println("Wert: " + j);
        }

        System.out.println();

        for (;;) { // Endlosschleife
            System.out.println("Wert: " + j);
        }
        */

        System.out.println();

        for (int i = 10; i > 0; System.out.println(--i)); // Body nicht nötig


        System.out.println();

        int[] arr = {5,7,8,22,19,18,100};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int wert : arr) {
            System.out.print(wert + " ");
        }

        System.out.println();

        List<String> namen = Arrays.asList("Peter", "Carol", "Bruce", "Natasha", "Tony");

        for (String name : namen) {
            System.out.print(name + " ");
        }

        System.out.println();

        for (int i = 0; i < namen.size(); i++) {
            System.out.print(namen.get(i) + " ");
        }

        System.out.println();

        System.out.println();

        // Seit Java 1.8
        namen.forEach(n -> System.out.println(n));

        // Methoden sind Funktionen, die zu einer Klasse gehören


    }
}

/*
// Freie Funktionen gibt es in Java nicht!

function xyz() { // Funktionsdefinition
    //...
}

xyz(); // Funktionsaufruf
*/