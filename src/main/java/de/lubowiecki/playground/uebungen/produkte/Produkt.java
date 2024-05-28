package de.lubowiecki.playground.uebungen.produkte;

import java.io.Serializable;
import java.time.LocalDate;

public class Produkt implements Serializable {

    private String name;

    private String beschreibung;

    private int anzahl;

    private double preis;

    private LocalDate imBestandSeit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public LocalDate getImBestandSeit() {
        return imBestandSeit;
    }

    public void setImBestandSeit(LocalDate imBestandSeit) {
        this.imBestandSeit = imBestandSeit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produkt{");
        sb.append("name='").append(name).append('\'');
        sb.append(", beschreibung='").append(beschreibung).append('\'');
        sb.append(", anzahl=").append(anzahl);
        sb.append(", preis=").append(preis);
        sb.append(", imBestandSeit=").append(imBestandSeit);
        sb.append('}');
        return sb.toString();
    }
}
