package de.lubowiecki.playground.jdbc;

import java.sql.*;
import java.util.List;

public interface Crud<T> {

    public boolean insert(T obj) throws SQLException;

    public T findById(int id) throws SQLException;

    public List<T> findAll() throws SQLException;

    List<T> findAllByQuery(final String SQL) throws SQLException;

    boolean update(T obj) throws SQLException;

    boolean delete(T obj) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    T mapToObject(ResultSet result) throws SQLException;

    void createTable() throws SQLException;
}
