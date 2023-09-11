import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        // int n = 13893;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == target) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}
