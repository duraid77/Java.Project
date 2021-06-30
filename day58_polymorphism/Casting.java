package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superman
        Worker worker = new Superman();
        worker.work("QA manager");
        worker.getPaid();
        //worker.raiseKid();


        ((Father)worker).raiseKid();

    }
}
