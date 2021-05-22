package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        // Find index of Gloves in the array.
        int index=-1;
        for(int i =0; i< items.length; i++){
            if(items[i].equals("Gloves")){
                index = i;
                break;
            }
        }
        System.out.println("index of Gloves = " + index);


        // check if ipad exists in the array.
        boolean ipadExists = false;
        for(String ipad: items){
            if (ipad.equals("iPad")){
                ipadExists = true;
                break;
            }
        }
        System.out.println("iPad exists? " + ipadExists);

        //print report for each item in the array.

        for (int i=0; i< items.length; i++){
            System.out.println("item" + i + ": " + items[i] + " - Price: $" + prices[i] + " - item ID: " + itemIDs[i]);
        }
// look for jacket and print all details
        System.out.println("Finding Jacket info ");

        for(int i =0; i< items.length; i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println("item" + i + ": " + items[i] + " - Price: $" + prices[i] + " - item ID: " + itemIDs[i]);
                break;
            }
        }

    }
}
