package de.lubowiecki.playground.jdbc;

public class Fahrzeug {

    private int id;
    private String kennzeichen;
    private String marke;
    private String typ;
    private int baujahr;

    public Fahrzeug() {
    }

    public Fahrzeug(int id, String kennzeichen, String marke, String typ, int baujahr) {
        this.id = id;
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.typ = typ;
        this.baujahr = baujahr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
}
