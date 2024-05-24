package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleInputUtils {

    // private: Nur diese Klasse kann dieses Scanner-Objekt benutzen
    // static: Scanner kann benutzt werden ohne die ConsoleInputUtils-Klasse zu instanzieren
    // final: diese Variable kann keinen neuen Scanner zugewiesen bekommen
    // Scanner: Typ des Objekts
    // scanner: Name der Variable
    // new: Instanzierung des Scanner Objekts
    // System.in: Quelle die der Scanner beobachten soll (Konsole)
    private static final Scanner scanner = new Scanner(System.in);

    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");


    private ConsoleInputUtils() { // Eine Instanzierung der Klasse ist nicht mehr möglich
    }

    public static String inputString(String label) {
        if(label != null) {
            System.out.print(label + ": ");
        }
        return scanner.nextLine().trim();
    }

    public static String inputString(String label, int minLength, int maxLength, String errorMsg) {
        while(true) {
            try {
                System.out.print(label + ": ");
                String input = scanner.nextLine().trim();
                if (input.length() <= minLength) {
                    throw new ToSmallException();
                }
                else if (input.length() > maxLength) {
                    throw new ToBigException();
                }
                return input;
            }
            catch(RuntimeException ex) {
                System.out.println(errorMsg);
            }
        }
    }

    public static String inputString(String label, String regexp , String errorMsg) {

        while(true) {
            try {
                if(label != null) {
                    System.out.print(label + ": ");
                }
                String input = scanner.nextLine().trim();

                if(!input.matches(regexp)) { // entspricht die Eingabe dem Muster?
                    throw new RuntimeException();
                }
                return input;
            }
            catch(RuntimeException ex) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int inputInt(String label, String errorMsg) {
        return inputInt(label, Integer.MIN_VALUE, Integer.MAX_VALUE, errorMsg);
    }

    public static int inputInt(String label, int min, int max, String errorMsg) {

        // TODO: Gesonderte ErrorMessages für die Validierung

        while(true) {
            System.out.print(label + ": ");
            try {
                int num = scanner.nextInt();
                if(num < min) {
                    throw new ToSmallException();
                }
                else if(num > max) {
                    throw new ToBigException();
                }
                scanner.nextLine(); // fix
                return num;
            }
            /*
            catch(InputMismatchException ex) {
                scanner.nextLine(); // fix
                System.out.println(errorMsg);
            }
            catch(ToSmallException ex) {
                scanner.nextLine(); // fix
                System.out.println(errorMsg);
            }
            catch(ToBigException ex) {
                scanner.nextLine(); // fix
                System.out.println(errorMsg);
            }
            */
            catch(RuntimeException ex) {
                scanner.nextLine(); // fix
                System.out.println(errorMsg);
            }
        }
    }

    public static LocalDate inputDate(String label, String errorMsg) {
        while(true) {
            System.out.print(label + ": ");
            try {
                String dateStr = scanner.next();
                return LocalDate.parse(dateStr, DATE_FMT);
            }
            catch(RuntimeException ex) {
                //ex.printStackTrace(); // Infos über die Exception
                System.out.println(errorMsg);
            }
        }
    }

    public static LocalTime inputTime(String label, String errorMsg) {
        while(true) {
            System.out.print(label + ": ");
            try {
                String dateStr = scanner.next();
                return LocalTime.parse(dateStr, TIME_FMT);
            }
            catch(RuntimeException ex) {
                System.out.println(errorMsg);
            }
        }
    }

    // Exceptions als Innere-Klassen
    static class ToSmallException extends RuntimeException {
    }

    static class ToBigException extends RuntimeException {
    }
}
