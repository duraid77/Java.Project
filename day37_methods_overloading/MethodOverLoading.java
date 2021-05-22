package day37_methods_overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading.sum(4,8);

        sum(4.3, 7.6);
        sum("hello ", "world");
        sum(10, 5.4);
    }






    public static void sum(int num1, int num2){
        System.out.println("sum(int num1, int num2) = " + (num1 + num2));
    }
    public static void sum(int num1, int num2, int num3){
        System.out.println("sum of 3 int = " + (num1 + num2 + num3));
    }

    public static void sum(double num1, double num2){
        System.out.println("sum of 2 doubles = " + (num1 + num2 ));
    }

    public static void sum(String num1, String num2){
        System.out.println("sum of two strings = " + (num1 + num2));
    }
}
