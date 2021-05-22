package day32_arrays_split;

public class countSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = cats.split(" cat ");
        System.out.println("count of cats " + ( catsArray.length -1));

    }
}
