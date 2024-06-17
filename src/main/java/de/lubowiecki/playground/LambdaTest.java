package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class LambdaTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(1,7,99,18,22,9,18,27,100,101));

        zahlen.removeIf(i -> i > 10 && i < 30);
        zahlen.forEach(v -> System.out.println(v));

        System.out.println();

        Random rand = new Random();
        //System.out.println(rand.nextInt(100) + 1);

        IntStream.generate(() -> rand.nextInt(100) + 1)
                .forEach(v -> System.out.println(v));


    }
}
