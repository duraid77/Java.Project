package day50_inheritance.animals;

public class AnimalsObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name ="Gray";
        animal.type = "Pitbul";



        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();

    }


}
