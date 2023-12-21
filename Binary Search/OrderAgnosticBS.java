public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -8, -5, 0, 1, 2, 5, 6, 7, 10, 45, 60 };
        int[] arr2 = { 100, 70, 41, 25, 11, 5, 4, -8, -10 };
        int target = 4;

        int ans = binarySearch(arr2, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // finding whether the array is in ascending or descending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // best case
            if (arr[mid] == target) {
                return mid;
            }

            // ascending order
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

            // descending order
            else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
