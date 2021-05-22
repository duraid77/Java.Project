package day10_operator;

public class changeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        balance = balance - baklava;
        System.out.println("balance = " + balance);
        double Kenafa = 44.45;
        balance = balance - Kenafa;
        System.out.println("balance = " + balance);
        // kenafe is 50% off now. lets buy it
        Kenafa = Kenafa/2;
        balance = balance - Kenafa;
        System.out.println("balance = " + balance);
    }
}
