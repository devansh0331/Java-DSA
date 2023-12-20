package Linear_Search;

public class Even_Digits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int ele : nums) {
            if (isEvenDigit(ele)) {
                count++;
            }

        }
        return count;
    }

    static boolean isEvenDigit(int ele) {
        boolean ans = false;
        int digits = digits2(ele);

        if (digits % 2 == 0) {
            return true;

        }
        return ans;
    }

    static int digits(int element) {
        int count = 0;
        if (element < 0) {
            element = element * -1;
        }
        if (element == 0) {
            return 1;
        }
        while (element > 0) {
            count++;
            element /= 10;

        }
        return count;

    }

    static int digits2(int element) {
        return (int) (Math.log10(element) + 1);
    }
}
