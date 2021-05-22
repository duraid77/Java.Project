package day36_custom_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
      int creditScore;
      creditScore = getCreditScore();
      checkEligible(creditScore);
    }



    public static void checkEligible(int score){
        if(score>=700){
            System.out.println("You are elegible for leasing");
        }else{
            System.out.println("Credit score is too low. You can't lease anything.");
        }

    }

    public static int getCreditScore(){
        return 800;
    }
}
