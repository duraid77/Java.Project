package coding_bat;

public class wordEnds {
    public static void main(String[] args) {
        String str = "XYXY";
        String word = "XY";
        String newword = "";
        int len = word.length();

        for( int i = 0; i<str.length(); i++){
            if (str.substring(i).equals(word)) {
                newword += "" + str.charAt(i - 1);
                break;
            }
            if (i == 0) {
                if (str.substring(i).startsWith(word)) {
                    if (!str.substring(i + len).equals(word)) {
                        newword += "" + str.charAt(i + len);
                        i += len;
                        continue;
                    }
                }
            }
            if (str.substring(i).startsWith(word)) {

                newword += "" + str.charAt(i - 1) + str.charAt(i + len);
                i += len - 1;


            }


        }
        System.out.println("newword = " + newword);
    }


}
