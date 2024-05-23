package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExceptionUncheckdTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("START");

        while(true) {
            System.out.print("Größe: ");
            int size = scanner.nextInt();

            try {
                char[] arr = new char[size];
                System.out.println("Das Array ist " + arr.length + " Elemente groß.");
                break;
            }
            catch(RuntimeException ex) { // Durch die Behandlung ist die Exception erledigt
                System.out.println("Ungültiger Wert");
            }
            /*
            catch (NegativeArraySizeException ex) { // Durch die Behandlung ist die Exception erledigt
                System.out.println("Ungültiger Wert");
            }
            */
        }

        while(true) {
            System.out.print("Datum: ");
            String datumStr = scanner.next();

            try {
                LocalDate datum = LocalDate.parse(datumStr);
                System.out.println("Das Datum ist: " + datum);
                break;
            }
            catch (RuntimeException ex) {
                System.out.println("Ungültige Angabe");
            }
            /*
            catch (DateTimeParseException ex) {
                System.out.println("Ungültige Angabe");
            }
            */
        }


        // Ist die Exception erledigt, kann das Programm weiter laufen

        System.out.println("ENDE");

    }
}
