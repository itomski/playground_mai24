package de.lubowiecki.playground.jdbc;

import java.sql.SQLException;
import java.util.List;

public class CrudTest {

    public static void main(String[] args) throws SQLException {

        FahrzeugCrud crud = new FahrzeugCrud();

        try {

            /*
            // Einfügen
            Fahrzeug f = new Fahrzeug();
            f.setKennzeichen("AB:XY578");
            f.setMarke("Porsche");
            f.setTyp("911");
            f.setBaujahr(2000);

            if(crud.insert(f)) {
                System.out.println("Wurde gespeichert!");
            }
            else {
                System.out.println("Probleme beim Speichern!");
            }
            */

            /*
            // Löschen nach der ID
            if(crud.deleteById(4)) {
                System.out.println("Fahrzeug wurde gelöscht!");
            }
            else {
                System.out.println("Problem beim Löschen!");
            }
            */

            /*
            // Fahrzeug Objekt löschen
            Fahrzeug f = crud.findById(3);
            if(crud.delete(f)) {
                System.out.println("Fahrzeug wurde gelöscht!");
            }
            else {
                System.out.println("Problem beim Löschen!");
            }
            */

            Fahrzeug f = crud.findById(5);
            f.setMarke("Volvo");
            f.setTyp("V70");
            if(crud.update(f)) {
                System.out.println("Fahrzeug wurde geändert.");
            }
            else {
                System.out.println("Problem beim Ändern.");
            }

            System.out.println();

            // Alle abfragen
            List<Fahrzeug> fahrzeuge = crud.findAll();
            for(Fahrzeug fahrzeug : fahrzeuge) {
                System.out.println(fahrzeug.getId() + ", " + fahrzeug.getKennzeichen() + ": " + fahrzeug.getMarke() + ", " + fahrzeug.getTyp());
            }

            /*
            // Ein Fahrzeug nach seiner ID abfragen
            Fahrzeug f = crud.findById(3);
            if(f != null)
                System.out.println(f.getKennzeichen() + ": " + f.getMarke() + ", " + f.getTyp());

             */
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
