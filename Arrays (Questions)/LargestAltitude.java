import java.util.Arrays;

public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = { 0, 44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63,
                64, -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81 };
        System.out.println(largetAltitude(gain));
    }

    static int largetAltitude(int[] gain) {
        int currentHeight = 0;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < gain.length; i++) {
            currentHeight += gain[i];
            maxHeight = Math.max(maxHeight, currentHeight);
        }

        return maxHeight;
    }
}
