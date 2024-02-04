public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int rem = (int) (Math.log10(nums[i])) + 1;

            if (rem % 2 == 0) {
                count++;

            }

        }

        return count;
    }
}
