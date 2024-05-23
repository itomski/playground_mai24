package de.lubowiecki.playground;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionCheckedTest {

    public static void main(String[] args) {
        System.out.println("MAIN Start");
        machWas1();
        System.out.println("MAIN Ende");
    }

    private static void machWas1() {
        System.out.println("1 Start");
        machWas2();
        System.out.println("1 Ende");
    }

    private static void machWas2() {
        System.out.println("2 Start");
        try {
            machWas3();
        } catch (SQLException e) {
            System.out.println("Problem mit der Datenbank.");
        }
        System.out.println("2 Ende");
    }


    // beim declare (throws) wird der Aufrufer der Methode verpflichtet sich um die
    // Exception zu kümmern
    private static void machWas3() throws SQLException {
        System.out.println("3 Start");
        machWas4(); // handle or declare
        System.out.println("3 Ende");
    }

    private static void machWas4() throws SQLException { // throws = als gefährlich deklarierern
        System.out.println("4 Start");

        // CheckedExceptions: Wenn sie nicht behandelt werden, kompileret der Sorcecode nicht
        // handle or declare
        Connection conn = DriverManager.getConnection("jdbc:mysql:verwaltung.db");

        System.out.println("4 Ende");
    }
}

