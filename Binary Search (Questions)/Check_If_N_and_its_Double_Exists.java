/**
 * Check_If_N_and_its_Double_Exists
 */
public class Check_If_N_and_its_Double_Exists {

    public static void main(String[] args) {

        int[] arr = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr));

    }

    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {

                        return true;

                    }
                }

            }
        }

        return false;
    }
}