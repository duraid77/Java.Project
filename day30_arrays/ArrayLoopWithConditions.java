package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args){

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        for(double num : prices){
            if(num > 100){
                System.out.print("num = " + num);
            }
        }

        for(double eachPrice : prices){
            if(eachPrice>=10 && eachPrice<=70){
                System.out.println("prices bet 10 and 70 " + eachPrice);
            }
        }

        int count=0;
        for(double eachPrice : prices){
            if(eachPrice>=50){
                count++;
            }
        }
        System.out.println("Total count for prices more than 50 = " + count);

        for(String str : countries){
            if(str.length()>= 7){
                System.out.println(str);
            }
        }




    }
}
