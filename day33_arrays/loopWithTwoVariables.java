package day33_arrays;

public class loopWithTwoVariables {
    public static void main(String[] args) {

        for( int i=1, j=0; i<=20; i++, j+=2){
            System.out.println("j = " + j);
        }

        for(int i=0, j=3, k = 100; i<=10; i++, j +=2, k+=100){
            System.out.println(i + " " + j + " " +k);
        }
    }
}
