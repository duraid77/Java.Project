package day31_arrays;
import java.util.Arrays;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] num = {100,5,1,88,63,-4,98,33};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};
        Arrays.sort(languages);
        System.out.println(String.join("<>", languages));

    }
}
