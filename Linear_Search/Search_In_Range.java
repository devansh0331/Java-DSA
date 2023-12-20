package Linear_Search;

public class Search_In_Range {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 25 };
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;

        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }
}
