package de.lubowiecki.playground.jdbc;

import java.util.Scanner;

public class App {

    private FahrzeugCrud crud;
    private final Scanner scanner;

    public App() {
        try {
            crud = new FahrzeugCrud();
        }
        catch(Exception e) {
            System.out.println("Probleme mit der Datenbank");
            System.exit(0);
        }
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {

        app: while(true) {

            try {
                System.out.print("Auswahl: ");

                switch (scanner.nextLine().toLowerCase()) {

                    case "n":
                        if (crud.insert(create())) {
                            System.out.println("Fahrzeug wurde gespeichert.");
                        }
                        break;

                    case "q":
                        break app;

                    // Weitere Cases

                    default:
                        System.out.println("Falsche Auswahl");
                }
            }
            catch (Exception e) {
                System.out.println("Problem: " + e.getMessage());
            }
        }

        System.out.println("Programm wird beendet.");
    }

    private Fahrzeug create() {
        Fahrzeug fahrzeug = new Fahrzeug();
        System.out.print("Kennzeichen: ");
        fahrzeug.setKennzeichen(scanner.nextLine());
        System.out.print("Marke: ");
        fahrzeug.setMarke(scanner.nextLine());
        System.out.print("Typ: ");
        fahrzeug.setTyp(scanner.nextLine());
        System.out.print("Baujahr: ");
        fahrzeug.setBaujahr(scanner.nextInt());
        scanner.nextLine(); // fix
        return fahrzeug;
    }
}
