public class Kth_Missing_Positivs_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;

        System.out.println(findKthPositive(arr, k));

    }

    public static int findKthPositive(int[] arr, int k) {

        int arrMax = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                return k;
            }

            else
                k++;
        }
        return k;
    }
}
