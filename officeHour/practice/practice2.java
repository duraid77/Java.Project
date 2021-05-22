package officeHour.practice;

public class practice2 {
    public static void main(String[] args) {
        int a=3, b =2;
        long c = (a-- + b)*2/3 %2;
        System.out.println("c = " + c);

        int num1 = 10;
        int num2 = num1++ *3 + ++num1 + num1++ %2;
        System.out.println("num2 = " + num2);

        char letter = 'a';


    }
}
/*
numOne = 10
num2 = 10 *3 + 12 + 12 %2 : n1 = 13
        30+12 = 42
        int biggest

 */
