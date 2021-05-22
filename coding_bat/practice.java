package coding_bat;
import java.util.*;
public class practice {
    public static void main(String[] args) {


               int[] num = {};

                if(num.length>=2){
                    int[] arr = {num[0], num[1]};
                    System.out.println(Arrays.toString(arr));
                }else if (num.length == 1){
                    int[] arr = {num[0]};
                    System.out.println(Arrays.toString(arr));

                }else{
                    int[] arr ={};
                    System.out.println(Arrays.toString(arr));
                }


            }
}
