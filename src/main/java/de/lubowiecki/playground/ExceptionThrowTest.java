package de.lubowiecki.playground;

public class ExceptionThrowTest {

    int countSitzplaetze = 5;

    public static void main(String[] args) {
        new ExceptionThrowTest().start();
    }

    private void start() {

        try {
            bucheEinenSitzplaz("Peter", 18);
            bucheEinenSitzplaz("Carol", 26);
            bucheEinenSitzplaz("Bruce", 48);
            bucheEinenSitzplaz("Tony", 51);
            bucheEinenSitzplaz("Scott", 35);
            bucheEinenSitzplaz("Steve", 82);
        }
        catch(KeinSitzplatzMehrException ex) {
            System.out.println("Sorry. Alle Sitzplätze sind bereits weg.");
            System.out.println(ex.getMessage());
        }
        catch(NichtAltGenugException ex) {
            System.out.println("Sorry. Du bist noch nicht alt genug.");
            System.out.println(ex.getMessage());
        }
    }

    private void bucheEinenSitzplaz(String name, int alter) {

        if(countSitzplaetze <= 0)
            throw new KeinSitzplatzMehrException();

        if(alter >= 18) {
            countSitzplaetze--;
            System.out.println("Ein Platz für " + name + " wurde gebucht.");
        }
        else {
            throw new NichtAltGenugException();
        }
    }
}

class KeinSitzplatzMehrException extends RuntimeException {

    public KeinSitzplatzMehrException() {
        super("Keine Sitzplätze mehr frei.");
    }
}

class NichtAltGenugException extends RuntimeException {

    public NichtAltGenugException() {
        super("Nicht alt genug.");
    }
}