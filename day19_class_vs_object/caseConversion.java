package day19_class_vs_object;

public class caseConversion {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        String anotherWord = "Hello World";
        System.out.println(anotherWord.toUpperCase());
        System.out.println(anotherWord.toLowerCase());

        System.out.println("Duraid".toUpperCase());
        System.out.println("Duraid".toLowerCase());
        word = word.toUpperCase();
        System.out.println(word);
        word = word.toLowerCase();
        System.out.println("word = " + word);

        // or this is another way
        String wordLcase = word.toUpperCase();
        System.out.println("wordLcase = " + wordLcase);

        String company = "Amazon";
        String companyLcase = company.toUpperCase();
        System.out.println("companyLcase = " + companyLcase);
        String companyLowerCase = companyLcase.toLowerCase();
        System.out.println("companyLowerCase = " + companyLowerCase);


    }
}
