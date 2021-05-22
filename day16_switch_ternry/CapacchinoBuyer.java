package day16_switch_ternry;

public class CapacchinoBuyer {
    public static void main(String[] args) {
        double price = 3.99;
        double calories =120;
        String size = "venti";

        switch (size){
            case "tall":
                System.out.println("Tall Cappuccino please");
                System.out.println("Price: $" + price);
                System.out.println("Calories: " + calories);
                break;
            case "grade":
                System.out.println("Grande Cappuccino please");
                System.out.println("Price: $" + price);
                System.out.println("Calories: " + calories);
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                System.out.println("Price: $" + price);
                System.out.println("Calories: " + calories);
                break;
            default:
                System.out.println("We don't serve that size of Cappuccino");

        }

    }
}
