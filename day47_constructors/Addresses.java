package day47_constructors;

public class Addresses {
    public static void main(String[] args) {
        Address duraid = new Address();
        duraid.setStreet("5908 colfax ave");
        duraid.setCity("Alexandria");
        duraid.setState("VA");
        duraid.setZipCode("22311");

        System.out.println(duraid.toString());

        Address papaJon = new Address("8501 Tyco rd", "Vienna" , "VA", "22182");
    }
}
