package day16_switch_ternry;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numberOfBedrooms = 1;
        double startingPrice = 0;

        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("We don't have apartment matching number of rooms selected");
                break;
        }
        System.out.println("startingPrice = $" + startingPrice);
    }
}
