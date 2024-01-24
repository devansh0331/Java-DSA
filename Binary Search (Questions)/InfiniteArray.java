public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 8, 9, 10, 90, 100, 130, 140, 160, 170, 200 };
        int target = 10;

        System.out.println(mainAns(arr, target));
    }

    static int mainAns(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }

        return binarySearch(arr, target, start, end);

        // return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
