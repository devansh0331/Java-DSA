public class Max {
    public static void main(String[] args) {
        int[] arr = { 4, 56, 12, 78, 10 };
        System.out.println(maxEle(arr));
    }

    static int maxEle(int[] arr) {
        // int max = Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
