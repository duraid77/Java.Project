package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();
        //spMan1.work; it doesn't work as it wasn't inhereted from father to superman.
    }
}
