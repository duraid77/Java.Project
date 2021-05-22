package officeHour.practice;
import java.util.Scanner;
public class Pandemic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        for (i = 1; (i < 10); i++) {

        System.out.println("Input year please: ");
        int year = scan.nextInt();
        if(year > 2021 || year < 0){
            System.out.println("Invalid year!");
        }else {
            switch (year) {
                case 1346:
                case 1347:
                case 1348:
                case 1349:
                case 1350:
                case 1351:
                case 1352:
                case 1353:
                    System.out.println("The Black Death");
                    break;
                case 1665:
                case 1666:
                    System.out.println("Great Plague of London");
                    break;
                case 1770:
                case 1771:
                case 1772:
                    System.out.println("Russian Plague");
                    break;
                case 1889:
                case 1890:
                    System.out.println("Flu epidemic");
                    break;
                case 1916:
                    System.out.println("American polio epidemic");
                    break;
                case 1918:
                case 1919:
                case 1920:
                    System.out.println("Spanish flu");
                    break;
                case 2009:
                case 2010:
                    System.out.println("H1N1 Swine flu pandemic");
                    break;
                case 2014:
                case 2015:
                case 2016:
                    System.out.println("West African Ebola epidemic");
                    break;
                case 2020:
                case 2021:
                    System.out.println("COVID 19");
                    break;
                default:
                    System.out.println("No Pandemic");
                    break;
            }

        }


        }
    }
}
