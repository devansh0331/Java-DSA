import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        // int n = 23597;
        // int n = 123456;
        int n = sc.nextInt();

        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }

        System.out.println(ans);

        sc.close();

    }

}
