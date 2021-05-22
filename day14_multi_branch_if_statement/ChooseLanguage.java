package day14_multi_branch_if_statement;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("For English press 1");
        System.out.println("For Spanish press 2");
        System.out.println("For Turkish press 3");
        System.out.println("For Russian press 4");
        System.out.println("For French press 5");

        int language = scan.nextInt();

        if(language == 1){
            System.out.println("Hello, thanks for your call");
        }else if(language == 2){
            System.out.println("hola, gracias para llamar");
        }else if(language == 3){
            System.out.println("bla bla bal in Turkish");
        }else if(language == 4){
            System.out.println("bla bal bal in Rusian");
        }else if(language == 5){
            System.out.println("bla bla bla in French");
        }else{
            System.out.println("Hello world");
        }



    }
}
