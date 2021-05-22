package day12_conditional_statements;

public class If_Statement {
    public static void main(String[] args) {
        if(10 > 5){
            System.out.println("Hallelujah!");
        } else {
            System.out.println("Try again");
        }
      int count = 25;
        if (count > 30){
            System.out.println("Count more than 30");

        } else if(count <30){
            System.out.println("count is less than 30");
        }

        // voting example
        byte age = 17;
        if(age >= 18){
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("Come back when you reach 18 to vote");
        }

    }
}
