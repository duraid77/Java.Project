package day40_arraylist;
import java.util.*;
public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("shoes");
        shoppingList.add("Cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("crap");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("go to costco");
        }

        int count = shoppingList.size();
        System.out.println("count = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            shoppingList.remove("shoes");
        }

        System.out.println("Done shopping, remove the list");
        shoppingList.clear();
        System.out.println("shoppingList = " + shoppingList);

    }
}
