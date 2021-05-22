package day40_arraylist;

public class CountLetters {
    public static void main(String[] args) {
        String str = "apple tree";
        counting(str);
    }


    public static void counting(String str){
        String checked ="";
        for (int i = 0; i < str.length(); i++) {
            char eachletter = str.charAt(i);

            int count =0;

            if(!checked.contains("" + eachletter)){
            for(int j=0; j < str.length(); j++) {
                char eachOtherletter = str.charAt(j);
               
                if(eachletter == eachOtherletter){
                    count++;
                }
            }
            System.out.println(eachletter + " = " + count);
            checked += "" + eachletter;
        }}

    }

}
