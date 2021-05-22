package officeHour.may_third;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript",
                "java", "word", "java"));
        String targetword = "java";
        int count =0;
        for (String each: words) {
            if(each.equalsIgnoreCase(targetword)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
