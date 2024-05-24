package de.lubowiecki.playground.time;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class InstantTest {

    public static void main(String[] args) {

        //long start = System.currentTimeMillis();

        Instant start = Instant.now();

        int[] arr = new int[100_000_000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        //long end = System.currentTimeMillis();
        //System.out.println(end - start + "ms");

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toNanos() + "ns");
    }
}
