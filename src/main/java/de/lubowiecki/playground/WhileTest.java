package de.lubowiecki.playground;

public class WhileTest {

    public static void main(String[] args) {

        // Statische Methoden werden auf der Klasse ausgeführt
        WhileTest.doSomethingStatic();

        // Instanzmethoden brauchen zuerst ein Objekt der Klasse
        WhileTest test = new WhileTest();
        test.doSomethingInstance();
    }

    public static void doSomethingStatic() {
        System.out.println("Static While");

        while(oneMoreTime()) { // Kopfgesteuert
            System.out.println("Hi");
        }

        System.out.println("---");

        // wird mind. 1x ausgeführt
        do {
            System.out.println("Hi");
        }
        while(oneMoreTime()); // Fußgesteuert
    }

    public void doSomethingInstance() {
        System.out.println("567");
    }

    static boolean oneMoreTime() {
        int rand = (int)(Math.random() * 6) + 1;
        return rand > 3;
    }
}

/* Weitere nicht public Klassen in gleicher Datei: Möglich aber keine gute Idee
class Xyz {

}
*/

