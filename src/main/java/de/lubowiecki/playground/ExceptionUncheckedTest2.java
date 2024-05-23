package de.lubowiecki.playground;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionUncheckedTest2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("START");

        System.out.print("Größe: ");
        int size = scanner.nextInt();

        try {
            char[] arr = new char[size];
            Arrays.fill(arr, 'X');

            System.out.print("Pos: ");
            int pos = scanner.nextInt();

            System.out.println("Der Wert ist: " + arr[pos]);
        }
        catch(NegativeArraySizeException ex) {
            System.out.println("Größe darf nicht negativ sein!");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Position ist ungültig.");
        }
        catch(RuntimeException ex) {
            System.out.println("Anderes Problem");
        }

        System.out.println("ENDE");

    }

}
