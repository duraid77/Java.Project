package day15_Logical_ops_switch_Ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        // check if age is no more than 7 for a carseat
        int age = 2;

        if (!(age >= 7)){
            System.out.println("You need a carseat");

        }
    }
}
