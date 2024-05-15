package de.lubowiecki.playground;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker", 25);
        // Objekt wird automatisch mit toString in eine Zeichenkette konvertiert
        // Stellt das Objekt keine eigene toString-Methode bereit,
        // wird die aus der Klasse Objekt verwendet
        System.out.println(p1);

        Person p2 = new Person("Bruce", "Banner", 35);
        System.out.println(p2);

        // machWas();
    }

    private static void machWas() {
        int a = 10;
        int b = 20;
        machWas(); // rekursiver Aufruf
    }
}
