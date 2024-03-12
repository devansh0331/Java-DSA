
import java.util.Arrays;

public class Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 1 };
        int[] bobSizes = { 2, 2 };

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
        // System.out.println(getTotal(aliceSizes));

    }

    public static int[] fairCandySwapBROOTFORCE(int[] aliceSizes, int[] bobSizes) {

        int[] ans = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {

                if (getTotal(aliceSizes) != getTotal(bobSizes)) {

                    int temp = aliceSizes[i];
                    aliceSizes[i] = bobSizes[j];
                    bobSizes[j] = temp;
                    if (getTotal(aliceSizes) == getTotal(bobSizes)) {

                        ans[0] = bobSizes[j];
                        ans[1] = aliceSizes[i];
                        break;
                    } else {
                        int temp2 = aliceSizes[i];
                        aliceSizes[i] = bobSizes[j];
                        bobSizes[j] = temp2;
                    }
                }

            }

        }
        return ans;
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int[] ans = new int[2];

        int aliceTotal = getTotal(aliceSizes);
        int bobTotal = getTotal(bobSizes);

        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {
            // int target = 2 * aliceSizes[i] + diff;
            int target = (bobTotal + 2 * aliceSizes[i] - aliceTotal) / 2;

            if (binarySearch(bobSizes, target)) {
                return new int[] { aliceSizes[i], target };
            }

        }

        return new int[] { 0, 0 };
    }

    public static boolean binarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == target) {
                return true;
            }

            else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;

            }
        }
        return false;

    }

    public static int getTotal(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

}
