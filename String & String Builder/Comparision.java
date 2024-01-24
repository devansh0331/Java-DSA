public class Comparision {
    public static void main(String[] args) {
        System.out.println();
        String a = "Devansh";
        String b = "Devansh";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String name1 = new String("Devansh");
        String name2 = new String("Devansh");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

    }
}
