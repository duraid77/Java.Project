package day44_custom_classes;

public class Animal {
    String type= "bird";
    public void eat(){
        System.out.println("vegies");
    }
    public void speak(){
        System.out.println("Chirp");
    }
    public String name(int num){
        String nm="";
        switch (num){
            case 1:
                nm = "Lion";
                break;
            case 2:
                nm = "cheetah";
                break;
            case 3:
                nm = "falcon";
        }
        return nm;


    }

}
