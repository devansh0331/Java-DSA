import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString((ans)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);

        }

        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > target) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }

        return ans;
    }

    static int[] bruiteForce(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            do {
                i++;
            } while (arr[i] < target);

            do {
                j--;
            } while (arr[j] > target);

            if (target == arr[i] && target == arr[j]) {
                ans[0] = i;
                ans[1] = j;
            }

        }

        return ans;
    }

}
