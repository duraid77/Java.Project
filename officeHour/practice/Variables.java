package officeHour.practice;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people =scan.nextInt();
        if(people <2 ){
            System.out.println("lives with less than 2 people");
        }else if(people>=3 && people <= 6){
            System.out.println("Live with 3-6 people");
        }else if(people > 6){
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("Do you live in downtown?");
        boolean isDownTown = scan.nextBoolean();
        if(isDownTown){
            System.out.println("Have you thought about moving to the suburbs? ");
            boolean movingToSub = scan.nextBoolean();
            if(movingToSub){
                System.out.println("Do it, its great");
            }else{
                System.out.println("You should think about it");
            }
        }
        System.out.println("What's your favorite animal?");
        String animal = scan.next();
        System.out.println("Wow " + animal + " is a great animal");
        System.out.println("How many pets do you want? ");
        int numOfPets = scan.nextInt();
        System.out.println("Interesting, do you want " + numOfPets + " " + animal);
    }


}
