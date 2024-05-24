package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortedSearchTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(2,7,99,18,1,-5,19,32,120,17,300));

        System.out.println(zahlen.contains(32));

        System.out.println(zahlen.indexOf(34));

        for (int i = 0; i < zahlen.size() ; i++) {
            if(zahlen.get(i) == 99) {
                System.out.println(i);
            }
        }

        System.out.println();

        // Sammlung muss vor dem BinarySearch sortiert werden
        Collections.sort(zahlen);

        // 0...n : Index an dem der Wert gefunden wurde
        // -n : Wert wurde nicht gefunden, würde aber sonst an Pos n stehen
        // n ist die Position -1
        //int index = Collections.binarySearch(zahlen, 99);
        int index = Collections.binarySearch(zahlen, 100);
        System.out.println(zahlen);
        System.out.println(index);

    }
}
