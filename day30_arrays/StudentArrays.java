package day30_arrays;

public class StudentArrays {
    public static void main(String[] args) {
        /**
         * id
         * first name
         * last name
         * batch number
         * phone number
         */
        String[] student1 ={"1234", "Duraid" , "Hussein", "batch 22", "202555555"};
        String[] student2 = new String[5];
        student2[0] = "135463213";
        student2[1] = "Tifa";
        student2[2] = "Zhou";
        student2[3] = "batch 24";
        student2[4] = "2025558565";

        System.out.println("student1 ID = " + student1[0]);
        System.out.println("student1 First name = " + student1[1].toUpperCase());
        System.out.println("student1 Last name = " + student1[2].toUpperCase());
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);

        if(student1.length == student2.length){
            System.out.println("Pass: data array has correct length");
        }else{
            System.out.println("fail: data array has incorrect length");
        }

        String mobilenumber = student1[4];

        System.out.println("FoR EACH LOOP");

        for(String data: student1){
            System.out.println(data);
        }
    }
}
