import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        System.out.println("Enter a character or word");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }

        sc.close();
    }
}
