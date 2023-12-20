package Linear_Search;

public class Max_Wealth {
    public static void main(String[] args) {
        int[][] accounts = { { 5, 3 }, { 10, 2 }, { -6, 7 } };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int persons = 0; persons < accounts.length; persons++) {
            int sum = 0;
            for (int account = 0; account < accounts[persons].length; account++) {
                sum = sum + accounts[persons][account];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

}
