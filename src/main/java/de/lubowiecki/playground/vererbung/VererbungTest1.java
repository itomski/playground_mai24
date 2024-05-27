package de.lubowiecki.playground.vererbung;

public class VererbungTest1 {

    public static void main(String[] args) {

        Hund h1 = new Hund(); // Hundobjekt besteht aus einem Object, einem Tier und Hund
        h1.setAlter(5);
        h1.setName("Max");

        System.out.println(h1.getName() + ", " + h1.getArt() + ", " + h1.getAlter());
        h1.fuehreEinenTrickAus();

        // Tier: Referenztyp
        // Hund: Objekttyp auf dem Heap
        Tier t1 = new Hund();
        t1.setName("Bella"); // Über eine Referenz vom Typ Tier sind nur Methen von Tier sichtbar
        // t1.fuehreEinenTrickAus(); // Error: über t1 nicht sichtbar

        System.out.println();
        Affe a1 = new Affe();
        a1.setName("Boby");
        a1.esseDieBanane();

        t1 = a1; // Ok, da ein Affe auch ein Tier ist

        //String s = a1; // Error: Ist ein Affe ein String? NEIN!

        // t1 = new Tier(); // Tier-Klasse ist eine Basis für Vererbung kann aber nicht direkt instanziert werden
    }

}

abstract class Tier {

    // public, package-private und protected Eigenschaften werden an Kindklassen vererbt

    private String name;
    private String art;
    private int alter;

    public Tier() {
        // super(); // Zuerst wird der Konstruktor der Elternklasse ausgeführt
        System.out.println("C: Tier");
    }

    public Tier(String name) {
        this(); // Ruft den parameterlosen Konstruktor der eigenen Klasse auf
        this.name = name;
    }

    // public abstract String getName(); // abstrakte Methode - Muss in der Kindklasse eingebaut werden

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}

class Hund extends Tier { // Klassenvererbung


    public Hund() {
        // super(); // Zuerst wird der Konstruktor der Elternklasse ausgeführt
        // name = "Max"; // private Eigenschaften der Elternklasse sind in der Kindklasse nicht verfügbar
        System.out.println("C: Hund");
        super.setArt("Hund"); // Verwendet die setArt-Methode aus der Elternklasse
        //setArt("Hund"); // Sucht die Methode zuerst in dieser Klasse

        // super: Objekt der Elternklasse
    }

    public void fuehreEinenTrickAus() {
        System.out.println(getName() + ": setzt sich.");
    }

    // Geerbte setArt-Methode weird mit einer anderen Inmplementierung ersetzt/überschrieben
    @Override
    public void setArt(String art) {
        throw new UnsupportedOperationException("Hund kann kein anderes Tier werden");
    }
}

class Affe extends Tier { // Klassenvererbung


    public Affe() {
        System.out.println("C: Affe");
        setArt("Affe");
        // super: Objekt der Elternklasse
    }

    public void esseDieBanane() {
        System.out.println(getName() + ": ist Banane.");
    }
}