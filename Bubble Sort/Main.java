import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 5, 2 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        // running the loop n-1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped)
                break;
        }
    }
}