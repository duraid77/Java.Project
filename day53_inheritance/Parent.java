package day53_inheritance;

public class Parent {
    public String name = "parent - Mike smith";
    public void introduce1(){
        System.out.println("hello I am " + name);
    }
}


class Child extends Parent{
    public String name = "Child - Bob smith";
        public void introduce2(){
            System.out.println("Hello my name is " + name);
        }
        }

        class Runner{
            public static void main(String[] args) {
                Parent parent = new Parent();
                Child child = new Child();




            }
        }
