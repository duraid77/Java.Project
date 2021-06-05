package day50_inheritance.animals;

public class Cat extends Animal{
    public void jump(){
        System.out.println("Cat is jumping");
    }
   @Override //optional
    public void speak(){
       System.out.println("Cat is saying Mew");
    }
}
