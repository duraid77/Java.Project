package day22_string_manipulation;

public class IndesOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);

        if(technologies.indexOf("maven") != -1){
            System.out.println("it contains maven");
        }


    }
}
