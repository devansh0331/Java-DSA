import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * KidsWithGreatesCandies
 */
public class KidsWithGreatesCandies {

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int children = candies.length;
        ArrayList<Boolean> ans = new ArrayList<>(children);

        int max = candies[0];

        for (int i = 0; i < children; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                ans.add(false);

            }

            else {
                ans.add(true);
            }
        }

        return ans;
    }

}