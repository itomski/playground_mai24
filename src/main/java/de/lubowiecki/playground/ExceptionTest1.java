package de.lubowiecki.playground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {

    public static void main(String[] args) {

        System.out.println("START");

        //int i = 100.0; // Kompilererror

        // Unchecked Exceptions: Der Entwickler kann selbst entscheiden,
        // ob eine eine Behandlung einbaut

        //String s = null;
        //System.out.println(s.toUpperCase()); // NullPointerException

        //int[] arr = {1,2,3,4,5};
        //System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

        //int[] arr = new int[-10]; // NegativeArraySizeException

        /*
        int a = 10;
        int b = 0;
        System.out.println(a / b); // ArithmeticException
        */


        // Checked Exceptions: Java zwingt uns zur Behandlung
        try {
            // Sourcecode, der eine Checked Exception produzieren könnte
            FileInputStream in = new FileInputStream("data.txt");
            // Entsteht hier eine Exception wird der rest des try-Blocks nicht abgearbeitet
            // Java springt dann sofort in einen passenden catch-Block
            System.out.println("...");
        }
        catch (IOException e) {
            // Block für die Behandlung der Exception
            System.out.println("Problem");
        }

        // Taucht eine Exception auf und wird nicht behandelt, dann beendet sie das Programm

        System.out.println("ENDE");

    }
}
