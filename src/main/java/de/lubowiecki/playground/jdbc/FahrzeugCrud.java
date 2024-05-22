package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FahrzeugCrud {

    private static final String TABLE = "fahrzeuge";

    // Create
    // Read
    // Update
    // Delete


    public FahrzeugCrud() throws SQLException {
        createTable();
    }

    // Create
    public boolean insert(Fahrzeug fahrzeug) throws SQLException {

        // TODO: Gegen SQL-Injection absichern

        final String SQL_TPL = "INSERT INTO " + TABLE + " (kennzeichen, marke, typ, baujahr) VALUES('%s', '%s', '%s', %d)";

        // SQL-Injection noch möglich

        final String SQL = String.format(SQL_TPL,
                                            fahrzeug.getKennzeichen(),
                                            fahrzeug.getMarke(),
                                            fahrzeug.getTyp(),
                                            fahrzeug.getBaujahr());

        try(Connection conn = DbUtils.getConnection(); Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(SQL) == 1;
        }
    }

    // Read
    public Fahrzeug findById(int id) throws SQLException {

        // TODO: Auf Optional umstellen

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection conn = DbUtils.getConnection(); Statement stmt = conn.createStatement()) {

            ResultSet results = stmt.executeQuery(SQL);

            if(results.next()) {
                return mapToObject(results); // Wenn Datensatz gefunden, wird er in ein Fahrzeug umgewandelt
            }

            return null; // sonst wird eine null zurückgegeben
        }
    }

    public List<Fahrzeug> findAll() throws SQLException { // Aufrufer muss sich um SQLException kümmern
        final String SQL = "SELECT * FROM " + TABLE;
        return findAllByQuery(SQL);
    }

    public List<Fahrzeug> findAllByMarke(String marke) throws SQLException {
        final String SQL = "SELECT * FROM " + TABLE + " WHERE marke = '" + marke + "'";
        return findAllByQuery(SQL);
    }

    private List<Fahrzeug> findAllByQuery(final String SQL) throws SQLException {

        List<Fahrzeug> fahrzeuge = new ArrayList<>();

        try(Connection conn = DbUtils.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet results = stmt.executeQuery(SQL);
            while(results.next()) { // Datensätze werden zeilenweise verarbeitet
                fahrzeuge.add(mapToObject(results));
            }
        }

        return fahrzeuge;
    }


    // Update
    public boolean update(Fahrzeug fahrzeug) throws SQLException {

        final String SQL = "UPDATE " + TABLE + " SET kennzeichen = ?, marke = ?, typ = ?, baujahr = ? WHERE id = ?";

        try(Connection conn = DbUtils.getConnection(); PreparedStatement stmt = conn.prepareStatement(SQL)) {

            stmt.setString(1, fahrzeug.getKennzeichen());
            stmt.setString(2, fahrzeug.getMarke());
            stmt.setString(3, fahrzeug.getTyp());
            stmt.setInt(4, fahrzeug.getBaujahr());
            stmt.setInt(5, fahrzeug.getId());

            return stmt.executeUpdate() == 1;
        }
    }

    // Delete
    public boolean delete(Fahrzeug fahrzeug) throws SQLException {
        return deleteById(fahrzeug.getId());
    }

    public boolean deleteById(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection conn = DbUtils.getConnection(); Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(SQL) == 1;
        }
    }

    // Relationale-Daten aus der DB sollen in Fahrzeugobjekte umgewandelt werden
    private Fahrzeug mapToObject(ResultSet result) throws SQLException {
        Fahrzeug fahrzeug = new Fahrzeug(); // Leeres Fahrzeug
        // Fahrzeug wird mit Daten aus der DB befüllt
        fahrzeug.setId(result.getInt("id"));
        fahrzeug.setKennzeichen(result.getString("kennzeichen"));
        fahrzeug.setMarke(result.getString("marke"));
        fahrzeug.setTyp(result.getString("typ"));
        fahrzeug.setBaujahr(result.getInt("baujahr"));
        return fahrzeug;
    }

    private void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                "kennzeichen TEXT UNIQUE NOT NULL, " +
                "marke TEXT NOT NULL, " +
                "typ TEXT NOT NULL, " +
                "baujahr INTEGER NOT NULL)";

        try(Connection conn = DbUtils.getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
