package de.lubowiecki.playground;

import java.time.Period;

public class ModuloTest {

    public static void main(String[] args) {
        int x = -10;
        System.out.println(x%(-3));
        System.out.println(x%(3));

        // int _ = 10; // in Java 1.8 noch erlaubt
        int $_abc = 100;

        int i = 0;
        int j = 10;
        float f = 10.0f;

        //System.out.println(j/i); // Ganzzahlen / 0 = Exception
        System.out.println(f/i); // Gleitkommazahl / 0 = Infinity

        System.out.println();

        Integer y = 100;

        System.out.println(Integer.SIZE);
        System.out.println(y.BYTES);

        Boolean.valueOf("TRUE");

        System.out.println(Period.of(1,1,0).getMonths());
        System.out.println(Period.of(1,1,0).toTotalMonths());

    }

}
