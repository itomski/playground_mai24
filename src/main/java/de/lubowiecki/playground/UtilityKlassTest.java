package de.lubowiecki.playground;

import java.util.Arrays;

public class UtilityKlassTest {

    public static void main(String[] args) {

        // Klassen, von denen keine Objekte erzeugt werden sollen, haben einen privaten Konstruktor

        //Arrays arr = new Arrays();

        int[] intArr = {5,7,9,1,-18,99};
        Arrays.sort(intArr); // sort ist stataisch
        System.out.println(Arrays.toString(intArr));


    }
}
