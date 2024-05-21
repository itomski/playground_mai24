package de.lubowiecki.playground;

public class KonstruktorTest {

    public static void main(String[] args) {

        String s1 = new String(); // Parameterloser Konstruktor
        String s2 = new String("Hallo");

        byte[] bytes = {120,115,126,80,1};
        //String s3 = new String(bytes);
        String s3 = new String(bytes, 2, 2);
        System.out.println(s3);

        System.out.println();

        Fahrzeug f1 = new Fahrzeug();
        System.out.println(f1);

        System.out.println();

        Fahrzeug f2 = new Fahrzeug("HHAB:123", "VW", "Golf", 2015);
        System.out.println(f2);

        System.out.println();

        Fahrzeug f3 = new Fahrzeug("VW", "Golf");
        System.out.println(f3);

        System.out.println();

        // Fahrzeug f4 = new Fahrzeug("VW", "Golf", 2018); // Error: Kein passender Konstruktor vorhanden
        // System.out.println(f4);

    }
}
