package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        ElementaryStudent student = new ElementaryStudent("faq", 6);
        ElementaryStudent st1 = new ElementaryStudent();
        try {
            st1.setAge(4);
            st1.setName("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Execution completed!");



    }
}
