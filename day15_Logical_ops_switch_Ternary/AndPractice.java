package day15_Logical_ops_switch_Ternary;

public class AndPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName ="wooden spoon";
        if(onSale && freeShipping && itemName.equals("wooden spoon")){
            System.out.println("Add wooden spoon to cart");
        }else{
            System.out.println("Try again");
        }

    }
}
