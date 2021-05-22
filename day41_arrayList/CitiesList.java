package day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0,"Ashgabat");
        System.out.println(cities);// printing the whole array list
        System.out.println("first city: " + cities.get(0));
        System.out.println("Last city: " + cities.get(cities.size()-1));


        for (int i = 0; i < cities.size(); i++) {
            System.out.println("cities = " + cities.get(i));
        }
        System.out.println();
        for(String each: cities){
            System.out.println(each);
        }
        System.out.println();

        //Delete items from arraylist
        // 1- remove using index. Delete value at index 3
        cities.remove(3);
        // 2- remove using object/value
        cities.remove("New York");
        System.out.println("cities after remove" + cities);

        //delete/remove all values from the method
        cities.clear();
        System.out.println("cities = " + cities);

        //2 using isEmpty()

        if(cities.isEmpty()){
            System.out.println("List is Empty");
        }

        // check size is zero

        if(cities.size() == 0){
            System.out.println("Size is zero. list is empty");
        }

    }
}
