import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }
}
