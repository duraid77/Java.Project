package day50_inheritance;

public class Teacher extends Person{
    int teacherID;
    public void teach(String topic){
        System.out.println("Teacher is teaching " + topic);
    }
}
