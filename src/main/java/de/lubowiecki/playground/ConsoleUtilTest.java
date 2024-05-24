package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConsoleUtilTest {

    public static void main(String[] args) {

        //String v1 = ConsoleInputUtils.inputString(null);
        //String v1 = ConsoleInputUtils.inputString("Name", 0, 10, "Das war nix...");
        //int v2 = ConsoleInputUtils.inputInt("Alter", "Falsche Eingabe");
        //int v3 = ConsoleInputUtils.inputInt("Alter", 0, 100, "Falsche Eingabe");

        //String v4 = ConsoleInputUtils.inputString("Name", "[a-zA-Z]*", "Falche Eingabe");
        //String v4 = ConsoleInputUtils.inputString("Name", "[a|b|c]{1}", "Falche Eingabe");

        LocalDate v5 = ConsoleInputUtils.inputDate("Geburtsdatum", "Kein gültiges Datum.");
        System.out.println(v5);

        LocalTime v6 = ConsoleInputUtils.inputTime("Start", "Keine gültige Zeit.");
        System.out.println(v6);
    }
}
