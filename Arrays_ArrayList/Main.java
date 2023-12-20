import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 1, 2, 3, 4, 5 };

        int[] arr; // Declaration
        arr = new int[5]; // Initialization
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}