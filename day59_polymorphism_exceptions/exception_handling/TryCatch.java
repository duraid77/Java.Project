package day59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try{
        System.out.println(10/2);
        System.out.println(10/0);
        System.out.println(10/3);
    }catch (Exception e){
            System.out.println("RunTimeException happened and handled");
        }
        System.out.println("After first try catch");

        try {
            int[] num = {11, 32, 43};
            System.out.println(num[2]);
            System.out.println(num[3]);
            System.out.println(num[1]);//this will be skipped because of the error in the line above.
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound exception found and handled");
        }


    }
}
