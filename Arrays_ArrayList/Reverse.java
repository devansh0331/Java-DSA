import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println(Arrays.toString(reverse(arr)));

    }

    static int[] reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        // int[] revArr = new int[end];

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;

    }
}
