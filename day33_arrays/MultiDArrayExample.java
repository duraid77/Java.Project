package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora";    // username
        users[0][1] = "TeodoraPWD12";   //password

        users[1][0] = "Anna";    // username
        users[1][1] = "AnnaPWD12";   //password

        users[2][0] = "Parvin";    // username
        users[1][1] = "ParvinPWD22";   //password

        //Easer way
        String[][] userData = { {"Teodora" , "TeodoraPWD12" },{"Anna" , "AnnaPWD12" } ,
                {"Parvin" ,  "ParvinPWD22"} };
//print all user data:
        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        // print all passwords
        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);


        // or printing the array but instead of toString you use DeepToString(array name)
        System.out.println(Arrays.deepToString(userData));

    }
}
