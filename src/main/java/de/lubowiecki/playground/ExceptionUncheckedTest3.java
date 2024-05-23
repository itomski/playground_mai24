package de.lubowiecki.playground;

public class ExceptionUncheckedTest3 {

    public static void main(String[] args) {
        System.out.println("MAIN Start");
        try {
            machWas1();
        }
        catch(NullPointerException ex) {
            System.out.println("Behandelt.");
        }
        System.out.println("MAIN Ende");
    }

    private static void machWas1() {
        System.out.println("1 Start");
        machWas2();
        System.out.println("1 Ende");
    }

    private static void machWas2() {
        System.out.println("2 Start");
        machWas3();
        System.out.println("2 Ende");
    }

    private static void machWas3() {
        System.out.println("3 Start");
        machWas4();
        System.out.println("3 Ende");
    }

    private static void machWas4() {
        System.out.println("4 Start");

        // RuntimeExceptions: Wenn sie nicht behandelt werden, beenden sie sofort die Methode
        // und die Exception taucht beim Aufrufer der Methode auf (auch ohne throws)
        String s = null;
        System.out.println(s.toUpperCase());

        System.out.println("4 Ende");
    }
}
