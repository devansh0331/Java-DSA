import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 4, 8 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;

        }
        return ans;

    }
}
