import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            // Press 'X' or 'x' to exit

            System.out.println("Enter the oprator : + , - , * , / , % or Press 'X' or 'x' to exit");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter num1 : ");
                int num1 = sc.nextInt();
                System.out.println("Enter num2 : ");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Answer : " + ans);

            } else if (op == 'X' || op == 'x') {
                break;

            } else {
                System.out.println("Invalid Operator");
            }
        }

        sc.close();

    }
}
