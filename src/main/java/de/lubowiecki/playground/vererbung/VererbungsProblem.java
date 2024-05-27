package de.lubowiecki.playground.vererbung;

public class VererbungsProblem {
}

class A {
    void machWas() {
        System.out.println("A: machWas");
    }
}

class B {
    void machWas() {
        System.out.println("B: machWas");
    }
}

interface InterfaceA {
    default void machWas() {
        System.out.println("InterfaceA: machWas");
    }
}

interface InterfaceB {
    default void machWas() {
        System.out.println("InterfaceB: machWas");
    }
}



class C extends B {

}

class D implements InterfaceA, InterfaceB {

    // Bei Konflikten mit default Methoden mit gleicher Signatur aus Interfaces muss die Klasse die Methode selbst
    // anbieten um den Vererbungs-Konflikt aufzulösen
    public void machWas() {
        System.out.println("D: machWas");
    }
}