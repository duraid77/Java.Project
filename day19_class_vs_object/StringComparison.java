package day19_class_vs_object;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Alexandria";

        System.out.println(city.equalsIgnoreCase("alexandria"));
        System.out.println(city.equalsIgnoreCase("ALEXANDRIA"));
        System.out.println(city.equalsIgnoreCase("Aliixandria"));
    }
}
