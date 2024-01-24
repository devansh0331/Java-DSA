import java.util.ArrayList;

/**
 * Operators
 */
public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1"
        // integer will converted into Integer that will call its toString()

        System.out.println("Devansh" + new ArrayList<>());
        // System.out.println("Devansh" + new Integer(56));
        // System.out.println(new ArrayList<>() + "" + new Integer(56));
    }
}