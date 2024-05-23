package de.lubowiecki.playground;

public class ConsoleUtilTest {

    public static void main(String[] args) {

        String v1 = ConsoleInputUtils.inputString(null);
        //String v1 = ConsoleInputUtils.inputString("Name", 0, 10, "Das war nix...");
        //int v2 = ConsoleInputUtils.inputInt("Alter", "Falsche Eingabe");
        //int v3 = ConsoleInputUtils.inputInt("Alter", 0, 100, "Falsche Eingabe");

        //String v4 = ConsoleInputUtils.inputString("Name", "[a-zA-Z]*", "Falche Eingabe");
        String v4 = ConsoleInputUtils.inputString("Name", "[a|b|c]{1}", "Falche Eingabe");
    }
}
