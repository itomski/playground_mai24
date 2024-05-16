package de.lubowiecki.playground.uebungen.taschenrechner;

import java.util.Scanner;

public class App {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {

        while(true) {
            System.out.print("Operation [add, sub, multi, div, protokoll, exit]: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break; // bricht die Schleife ab
            }
            else if (input.equals("protokoll")) {
                //System.out.println(Taschenrechner.getProtokoll());
                System.out.println(Taschenrechner.getProtokollAsTable());
                continue;
            }

            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();

            scanner.nextLine(); // fix

            runOperation(input, a, b);
        }

        System.out.println("Programm wird beendet.");
    }

    private void runOperation(String op, double a, double b) {

        if (op.equals("add")) {
            System.out.println(Taschenrechner.add(a, b));
        }
        else if (op.equals("sub")) {
            System.out.println(Taschenrechner.sub(a,b));
        }
        else if (op.equals("multi")) {
            System.out.println(Taschenrechner.multi(a, b));
        }
        else if (op.equals("div")) {
            System.out.println(Taschenrechner.div(a, b));
        }
        else {
            System.out.println("Falsche Auswahl!");
        }
    }
}
