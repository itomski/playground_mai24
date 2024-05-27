package de.lubowiecki.playground.vererbung;

public class SpielTest {

    public static void main(String[] args) {

        Einheit e1 = new Einheit("Damplock");
        e1.geheAufPos(100, 50);
        System.out.println(e1);

        System.out.println();

        e1 = new Schlauchboot("AR5527");
        e1.geheAufPos(20,25);
        System.out.println(e1);

        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt

    }
}

class Einheit {

    private String bezeichnung;

    private int posX;
    private int posY;

    public Einheit(String bezeichnung) {
        this(bezeichnung, 0, 0);
    }

    public Einheit(String bezeichnung, int posX, int posY) {
        this.bezeichnung = bezeichnung;
        this.posX = posX;
        this.posY = posY;
    }

    public void geheAufPos(int x, int y) {
        posX = x;
        posY = y;
        System.out.println(bezeichnung + " geht auf Position: x " + posX + ", y " + posY);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Einheit{");
        sb.append("bezeichnung='").append(bezeichnung).append('\'');
        sb.append(", posX=").append(posX);
        sb.append(", posY=").append(posY);
        sb.append('}');
        return sb.toString();
    }
}

class Schlauchboot extends Einheit {

    public Schlauchboot(String bezeichnung) {
        // der default-Konstruktor verwendet automatisch den parameterlosen Konstruktor der Elternklasse
        // Ist dieser nicht verfügbar - Compilererror!
        super(bezeichnung + " (Schlauchboot)");
    }

    @Override
    public void geheAufPos(int x, int y) {
        setPosX(x);
        setPosY(y);
        System.out.println(getBezeichnung() + " bewegt sich auf Position: x " + getPosX() + ", y " + getPosY());
    }
}
