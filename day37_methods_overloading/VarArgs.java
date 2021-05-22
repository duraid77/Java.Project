package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(25,36,98,37,985);
    }

    public static void addNumbers (int ... ints){
        int sum =0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];

        }
        System.out.println("sum = " + sum);
    }
}
