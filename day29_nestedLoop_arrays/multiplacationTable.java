package day29_nestedLoop_arrays;

public class multiplacationTable {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for (int n=1; n<=10; n++){
                System.out.print(i+" x " +n+ " = " + i*n +"\t");
            }
            System.out.println();
        }
    }
}
