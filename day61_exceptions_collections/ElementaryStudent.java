package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
           // Exception e = new IllegalArgumentException();
           // throw e;
            throw new IllegalArgumentException("Name can not empty or null");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <5 || age >12){
            throw new IllegalArgumentException("Age can not be less than 5 or more than 12 for elementary school");
        }
        this.age = age;
    }

    public ElementaryStudent(String name, int age){
        setName(name);
        setAge(age);
    }
    public ElementaryStudent(){

    }


}
