package de.lubowiecki.playground.uebungen.produkte;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduktVerwaltung {

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"))) {
            produkte = (List<Produkt>) in.readObject(); // Die Liste mit Objekten wird in gelesen und deserialisiert
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        Produkt p = new Produkt();
        p.setName("Zahnpasta");
        p.setBeschreibung("Ne ganz tolle Zahnpasta");
        p.setAnzahl(100);
        p.setPreis(2.99);
        p.setImBestandSeit(LocalDate.of(2022, 10, 17));

        produkte.add(p);

        VerdeblichesProdukt p2 = new VerdeblichesProdukt();
        p2.setName("Milch");
        p2.setBeschreibung("1.5% Fett");
        p2.setAnzahl(1000);
        p2.setPreis(1.29);
        p2.setImBestandSeit(LocalDate.of(2024, 5, 1));
        p2.setMhd(p2.getImBestandSeit().plusDays(30));

        produkte.add(p2); // VerdeblichesProdukt IS-A Produkt

        for(Produkt produkt : produkte) {
            System.out.println(produkt);
        }

        // Serialisierung
        // ObjectOutputStream: Kann Objekte in Dateien schreiben
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            out.writeObject(produkte); // Die Liste mit Objekten wird in Text übersetzt und gespeichert
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
