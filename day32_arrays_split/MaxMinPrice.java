package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        double mostExp = 0;
        int mostExpDex =0;
        double cheaper = prices[0];
        int cheaperDex = 0;

        for (int i=0; i< items.length; i++){
            if(prices[i] > mostExp){
                mostExp = prices[i];
                mostExpDex = i;
            }
            if(prices[i] < cheaper){
                cheaper = prices[i];
                cheaperDex = i;
            }
        }
        System.out.println("Most expensive item is " + items[mostExpDex] );
        System.out.println("Cheapist item is " + items[cheaperDex]);

        // To print entire array
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));


    }
}
