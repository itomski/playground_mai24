package de.lubowiecki.playground.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonCrud implements Crud<Person> {
    @Override
    public boolean insert(Person obj) throws SQLException {
        return false;
    }

    @Override
    public Person findById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Person> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<Person> findAllByQuery(String SQL) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Person obj) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Person obj) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }

    @Override
    public Person mapToObject(ResultSet result) throws SQLException {
        return null;
    }

    @Override
    public void createTable() throws SQLException {

    }
}
