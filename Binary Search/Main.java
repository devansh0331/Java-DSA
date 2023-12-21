public class Main {
    public static void main(String[] args) {
        int[] arr = { -70, -20, 0, 2, 4, 6, 8, 9, 11, 12, 20, 36, 48 }; // array must be sorted
        System.out.println(binarySearch(arr, 36));
    }

    // if target found : return index
    // if target not found : return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
