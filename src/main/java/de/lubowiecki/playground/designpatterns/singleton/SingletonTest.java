package de.lubowiecki.playground.designpatterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        //SingletonBox sb1 = new SingletonBox(); // sb1 ist eine lokale Variable
        SingletonBox sb1 = SingletonBox.getInstance();
        sb1.setContent("Montag");

        System.out.println(sb1.getContent());

        aendereBoxInhalt();

        System.out.println(sb1.getContent());
    }

    private static void aendereBoxInhalt() {
        // getInstance liefert immer das gleiche Objekt!
        SingletonBox.getInstance().setContent("Dienstag");

        aendereBoxInhaltNochMal();
    }

    private static void aendereBoxInhaltNochMal() {
        SingletonBox.getInstance().setContent("Mittwoch");
    }
}
