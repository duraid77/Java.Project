package day19_class_vs_object;

public class CheckCaseMatch {
    public static void main(String[]args){
        String country = "USA";
        if(country.equals(country.toUpperCase())) {
            System.out.println("country match");
        }else{
            System.out.println("not all uppercase");

        }
    }

}
