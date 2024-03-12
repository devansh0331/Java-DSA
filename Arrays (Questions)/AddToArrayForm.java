import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {

        int[] num = { 1, 2, 0, 0 };
        System.out.println(addToArrayForm(num, 34));

    }

    static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            temp = temp * 10 + num[i];
        }

        int sum = temp + k;

        int noOfDigits = (int) (Math.log10(sum)) + 1;
        int[] tempAns = new int[noOfDigits];
        for (int i = 0; i < noOfDigits; i++) {
            int rem = sum % 10;
            tempAns[noOfDigits - i - 1] = rem;

            sum = sum / 10;

        }

        for (int i = 0; i < noOfDigits; i++) {
            ans.add(tempAns[i]);

        }

        return ans;

    }

    static List<Integer> addToArrayForm2(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            int updatedDigit = num[num.length - 1 - i] + k % 10;
            k = k / 10;

            if (updatedDigit > 9) {
                ans.add(updatedDigit % 10);
                k = k % 10 + 1;
            }

        }

        return ans;
    }
}
