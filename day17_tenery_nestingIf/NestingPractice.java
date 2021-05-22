package day17_tenery_nestingIf;

public class NestingPractice {
    public static void main(String[] args) {
        double itemPrice = 40;

        boolean isPrimeMember = false;

        if (isPrimeMember) {
            System.out.println("Eligible for two days shipping");
        } else {
            if (itemPrice >= 35) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping");
            }
        }
    }
}
