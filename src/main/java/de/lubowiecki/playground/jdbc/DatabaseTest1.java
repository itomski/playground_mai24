package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTest1 {

    public static void main(String[] args) {

        for(String zeile : getFahrzeugeFromDb()) {
            System.out.println(zeile);
        }

    }

    private static List<String> getFahrzeugeFromDb() {

        List<String> zeilen = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db"); // Verbindung aubauen
            Statement stmt = conn.createStatement()) { // Abfrage aufbauen

            // ResultSet: Ergebnis-Menge
            ResultSet results = stmt.executeQuery("SELECT * FROM fahrzeuge"); // Abfrage absetzen

            // Daten verarbeiten
            while(results.next()) {
                String zeile = results.getString("kennzeichen") + ", " +
                                results.getString("marke") + ", " +
                                results.getString("typ") + ", " +
                                results.getInt("baujahr");

                zeilen.add(zeile);
            }

            // stmt wird automatisch geschlossen
            // conn wird automatisch geschlossen
        }
        catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }

        return zeilen;
    }
}
