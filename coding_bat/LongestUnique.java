package coding_bat;

import java.util.ArrayList;

public class LongestUnique {
    public static void main(String[] args) {
        String str = "2aabbcbbbadef";
        int numOfCh = Integer.parseInt(str.substring(0,1));
        str = str.substring(1);
        String longestString = "";

        for (int i = 0; i < str.length(); i++) {
            String uniqueStr = "" + str.charAt(i);
            int numOfUnique =1;

            for(int j=i+1; j< str.length();j++){
                if(str.substring(i,j).contains("" + str.charAt(j))){
                    uniqueStr += "" + str.charAt(j);
                }else{
                    numOfUnique++;
                    if(numOfUnique >numOfCh){
                        break;
                    }else {
                        uniqueStr += "" + str.charAt(j);
                    }
                }
            }
            if(uniqueStr.length()> longestString.length()){
                longestString = uniqueStr;
            }
       }

        System.out.println("Longest String = " + longestString);

    }
}
