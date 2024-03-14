public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static void main(String[] args) {
        int[] arr = { 0, 4, 3, 0, 4 };
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            int count = 0;
            for (int x = 0; x < nums.length; x++) {
                if (i <= nums[x]) {
                    count++;
                }

            }

            if (count == i) {
                return i;
            }
        }

        return -1;
    }
}
