package Linear_Search;

public class Find_Min {
    public static void main(String[] args) {

        int[] arr = { 18, 12, -7, 3, 14, 25 };
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        // if(arr.length == 0){
        // return -1;
        // }

        int minimun = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimun) {
                minimun = arr[i];

            }
        }
        return minimun;
    }

}
