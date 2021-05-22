package day16_switch_ternry;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 2;

        if(floorNum == 1){
            System.out.println("Floor one selected");
            System.out.println("Lobby, verizon, Starbucks");
        }else if(floorNum == 2){
            System.out.println("Floor two selected");
            System.out.println("Cybertek, NASA, Intelsat");
        }else if(floorNum ==3){
            System.out.println("Floor Three selected");
            System.out.println("Lyft, BofA, Stake house");
        }else{
            System.out.println("Invalid floor - " + floorNum);
        }
        System.out.println("------------------------Switch conversion");

        floorNum=1;
        switch (floorNum){
            case 1:
                System.out.println("Floor one selected");
                System.out.println("Lobby, verizon, Starbucks");
                break;

            case 2:
                System.out.println("Floor two selected");
                System.out.println("Cybertek, NASA, Intelsat");
                break;

            case 3:
                System.out.println("Floor Three selected");
                System.out.println("Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }


    }
}
