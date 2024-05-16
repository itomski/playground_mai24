package de.lubowiecki.playground;

import java.util.Scanner;

public class SwitchTest {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new SwitchTest().run();
    }

    private void run() {

        System.out.print("Eingabe: ");

        // Ganzzahlen (byte, short, int, char, String, Enums)
        switch(scanner.next().trim().toLowerCase()) {
            case "add":
                System.out.println("add");
                break;

            case "sub":
                System.out.println("sub");
                break;

            case "multi":
                System.out.println("multi");
                break;

            case "div":
                System.out.println("div");
                break;

            default:
                System.out.println("Ungültige Eingabe");
        }

        byte b1 = 100;

        switch(b1) {
            case 10:
                System.out.println("1..");
                break;

            case 20:
                System.out.println("2..");
                break;

            case 30:
                System.out.println("3..");
                break;

            case 100:
                System.out.println("10..");
                break;

            /*
            case 130: // ist kein byte
                System.out.println("13..");
                break;
             */

            default:
                System.out.println("Ungültige Eingabe");
        }

        Wochentag w = Wochentag.DI;
        System.out.println(w);

        wieLangeNochBisWochchenende(Wochentag.DO);

    }

    private void wieLangeNochBisWochchenende(Wochentag tag) {

        switch(tag) {
            case MO:
                System.out.println("Montag");
                //break;

            case DI:
                System.out.println("Dienstag");
                //break;

            case MI:
                System.out.println("Mittwoch");
                //break;

            case DO:
                System.out.println("Donnerstag");
                //break;

            case FR:
                System.out.println("Freitag");
                break;

            case SA:
            case SO:
                System.out.println("Wochenende!!!!!");
        }
    }
}
