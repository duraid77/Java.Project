package day13_conditional_statements;

public class SalesBonus {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 3100;

        if(salesAmount >= 1000 &&  salesAmount< 2000){
            bonus = 50;
            System.out.println("good job. You have scored $50 in bonus");
           } else if (salesAmount>= 2000 && salesAmount< 3000){
            bonus = 100;
            System.out.println("good job. You have scored $100 in bonus");
        }else if( salesAmount >=3000){
            bonus = 200;
            System.out.println("congratulation. You have scored $200 in bonus");
        }
    }
}