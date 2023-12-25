/**
 * Ceiling
 */
public class Ceiling {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 8, 14, 16, 18 };
        int target = 15;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }

            else if (arr[mid] < target) {
                end = mid - 1;
            }

            else {
                return mid;
            }

        }

        return start;
    }
}