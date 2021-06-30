package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();
        //spMan1.work; it doesn't work as it wasn't inherited from father to superman.

        Worker spMan2 = new Superman();
        spMan2.work("SDET");
        spMan2.getPaid();

        Superman spMan3 = new Superman();
        // now spman3 has access to all methods;


    }
}
