package officeHour.april_6th;

public class longestString {
    public static void main(String[] args) {


        String str = "aaabbbbccccceeeeee";
        String word = "";
        String longest ="";
        String temp = "";

        for (int i=0; i< str.length()-1;i++){

        if(str.charAt(i) == str.charAt(i+1)) {
            temp += "" + str.charAt(i);
        }else if (i>0){
            if(str.charAt(i) == str.charAt(i-1)){
                temp += "" + str.charAt(i);

                if (temp.length()>= longest.length()) {
                    longest = temp;
                    temp = "";
                }
            }
        }else{
            if (temp.length()>= longest.length()){
                longest = temp;
                temp = "";
            }
        }

        }
        System.out.println("longest = " + longest);
    }
}