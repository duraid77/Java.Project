package day19_class_vs_object;

public class endsWith {
    public static void main(String[] args) {
        String word = "Dr. Nadir";

        if (word.startsWith("Mr.")){
            System.out.println("Man");
        }else if(word.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(word.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(word.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(word.startsWith("Sr.")){
            System.out.println("Senior citizen");
        }
    }
}
