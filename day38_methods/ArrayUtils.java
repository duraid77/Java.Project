package day38_methods;

public class ArrayUtils {
    public static void main(String[] args) {
      String names[] = {"Hello" , "How", "are", "you"};
      printArray(names);
        System.out.println();
    int[] numbers = { 65, 32, 98, 76, 82, 37};
        System.out.println("Sum for the array = " + sumArray(numbers));
        System.out.println("sum = " + ArrayUtils.sumArray(new int[] {78, 69, 37, 235, 875}));


    }



    public static void printArray(String[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int sumArray(int[] nums){
        int sum = 0;
        for(int each: nums){
            sum += each;
        }
        return sum;
    }

}
