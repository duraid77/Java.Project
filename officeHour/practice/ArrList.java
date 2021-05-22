package officeHour.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> arr){
        for(int i =0; i< arr.size(); i++){
            arr.add(arr.get(i));
        }
        return arr;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int size = in.nextInt();
        int size =2;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }
}
