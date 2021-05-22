package day38_methods;

public class RecursionMethod {
    public static void main(String[] args) {
        int num=1;
        anotherWay(num);
    }
    public static int a(int num){
        System.out.print(num + " ");
        if (num<100){
            b(num);
        }
        return num;
    }
    public static void b(int num){
        num ++;
        a(num);
    }

    public static int anotherWay(int num){

        System.out.print(num + " ");

        if (num < 100){
           num++;
            anotherWay(num);
        }
        return num;
    }
}
