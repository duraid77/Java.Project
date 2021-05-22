package day15_Logical_ops_switch_Ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "NoVA";
        double salary = 110000;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if (location.equals("NoVA") && isRemote && hasBenefits && (salary>= 100000)){
            System.out.println("Accept the offer. Do you still need to ask? ");
        }else{
            System.out.println("Let's negotiate better");
        }


    }
}
