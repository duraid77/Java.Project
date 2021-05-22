package day26_loops;

public class lultiplicationTable {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
