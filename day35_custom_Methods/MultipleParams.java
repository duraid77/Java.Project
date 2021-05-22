package day35_custom_Methods;

public class MultipleParams {
    public static void main(String[] args) {
        showSum(6.8 , 7.9);
    }
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("sum = " + sum);
    }
}
