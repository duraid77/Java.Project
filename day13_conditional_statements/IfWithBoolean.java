package day13_conditional_statements;

public class IfWithBoolean {
    public static void main(String[] args) {
        boolean isHungry = false;

        if (isHungry == true){
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Lets code java");

        } else{
            System.out.println("I a not hungry");
            System.out.println("I will continue coding java");
        }

        double price = 130.44;
        double budget = 200.00;
        boolean isAffordable = price <= budget;

        if (isAffordable){
            System.out.println("This item is affordable. Go ahead and buy it.");
        } else{
            System.out.println("You can't afford it. Get and SDET job");
        }

        boolean isRemoteJob = true;
        if(isRemoteJob != false){
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure I am interested, what is the interview process");
        }
    }
}
