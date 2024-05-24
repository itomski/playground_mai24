package de.lubowiecki.playground.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        d = new Date(2020, 10, 15);
        System.out.println(d);

        // Immutable
        LocalDate ld = LocalDate.now(); // Aktuelles Datum
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        //ld = ld.plusDays(10);
        ld = LocalDate.of(2021, 2, 28);
        lt = LocalTime.of(15, 22);
        ldt = LocalDateTime.of(ld, lt);


        ld = ld.plusDays(10); // minusDays etc.
        ld = ld.plusYears(10);
        ld = ld.plusMonths(10);
        ld = ld.plusWeeks(10);
        ld = ld.plus(10, ChronoUnit.DAYS);
        ld = ld.minus(10, ChronoUnit.YEARS);

        System.out.println(ld.getYear());
        System.out.println(ld.get(ChronoField.YEAR));
        System.out.println(lt.get(ChronoField.SECOND_OF_DAY));

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        // parse = Text wird in ein LocalDate umgewandelt
        LocalDate ld2 = LocalDate.parse("2015-11-27"); // ISO
        System.out.println(ld2);
        System.out.println(ld2.getDayOfWeek());

        System.out.println();

        Locale.setDefault(Locale.GERMANY); // Verändert die Sprach/Land Einstellung für die VM

        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ISO_WEEK_DATE; // Vorgefertigte Konstanten
        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(ld2.format(DATE_FMT));

        ld2 = LocalDate.parse("30.11.21", DATE_FMT);
        System.out.println(ld2);

        System.out.println();

        Period p = Period.of(20,2, 0);
        System.out.println(p);

        ld2 = ld2.plus(p);
        System.out.println(ld2);

        LocalDate heute = LocalDate.now();
        LocalDate em = LocalDate.of(2024, 6, 14);

        // Period ist für Datum vorgesehen
        Period p2 = Period.between(heute, em);
        System.out.println("noch " + p2.getDays() + " Tage bis EM");


        LocalTime jetzt = LocalTime.now();
        LocalTime spaeter = LocalTime.of(16, 30);

        // Duration ist für Zeit vorgesehen
        Duration d1 = Duration.between(jetzt, spaeter);
        System.out.println("noch " + d1.toMillis() + " ms bis Feierabend");
    }
}
