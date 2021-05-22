package day17_tenery_nestingIf;

public class VendingMachine {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coke";
        String snacks = "candy";

        if(selection.equals("drink")) {
            if (drink.equals("tea")) {
                System.out.println("drink = " + drink);
            } else {
                System.out.println("drink = " + drink);
            }
        }else{
                if(snacks.equals("chips")) {
                   System.out.println("snacks = " + snacks);
            }else{
                System.out.println("snacks = " + snacks);
            }

        }
    }
}
