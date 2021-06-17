package day54_abstraction;

public class Pizza extends MenuItem{
    public void prepare(){
        System.out.println("kneed the dough, make pizza");
    }
    public void serve(){
        System.out.println("serve it on a round stone");
    }
}
