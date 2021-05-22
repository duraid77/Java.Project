package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("Moskovich");
        myCars.add("Tesla");
        myCars.add(0,"jeep");
        myCars.add(1 ,"lada");
        myCars.add(2,"yugu");

        System.out.println(myCars.toString()); //toString not necessary here.
        String allCarsInOneString = myCars.toString();

        myCars.set(0, "Honda"); //replacing that index's value to the new string Honda.
        myCars.set(4, "lamborghini");
        System.out.println(myCars);
        System.out.println("Index of ford = " + myCars.indexOf("ford"));
        int dex = myCars.indexOf("Moskovich");
        System.out.println("dex = " + dex);



        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println(myCars);

        myCars.set(dex, "Jiguli");

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "BMW");
        }else{
            System.out.println("lada was not found");
        }
        System.out.println(myCars);

        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equals("lamborghini")){
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("Toyota")) {
                myCars.set(i, "lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i, "Audi");


            }
        }
        System.out.println(myCars);
    }
}
