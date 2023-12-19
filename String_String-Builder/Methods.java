import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        System.out.println();

        String name = "Devansh Shrivastava";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('D'));
        System.out.println("          Devansh      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

        System.out.println();
    }

}
