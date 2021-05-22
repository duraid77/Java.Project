package day28_loops;

public class breakvsContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
            if(i == 4){
                break; // exit the loop
            }
        }
        for (int i =1 ; i< 10; i++){
            if(i == 5 || i == 7){
                continue; //it will skip this iteration

            }
            System.out.println("i = " + i);
        }
    }
}
