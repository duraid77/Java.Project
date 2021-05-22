package officeHour.april_12;

public class innerOuterArray {
    public static void main(String[] args) {
        int[] inner = {4,2,1,2,4,6,2,4};

        int[] outer = {0,1,2,3,4,5,6,7};


        boolean[] checks = new boolean[8];

        for (int i =0; i<inner.length; i++){

            for (int j =0; j<outer.length; j++){

                if(inner[i] == outer[j]){
                    checks[i] = true;
                    break;
                }
            }
        }
        for(boolean each: checks){
            if(!each){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");


    }
}
