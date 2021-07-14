package coding_bat;

public class InterviewTask1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 0, 2, 7, 0, 6, 0, 9, 0, 0, 0 , 8 , 7};

        int limitIndex = arr.length - 1;
        for (int i = 0; i < limitIndex; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < limitIndex; j++) {
                        arr[j] = arr[j + 1];
                }
                    arr[limitIndex] = 0;
                    limitIndex--;
                    if (arr[i] == 0) {
                        i--;
                    }
                }
            }
            // printing out the array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

