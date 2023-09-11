import java.util.Scanner;

/**
 * Bonus_Salary
 */
public class Bonus_Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean stayIn = true;

        while (stayIn) {
            System.out.println("Enter the salary - ");
            int salary = sc.nextInt();

            if (salary > 10000) {
                salary = salary + 2000;
            }

            else if (salary > 20000) {
                salary = salary + 3000;
            } else {
                salary = salary + 1000;
            }

            System.out.println("Salary with Bonus " + salary);

            System.out.println("Press '0' to continue");
            int alpha = sc.nextInt();

            if (alpha == 0) {
                stayIn = true;

            } else {
                stayIn = false;
            }

        }
        sc.close();
    }
}