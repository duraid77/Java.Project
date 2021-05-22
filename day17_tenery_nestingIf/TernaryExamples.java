package day17_tenery_nestingIf;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String result =(score>60)? "pass":"fail";
        System.out.println("result = " + result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("x = " + x);

        char grade = (score > 90) ? 'A':'B';
        System.out.println("grade = " + grade);

        String evenOdd = (score % 2 == 0)? "even": "odd";
        System.out.println("evenOdd = " + evenOdd);


        int hourlyRate = 35;
        String offer = hourlyRate > 45? "Accept" : "Reject";
        System.out.println("offer = " + offer);

        String todayClass = "java";
        String teacher = todayClass.equals("java")? "Murodil": "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "have DL, can drive": "No Dl, can not drive";
        System.out.println("driving = " + driving);


    }
}
