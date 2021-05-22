package day15_Logical_ops_switch_Ternary;

public class CarShopping {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "Toyota";
        int carPrice = 4500;

        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("Car within budget and the model is what you want");
            System.out.println("Model: " + model + " - $" + carPrice);
        }else if (carPrice > budget){
            System.out.println("Price is over budget");
        }else{
            System.out.println("Car model is not desirable");
        }
    }
}
