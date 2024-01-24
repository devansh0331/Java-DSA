import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(24);
        list.add(80);
        list.add(220);
        list.add(543);
        list.add(100);

        System.out.println(list);
        list.set(2, 65);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(24));

        ArrayList<ArrayList<Integer>> listArr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listArr.add(new ArrayList<>());

        }

    }
}
