package de.lubowiecki.playground.uebungen.taschenrechner;

import java.util.Arrays;

public class Taschenrechner {

    // PascalCase: Klassen, Interfaces, Enums
    // camelCase: Variablen und Methoden (Methoden haben eine Parameter-Klammer)
    // snake_case: wird in Java nicht benutzt
    // SCREAMING_SNAKE_CASE: public Konstanten

    // private static int zahl = 100; // Klassenvariable (static)
    // private int andereZahl = 200; // Instanzvariable (nicht static)

    private static final StringBuilder protokoll = new StringBuilder();

    private static final String ROW_TPL = "| %10s | %10s | %4s | %10s | \n";


    public static double add(double a, double b) {
        double erg = a + b;
        addToProtokoll('+', a, b, erg);
        return erg;
    }

    public static double sub(double a, double b) {
        double erg = a - b;
        addToProtokoll('-', a, b, erg);
        return erg;
    }

    public static double div(double a, double b) {
        double erg = a / b;
        addToProtokoll('/', a, b, erg);
        return erg;
    }

    /*
    public double div(double a, double b) { // Instanzmethode (nicht static)
        return a / b;
    }
    */

    public static double multi(double a, double b) { // Klassenmethode (static)
        double erg = a * b;
        addToProtokoll('*', a, b, erg);
        return erg;
    }

    private static void addToProtokoll(char op, double a, double b, double erg) {
        protokoll.append(a)
                .append(" ")
                .append(op)
                .append(" ")
                .append(b)
                .append(" = ")
                .append(erg)
                .append("\n");
    }

    public static StringBuilder getProtokoll() {
        return protokoll;
    }

    public static String getProtokollAsTable() {
        String[] rows = protokoll.toString().split("\n");

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(ROW_TPL, "A", "B", "OP", "ERG"))
           .append("-----------------------------------------------\n");

        for(String row : rows) {
            String[] cells = row.split(" ");
            sb.append(String.format(ROW_TPL, cells[0], cells[2], cells[1], cells[4]));
        }

        return sb.toString();
    }
}
