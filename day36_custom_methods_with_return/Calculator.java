package day36_custom_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add( 35, 87));
        System.out.println("multiply = " + multiply(563, 635));


    }



    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double minus(double num1, double num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }
}
