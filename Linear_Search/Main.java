package Linear_Search;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(linearSearch(arr, 6));
    }

    // Search in the array: return the index if item found
    // Otherwise if item not found: return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for-loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int i : arr) {
            if (i == target) {
                return i;

            }

        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int ele : arr) {
            if (ele == target)
                return true;

        }
        return false;
    }
}
