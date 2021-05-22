package day20_String;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle= "";
        if (jobTitle.isEmpty()){
            System.out.println("String is empty");
        }else{
            System.out.println("String is not empty");
        }

        if(jobTitle.length() == 0){
            System.out.println("Still empty");
        }else{
            System.out.println("No, not empty anymore");
        }

        if(jobTitle.equalsIgnoreCase("")){
            System.out.println("I said it is empty");
        }else{
            System.out.println("No, there is a text");
        }

        String veggie = "eggplant";
        if(!veggie.isEmpty()){
            System.out.println("Veggie is " + veggie);
        }

    }
}
