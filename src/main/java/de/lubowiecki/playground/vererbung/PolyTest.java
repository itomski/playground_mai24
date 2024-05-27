package de.lubowiecki.playground.vererbung;

public class PolyTest {

    public static void main(String[] args) {

        Roboter roboter = new Roboter();
        begruessung(roboter); // Roboter implementiert das Hallo-Interface

        Politiker politiker = new Politiker();
        begruessung(politiker); // Politiker implementiert das Hallo-Interface

        begruessung(new NorddeutscherBauer()); // NorddeutscherBauer implementiert das Hallo-Interface
    }

    private static void begruessung(Hallo obj) {
        obj.sagHallo();
    }
}

interface Hallo {

    void sagHallo();

}

class Roboter implements Hallo {

    @Override
    public void sagHallo() {
        System.out.println("PIP...PIP...PIP");
    }
}

class NorddeutscherBauer implements Hallo {

    @Override
    public void sagHallo() {
        System.out.println("Moin!");
    }
}

class Politiker implements Hallo {

    @Override
    public void sagHallo() {
        System.out.println("Guten Tag meine Damen und Herren!");
    }
}

