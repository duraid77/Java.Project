package day35_custom_Methods;

public class VoidMethod {
    public static void main(String[] args) {
printAlphabet();
        displayUSFlag();
        for (int i = 0; i < 10; i++) {

        }
    }

    public static void printAlphabet(){
        for(char i ='A'; i<='Z'; i++)
            System.out.print(i + " ");

    }
    public static void displayUSFlag(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
