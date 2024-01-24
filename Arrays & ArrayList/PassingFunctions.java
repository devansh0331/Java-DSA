import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        changeEle(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeEle(int[] arr) {
        arr[0] = 25;
    }
}
