package day18_conditions_practice_String;

public class ScoreCheck {
    public static void main(String[] args) {
        int score;
        for(score = 1; score <=100; score++) {
            if (score >= 1 && score <= 40) {
                System.out.println("D");
            } else if (score >= 41 && score <= 60) {
                System.out.println("C");
            } else if (score >= 61 && score <= 90) {
                System.out.println("B");
            } else if (score >= 91 && score <= 100) {
                System.out.println("A");
            } else {
                System.out.println("invalid score");
            }
        }
    }
}
