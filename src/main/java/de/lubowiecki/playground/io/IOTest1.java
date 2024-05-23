package de.lubowiecki.playground.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest1 {

    public static void main(String[] args) {

        try {
            // IOException ist checked d.h. ich muss sie behandeln oder deklarieren
            Writer out = new FileWriter("texte.txt", true);
            out.append("Das ist das Haus ");
            out.append("von Nikigraus...\n");
            out.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
