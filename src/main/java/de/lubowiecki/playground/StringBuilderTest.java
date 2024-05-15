package de.lubowiecki.playground;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str1 = "Hallo";
        String str2 = " ";
        String str3 = "Welt";
        // Srtring ist nicht veränderbar

        System.out.println(str1 + str2 + str3); // + produziert 2 neue Strings

        System.out.println();

        // Überall, wo ein String stuffenweise verändert werden soll,
        // sollte lieber ein StringBuilder verwendet werden!!!
        // StringBuilder ist veränderbar

        StringBuilder sb = new StringBuilder();
        sb.append("Hallo");

        sb.append(" ").append("Welt");

        System.out.println(sb); // Produziert 1 StringBuilder Objekt

        System.out.println(sb.capacity()); // Interne Größe
        System.out.println(sb.length()); // Anzahl Zeichen

        // wird die capacity überschritten muss sie (interne Array vergrößert werden)

    }
}
